package lt.lessons.baltictalents.controller;

import lt.lessons.baltictalents.model.Pazymys;
import lt.lessons.baltictalents.repository.PazymiaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LessonController {

    @Autowired
    PazymiaiRepository lessonRepository;

    @GetMapping("/addLesson")
    public String getLesson(Model model) {
        model.addAttribute("lesson", new Pazymys());
        return "addLesson";
    }


    @RequestMapping(value = "/saveLesson")
    public String saveItem(Pazymys lesson){
        lessonRepository.save(lesson);
        return "done";
    }


}