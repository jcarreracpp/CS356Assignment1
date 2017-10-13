package cs356assignment1;

/**
 * Should be able to generate questions of two types: multiple choice and single
 * choice. For each type the answers pool should be another two types: one with
 * A,B,C,D,E,F, and the other being True/False.
 *
 * Multiple answers for true/false is removed, cannot answer true AND false to a
 * given question, so only the lettered answers will be eligible for multiple
 * selection.
 *
 * @author Jorge
 */
public class Question {
    private String question;
    private boolean trueFalse;
    private boolean multipleAns;

    public Question(){}
    
    public Question(boolean trueFalse, boolean multipleAns){
        this.trueFalse = trueFalse;
        
        if(trueFalse){
            this.multipleAns = false;
        }else{
            this.multipleAns = multipleAns;
        }
    }
    
    public Question(String question, boolean trueFalse, boolean multipleAns){
        this.question = question;
        this.trueFalse = trueFalse;
        
        if(trueFalse){
            this.multipleAns = false;
        }else{
            this.multipleAns = multipleAns;
        }
    }
    
    public void setQuestion(String setQ){
        question = setQ;
    }
    
    public String getQuestion(){
        return question;
    }
    
    public boolean trueFalse(){
        return trueFalse;
    }
    
    public boolean getMultipleAns(){
        return multipleAns;
    }
}
