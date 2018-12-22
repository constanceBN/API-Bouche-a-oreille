package co.simplon.boucheaoreille.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.simplon.boucheaoreille.model.User;
import co.simplon.boucheaoreille.repository.UserRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class UserController.
 */
@RestController
@RequestMapping("/api")
public class UserController {

	/** The repository. */
	@Autowired
	UserRepository repository;

	/**
	 * Adds the user.
	 *
	 * @param user the user
	 * @return the user
	 */
	@PostMapping("/user/add")
	User addUser(@Valid @RequestBody User user) {
		return repository.save(user);
	}

	/**
	 * Gets the user by id.
	 *
	 * @param idUser the id user
	 * @return the user by id
	 */
	@GetMapping("/user/{idUser}")
	ResponseEntity<User> getUserById(@PathVariable long idUser) {
		User user = repository.findOne(idUser);
		if (user == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(user);
	}
	
	/**
	 * Update user.
	 *
	 * @param idUser the id user
	 * @param user the user
	 * @return the response entity
	 */
	@PutMapping("/user/{idUser}")
	ResponseEntity<User> updateUser(@PathVariable(value = "idUser") long idUser, @Valid @RequestBody User user) {
		User userToUpdate = repository.findOne(idUser);
		if (userToUpdate == null)
			return ResponseEntity.notFound().build();

		userToUpdate.setPseudo(user.getPseudo());
		userToUpdate.setEmail(user.getEmail());
		userToUpdate.setPassword(user.getPassword());
		userToUpdate.setAdmin(user.isAdmin());

		User updatedUser = repository.save(userToUpdate);
		return ResponseEntity.ok(updatedUser);
	}

	/**
	 * Delete user.
	 *
	 * @param idUser the id user
	 * @return the response entity
	 */
	@DeleteMapping("/user/{idUser}")
	ResponseEntity<User> deleteUser(@PathVariable(value = "idUser") long idUser) {
		User user = repository.findOne(idUser);
		if (user == null)
			return ResponseEntity.notFound().build();

		repository.delete(user);
		return ResponseEntity.ok().build();
	}

}
