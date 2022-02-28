package com.peaksoft.controller;

import com.peaksoft.dao.StudentDaoImpl;
import com.peaksoft.model.Student;
import com.peaksoft.service.StudentService;
import com.peaksoft.service.StudentServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {
    @Autowired
    private final StudentService studentService ;

   @GetMapping
    public String studentList(Model model) {
        model.addAttribute("new1", studentService.getAllStudents());
        if(studentService.getAllStudents() == null)
            System.out.println("error");
        else{
            System.out.println(studentService.getAllStudents().size());
        }
        return "/st/index";
    }

    @GetMapping("/{id}")
    public String showStudent(@PathVariable("id") long id, Model model) {
        model.addAttribute("show", studentService.getById(id));
        return "/st/show";
    }

    @GetMapping("/student/new2")
    public String newStudent(Model model){
        model.addAttribute("student",new Student());
        return "/st/new2";
    }

    @PostMapping("/save")
    public String getStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/student";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") long id) {
        model.addAttribute("student", studentService.getById(id));
        return "/st/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("company")  Student student ,@PathVariable("id") long id) {
        studentService.studentUpdate(id, student);
        return "redirect:/student";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id" ) long id){
        studentService.deleteById(id);
        return "redirect:/student";
    }


}
