package com.Action;
import java.sql.*;

import com.entity.*;
import com.opensymphony.xwork2.ActionSupport;

public class DelectAction extends ActionSupport {
	String ISBN_fw;
	String authorID_fw;
	int flag;
	public int getFlag(){
		return flag;
	 }
	 public void setFlag(int flag){
		 this.flag=flag;
	 }
	public String getISBN_fw() {
		return ISBN_fw;
		}
	public void setISBN_fw(String ISBN_fw) {
		this.ISBN_fw = ISBN_fw;
		}
	public String getAuthorID_fw() {
		return authorID_fw;
		}
	public void setAuthorID_fw(String authorID_fw) {
		this.authorID_fw= authorID_fw;
		}
	public String execute() {
		// TODO 自动生成的方法存根
		PreparedStatement res;
		PreparedStatement tp_res;
		try{
			Connection conn;
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","10248092");
			String tp_sql = "delete from Book where ISBN='"+ISBN_fw+"'";
			tp_res=conn.prepareStatement(tp_sql);
			tp_res.executeUpdate();
			
			Statement stmt=conn.createStatement();
			ResultSet res2=stmt.executeQuery("SELECT authorID from Author where authorID='"+authorID_fw+"'");
			 while (res2.next()) {
					flag=flag+1;
				  }
			if(flag<=1){
				String sql = "delete from Author where authorID='"+authorID_fw+"'";
				res=conn.prepareStatement(sql);
				res.executeUpdate();
			}
		}catch(Exception e){
			System.out.println(e);
			return ERROR;
		}
		return SUCCESS;
	}	
}