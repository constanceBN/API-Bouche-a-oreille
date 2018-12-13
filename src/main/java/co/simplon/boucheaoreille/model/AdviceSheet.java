package co.simplon.boucheaoreille.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class AdviceSheet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAdviceSheet;

	@NotBlank
	private String doctorFullName;

	@NotBlank
	private String doctorAddress;

	@NotBlank
	private String doctorPhoneNumber;

	@NotBlank
	private String medicalSpeciality;

	private boolean isOnTime;
	private boolean isListening;
	private boolean isGentle;
	private boolean isExcessOfHonorary;
	private boolean isModernEquipment;
	private boolean isDifficultToMakeAppointment;

	// @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) 
	// private LocalDate creationDate;
	
    @ManyToOne
	private User creator; 

	public Long getIdAdviceSheet() {
		return idAdviceSheet;
	}

	public void setIdAdviceSheet(Long idAdviceSheet) {
		this.idAdviceSheet = idAdviceSheet;
	}

	public String getDoctorFullName() {
		return doctorFullName;
	}

	public void setDoctorFullName(String doctorFullName) {
		this.doctorFullName = doctorFullName;
	}

	public String getDoctorAddress() {
		return doctorAddress;
	}

	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}

	public String getDoctorPhoneNumber() {
		return doctorPhoneNumber;
	}

	public void setDoctorPhoneNumber(String doctorPhoneNumber) {
		this.doctorPhoneNumber = doctorPhoneNumber;
	}

	public String getMedicalSpeciality() {
		return medicalSpeciality;
	}

	public void setMedicalSpeciality(String medicalSpeciality) {
		this.medicalSpeciality = medicalSpeciality;
	}

	public boolean isOnTime() {
		return isOnTime;
	}

	public void setOnTime(boolean isOnTime) {
		this.isOnTime = isOnTime;
	}

	public boolean isListening() {
		return isListening;
	}

	public void setListening(boolean isListening) {
		this.isListening = isListening;
	}

	public boolean isGentle() {
		return isGentle;
	}

	public void setGentle(boolean isGentle) {
		this.isGentle = isGentle;
	}

	public boolean isExcessOfHonorary() {
		return isExcessOfHonorary;
	}

	public void setExcessOfHonorary(boolean isExcessOfHonorary) {
		this.isExcessOfHonorary = isExcessOfHonorary;
	}

	public boolean isModernEquipment() {
		return isModernEquipment;
	}

	public void setModernEquipment(boolean isModernEquipment) {
		this.isModernEquipment = isModernEquipment;
	}

	public boolean isDifficultToMakeAppointment() {
		return isDifficultToMakeAppointment;
	}

	public void setDifficultToMakeAppointment(boolean isDifficultToMakeAppointment) {
		this.isDifficultToMakeAppointment = isDifficultToMakeAppointment;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

    /* public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
    */
}
