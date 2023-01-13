package sky.pro.course2.serivce;

import org.springframework.stereotype.Service;
import sky.pro.course2.model.Question;

import java.awt.desktop.QuitEvent;
import java.util.*;

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
//        т.к. наш сет пустой, создам тут новый, только для тестов

        Question question1 = new Question("Чем интерфейс отличается от класса?", "Интерфейс описывает только функциональность");
        Question question2 = new Question("Чем System.out.println() отличается от System.out.print()", "Первый метод выводит текст на новой строке а второй на одной и той же");
        Question question3 = new Question("Какая коллекция работает как 'значение - ключ'?", "Map");
        Question question4 = new Question("Назовите пример примитивных данных", "int, byte, boolean и тд");
        Question question5 = new Question("Назовите пример объектных данных", "String, Integer, массив");

        Set<Question> questionsTemp = new HashSet<>();
        questionsTemp.add(question1);
        questionsTemp.add(question2);
        questionsTemp.add(question3);
        questionsTemp.add(question4);
        questionsTemp.add(question5);

        Random randomQuestion = new Random();
        int randomNumber = randomQuestion.nextInt(questionsTemp.size());

        Iterator<Question> iterator = questionsTemp.iterator();

        int i = 0;
        Question question = null;

        while (iterator.hasNext()) {
            question = iterator.next();

            if (i == randomNumber)
                return question;

            i++;
        }

        return question;
    }
}
