package sky.pro.course2.serivce;

import sky.pro.course2.model.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestions(int amount);
}
