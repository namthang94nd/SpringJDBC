package com.thang.spring;

import java.util.List;

import com.thang.spring.DepartmentDAO;
import com.thang.spring.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class MainController {
 
   @Autowired
   private DepartmentDAO departmentDAO;
 
   @RequestMapping(value = { "/" }, method = RequestMethod.GET)
   public String welcomePage(Model model) {
       departmentDAO.insertDepartment("HR", "Chicago");
       departmentDAO.insertDepartment("INV", "Hanoi");
       List<Department> list = departmentDAO.listDepartment();
       model.addAttribute("departments", list);
       return "index";
   }
}
