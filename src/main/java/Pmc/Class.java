package Pmc;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.Employeedao;
import dto.Employee;

public class Class extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		String s1=arg0.getParameter("empid");
		int empid=Integer.parseInt(s1);
		
		String empname=arg0.getParameter("empname");
		
		Employee employee=new Employee();
		employee.setEmpid(empid);
		employee.setEmpname(empname);
		
		Employeedao employeedao= new Employeedao();
		employeedao.insert(employee);
	}

}
