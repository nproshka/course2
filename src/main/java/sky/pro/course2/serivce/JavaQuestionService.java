package sky.pro.course2.serivce;

import org.springframework.stereotype.Service;
import sky.pro.course2.model.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class JavaQuestionService implements QuestionService {

    Set<Question> questions = new HashSet<>();

    @Override
    public Question add(String question, String answer) {
        if (question == null || answer == null) {
            throw new IllegalArgumentException("Введите корректное название вопроса и ответа!");
        }
        Question temp = new Question(question, answer);
        questions.add(temp);
        return temp;
    }

    @Override
    public Question add(Question question) {
        if (question.getQuestion() == null || question.getAnswer() == null) {
            throw new IllegalArgumentException("Введите корректное название вопроса и ответа!");
        }
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (question.getQuestion() == null || question.getAnswer() == null) {
            throw new IllegalArgumentException("Введите корректное название вопроса и ответа!");
        }
        questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }

    @Override
    public Question getRandomQuestion() {
        Random randomQuestion = new Random();
        Question question = new Question("тест1", "тест2");

        if (randomQuestion.nextInt(5) == 0) {
            question = new Question("Чем интерфейс отличается от класса?", "Интерфейс описывает только функциональность");
        }

        if (randomQuestion.nextInt(5) == 1) {
            question = new Question("Чем System.out.println() отличается от System.out.print()", "Первый метод выводит текст на новой строке а второй на одной и той же");
        }

        if (randomQuestion.nextInt(5) == 2) {
            question = new Question("Какая коллекция работает как 'значение - ключ'?", "Map");
        }

        if (randomQuestion.nextInt(5) == 3) {
            question = new Question("Назовите пример примитивных данных", "int, byte, boolean и тд");
        }

        if (randomQuestion.nextInt(5) == 4) {
            question = new Question("Назовите пример объектных данных", "String, Integer, массив");
        }
        return question;
    }
}
