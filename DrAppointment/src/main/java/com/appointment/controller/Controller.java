package com.appointment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.appointment.appointment.Appointment;
import com.appointment.appointment.AppointmentRepository;
import com.appointment.doctor.Doctor;
import com.appointment.doctor.DoctorRepository;
import com.appointment.person.Person;
import com.appointment.person.PersonRepository;



@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	PersonRepository personRepo;
	@Autowired
	DoctorRepository doctorRepo;
	@Autowired
	AppointmentRepository appRepo;
	@Autowired
	Person person;
	@Autowired
	Doctor doctor;
	@Autowired
	Appointment app;
	// Home Page
	@GetMapping("/")
	public String home() {
		return "start";
	}
	// About US
	@GetMapping("/aboutus")
	public String aboutUs() {
		return "aboutus";
	}
	// Patient Login
	@GetMapping("/patlog")
	public String patlog(Model model) {
		model.addAttribute("person", new Person());
		return "patlog";
	}
	// Register Patient Template
	@GetMapping("/registerpatient")
	public String register(Model model) {
		model.addAttribute("person", new Person());
		return "registerpatient";
	}
	// Patient Registeration
	@PostMapping("/registered")
	public String registered(@ModelAttribute Person person, Model model) {
		
		Person save = personRepo.save(person);
//		model.addAttribute("person", new Person());
		String getpEmail = save.getpEmail();
		model.addAttribute("message", getpEmail);		
		return "success_register";
	}
	// Patient Login validation
	@PostMapping("/authenticate")
	public String authenticate(@ModelAttribute Person person, jakarta.servlet.http.HttpSession session, Model model) {
		if(personRepo.existsById(person.getpEmail()) && personRepo.findById(person.getpEmail()).get().getpPassword().equals(person.getpPassword())) {
			model.addAttribute("pers", person.getpEmail()); 
			session.setAttribute("pers", person.getpEmail());
			return "/home";
			}
			return "redirect:/fail_login";
	}
	// Patient Home Page post Login
	@GetMapping("/home")
	public String display(@ModelAttribute Person person, Model model) {
		model.getAttribute("pers"); 
		return "home";
	}
	
	@GetMapping("/userdetails")
	public String appoinment(jakarta.servlet.http.HttpSession session) {
		session.getAttribute("pers");
		System.out.println(session.getAttribute("pers"));
		return "/appointed";
	}
	
	// Doctor Login Page
	@GetMapping("/doclog")
	public String doclog(Model model) {
		model.addAttribute("doctor", new Doctor());
		return "doclog";
	}
	
	// Register Doctor Template
	@GetMapping("/registerdoctor")
	public String registerdoc(Model model) {
		model.addAttribute("doctor", new Doctor());
		return "registerdoctor";
	}
	
	// Doctor Registeration
	@PostMapping("/registereddoc")
	public String registereddoc(@ModelAttribute Doctor doctor, Model model) {
		
		Doctor save = doctorRepo.save(doctor);
//		model.addAttribute("person", new Person());
		String getdEmail = save.getdEmail();
		model.addAttribute("message", getdEmail);		
		return "success_register";
	}
	// Doctor List
	@GetMapping("/docdetails")
	public String docDetails(Model model) {
		List<Doctor> findAll = doctorRepo.findAll();
		model.addAttribute("list", findAll);
		return "doctorlist";
	}
	
	@GetMapping("/booking")
	public String booking(jakarta.servlet.http.HttpSession session, Model model) {
		model.addAttribute("app", new Appointment());
		model.getAttribute("pers");
		System.out.println(model.getAttribute("pers"));
		return "booking";
	}
	
	@PostMapping("/appbooking")
	public String appBooking(@ModelAttribute Appointment appointment, Model model) {
		
		Appointment save = appRepo.save(appointment);
//		model.addAttribute("person", new Person());
		model.addAttribute("message",save.getpEmail());		
		return "success_book";
	}
	
	@PostMapping("/authenticatedoc")
	public String authenticatedoc(@ModelAttribute Doctor doctor, jakarta.servlet.http.HttpSession session, Model model) {
		if(doctorRepo.existsById(doctor.getdEmail()) && doctorRepo.findById(doctor.getdEmail()).get().getdPassword().equals(doctor.getdPassword())) {
			model.addAttribute("pers", doctor.getdEmail()); 
			session.setAttribute("pers", doctor.getdEmail());
			return "patientlist";
			}
			return "fail_login";
	}
	

	
	@GetMapping("/appointed")
	public String appointedPerson(Model model) {
		model.addAttribute("doctor", new Doctor());
		return "appointed";
	}
}
