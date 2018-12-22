package co.simplon.boucheaoreille.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

// TODO: Auto-generated Javadoc
/**
 * The Class User.
 */
@Entity
public class User {

	/** The id user. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idUser;
	
	/** The advice sheet. */
	@OneToMany
	private List<AdviceSheet> adviceSheet;

	/** The pseudo. */
	private String pseudo;

	/** The email. */
	private String email;

	/** The password. */
	private String password;

	/** The is admin. */
	private boolean isAdmin;

	// Generate Getters and Setters 
	/**
	 * Gets the id user.
	 *
	 * @return the id user
	 */
	public Long getIdUser() {
		return idUser;
	}

	/**
	 * Sets the id user.
	 *
	 * @param idUser the new id user
	 */
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	/**
	 * Gets the pseudo.
	 *
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * Sets the pseudo.
	 *
	 * @param pseudo the new pseudo
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Checks if is admin.
	 *
	 * @return true, if is admin
	 */
	public boolean isAdmin() {
		return isAdmin;
	}

	/**
	 * Sets the admin.
	 *
	 * @param isAdmin the new admin
	 */
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	/**
	 * Gets the advice sheet.
	 *
	 * @return the advice sheet
	 */
	public List<AdviceSheet> getAdviceSheet() {
		return adviceSheet;
	}

	/**
	 * Sets the advice sheet.
	 *
	 * @param adviceSheet the new advice sheet
	 */
	public void setAdviceSheet(List<AdviceSheet> adviceSheet) {
		this.adviceSheet = adviceSheet;
	}

}
