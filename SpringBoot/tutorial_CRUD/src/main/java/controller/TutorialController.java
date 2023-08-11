package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import repository.TutorialRepository;

//@CrossOrigin is for configuring allowed origins

//@RestController annotation is used to define a controller and to indicate that the
//return value of the methods should be be bound to the web response body

//@RequestMapping("/api") declares that all Apis’ url in the controller will start with /api

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping
public class TutorialController {

	//We use @Autowired to inject TutorialRepository bean to local variable
	@Autowired
	TutorialRepository tutorialRepo;
	
	 
	
}
