/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 *
 * @author andre
 */
public class StderrLogger extends Logger {
    
    public StderrLogger(int mask) {
        this.mask = mask;
    }
    
    public void writeMessage(String msg) {
        System.out.println("Writing to stderr: " + msg);
    }
}
