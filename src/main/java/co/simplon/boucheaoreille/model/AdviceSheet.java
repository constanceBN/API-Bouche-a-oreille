package co.simplon.boucheaoreille.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

// TODO: Auto-generated Javadoc
/**
 * The Class AdviceSheet.
 */
@Entity
public class AdviceSheet {

	/** The id advice sheet. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAdviceSheet;

	/** The doctor. */
	@ManyToOne
	private Doctor doctor;

	/** The is on time. */
	private boolean isOnTime;
	
	/** The is listening. */
	private boolean isListening;
	
	/** The is gentle. */
	private boolean isGentle;
	
	/** The is excess of honorary. */
	private boolean isExcessOfHonorary;
	
	/** The is modern equipment. */
	private boolean isModernEquipment;
	
	/** The is difficult to make appointment. */
	private boolean isDifficultToMakeAppointment;

	// Generate Getters and Setters 
	/**
	 * Gets the id advice sheet.
	 *
	 * @return the id advice sheet
	 */
	public Long getIdAdviceSheet() {
		return idAdviceSheet;
	}

	/**
	 * Sets the id advice sheet.
	 *
	 * @param idAdviceSheet the new id advice sheet
	 */
	public void setIdAdviceSheet(Long idAdviceSheet) {
		this.idAdviceSheet = idAdviceSheet;
	}

	/**
	 * Checks if is on time.
	 *
	 * @return true, if is on time
	 */
	public boolean isOnTime() {
		return isOnTime;
	}

	/**
	 * Sets the on time.
	 *
	 * @param isOnTime the new on time
	 */
	public void setOnTime(boolean isOnTime) {
		this.isOnTime = isOnTime;
	}

	/**
	 * Checks if is listening.
	 *
	 * @return true, if is listening
	 */
	public boolean isListening() {
		return isListening;
	}

	/**
	 * Sets the listening.
	 *
	 * @param isListening the new listening
	 */
	public void setListening(boolean isListening) {
		this.isListening = isListening;
	}

	/**
	 * Checks if is gentle.
	 *
	 * @return true, if is gentle
	 */
	public boolean isGentle() {
		return isGentle;
	}

	/**
	 * Sets the gentle.
	 *
	 * @param isGentle the new gentle
	 */
	public void setGentle(boolean isGentle) {
		this.isGentle = isGentle;
	}

	/**
	 * Checks if is excess of honorary.
	 *
	 * @return true, if is excess of honorary
	 */
	public boolean isExcessOfHonorary() {
		return isExcessOfHonorary;
	}

	/**
	 * Sets the excess of honorary.
	 *
	 * @param isExcessOfHonorary the new excess of honorary
	 */
	public void setExcessOfHonorary(boolean isExcessOfHonorary) {
		this.isExcessOfHonorary = isExcessOfHonorary;
	}

	/**
	 * Checks if is modern equipment.
	 *
	 * @return true, if is modern equipment
	 */
	public boolean isModernEquipment() {
		return isModernEquipment;
	}

	/**
	 * Sets the modern equipment.
	 *
	 * @param isModernEquipment the new modern equipment
	 */
	public void setModernEquipment(boolean isModernEquipment) {
		this.isModernEquipment = isModernEquipment;
	}

	/**
	 * Checks if is difficult to make appointment.
	 *
	 * @return true, if is difficult to make appointment
	 */
	public boolean isDifficultToMakeAppointment() {
		return isDifficultToMakeAppointment;
	}

	/**
	 * Sets the difficult to make appointment.
	 *
	 * @param isDifficultToMakeAppointment the new difficult to make appointment
	 */
	public void setDifficultToMakeAppointment(boolean isDifficultToMakeAppointment) {
		this.isDifficultToMakeAppointment = isDifficultToMakeAppointment;
	}

	/**
	 * Gets the doctor.
	 *
	 * @return the doctor
	 */
	public Doctor getDoctor() {
		return doctor;
	}

	/**
	 * Sets the doctor.
	 *
	 * @param doctor the new doctor
	 */
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

}
