package JDBC.database.dao;

import java.sql.SQLException;
import java.util.List;

import JDBC.database.entity.EmplProj;

public interface EmplProjDAO {
//	create
	void add(EmplProj emplProj) throws SQLException;

//	read
	List<EmplProj> getAll() throws SQLException;

	EmplProj getByEmployeeIdAndProjectId(Long employeeId, Long projectId) throws SQLException;

//	update
	void update(EmplProj emplProj) throws SQLException;

//	delete
	void remove(EmplProj emplProj) throws SQLException;
}
