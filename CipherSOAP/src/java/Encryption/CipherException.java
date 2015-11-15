/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
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
public class CipherException
{
    private String message;
    private static final String String_Default = "Unkown argument.";
    
    public CipherException()
    {
        message = String_Default;
    }
    public CipherException(String msg)
    {
        if(msg != null)
        {
            message = msg;
        }
        else
        {
            message = String_Default;
        }
    }
    
    public String getMessage()
    {
       return message;
    }
}
