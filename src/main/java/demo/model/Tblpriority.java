package demo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tblpriority database table.
 * 
 */
@Entity
@NamedQuery(name="Tblpriority.findAll", query="SELECT t FROM Tblpriority t")
public class Tblpriority implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int priorityID;

	private String description;

	private String priority;

	//bi-directional many-to-one association to Tbltodo
	@OneToMany(mappedBy="tblpriority")
	private List<Tbltodo> tbltodos;

	public Tblpriority() {
	}

	public int getPriorityID() {
		return this.priorityID;
	}

	public void setPriorityID(int priorityID) {
		this.priorityID = priorityID;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public List<Tbltodo> getTbltodos() {
		return this.tbltodos;
	}

	public void setTbltodos(List<Tbltodo> tbltodos) {
		this.tbltodos = tbltodos;
	}

	public Tbltodo addTbltodo(Tbltodo tbltodo) {
		getTbltodos().add(tbltodo);
		tbltodo.setTblpriority(this);

		return tbltodo;
	}

	public Tbltodo removeTbltodo(Tbltodo tbltodo) {
		getTbltodos().remove(tbltodo);
		tbltodo.setTblpriority(null);

		return tbltodo;
	}

}