package com.ProxyPattern.app;
import com.ProxyPattern.modal.*;
import com.ProxyPattern.proxy.*;


public class ProxyPattern {
	public static void main(String[] args) {
		OfficeInternetAccess access=new ProxyInternetAccess("Srilakshmi");
				access.grantInternetAccess();
	}

}
