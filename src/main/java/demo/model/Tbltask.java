package demo.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the tbltasks database table.
 */
@Entity
@Table(name = "tbltasks")
@NamedQuery(name = "Tbltask.findAll", query = "SELECT t FROM Tbltask t")
public class Tbltask implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private int taskID;

    private String description;

    private int effort;

    private Timestamp lastchange;

    @Temporal(TemporalType.TIMESTAMP)
    private Date taskdatetime;

    // bi-directional many-to-one association to Tbltodo
    @ManyToOne
    @JoinColumn(name = "TodoID")
    private Tbltodo tbltodo;

    // bi-directional many-to-one association to Tbluser
    @ManyToOne
    @JoinColumn(name = "UserID")
    private Tbluser tbluser;

    public Tbltask() {
    }

    public int getTaskID() {
        return this.taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEffort() {
        return this.effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public Timestamp getLastchange() {
        return this.lastchange;
    }

    public void setLastchange(Timestamp lastChange) {
        this.lastchange = lastChange;
    }

    public Date getTaskdatetime() {
        return this.taskdatetime;
    }

    public void setTaskdatetime(Date taskdatetime) {
        this.taskdatetime = taskdatetime;
    }

    public Tbltodo getTbltodo() {
        return this.tbltodo;
    }

    public void setTbltodo(Tbltodo tbltodo) {
        this.tbltodo = tbltodo;
    }

    public Tbluser getTbluser() {
        return this.tbluser;
    }

    public void setTbluser(Tbluser tbluser) {
        this.tbluser = tbluser;
    }

    // public int getUserID() {
    // return this.userID;
    // }
    //
    // public void setUserID(int userID) {
    // this.userID = userID;
    // }

}