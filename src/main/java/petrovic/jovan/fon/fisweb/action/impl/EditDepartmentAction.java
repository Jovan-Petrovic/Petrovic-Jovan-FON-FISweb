/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrovic.jovan.fon.fisweb.action.impl;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import petrovic.jovan.fon.fisweb.action.AbstractAction;
import petrovic.jovan.fon.fisweb.constants.PageConstants;
import petrovic.jovan.fon.fisweb.model.Department;

/**
 *
 * @author KORISNIK
 */
public class EditDepartmentAction extends AbstractAction {

    @Override
    public String execute(HttpServletRequest request) {
        Long id = Long.parseLong(request.getParameter("department_id"));
        System.out.println(id);
        Department department = findDepartmentByID(request, id);
        request.setAttribute("department", department);
        System.out.println(department.getName());
        return PageConstants.VIEW_EDIT_DEPARTMENT;
    }

    private Department findDepartmentByID(HttpServletRequest request, Long id) {
        List<Department> departments = (List<Department>) request.getServletContext().getAttribute("departments");
        for (Department department : departments) {
            if (department.getId() == id) {
                return department;
            }
        }
        return null;
    }
    
}
