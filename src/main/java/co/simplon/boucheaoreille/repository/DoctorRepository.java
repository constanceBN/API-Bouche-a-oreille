package co.simplon.boucheaoreille.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.boucheaoreille.model.Doctor;


/**
 * The Interface DoctorRepository.
 */
public interface DoctorRepository extends JpaRepository<Doctor, Long>{

}
