/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chintu
 */
//score the question if it correct 
public class ScoreObserver implements GameObserver {

    private int score;

    public ScoreObserver() {
        score = 0;
    }
//it shows the answer with log question.
    @Override
    public void update(Question question, String answer) {
        if (answer.equalsIgnoreCase(question.getCorrectAnswer())) {
            score++;
            System.out.println("Correct! Score: " + score);
        } else {
            System.out.println("Incorrect! The correct answer was: " + question.getCorrectAnswer() + " Score: " + score);
        }
    }
}
