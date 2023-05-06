
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Chintu
 */
public class LogObserver implements GameObserver {

    private List<String> log;

    public LogObserver() {
        log = new ArrayList<>();
    }

    @Override
    public void update(Question question, String answer) {
        String message = "Question: " + question.getQuestionText() + ", Answer: " + answer;
        log.add(message);
        System.out.println(message);
    }

    public void printLog() {
        System.out.println("Game log:");
        log.forEach(message -> {
            System.out.println(message);
        });
    }
}
