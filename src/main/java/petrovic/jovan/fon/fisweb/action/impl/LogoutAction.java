package petrovic.jovan.fon.fisweb.action.impl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import petrovic.jovan.fon.fisweb.action.impl.*;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import petrovic.jovan.fon.fisweb.action.AbstractAction;
import petrovic.jovan.fon.fisweb.constants.PageConstants;
import petrovic.jovan.fon.fisweb.model.User;

/**
 *
 * @author KORISNIK
 */
@Component
public class LogoutAction extends AbstractAction {

    @Override
    public String execute(HttpServletRequest request) {
        // delete current user from session => make session invalid
        request.getSession().invalidate();
        request.setAttribute("message", "User success logout!");
        return PageConstants.VIEW_LOGIN;

    }

}
