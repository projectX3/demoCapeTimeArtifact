package demo.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * The persistent class for the tbluser database table.
 */
@Entity
@NamedQuery(name = "Tbluser.findAll", query = "SELECT t FROM Tbluser t")
public class Tbluser implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private int userID;

    private String emailadresse;

    private Timestamp lastchange;

    private String password;

    private String user;

    // bi-directional many-to-one association to Tbllogging
    @OneToMany(mappedBy = "tbluser")
    private List<Tbllogging> tblloggings;

    // bi-directional many-to-one association to Tbltask
    @OneToMany(mappedBy = "tbluser")
    private List<Tbltask> tbltasks;

    // bi-directional many-to-one association to Tbltodo
    @OneToMany(mappedBy = "tbluser1")
    private List<Tbltodo> tbltodos1;

    // bi-directional many-to-one association to Tbltodo
    @OneToMany(mappedBy = "tbluser2")
    private List<Tbltodo> tbltodos2;

    // bi-directional many-to-one association to Tblcustomer
    @ManyToOne
    @JoinColumn(name = "CustomerID")
    private Tblcustomer tblcustomer;

    public Tbluser() {
    }

    public int getUserID() {
        return this.userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getEmailadresse() {
        return this.emailadresse;
    }

    public void setEmailadresse(String emailadresse) {
        this.emailadresse = emailadresse;
    }

    public Timestamp getLastChange() {
        return this.lastchange;
    }

    public void setLastChange(Timestamp lastChange) {
        this.lastchange = lastChange;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public List<Tbllogging> getTblloggings() {
        return this.tblloggings;
    }

    public void setTblloggings(List<Tbllogging> tblloggings) {
        this.tblloggings = tblloggings;
    }

    public Tbllogging addTbllogging(Tbllogging tbllogging) {
        getTblloggings().add(tbllogging);
        tbllogging.setTbluser(this);

        return tbllogging;
    }

    public Tbllogging removeTbllogging(Tbllogging tbllogging) {
        getTblloggings().remove(tbllogging);
        tbllogging.setTbluser(null);

        return tbllogging;
    }

    public List<Tbltask> getTbltasks() {
        return this.tbltasks;
    }

    public void setTbltasks(List<Tbltask> tbltasks) {
        this.tbltasks = tbltasks;
    }

    public Tbltask addTbltask(Tbltask tbltask) {
        getTbltasks().add(tbltask);
        tbltask.setTbluser(this);

        return tbltask;
    }

    public Tbltask removeTbltask(Tbltask tbltask) {
        getTbltasks().remove(tbltask);
        tbltask.setTbluser(null);

        return tbltask;
    }

    public List<Tbltodo> getTbltodos1() {
        return this.tbltodos1;
    }

    public void setTbltodos1(List<Tbltodo> tbltodos1) {
        this.tbltodos1 = tbltodos1;
    }

    public Tbltodo addTbltodos1(Tbltodo tbltodos1) {
        getTbltodos1().add(tbltodos1);
        tbltodos1.setTbluser1(this);

        return tbltodos1;
    }

    public Tbltodo removeTbltodos1(Tbltodo tbltodos1) {
        getTbltodos1().remove(tbltodos1);
        tbltodos1.setTbluser1(null);

        return tbltodos1;
    }

    public List<Tbltodo> getTbltodos2() {
        return this.tbltodos2;
    }

    public void setTbltodos2(List<Tbltodo> tbltodos2) {
        this.tbltodos2 = tbltodos2;
    }

    public Tbltodo addTbltodos2(Tbltodo tbltodos2) {
        getTbltodos2().add(tbltodos2);
        tbltodos2.setTbluser2(this);

        return tbltodos2;
    }

    public Tbltodo removeTbltodos2(Tbltodo tbltodos2) {
        getTbltodos2().remove(tbltodos2);
        tbltodos2.setTbluser2(null);

        return tbltodos2;
    }

    public Tblcustomer getTblcustomer() {
        return this.tblcustomer;
    }

    public void setTblcustomer(Tblcustomer tblcustomer) {
        this.tblcustomer = tblcustomer;
    }

}