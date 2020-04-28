/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrovic.jovan.fon.fisweb.controller;

import javax.servlet.http.HttpServletRequest;
import petrovic.jovan.fon.fisweb.action.AbstractAction;
import petrovic.jovan.fon.fisweb.action.factory.ActionFactory;
import petrovic.jovan.fon.fisweb.constants.PageConstants;

/**
 *
 * @author KORISNIK
 */
public class ApplicationController {

    public String processRequest(String pathInfo, HttpServletRequest request) {
        String nextPage = PageConstants.VIEW_DEFAULT_ERROR;
        
        AbstractAction action = ActionFactory.createActionFactory(pathInfo);
        if (action != null) {
            nextPage = action.execute(request);
        }
        
        return nextPage;
    }
    
}
