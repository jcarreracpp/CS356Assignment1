/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356assignment1;

/**
 *
 * @author Jorge
 */
public class SimulationDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Question new1 = new Question(true, false);
        DriverAssistant da = new DriverAssistant();
        new1.setQuestion("Do infinite while loops exist?");
        da.automateTest(new1);
        
        System.out.println();
        
        new1 = new Question(false, true);
        new1.setQuestion("Of the first six letters of the alphabet, which ones"
                + " are your favorites?");
        da.automateTest(new1);
    }
}
