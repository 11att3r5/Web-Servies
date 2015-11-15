/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encryption;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author Alex
 */
@WebService(serviceName = "CipherSoap")
public class CipherSoap {
    /**
     * @param s
     * @param shift
     * @return 
     * @throws Encryption.FaultBean 
     */
    @WebMethod(operationName = "Cipher")
    public String cipher(@WebParam(name = "Text") String s,
            @WebParam(name = "Shift")Integer shift)
            throws FaultBean       
    {
        if(s.isEmpty())
        {
            throw new FaultBean("Must have text to cipher.", new CipherException());
        }
        else if((shift < 1) || (shift > 93))
        {
            throw new FaultBean("Number to shift must be greater than 0 and less than 94", new CipherException());
        }
        else
        {
            char[] ctArray = s.toCharArray();

            char[] ptArray = new char[ctArray.length];
            //cipher code. Gets the ASCii value subtracts 32(since were dealing with 32 - 127), add the shift
            //divide the result by 95(the number of valid characters) and get the remainder, then add 32(which puts you somewhere between 32 -127
            //Decipher works in a similar way by doubling back.
            for(int i = 0; i < ctArray.length; i++)
            {
            int ascii = (int)ctArray[i];
            ascii = (ascii - 32 + shift)%95 + 32;
            ptArray[i] = (char)ascii;
            }
            String c = new String(ptArray);
            return c;
        }
    }
    /**
     * @param s
     * @param shift
     * @return  
     * @throws Encryption.FaultBean   
     */
    @WebMethod(operationName = "decipher")
    public String decipher(@WebParam(name = "DecipherText") String s,
            @WebParam(name = "Shiftback")int shift) 
            throws FaultBean
    {
        if(s.isEmpty())
        {
            throw new FaultBean("Must have text to decipher.", new CipherException());
        }
        else if((shift < 1) || (shift > 93))
        {
            throw new FaultBean("Number to shift must be greater than 0 and less than 94", new CipherException());
        }
        else
        {
            char[] ctArray = s.toCharArray();

            char[] ptArray = new char[ctArray.length];
            for(int i = 0; i < ctArray.length; i++)
            {
                int ascii = (int)ctArray[i];
                ascii = (ascii + 32 - shift)%95 + 63;
                ptArray[i] = (char)ascii;
            }
            String c = new String(ptArray);
            return c;
        }
    }
}
