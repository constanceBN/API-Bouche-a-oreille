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

import co.simplon.boucheaoreille.model.AdviceSheet;
import co.simplon.boucheaoreille.repository.AdviceSheetRepository;

@RestController
@RequestMapping("/api")
public class AdviceSheetController {
	
	@Autowired
	AdviceSheetRepository repository;
	
	@GetMapping("/adviceSheet")
	List<AdviceSheet> getAllAdviceSheet() {
		return repository.findAll();
	}
	
	@GetMapping("/adviceSheet/{idAdviceSheet}")
	ResponseEntity<AdviceSheet> getAdviceSheetById(@PathVariable long idAdviceSheet) {
		AdviceSheet adviceSheet = repository.findOne(idAdviceSheet);
		if (adviceSheet == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(adviceSheet);
	}
	
	@PostMapping("/adviceSheet/add")
	AdviceSheet addAdviceSheet(@Valid @RequestBody AdviceSheet adviceSheet) {
		return repository.save(adviceSheet);
	}

	@PostMapping("/adviceSheet/multiple")
	List<AdviceSheet> addMultipleAdviceSheet(@Valid @RequestBody List<AdviceSheet> adviceSheet) {
		return repository.save(adviceSheet);
	}

}
