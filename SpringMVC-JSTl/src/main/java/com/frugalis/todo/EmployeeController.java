package com.frugalis.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.frugalis.model.Employee;

@Controller
public class EmployeeController {

	@ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("msg", "Welcome to Heaven Plus Hell!");
    }
	
	@RequestMapping(value = "/addemp", method = RequestMethod.POST)
	public String submit(@ModelAttribute("employee") Employee employee) {
		
		System.out.println("*******************************");
		System.out.println(employee.getContactNumber());

		return "add-todo2";
	}

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("add-todo2", "employee", new Employee());
	}

}
