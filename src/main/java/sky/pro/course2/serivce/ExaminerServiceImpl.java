package sky.pro.course2.serivce;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import sky.pro.course2.model.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {



    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        Set<Question> examQuestions = new HashSet<>();

//        if (amount > 5) {
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
//        }

        for (int i = 0; i < amount; i++) {
            examQuestions.add(questionService.getRandomQuestion());
        }
        return examQuestions;
    }

//    public Question getRandomQuestion() {
//        Random randomQuestion = new Random();
//        Question question = new Question("тест1", "тест2");
//
//        if (randomQuestion.nextInt(5) == 0) {
//            question = new Question("Чем интерфейс отличается от класса?", "Интерфейс описывает только функциональность");
//        }
//
//        if (randomQuestion.nextInt(5) == 1) {
//            question = new Question("Чем System.out.println() отличается от System.out.print()", "Первый метод выводит текст на новой строке а второй на одной и той же");
//        }
//
//        if (randomQuestion.nextInt(5) == 2) {
//            question = new Question("Какая коллекция работает как 'значение - ключ'?", "Map");
//        }
//
//        if (randomQuestion.nextInt(5) == 3) {
//            question = new Question("Назовите пример примитивных данных", "int, byte, boolean и тд");
//        }
//
//        if (randomQuestion.nextInt(5) == 4) {
//            question = new Question("Назовите пример объектных данных", "String, Integer, массив");
//        }
//        return question;
//    }

}

