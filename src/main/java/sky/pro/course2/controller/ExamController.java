package sky.pro.course2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.course2.model.Question;
import sky.pro.course2.serivce.ExaminerServiceImpl;

import java.util.Collection;

@RestController
public class ExamController {

    private final ExaminerServiceImpl examinerService;

    public ExamController(ExaminerServiceImpl examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/examiner")
    public Collection<Question> getQuestions(@RequestParam int amount) {
        return examinerService.getQuestions(amount);
    }

}
