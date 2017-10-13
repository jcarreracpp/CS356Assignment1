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
public class IVoteService {
    private String question;
    private int[] answerArray = new int[6];
    
    public IVoteService(){}
    
    public void submitQuestion(Question q){
        question = q.getQuestion();
    }
    
    public void submitAnswer(Student s){
        boolean[] temp = s.getResponse();
        
        for(int i = 0; i < temp.length; i++){
            if(temp[i]){
                answerArray[i]++;
            }
        }
    }
}
