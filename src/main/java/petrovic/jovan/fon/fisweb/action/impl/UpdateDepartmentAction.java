/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrovic.jovan.fon.fisweb.action.impl;

import java.util.List;
import java.util.Objects;
import javax.servlet.http.HttpServletRequest;
import petrovic.jovan.fon.fisweb.action.AbstractAction;
import petrovic.jovan.fon.fisweb.constants.PageConstants;
import petrovic.jovan.fon.fisweb.model.Department;

/**
 *
 * @author KORISNIK
 */
public class UpdateDepartmentAction extends AbstractAction {

    @Override
    public String execute(HttpServletRequest request) {
        Long id = Long.parseLong(request.getParameter("id"));
        String shortname = request.getParameter("shortname");
        String name = request.getParameter("name");
        
        Department department = new Department(id, shortname, name);
        
        if (updateDepartment(request, department) != null) {
            request.setAttribute("message", "Department successfully updated!");
        } else {
            request.setAttribute("message", "Department is not successfully updated!");
        }

        return PageConstants.VIEW_EDIT_DEPARTMENT;
    }

    private Object updateDepartment(HttpServletRequest request, Department department) {
        List<Department> departments = (List<Department>) request.getServletContext().getAttribute("departments");

        for (Department d : departments) {
            if (d.getId().equals(department.getId())) {
                d.setName(department.getName());
                d.setShortname(department.getShortname());
                request.getServletContext().setAttribute("departments", departments);
                return department;
            }
        }

        return null;
    }
    
}
