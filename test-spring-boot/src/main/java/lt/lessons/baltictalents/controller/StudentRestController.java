package lt.lessons.baltictalents.controller;

import lombok.val;
import lt.lessons.baltictalents.model.Studentas;
import lt.lessons.baltictalents.repository.StudentaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    @Autowired
    StudentaiRepository studentRepository;

    @RequestMapping(value ="/student/{studentId}", method= RequestMethod.GET)
    public Studentas getPerson(@PathVariable("studentId") long studentId){
        val student = studentRepository.findById(studentId);

        return student.get();
    }



}