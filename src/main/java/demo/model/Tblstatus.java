package demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * The persistent class for the tblstatus database table.
 */
@Entity
@NamedQuery(name = "Tblstatus.findAll", query = "SELECT t FROM Tblstatus t")
public class Tblstatus implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private int statusID;

    private String description;

    private String status;

    private int statuslevel;

    // bi-directional many-to-one association to Tbltodo
    @OneToMany(mappedBy = "tblstatus")
    private List<Tbltodo> tbltodos;

    public Tblstatus() {
    }

    public int getStatusID() {
        return this.statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusLevel() {
        return this.statuslevel;
    }

    public void setStatusLevel(int statusLevel) {
        this.statuslevel = statusLevel;
    }

    public List<Tbltodo> getTbltodos() {
        return this.tbltodos;
    }

    public void setTbltodos(List<Tbltodo> tbltodos) {
        this.tbltodos = tbltodos;
    }

    public Tbltodo addTbltodo(Tbltodo tbltodo) {
        getTbltodos().add(tbltodo);
        tbltodo.setTblstatus(this);

        return tbltodo;
    }

    public Tbltodo removeTbltodo(Tbltodo tbltodo) {
        getTbltodos().remove(tbltodo);
        tbltodo.setTblstatus(null);

        return tbltodo;
    }

}