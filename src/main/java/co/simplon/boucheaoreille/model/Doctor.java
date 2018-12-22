package co.simplon.boucheaoreille.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class Doctor.
 */
@Entity
public class Doctor {

	/** The id doctor. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idDoctor;

	/** The name. */
	private String name;

	/** The address. */
	private String address;

	// Generate Getters and Setters 
	/**
	 * Gets the id doctor.
	 *
	 * @return the id doctor
	 */
	public long getIdDoctor() {
		return idDoctor;
	}

	/**
	 * Sets the id doctor.
	 *
	 * @param idDoctor the new id doctor
	 */
	public void setIdDoctor(long idDoctor) {
		this.idDoctor = idDoctor;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
