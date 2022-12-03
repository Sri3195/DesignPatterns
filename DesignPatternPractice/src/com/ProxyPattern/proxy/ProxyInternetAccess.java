package com.ProxyPattern.proxy;

import com.ProxyPattern.modal.*;

public class ProxyInternetAccess implements OfficeInternetAccess{
	
	private String employeeName;
	private RealInternetAccess realaccess;
	
	public ProxyInternetAccess(String employeeName) {
		this.employeeName=employeeName;
	}

	@Override
	public void grantInternetAccess() {
		
		if(getRole(employeeName)>4) {
			realaccess= new RealInternetAccess(employeeName);
			realaccess.grantInternetAccess();
		}
		
		else
		{
			System.out.println("No internet access granted.Your job level is less than 5");
		}
		
	}
	
	public int getRole(String empName) {
		return 9;
	}
}
