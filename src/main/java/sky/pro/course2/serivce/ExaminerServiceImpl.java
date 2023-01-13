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


        int i = 0;
        while (i < amount) {
            examQuestions.add(questionService.getRandomQuestion());
            i++;
        }
        return examQuestions;
    }

}

