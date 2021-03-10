package nz.ac.op.cs.SB_HSQL_Prj.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
//@Entity(name="question")
public class Question {
    @Id
    String Id;
    String QuizId;
    String Category;
    String Type;
    String difficulty;
    String question;
    String correct_answers;
    List<String> incorrect_answers;

    public Question() {

    }

    public Question(String id, String quizId, String category, String type, String difficulty, String question, String correct_answers, List<String> incorrect_answers) {
        Id = id;
        QuizId = quizId;
        Category = category;
        Type = type;
        this.difficulty = difficulty;
        this.question = question;
        this.correct_answers = correct_answers;
        this.incorrect_answers = incorrect_answers;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getQuizId() {
        return QuizId;
    }

    public void setQuizId(String quizId) {
        QuizId = quizId;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrect_answers() {
        return correct_answers;
    }

    public void setCorrect_answers(String correct_answers) {
        this.correct_answers = correct_answers;
    }

    public List<String> getIncorrect_answers() {
        return incorrect_answers;
    }

    public void setIncorrect_answers(List<String> incorrect_answers) {
        this.incorrect_answers = incorrect_answers;
    }
}