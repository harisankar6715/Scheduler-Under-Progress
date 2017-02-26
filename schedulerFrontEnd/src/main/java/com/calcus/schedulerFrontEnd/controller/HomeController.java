package com.calcus.schedulerFrontEnd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.calcus.scheduler.dao.TaskDAO;
import com.calcus.scheduler.dao.UsersDAO;

import com.calcus.scheduler.model.Task;
import com.calcus.scheduler.model.Users;

@Controller
public class HomeController { 
	
	@Autowired
	Users users;
	
	@Autowired
	UsersDAO usersDAO; 
	
	@Autowired
	Task task;
	
	@Autowired
	TaskDAO taskDAO;
	
	
	@RequestMapping("/")
	public ModelAndView myfun1()
	{
	  ModelAndView mv=new ModelAndView("/home");
	  return mv;
	} 
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("isUserClickedLoginHere", "true");
		return mv;
	}

	@RequestMapping("/loginhere")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("/login");
		mv.addObject("isUserClickedLoginHere", "true");
		return mv;
	}
	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView("/register");
	
		mv.addObject("isUserClickedRegisterHere", "true");
		return mv;
	}	
	@RequestMapping(value = "registerme", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute Users users) {
	    usersDAO.saveOrUpdate(users);
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("successMessage", "You are successfully register");
		return "/home";
	}
	@RequestMapping("/login")
	public ModelAndView isValidUser(@RequestParam(value = "name") String Email,
			@RequestParam(value = "password") String password, HttpSession session) {
		ModelAndView mv = new ModelAndView("/existingTask");
		boolean isValidUser = usersDAO.isValidUser(Email, password);
		if (isValidUser == true) {
			session.setAttribute("loggedInUser", users.getName());
			System.out.println(users.getName() + "logged in");
		}else {
		mv.addObject("invalidCredentials", "true");
		mv.addObject("errorMessage", "Invalid Credentials");
		}
	return mv;
	}
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request, HttpSession session) {
		ModelAndView mv = new ModelAndView("home");
		session.invalidate();
		session = request.getSession(true);
		
		mv.addObject("logoutMessage", "You successfully logged out");
		mv.addObject("loggedOut", "true");
	
		return mv;
	 } 
	@RequestMapping(value = "/createTask", method = RequestMethod.GET)
	public ModelAndView create(@ModelAttribute("task") Task t) {

		ModelAndView mv = new ModelAndView("/createTask");
		mv.addObject("iscreateTask", "true");
		
		return mv;
	}
	@RequestMapping("/existingTask")
	public ModelAndView existing(@ModelAttribute("task") Task t) {

		ModelAndView mv = new ModelAndView("/existingTask");
		mv.addObject("isexistingTask", "true");
		mv.addObject("taskList", this.taskDAO.list());
		return mv;
	} 
	@RequestMapping(value = "/task/delete/{task_Id}")
	public String deleteTask(@PathVariable("task_Id") int task_Id, ModelMap model) {
		taskDAO.delete(task_Id);;
		return "redirect:/existingTask";
	}
	@RequestMapping(value = "task/update/{task_Id}")
	public String  updateTask(@PathVariable("task_Id") int task_Id,@ModelAttribute("task") Task t) {
		ModelAndView model=new ModelAndView("/existing");
		t=taskDAO.getTask(task_Id);
		t.setStatus("Done");
		model.addObject("task", task);
		model.addObject("taskList", this.taskDAO.list());
		taskDAO.saveOrUpdate(t);
		return "redirect:/existingTask";
	}
	@RequestMapping(value = "/tocreateTask", method = RequestMethod.POST)
	public String addTasks(@ModelAttribute("task") Task task)
	{
		
		taskDAO.saveOrUpdate(task);
		return "redirect:/existingTask";
	}
}
