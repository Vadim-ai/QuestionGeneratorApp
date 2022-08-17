package pro.sky.myapp.questiongeneratorapp.service;

import org.springframework.stereotype.Service;
import pro.sky.myapp.questiongeneratorapp.Question;
import pro.sky.myapp.questiongeneratorapp.exception.NullParamException;

import java.util.*;

@Service
public class QuestionServiceImpl implements QuestionService {

    private List <Question> allQuestions = new ArrayList<>();

    @Override
    public Question add(String question, String answer) {
        if (question==null||answer==null)
            throw new NullParamException();

       Question question1 = new Question(question, answer);
       allQuestions.add(question1);
        return question1;
    }

    @Override
    public Question add(Question question) {
        if (question == null)
            throw new NullParamException();
        
        return question;
    }

    @Override
    public Question remove(Question question) {
        return null;
    }

    @Override
    public Collection<Question> getAll() {
        return null;
    }

    @Override
    public Question getRandomQuestion() {
        return null;
    }
}
