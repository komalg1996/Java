package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity annotation indicates that the class is a persistent Java class.
//@Table annotation provides the table that maps this entity.
@Entity
@Table (name="tutorials")
public class Tutorial {

	//@Id annotation is for the primary key.
	//@GeneratedValue annotation is used to define generation strategy for the primary key. GenerationType.AUTO means Auto Increment field.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	//@Column annotation is used to define the column in database that maps annotated field.
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="published")
	private boolean published;
	
	
	public Tutorial() {
		
	}


	public Tutorial(String title, String description, boolean published) {
		super();
		this.title = title;
		this.description = description;
		this.published = published;
	}


	public long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isPublished() {
		return published;
	}


	public void setPublished(boolean published) {
		this.published = published;
	}


	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", published=" + published
				+ "]";
	}
	
	
}
