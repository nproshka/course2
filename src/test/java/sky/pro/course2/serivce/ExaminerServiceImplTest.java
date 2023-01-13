package sky.pro.course2.serivce;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import sky.pro.course2.model.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    Question questionTemp = new Question("Test1", "Test2");
    Set<Question> test = new HashSet<>();


    @Mock
    private QuestionService questionService;

    private ExaminerServiceImpl examinerService;



    @BeforeEach
    public void SetUp() {
        examinerService = new ExaminerServiceImpl(questionService);
    }


    @Test
    void getQuestions() {
        test.add(questionTemp);
        Mockito.when(questionService.getRandomQuestion()).thenReturn(questionTemp);
        assertEquals(examinerService.getQuestions(1), test);
    }

}