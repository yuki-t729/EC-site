package jp.co.internous.ecsite.model.domain;

public class MstUser {
	
	private int id;
	
	private String userName;
	
	private String password;
	
	private String fullName;
	
	private int isAdmin;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFullname() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public int getIsAdmin() {
		return isAdmin;
	}
	
	public void SetIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
}
