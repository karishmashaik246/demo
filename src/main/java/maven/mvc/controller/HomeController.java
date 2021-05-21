package maven.mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="home")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="aj005")
	public ModelAndView test1(HttpServletResponse response) throws IOException{
		return new ModelAndView("aj005");
	}
	@RequestMapping(value="java")
	public ModelAndView test2(HttpServletResponse response) throws IOException{
		return new ModelAndView("java");
	}
	@RequestMapping(value="dotnet")
	public ModelAndView test4(HttpServletResponse response) throws IOException{
		return new ModelAndView("dotnet");
	}
	@RequestMapping("/params")
    public ModelAndView test5(@RequestParam("id") String id, @RequestParam("name") String name) {
        
        ModelAndView m = new ModelAndView();
        //System.out.println(id+" "+name);
        Student s = new Student(id,name);
        m.addObject("stu", s);
        m.setViewName("param");
        return m;
        
    }
}
