/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrovic.jovan.fon.fisweb.action.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import petrovic.jovan.fon.fisweb.action.AbstractAction;
import petrovic.jovan.fon.fisweb.action.impl.AddDepartmentAction;
import petrovic.jovan.fon.fisweb.action.impl.AllDepartmentsAction;
import petrovic.jovan.fon.fisweb.action.impl.DeleteDepartmentAction;
import petrovic.jovan.fon.fisweb.action.impl.EditDepartmentAction;
import petrovic.jovan.fon.fisweb.action.impl.LoginAction;
import petrovic.jovan.fon.fisweb.action.impl.SaveDepartmentAction;
import petrovic.jovan.fon.fisweb.action.impl.UpdateDepartmentAction;
import petrovic.jovan.fon.fisweb.constants.ActionConstants;

/**
 *
 * @author KORISNIK
 */
@Component
public class ActionFactory {
    
    @Autowired
    private AbstractAction loginAction;
    @Autowired
    private AbstractAction allDepartmentsAction;
    @Autowired
    private AbstractAction addDepartmentAction;
    @Autowired
    private AbstractAction saveDepartmentAction;
    @Autowired
    private AbstractAction deleteDepartmentAction;
    @Autowired
    private AbstractAction editDepartmentAction;
    @Autowired
    private AbstractAction updateDepartmentAction;
    @Autowired
    private AbstractAction logoutAction;
    
    public AbstractAction createActionFactory(String actionName) {
        AbstractAction action = null;
        if(actionName.equals(ActionConstants.URL_LOGIN)) {
            action = loginAction;
        }
        if(actionName.equals(ActionConstants.URL_ALL_DEPARTMENTS)) {
            action = allDepartmentsAction;
        }
        if(actionName.equals(ActionConstants.URL_ADD_DEPARTMENT)) {
            action = addDepartmentAction;
        }
        if(actionName.equals(ActionConstants.URL_SAVE_DEPARTMENT)) {
            action = saveDepartmentAction;
        }
        if(actionName.equals(ActionConstants.URL_DELETE_DEPARTMENT)) {
            action = deleteDepartmentAction;
        }
        if(actionName.equals(ActionConstants.URL_EDIT_DEPARTMENT)) {
            action = editDepartmentAction;
        }
        if(actionName.equals(ActionConstants.URL_UPDATE_DEPARTMENT)) {
            action = updateDepartmentAction;
        }
        if(actionName.equals(ActionConstants.URL_LOGOUT)) {
            action = logoutAction;
        }
        return action;
    }
}
