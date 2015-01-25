package com.malsysco.lcsconsole;

public class LoginCheckCredentials
{

	
	public Boolean passwordCheck(String pUsername, String pPassword)
	{
		String username = pUsername;
		String password = pPassword;
		System.out.println(username);
		
		return true;
	}
	
	public static void main(String [] a)
	{
		LoginCheckCredentials login = new LoginCheckCredentials();
		login.passwordCheck("wilmotLesley", "password");
	}
	
}