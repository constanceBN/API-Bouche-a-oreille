package co.simplon.boucheaoreille.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.simplon.boucheaoreille.model.Doctor;
import co.simplon.boucheaoreille.repository.DoctorRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class DoctorController.
 */
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DoctorController {

	/** The repository. */
	@Autowired
	DoctorRepository repository;

	/**
	 * Adds the doctor.
	 *
	 * @param doctor the doctor
	 * @return the doctor
	 */
	@PostMapping("/doctors")
	Doctor addDoctor(@Valid @RequestBody Doctor doctor) {
		return repository.save(doctor);
	}

	/**
	 * Gets the doctor by id.
	 *
	 * @param idDoctor the id doctor
	 * @return the doctor by id
	 */
	@GetMapping("/doctor/{idDoctor}")
	ResponseEntity<Doctor> getDoctorById(@PathVariable(value ="idDoctor") long idDoctor) {
		Doctor doctor = repository.findOne(idDoctor);
		if (doctor == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(doctor);
	}

	/**
	 * Update doctor.
	 *
	 * @param idDoctor the id doctor
	 * @param doctor the doctor
	 * @return the response entity
	 */
	@PutMapping("/doctor/{idDoctor}")
	ResponseEntity<Doctor> updateDoctor(@PathVariable(value="idDoctor") long idDoctor, @Valid @RequestBody Doctor doctor) {
		Doctor doctorToUpdate = repository.getOne(idDoctor);
		if (doctorToUpdate == null)
			return ResponseEntity.notFound().build();
		
		doctorToUpdate.setName(doctor.getName());
		doctorToUpdate.setAddress(doctor.getAddress());
		
		Doctor updatedDoctor = repository.save(doctorToUpdate);
		return ResponseEntity.ok(updatedDoctor);
	}
	
	/**
	 * Delete doctor.
	 *
	 * @param idDoctor the id doctor
	 * @return the response entity
	 */
	@DeleteMapping("/doctor/{idDoctor}")
	ResponseEntity<Doctor> deleteDoctor(@PathVariable(value = "idDoctor") long idDoctor) {
		Doctor doctor = repository.findOne(idDoctor);
		if (doctor == null)
			return ResponseEntity.notFound().build();

		repository.delete(doctor);
		return ResponseEntity.ok().build();
	}
}
