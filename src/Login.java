import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.commons.httpclient.NameValuePair;

/**
 * Login.java.java Create on 2012-9-26下午1:48:42 
 * 
 * 
 * Copyright (c) 2012 by MTA.
 * 
 * @author lmeteor
 * @Email txin0814@sina.com
 * @description 
 * @version 1.0
 */
public class Login
{
	 /**
     * 实现登录操作
     * @throws UnsupportedEncodingException
     */
	
	private String loginURL;
	private String loginParams;
    
    public static void main(String[] args) throws UnsupportedEncodingException{
        Login login = new Login("https://www.flybuys.com.au/home", 
        		"disableMbrNumPost=false&fullCardNumber=6008944840337917&password=wahaha1988");
        login.doLogin();
    }
 
	
	public Login(String loginURL, String login)
	{
		this.loginURL=loginURL;
		this.loginParams= login;
	}

    public void doLogin() throws UnsupportedEncodingException
    {
    	List<NameValuePair> pList= HttpDoPostUtils.createNameValuePair(loginParams);
    	String loginResponseText= HttpDoPostUtils.doRequestToString(loginURL, pList);
        System.out.println(loginResponseText);
        
    }
    

}