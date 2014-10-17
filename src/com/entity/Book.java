package com.entity;

import com.opensymphony.xwork2.ActionSupport;

public class Book extends ActionSupport {
	String ISBN;
	String title;
	String authorID;
	String publisher;
	String publishDate;
	String price;
	public String getISBN() {
		return ISBN;
		}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
		}
	public String getTitle() {
		return title;
		}
	public void setTitle(String title) {
		this.title = title;
		}
	public String getAuthorID() {
		return authorID;
		}
	public void setAuthorID(String authorID) {
		this.authorID = authorID;
		}
	public String getPublisher() {
		return publisher;
		}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
		}
	public String getPublishDate() {
		return publishDate;
		}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
		}
	public String getPrice() {
		return price;
		}
		public void setPrice(String price) {
			this.price = price;
			}
}