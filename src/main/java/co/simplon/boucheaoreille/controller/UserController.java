package co.simplon.boucheaoreille.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.simplon.boucheaoreille.model.User;
import co.simplon.boucheaoreille.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserRepository repository;

	@GetMapping("/user")
	List<User> getAllUser() {
		return repository.findAll();
	}

	@GetMapping("/user/{idUser}")
	ResponseEntity<User> getUserById(@PathVariable long idUser) {
		User user = repository.findOne(idUser);
		if (user == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(user);
	}

	@PostMapping("/user/add")
	User addUser(@Valid @RequestBody User user) {
		return repository.save(user);
	}

	@PostMapping("/user/multiple")
	List<User> addMultipleUser(@Valid @RequestBody List<User> user) {
		return repository.save(user);
	}

}
