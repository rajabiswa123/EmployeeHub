package com.abs.herosofhappiness.service;

import java.util.List;

import com.abs.herosofhappiness.entity.Employee;


public interface HrService {
	public int loginHr(String email,String password);
	public String sendMailForResetPassword(String email);
	public String resetPassword(String email,String password);
	public List<Employee> findEmpByHrId(String email);
}
