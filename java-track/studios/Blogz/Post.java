package Blogz;

import java.util.Date;

public class Post extends Entity {

	private String body;
	private String title;
	private String author;
	private final Date created;
	private Date modified;
	
	public Post(int UID, String body, String title, String author, Date created, Date modified) {
		
		super(UID);
		this.body = body;
		this.title = title;
		this.author = author;
		this.created = created;
		this.modified = modified;
	}
	
	public String getBody() {
		return this.body;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public Date getCreated() {
		return this.created;
	}
	
	public Date getModified() {
		return this.modified;
	}
	
	//setters
	public void setTitle() {
		Date d = new Date();
		this.modified = d;
		this.title = title;
	}
	
	public void setAuthor() {
		Date d = new Date();
		this.modified = d;
		this.author = author;
	}
	
	public void setBody() {
		Date d = new Date();
		this.modified = d;
		this.body = body;
	}
}
