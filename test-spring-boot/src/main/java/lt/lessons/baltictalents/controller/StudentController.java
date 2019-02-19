package lt.lessons.baltictalents.controller;

import lt.lessons.baltictalents.model.Studentas;
import lt.lessons.baltictalents.repository.StudentaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @Autowired
    StudentaiRepository studentRepository;

    @GetMapping("/addStudent")
    public String getStudent(Model model) {
        model.addAttribute("student", new Studentas());
        return "addStudent";
    }


    @RequestMapping(value = "/saveStudent")
    public String saveItem(Studentas student){
        studentRepository.save(student);
        return "done";
    }


}