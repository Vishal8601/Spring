package vishal.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import vishal.in.binding.Student;
import vishal.in.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	
	private StudentService service;
	
	@GetMapping("/")
	public String loadIndexPage(Model model) {
		
			
		
		init(model);
		
		return "index";
		
	}
	private void init(Model model) {
		model.addAttribute("student",new Student());
		model.addAttribute("courses", service.getCorses());
	}
	@PostMapping("/save")
    public String saveIndexPage(Student s,	Model model) {
		
		boolean saveStudent = service.saveStudent(s);

		if(saveStudent) 
		{
		
		model.addAttribute("msg", "Submit");
		
		}

		init(model);
		
		
		return "index";
		
	}

}
