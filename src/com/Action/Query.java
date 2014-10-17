package com.Action;
import com.entity.*;

import java.sql.*;
import java.util.*;

import com.opensymphony.xwork2.ActionSupport;

public class Query extends ActionSupport {
	public List<Book> list;
	public List<Book> Infolist = new ArrayList<Book>();
	public List<Author> list2;
	public List<Author> Infolist2 = new ArrayList<Author>();
	String name_tp;	
	public String getName_tp() {
		return name_tp;
		}
	public void setName_tp(String name_tp) {
		this.name_tp = name_tp;
		}
	public List<Book> getList() {
		  return list;
		 }
	public void setList(List<Book> list) {
		  this.list = list;
		 }
	public List<Author> getList2() {
		  return list2;
		 }
	public void setList2(List<Author> list2) {
		  this.list2 = list2;
		 }
	public String execute()throws Exception  {
		String temp=null;
		try{
			Connection conn;
			Statement stmt;
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","10248092");
			stmt=conn.createStatement();
			ResultSet res2=stmt.executeQuery("SELECT authorID from Author "
					+ "where Author.name='"+name_tp+"'");
			 while (res2.next()) {
					Author author = new Author();
					author.setAuthorID(res2.getString("authorID"));
					temp=res2.getString("authorID");
					Infolist2.add(author);
				  }
			 this.setList2(Infolist2);
			 String tp_authorID=temp;
			ResultSet res=stmt.executeQuery("SELECT ISBN,title,authorID from Book "
					+ "where Book.authorID='"+tp_authorID+"'");
			 while (res.next()) {
				   Book book = new Book();
				   book.setISBN(res.getString("ISBN"));
				   book.setTitle(res.getString("title"));
				   book.setAuthorID(res.getString("authorID"));
				   Infolist.add(book);
				  }
				  //×¢Èë
				  this.setList(Infolist);
			res.close();
			res2.close();
		}catch(Exception e){
			System.out.println("Error:"+e);
			return ERROR;
		}
		return SUCCESS;
	}
}