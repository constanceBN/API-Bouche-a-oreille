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
import co.simplon.boucheaoreille.model.AdviceSheet;
import co.simplon.boucheaoreille.repository.AdviceSheetRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class AdviceSheetController.
 */
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AdviceSheetController { 

	/** The repository. */
	@Autowired
	AdviceSheetRepository repository;

	/**
	 * Adds the advice sheet.
	 *
	 * @param adviceSheet the advice sheet
	 * @return the advice sheet
	 */
	@PostMapping("/adviceSheet/add")
	AdviceSheet addAdviceSheet(@Valid @RequestBody AdviceSheet adviceSheet) {
		return repository.save(adviceSheet);
	}

	/**
	 * Gets the advice sheet by id.
	 *
	 * @param idAdviceSheet the id advice sheet
	 * @return the advice sheet by id
	 */
	@GetMapping("/adviceSheet/{idAdviceSheet}")
	ResponseEntity<AdviceSheet> getAdviceSheetById(@PathVariable(value = "idAdviceSheet") long idAdviceSheet) {
		AdviceSheet adviceSheet = repository.findOne(idAdviceSheet);
		if (adviceSheet == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(adviceSheet);
	}

	/**
	 * Update advice sheet.
	 *
	 * @param id the id
	 * @param adviceSheet the advice sheet
	 * @return the response entity
	 */
	@PutMapping("/adviceSheet/{idAdviceSheet}")
	ResponseEntity<AdviceSheet> updateAdviceSheet(@PathVariable(value = "idUser") long id, @Valid @RequestBody AdviceSheet adviceSheet) {
		AdviceSheet adviceSheetToUpdate = repository.findOne(id);
		if (adviceSheetToUpdate == null)
			return ResponseEntity.notFound().build();

		adviceSheetToUpdate.setOnTime(adviceSheet.isOnTime());
		adviceSheetToUpdate.setListening(adviceSheet.isListening());
		adviceSheetToUpdate.setGentle(adviceSheet.isGentle());
		adviceSheetToUpdate.setExcessOfHonorary(adviceSheet.isExcessOfHonorary());
		adviceSheetToUpdate.setModernEquipment(adviceSheet.isModernEquipment());
		adviceSheetToUpdate.setDifficultToMakeAppointment(adviceSheet.isDifficultToMakeAppointment());

		AdviceSheet updatedAdviceSheet = repository.save(adviceSheetToUpdate);
		return ResponseEntity.ok(updatedAdviceSheet);
	}
	
	/**
	 * Delete advice sheet.
	 *
	 * @param idAdviceSheet the id advice sheet
	 * @return the response entity
	 */
	@DeleteMapping("/adviceSheet/{idAdviceSheet}")
	ResponseEntity<AdviceSheet> deleteAdviceSheet(@PathVariable(value = "idAdviceSheet") long idAdviceSheet) {
		AdviceSheet adviceSheet = repository.findOne(idAdviceSheet);
		if (adviceSheet == null)
			return ResponseEntity.notFound().build();

		repository.delete(adviceSheet);
		return ResponseEntity.ok().build();
	} 

}
