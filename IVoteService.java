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
    private Question question;
    private int[] answerArray = new int[6];
    
    public IVoteService(){}
    
    public void submitQuestion(Question q){
        question = q;
    }
    
    public void printQuestion(){
        System.out.println(question.getQuestion());
    }
    
    public void printResults(){

        if(question.trueFalse()){
            System.out.println("1. True : " + answerArray[0]);
            System.out.println("2. False : " + answerArray[1]);
        }else{
            System.out.println("A : " + answerArray[0]);
            System.out.println("B : " + answerArray[1]);
            System.out.println("C : " + answerArray[2]);
            System.out.println("D : " + answerArray[3]);
            System.out.println("E : " + answerArray[4]);
            System.out.println("F : " + answerArray[5]);
        }
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
