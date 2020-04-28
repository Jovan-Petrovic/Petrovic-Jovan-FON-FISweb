/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrovic.jovan.fon.fisweb.action.factory;

import petrovic.jovan.fon.fisweb.action.AbstractAction;
import petrovic.jovan.fon.fisweb.action.impl.LoginAction;
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
        return action;
    }
}
