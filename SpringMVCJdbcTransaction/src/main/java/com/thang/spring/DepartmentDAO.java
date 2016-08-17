package com.thang.spring;

import java.util.List;

import com.thang.spring.Department;
 
public interface DepartmentDAO {
 
   public Department findDepartment(String deptNo);
 
   public void insertDepartment(String deptName, String location);
 
   public List<Department> listDepartment();
}
