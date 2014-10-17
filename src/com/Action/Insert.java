
package com.Action;

import java.sql.*;
import com.opensymphony.xwork2.ActionSupport;

public class Insert extends ActionSupport {
	String ISBN1;
	String title1;
	String authorID1;
	String publisher1;
	String publishDate1;
	String price1;
	public String getISBN1() {
		return ISBN1;
		}
	public void setISBN1(String ISBN1) {
		this.ISBN1 = ISBN1;
		}
	public String getTitle1() {
		return title1;
		}
	public void setTitle1(String title1) {
		this.title1 = title1;
		}
	public String getAuthorID1() {
		return authorID1;
		}
	public void setAuthorID1(String authorID1) {
		this.authorID1 = authorID1;
		}
	public String getPublisher1() {
		return publisher1;
		}
	public void setPublisher1(String publisher1) {
		this.publisher1 = publisher1;
		}
	public String getPublishDate1() {
		return publishDate1;
		}
	public void setPublishDate1(String publishDate1) {
		this.publishDate1 = publishDate1;
		}
	public String getPrice1() {
		return price1;
		}
	public void setPrice1(String price1) {
		this.price1 = price1;
		}
	
	
		
		
		
		String authorID2;
		String name2;
		String age2;
		String country2;
		public String getAuthorID2() {
			return authorID2;
			}
		public void setAuthorID2(String authorID2) {
			this.authorID2 = authorID2;
			}
		public String getName2() {
			return name2;
			}
		public void setName2(String name2) {
			this.name2 = name2;
			}
		public String getAge2() {
			return age2;
			}
		public void setAge2(String age2) {
			this.age2 = age2;
			}
		public String getCountry2() {
			return country2;
			}
		public void setCountry2(String country2) {
			this.country2 = country2;
			}
	
	
	
	public String execute() {
		// TODO 自动生成的方法存根
		PreparedStatement res;
		PreparedStatement tp_res;
		try{
			Connection conn;
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","10248092");
			String tp_sql = "insert into Author (authorID,name,age,country)"
					+ "values(?,?,?,?)";
		 tp_res=conn.prepareStatement(tp_sql);
		 tp_res.setString(1,getAuthorID2());
		 tp_res.setString(2,getName2());
		 tp_res.setString(3,getAge2());
		 tp_res.setString(4,getCountry2());
		 tp_res.executeUpdate();
			String sql = "insert into Book (ISBN,title,authorID,publisher,publishDate,price)"
					+ "values(?,?,?,?,?,?)";
			 res = conn.prepareStatement(sql);
			 res.setString(1,getISBN1());
			 res.setString(2,getTitle1());
			 res.setString(3,getAuthorID1());
			 res.setString(4,getPublisher1());
			 res.setString(5,getPublishDate1());
			 res.setString(6,getPrice1());
			 res.executeUpdate();
			 tp_res.close();
			 res.close();
		}catch(Exception e){
			System.out.println(e);
			return ERROR;
		}
		return SUCCESS;
	}
}