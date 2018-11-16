package co.simplon.boucheaoreille.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.boucheaoreille.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
