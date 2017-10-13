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
public class DriverAssistant {
    
    public DriverAssistant(){}
    
    public Student generateStudent(Question q) {
        Student replicant = new Student();
        boolean[] b = new boolean[6];
        if (q.trueFalse()) {
            if (Math.random() >= .5) {
                b[0] = true;
            } else {
                b[1] = true;
            }
        } else {
            if (q.getMultipleAns()) {
                for (int i = 0; i < b.length; i++) {
                    if (Math.random() >= .5) {
                        b[i] = true;
                    }
                }
            }else{
                boolean got = false;
                int j = 0;
                while(got){
                    if(Math.random()>= .7){
                        b[j] = true;
                    }
                    j++;
                    if(j > 5){
                        j = 0;
                    }
                }
            }
        }
        replicant.setResponse(b);
        return replicant;
    }
    
    public void automateTest(Question q){
        int numberOfStudents = (int)((Math.random()*20)+20);
        IVoteService ivs = new IVoteService();
        ivs.submitQuestion(q);
        
        while(numberOfStudents > 0){

            ivs.submitAnswer(generateStudent(q));
            
            numberOfStudents--;
        }
        
        ivs.printQuestion();
        ivs.printResults();
    }
}
