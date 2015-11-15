/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encryption;
/**
 *
 * @author Alex
 */
import javax.xml.ws.WebFault;

/**
 *
 * @author Alex
 */
@WebFault(name = "ArgumentException")
public class FaultBean extends Exception
{
    private final CipherException exceptionhandle;
    
    public FaultBean(String msg , CipherException faultinfo)
    {
        super(msg);
        exceptionhandle = faultinfo;
    }
    
    public FaultBean(String msg, CipherException faultinfo, Throwable cause)
    {
        super(msg, cause);
        exceptionhandle = faultinfo;
    }
    
    public CipherException getFaultInfo()
    {
            return exceptionhandle;
    }
}
