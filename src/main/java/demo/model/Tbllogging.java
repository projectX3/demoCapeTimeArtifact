package demo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tbllogging database table.
 * 
 */
@Entity
@NamedQuery(name="Tbllogging.findAll", query="SELECT t FROM Tbllogging t")
public class Tbllogging implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int logID;

	private String description;

	private String ipAdress;

	private Timestamp lastChange;

	//bi-directional many-to-one association to Tbluser
	@ManyToOne
	@JoinColumn(name="UserID")
	private Tbluser tbluser;

	public Tbllogging() {
	}

	public int getLogID() {
		return this.logID;
	}

	public void setLogID(int logID) {
		this.logID = logID;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIpAdress() {
		return this.ipAdress;
	}

	public void setIpAdress(String ipAdress) {
		this.ipAdress = ipAdress;
	}

	public Timestamp getLastChange() {
		return this.lastChange;
	}

	public void setLastChange(Timestamp lastChange) {
		this.lastChange = lastChange;
	}

	public Tbluser getTbluser() {
		return this.tbluser;
	}

	public void setTbluser(Tbluser tbluser) {
		this.tbluser = tbluser;
	}

}