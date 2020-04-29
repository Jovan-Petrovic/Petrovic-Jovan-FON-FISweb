/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrovic.jovan.fon.fisweb.action.factory;

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
public class ActionFactory {
    public static AbstractAction createActionFactory(String actionName) {
        AbstractAction action = null;
        if(actionName.equals(ActionConstants.URL_LOGIN)) {
            action = new LoginAction();
        }
        if(actionName.equals(ActionConstants.URL_ALL_DEPARTMENTS)) {
            action = new AllDepartmentsAction();
        }
        if(actionName.equals(ActionConstants.URL_ADD_DEPARTMENT)) {
            action = new AddDepartmentAction();
        }
        if(actionName.equals(ActionConstants.URL_SAVE_DEPARTMENT)) {
            action = new SaveDepartmentAction();
        }
        if(actionName.equals(ActionConstants.URL_DELETE_DEPARTMENT)) {
            action = new DeleteDepartmentAction();
        }
        if(actionName.equals(ActionConstants.URL_EDIT_DEPARTMENT)) {
            action = new EditDepartmentAction();
        }
        if(actionName.equals(ActionConstants.URL_UPDATE_DEPARTMENT)) {
            action = new UpdateDepartmentAction();
        }
        return action;
    }
}
