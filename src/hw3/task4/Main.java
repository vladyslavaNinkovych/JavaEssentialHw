package hw3.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter version: pro or exp");
        String version = sc.next();

        DocumentWorker worker;
        switch (version) {
            case "pro":
                worker = new ProDocumentWorker();
                break;
            case "exp":
                worker = new ExpertDocumentWorker();
                break;
            default:
                worker = new DocumentWorker();
                break;
        }
        worker.openDocument();
        worker.editDocument();
        worker.saveDocument();
    }
}
