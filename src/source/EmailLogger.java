/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 *
 * @author andre
 */
public class EmailLogger extends Logger {
    
    public EmailLogger(int mask) {
        this.mask = mask;
    }
    
    public void writeMessage(String msg) {
        System.out.println("Sending via email: " + msg);
    }
}
