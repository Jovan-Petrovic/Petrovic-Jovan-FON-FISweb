/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrovic.jovan.fon.fisweb.action.impl;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import petrovic.jovan.fon.fisweb.action.AbstractAction;
import petrovic.jovan.fon.fisweb.constants.PageConstants;
import petrovic.jovan.fon.fisweb.model.Department;

/**
 *
 * @author KORISNIK
 */
@Component
public class SaveDepartmentAction extends AbstractAction{

    @Override
    public String execute(HttpServletRequest request) {
        String shortname = request.getParameter("shortname");
        String name = request.getParameter("name");
        Long id = (Long) request.getServletContext().getAttribute("maxId");
        id++;
        
        Department department = new Department(id, shortname, name);
        List<Department> departments = (List<Department>) request.getServletContext().getAttribute("departments");
        if(departments.contains(department)) {
            request.setAttribute("message", "Department already exist!");
        } else {
            departments.add(department);
            request.setAttribute("message", "Department is saved!");
            request.getServletContext().setAttribute("maxId", id);
        }
        return PageConstants.VIEW_ADD_DEPARTMENT;
    }
    
}
