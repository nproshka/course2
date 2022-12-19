package sky.pro.course2.serivce;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import sky.pro.course2.model.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    @Mock
    private QuestionService questionService;

    private ExaminerServiceImpl examinerService;



    @BeforeEach
    public void SetUp() {
        examinerService = new ExaminerServiceImpl(questionService);
    }


    @Test
    void getQuestions() {
        Set<Question> test = new HashSet<>();
        test.addAll(examinerService.getQuestions(5));
        System.out.println(test);
//        Почему-то у меня выводится null хотя по идеи список должен заполниться рандомными вопросами, как я не пытался править код
//        Я и вместо QuestionService пробовал JavaQuestionService и всё равно результат тот же
//        Работает только если я добавлю метод на рандомный вопрос в самом ExaminerServiceImpl объясните почему так? я не понимаю(
    }

}