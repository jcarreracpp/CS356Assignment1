package cs356assignment1;

/**
 * Each of these student objects has a unique ID(string), and an answer(s) for
 * the question.
 *
 * @author Jorge
 */
public class Student {
    private String name;
    private boolean[] answers = new boolean[6];
    
    public Student(){}
    
    public Student(String name){
        this.name = name;
    }
    
    public Student(String name, boolean[] answers){
        this.name = name;
        this.answers = answers;
    }
    
    public void setName(String input){
        name = input;
    }
    
    public void setResponse(boolean[] input){
        answers = input;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean[] getResponse(){
        return answers;
    }
}
