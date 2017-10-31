package com.shibuyaxpress.lab10springmvctest.dao;

import java.util.List;

import com.shibuyaxpress.lab10springmvctest.exception.DAOException;
import com.shibuyaxpress.lab10springmvctest.exception.EmptyResultException;
import com.shibuyaxpress.lab10springmvctest.model.Employee;

public interface EmployeeDAO {

	Employee findEmployee(int id) throws DAOException, EmptyResultException;
	
	void create(String login, String password, String lastname, String firstname, int salary, int dptId) throws DAOException;

	void delete(String login) throws DAOException;

	void update(String login, String password, String lastname, String firstname, int salary, int dptId) throws DAOException;

	Employee findEmployeeByLogin(String login) throws DAOException, EmptyResultException;

	List<Employee> findAllEmployees() throws DAOException, EmptyResultException;

	List<Employee> findEmployeesByName(String name) throws DAOException, EmptyResultException;
	
	List<Employee> findEmployeesByLastName(String lastname) throws DAOException, EmptyResultException;

}
