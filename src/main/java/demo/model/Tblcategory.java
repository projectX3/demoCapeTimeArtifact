package demo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblcategories database table.
 * 
 */
@Entity
@Table(name="tblcategories")
@NamedQuery(name="Tblcategory.findAll", query="SELECT t FROM Tblcategory t")
public class Tblcategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int categoryID;

	private String category;

	private String uniquekey;

	public Tblcategory() {
	}

	public int getCategoryID() {
		return this.categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getUniquekey() {
		return this.uniquekey;
	}

	public void setUniquekey(String uniquekey) {
		this.uniquekey = uniquekey;
	}

}