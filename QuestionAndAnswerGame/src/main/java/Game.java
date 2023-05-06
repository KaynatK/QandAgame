
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Chintu
 */
//class name
public class Game {

    private QuestionFactory questionFactory;
    private List<GameObserver> observers;
//private instance and list

    public Game() {
        questionFactory = new QuestionFactory();
        observers = new ArrayList<>();
    }
//method adds object to observers list.

    public void addObserver(GameObserver observer) {
        observers.add(observer);
    }
//random question generate+

    public void play() {
        Scanner scanner = new Scanner(System.in);
        Question question = questionFactory.createQuestion();
        System.out.println(question.getQuestionText());
        String answerText = scanner.nextLine();
        boolean isCorrect = answerText.equalsIgnoreCase(question.getCorrectAnswer());
        Answer answer = new Answer(answerText, isCorrect);
        notifyObservers(question, answerText);
    }
//method that iterates 

    private void notifyObservers(Question question, String answerText) {
        for (GameObserver observer : observers) {
            observer.update(question, answerText);
        }
    }
}
