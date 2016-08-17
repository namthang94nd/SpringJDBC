package com.thang.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
 
import com.thang.spring.Department;
import org.springframework.jdbc.core.RowMapper;
 
public class DepartmentMapper implements RowMapper<Department> {
 
   public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
       Integer deptId = rs.getInt("dept_id");
       String deptNo = rs.getString("dept_no");
       String deptName = rs.getString("dept_name");
       String location = rs.getString("location");
 
       return new Department(deptId, deptNo, deptName, location);
   }
 
}
