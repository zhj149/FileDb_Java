/**
 * Created with IntelliJ IDEA.
 * User: tmb
 * Date: 30/12/12
 * Time: 7:12 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainGui();
            }
        });

    }

}
