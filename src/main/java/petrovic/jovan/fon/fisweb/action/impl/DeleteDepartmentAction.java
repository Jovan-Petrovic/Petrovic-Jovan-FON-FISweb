/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrovic.jovan.fon.fisweb.action.impl;

import java.util.List;
import java.util.Objects;
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
public class DeleteDepartmentAction extends AbstractAction{

    @Override
    public String execute(HttpServletRequest request) {
         Long id = Long.parseLong(request.getParameter("departmentId"));
         List<Department> departments = (List<Department>) request.getServletContext().getAttribute("departments");
    
         for (int i = 0; i < departments.size(); i++) {
            if(departments.get(i).getId().equals(id)){
                departments.remove(i);
            }
        }
        
        return PageConstants.VIEW_ALL_DEPARTMENTS;
    }
    
}
