package com.abe.java_basic.text4_8;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable{
	private String title;
	private Date publishDate;
	private String comment;
	
	public Book() {
		super();
	}

	public Book(String title, Date publishDate, String comment) {
		this.title = title;
		this.publishDate = publishDate;
		this.comment = comment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(publishDate, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(publishDate, other.publishDate) && Objects.equals(title, other.title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", publishDate=" + publishDate + ", comment=" + comment + "]";
	}
	public int compareTo(Book obj) {
		if(this.publishDate.getTime() < obj.getPublishDate().getTime()) {
			return -1;
		}else if (this.publishDate.getTime() > obj.getPublishDate().getTime()) {
			return 1;
		}
		return 0;
	}
	
	public Book clone() {
		Book result = new Book();
		result.title = this.title;
		result.publishDate = this.publishDate;
		result.comment = this.comment;
		return result;
		
	}
	
	

}
