package com.Action;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.entity.*;
public class DatailAction extends ActionSupport {
	String ISBN_tp;
	String authorID_tp;
	
	public List<Book> list3;
	public List<Book> Infolist3 = new ArrayList<Book>();
	public List<Author> list4;
	public List<Author> Infolist4 = new ArrayList<Author>();
	public List<Book> getList3() {
		  return list3;
		 }
	public void setList3(List<Book> list3) {
		  this.list3 = list3;
		 }
	public List<Author> getList4() {
		  return list4;
		 }
	public void setList4(List<Author> list4) {
		  this.list4 = list4;
		 }
	
	public String getISBN_tp() {
		return ISBN_tp;
		}
	public void setISBN_tp(String ISBN_tp) {
		this.ISBN_tp = ISBN_tp;
		}
	public String getAuthorID_tp() {
		return authorID_tp;
		}
	public void setAuthorID_tp(String authorID_tp) {
		this.authorID_tp= authorID_tp;
		}
	public String execute() {
		// TODO 自动生成的方法存根
		try{
			Connection conn;
			Statement stmt;
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","10248092");
			stmt=conn.createStatement();
			ResultSet res2=stmt.executeQuery("SELECT title,price,publisher,publishDate from Book "
					+ "where Book.ISBN='"+ISBN_tp+"'");
			while(res2.next()){
				Book book = new Book();
				book.setTitle(res2.getString("title"));
				book.setPrice(res2.getString("price"));
				book.setPublisher(res2.getString("publisher"));
				book.setPublishDate(res2.getString("publishDate"));
				Infolist3.add(book);
			}
			this.setList3(Infolist3);
			ResultSet res=stmt.executeQuery("SELECT * from Author "
					+ "where Author.authorID='"+authorID_tp+"'");
			while(res.next()){
				Author author = new Author();
				author.setAuthorID(res.getString("authorID"));
				author.setName(res.getString("name"));
				author.setAge(res.getString("age"));
				author.setCountry(res.getString("country"));
				Infolist4.add(author);
			}
			this.setList4(Infolist4);
			res.close();
			res2.close();
		}catch(Exception e){
			System.out.println(e);
			return ERROR;
		}
		return SUCCESS;
	}
}












