package sky.pro.course2.serivce;

import org.junit.jupiter.api.Test;
import sky.pro.course2.model.Question;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {

    JavaQuestionService javaQuestionService = new JavaQuestionService();

    Set<Question> testSet = new HashSet<>();

    Question test1 = new Question("test1", "test2");
    Question test2 = new Question("test3", "test4");
    Question test3 = new Question("test5", "test6");
    @Test
    void add() {

        assertThrows(IllegalArgumentException.class, () -> javaQuestionService.add(null, null));
        assertThrows(IllegalArgumentException.class, () -> javaQuestionService.add("as", null));
        assertEquals(javaQuestionService.add("test1", "test2"), test1);
    }

    @Test
    void testAdd() {
        assertThrows(IllegalArgumentException.class, () -> javaQuestionService.add(null, null));
        assertThrows(IllegalArgumentException.class, () -> javaQuestionService.add("as", null));
        assertEquals(javaQuestionService.add(test1), test1);
    }

    @Test
    void remove() {
        assertThrows(IllegalArgumentException.class, () -> javaQuestionService.add(null, null));
        assertThrows(IllegalArgumentException.class, () -> javaQuestionService.add("as", null));

        testSet.add(test1);
        javaQuestionService.add(test1);
        javaQuestionService.remove(test1);

        assertNotEquals(testSet, javaQuestionService.getAll());

        testSet.remove(test1);

    }

    @Test
    void getAll() {
        assertThrows(IllegalArgumentException.class, () -> javaQuestionService.add(null, null));
        assertThrows(IllegalArgumentException.class, () -> javaQuestionService.add("as", null));
        testSet.add(test1);
        testSet.add(test2);
        testSet.add(test3);

        javaQuestionService.add(test1);
        javaQuestionService.add(test2);
        javaQuestionService.add(test3);

        assertEquals(testSet, javaQuestionService.getAll());
    }

    @Test
    void getRandomQuestion() {
        assertNotNull(javaQuestionService.getRandomQuestion());

        for (int i = 0; i < 5; i++) {
            System.out.println(javaQuestionService.getRandomQuestion());
        }

    }
}