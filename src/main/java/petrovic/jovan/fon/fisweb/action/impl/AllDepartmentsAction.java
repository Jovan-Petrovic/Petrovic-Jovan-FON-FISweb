/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrovic.jovan.fon.fisweb.action.impl;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import petrovic.jovan.fon.fisweb.action.AbstractAction;
import petrovic.jovan.fon.fisweb.constants.PageConstants;

/**
 *
 * @author KORISNIK
 */
@Component
public class AllDepartmentsAction extends AbstractAction{

    @Override
    public String execute(HttpServletRequest request) {
        return PageConstants.VIEW_ALL_DEPARTMENTS;
    }
    
}
