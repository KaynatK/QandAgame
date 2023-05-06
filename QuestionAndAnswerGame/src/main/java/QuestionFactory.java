
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Chintu
 */
//class name
public class QuestionFactory {

    private List<Question> questions;
//private instance variable and list for objects

    public QuestionFactory() {
        questions = new ArrayList<>();
        questions.add(new Question("What is the capital of France?", "Paris"));
        questions.add(new Question("What is the largest country in the world?", "Russia"));
        questions.add(new Question("What is the smallest country in the world?", "Vatican City"));
        questions.add(new Question("What are odd numbers?", "1,3,5,7,9.11"));
        questions.add(new Question("Who painted the Mona Lisa?", "Leonardo da Vinci"));
        questions.add(new Question("Which planet is known as the Red Planet?", "Mars"));
        questions.add(new Question("What is the highest moutain in the world?", "Mount Everest"));
        questions.add(new Question("What is the smallest contient by land area?", "Australia"));
    }
//this return randomly selected question

    public Question createQuestion() {
        Random random = new Random();
        int index = random.nextInt(questions.size());
        return questions.get(index);
    }
}
