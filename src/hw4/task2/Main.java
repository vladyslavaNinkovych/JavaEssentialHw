package hw4.task2;

public class Main {
    public static void main(String[] args) {
        AbstractHandler xml = new XMLHandler();
        AbstractHandler txt = new TXTHandler();
        AbstractHandler doc = new DOCHandler();

        AbstractHandler[] files = {xml, txt, doc};

        for (AbstractHandler file : files){
            file.open();
            file.create();
            file.change();
            file.save();
        }
    }
}
