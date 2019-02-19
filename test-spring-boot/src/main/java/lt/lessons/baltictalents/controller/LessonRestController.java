package lt.lessons.baltictalents.controller;

import lombok.val;
import lt.lessons.baltictalents.model.BaseEntity;
import lt.lessons.baltictalents.repository.PazymiaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LessonRestController {
    @Autowired
    PazymiaiRepository lessonRepository;

    @RequestMapping(value ="/lessons/{lessonType}", method= RequestMethod.GET)
    public BaseEntity getLesson(@PathVariable("lessonType") String lessonType){
        val lesson = lessonRepository.findByType(lessonType);

        return lesson;
    }



}