package demo.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the tblcustomers database table.
 */
@Entity
@Table(name = "tblcustomers")
@NamedQuery(name = "Tblcustomer.findAll", query = "SELECT t FROM Tblcustomer t")
public class Tblcustomer implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private int customerID;

    private String customer;

    private Timestamp lastchange;

    // bi-directional many-to-one association to Tbltodo
    @OneToMany(mappedBy = "tblcustomer")
    private List<Tbltodo> tbltodos;

    // bi-directional many-to-one association to Tbluser
    // @OneToMany(mappedBy = "tblcustomer")
    // private List<Tbluser> tblusers;

    public Tblcustomer() {
    }

    public int getCustomerID() {
        return this.customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomer() {
        return this.customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Timestamp getLastChange() {
        return this.lastchange;
    }

    public void setLastChange(Timestamp lastChange) {
        this.lastchange = lastChange;
    }

    public List<Tbltodo> getTbltodos() {
        return this.tbltodos;
    }

    public void setTbltodos(List<Tbltodo> tbltodos) {
        this.tbltodos = tbltodos;
    }

    public Tbltodo addTbltodo(Tbltodo tbltodo) {
        getTbltodos().add(tbltodo);
        tbltodo.setTblcustomer(this);

        return tbltodo;
    }

    public Tbltodo removeTbltodo(Tbltodo tbltodo) {
        getTbltodos().remove(tbltodo);
        tbltodo.setTblcustomer(null);

        return tbltodo;
    }

    // public List<Tbluser> getTblusers() {
    // return this.tblusers;
    // }
    //
    // public void setTblusers(List<Tbluser> tblusers) {
    // this.tblusers = tblusers;
    // }
    //
    // public Tbluser addTbluser(Tbluser tbluser) {
    // getTblusers().add(tbluser);
    // tbluser.setTblcustomer(this);
    //
    // return tbluser;
    // }
    //
    // public Tbluser removeTbluser(Tbluser tbluser) {
    // getTblusers().remove(tbluser);
    // tbluser.setTblcustomer(null);
    //
    // return tbluser;
    // }

}