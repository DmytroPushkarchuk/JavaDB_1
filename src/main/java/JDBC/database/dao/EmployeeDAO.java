package JDBC.database.dao;

import java.sql.SQLException;
import java.util.List;

import JDBC.database.entity.Employee;

public interface EmployeeDAO {
//	create
	void add(Employee employee) throws SQLException;

//	read
	List<Employee> getAll() throws SQLException;

	Employee getById(Long id) throws SQLException;

//	update
	void update(Employee employee) throws SQLException;

//	delete
	void remove(Employee employee) throws SQLException;

}
