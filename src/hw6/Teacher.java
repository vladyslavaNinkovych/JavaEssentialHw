package hw6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher (String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString(){
        return name;
    }
}
