package sky.pro.course2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.course2.model.Question;
import sky.pro.course2.serivce.JavaQuestionService;
import sky.pro.course2.serivce.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class JavaQuestionController {

    private final JavaQuestionService javaQuestionService;

    public JavaQuestionController(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @GetMapping("java")
    public Collection<Question> getAllQuestions() {
        return this.javaQuestionService.getAll();
    }

    @GetMapping("/java/add")
    public Question addQuestion(String question, String answer) {
        return this.javaQuestionService.add(question, answer);
    }

    @GetMapping("/java/remove")
    public Question removeQuestion(Question question) {
        return this.javaQuestionService.remove(question);
    }

    @GetMapping("/java/random")
    public Question random() {
        return this.javaQuestionService.getRandomQuestion();
    }
}
