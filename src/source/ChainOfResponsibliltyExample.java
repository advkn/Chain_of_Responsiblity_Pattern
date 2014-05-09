/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 *
 * @author andre
 */
public class ChainOfResponsibliltyExample {
    
    public static void main(String[] args) {
        
        //Build the chain of responsibility
        Logger logger, logger1, logger2;
        
        logger = new StdoutLogger(Logger.DEBUG);
        logger1 = logger.setNext(new EmailLogger(Logger.NOTICE));
        logger2 = logger1.setNext(new StderrLogger(Logger.ERR));
        
        //handled by StdoutLogger
        logger.message("Entering function y. ", Logger.DEBUG);
        
        //handled by StdoutLogger & EmailLogger
        logger.message("Step1 completed: ", Logger.NOTICE);
        
        //handled by all three logger
        logger.message("An error has occurred: ", Logger.ERR);
    }
    
}
