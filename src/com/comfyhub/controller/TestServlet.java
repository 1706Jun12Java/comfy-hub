package com.comfyhub.controller;

import java.io.IOException;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.comfyhub.dao.PaymentDao;
import com.comfyhub.dao.PaymentDaoImpl;
import com.comfyhub.dao.UserDao;
import com.comfyhub.dao.UserDaoImpl;
import com.comfyhub.domain.*;
import com.comfyhub.main.Driver;


//@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;    
   
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("start");
	Driver d = new Driver();
		d.init();
		/*
		User u1 = new User("John","Smith","jsmith@gmail.com","718-667-5676","356 Woodhaven Blvd"); 
		Payment p1 = new Payment(50000,"USD","123454543","565",10,2020, u1);
		UserDao ud = new UserDaoImpl();
		ud.createUser(u1);
		PaymentDao pd = new PaymentDaoImpl(); 
		pd.createPayment(p1);
		System.out.println(pd.getPayment(u1));*/
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
