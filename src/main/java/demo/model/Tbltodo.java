package demo.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the tbltodos database table.
 */
@Entity
@Table(name = "tbltodos")
@NamedQuery(name = "Tbltodo.findAll", query = "SELECT t FROM Tbltodo t")
public class Tbltodo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private int todoID;

    private Timestamp creationdate;

    private String details;

    @Temporal(TemporalType.DATE)
    private Date duedate;

    private Timestamp lastchange;

    private int plannedeffort;

    @Temporal(TemporalType.TIMESTAMP)
    private Date reminderdate;

    private String title;

    // bi-directional many-to-one association to Tblpriority
    @ManyToOne
    @JoinColumn(name = "PriorityID")
    private Tblpriority tblpriority;

    // bi-directional many-to-one association to Tblcategory
    @ManyToOne
    @JoinColumn(name = "CategoryID")
    private Tblcategory tblcategory;

    // bi-directional many-to-one association to Tblcustomer
    @ManyToOne
    @JoinColumn(name = "CustomerID")
    private Tblcustomer tblcustomer;

    // bi-directional many-to-one association to Tblstatus
    @ManyToOne
    @JoinColumn(name = "StatusID")
    private Tblstatus tblstatus;

    // bi-directional many-to-one association to Tbluser
    @ManyToOne
    @JoinColumn(name = "CreatorID")
    private Tbluser tbluser1;

    // bi-directional many-to-one association to Tbluser
    @ManyToOne
    @JoinColumn(name = "OwnerID")
    private Tbluser tbluser2;

    // bi-directional many-to-one association to Tblpriority
    @ManyToOne
    @JoinColumn(name = "ListID")
    private Tbllist tbllist;

    // bi-directional many-to-one association to Tbltask
    @OneToMany(mappedBy = "tbltodo")
    private List<Tbltask> tbltasks;

    public Tbltodo() {
    }

    public int getToDoID() {
        return this.todoID;
    }

    public void setToDoID(int toDoID) {
        this.todoID = toDoID;
    }

    public Timestamp getCreationDate() {
        return this.creationdate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationdate = creationDate;
    }

    public String getDetails() {
        return this.details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getDueDate() {
        return this.duedate;
    }

    public void setDueDate(Date dueDate) {
        this.duedate = dueDate;
    }

    public Timestamp getLastChange() {
        return this.lastchange;
    }

    public void setLastChange(Timestamp lastChange) {
        this.lastchange = lastChange;
    }

    public int getPlannedEffort() {
        return this.plannedeffort;
    }

    public void setPlannedEffort(int plannedEffort) {
        this.plannedeffort = plannedEffort;
    }

    public Date getReminderDate() {
        return this.reminderdate;
    }

    public void setReminderDate(Date reminderDate) {
        this.reminderdate = reminderDate;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Tblpriority getTblpriority() {
        return this.tblpriority;
    }

    public void setTblpriority(Tblpriority tblpriority) {
        this.tblpriority = tblpriority;
    }

    public Tblcategory getTblcategory() {
        return this.tblcategory;
    }

    public void setTblcategory(Tblcategory tblcategory) {
        this.tblcategory = tblcategory;
    }

    public Tblcustomer getTblcustomer() {
        return this.tblcustomer;
    }

    public void setTblcustomer(Tblcustomer tblcustomer) {
        this.tblcustomer = tblcustomer;
    }

    public Tblstatus getTblstatus() {
        return this.tblstatus;
    }

    public void setTblstatus(Tblstatus tblstatus) {
        this.tblstatus = tblstatus;
    }

    public Tbluser getTbluser1() {
        return this.tbluser1;
    }

    public void setTbluser1(Tbluser tbluser1) {
        this.tbluser1 = tbluser1;
    }

    public Tbluser getTbluser2() {
        return this.tbluser2;
    }

    public void setTbluser2(Tbluser tbluser2) {
        this.tbluser2 = tbluser2;
    }

    public Tbllist getTbllist() {
        return this.tbllist;
    }

    public void setList(Tbllist tbllist) {
        this.tbllist = tbllist;
    }

    public List<Tbltask> getTbltasks() {
        return this.tbltasks;
    }

    public void setTbltasks(List<Tbltask> tbltasks) {
        this.tbltasks = tbltasks;
    }

    public Tbltask addTbltask(Tbltask tbltask) {
        getTbltasks().add(tbltask);
        tbltask.setTbltodo(this);

        return tbltask;
    }

    public Tbltask removeTbltask(Tbltask tbltask) {
        getTbltasks().remove(tbltask);
        tbltask.setTbltodo(null);

        return tbltask;
    }

}