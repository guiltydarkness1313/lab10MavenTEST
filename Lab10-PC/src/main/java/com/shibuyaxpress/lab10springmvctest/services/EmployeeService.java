package com.shibuyaxpress.lab10springmvctest.services;

import com.shibuyaxpress.lab10springmvctest.exception.DAOException;
import com.shibuyaxpress.lab10springmvctest.exception.EmptyResultException;
import com.shibuyaxpress.lab10springmvctest.model.Employee;

public interface EmployeeService {
	
	Employee find(int employee_id) throws DAOException, EmptyResultException;

}
