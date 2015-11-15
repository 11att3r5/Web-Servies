/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciphersoapclient;

import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author Alex
 */
public class CipherSOAPClient extends JFrame
{
    private JButton encrypt = new JButton("Cipher");
    private JButton decrypt = new JButton("Decipher");
    private JButton clear = new JButton("Clear");
    private JButton exit = new JButton("Exit");
 
    private JLabel shift = new JLabel("Shift");
    
    private JTextArea ecBox = new JTextArea("Enter text here...");
    
    private JTextField shiftBox = new JTextField();
    
    private JPanel east = new JPanel();
    private JPanel west =  new JPanel();
    private JPanel south = new JPanel();
    
    private String message;
    
    public CipherSOAPClient()
    {
        super("Client");
        Container cont  = getContentPane();
        cont.add(east, BorderLayout.EAST);
        cont.add(west, BorderLayout.WEST);
        cont.add(south, BorderLayout.SOUTH);
        
        shiftBox.setColumns(5);
       
        cont.add(ecBox);
        
        east.setLayout(new GridBagLayout());
        ecBox.setBorder(new LineBorder(Color.BLACK));

        east.add(shift);
        east.add(shiftBox);
    
        south.add(encrypt);
        south.add(decrypt);
        south.add(clear);
        south.add(exit);
        
        setSize(520, 400);
        
        //Make Webservice reference
        CipherSoap proxy;
        CipherSoap_Service service = new CipherSoap_Service();
        proxy = service.getCipherSoapPort();
        
        encrypt.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    String ec = ecBox.getText();
                    String shiftTo = shiftBox.getText();
                    //Type checking
                    if(shiftTo.isEmpty())
                    {
                       message = ("Please enter a number to shift from.");
                       JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE );
                    }
                    else
                    { 
                        try
                        {
                            int shiftInt = Integer.parseInt(shiftTo);
                            if((shiftInt < 0) || (shiftInt > 93))
                            {
                                message = ("Number to shift must be greater than 0 and less than 94");
                                JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE );
                            }
                            else
                            {
                            String setDec = proxy.cipher(ec, shiftInt);
                            ecBox.setText("Original Text: " + ec + "\nCiphered text: " + setDec);
                            }
                        }
                        catch(NumberFormatException n)
                        {
                            message = ("Please enter a number to shift from.");
                            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE );
                        }
                    }
                }
                catch(FaultBean ex)
                {
                    message = ex.getMessage();
                    JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        decrypt.addActionListener(new ActionListener()
        {
             @Override
             public void actionPerformed(ActionEvent e)
            {
                try
                {
                    String ec = ecBox.getText();
                    String shiftFr = shiftBox.getText();
                    //type checking
                    if(shiftFr.isEmpty())
                    {
                        message = ("Please enter a number to shift from."); 
                        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE );
                    }
                    else
                    {
                        try
                        {
                            int shiftInt = Integer.parseInt(shiftFr);
                            String setDec = proxy.decipher(ec, shiftInt);
                            ecBox.setText("Original Text: " + ec + "\nDeciphered text: " + setDec);
                        }
                        catch(NumberFormatException ex)
                        {
                            message = ("Please enter a number to shift from.");
                            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE );
                        }
                    }
                }
                catch(FaultBean ex)
                {
                    message = ex.getMessage();
                    JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE );
                }
            }
        });
 
        
        clear.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ecBox.setText(null);
                shiftBox.setText(null);
            }
        });
        
        exit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(-1);
            }
        });
    }
    
    public static void main(String args[])
    {
        CipherSOAPClient theApp = new CipherSOAPClient();
        theApp.setDefaultCloseOperation(EXIT_ON_CLOSE);
        theApp.setLocationRelativeTo(null);
        theApp.setVisible(true);
    }
}

