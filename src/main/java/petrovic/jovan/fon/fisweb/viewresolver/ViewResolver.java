/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrovic.jovan.fon.fisweb.viewresolver;

import java.util.HashMap;
import java.util.Map;
import petrovic.jovan.fon.fisweb.constants.PageConstants;

/**
 *
 * @author KORISNIK
 */
public class ViewResolver {

    private final Map<String, String> viewPageMap;
    
    public ViewResolver(){
        viewPageMap=new HashMap<String, String>(){
            {   //key = view, value=page
                put(PageConstants.VIEW_HOME,PageConstants.PAGE_HOME );
                put(PageConstants.VIEW_LOGIN,PageConstants.PAGE_LOGIN );
                put(PageConstants.VIEW_DEFAULT_ERROR,PageConstants.PAGE_DEFAULT_ERROR );
                put(PageConstants.VIEW_ALL_DEPARTMENTS,PageConstants.PAGE_ALL_DEPARTMENTS );
                put(PageConstants.VIEW_ADD_DEPARTMENT,PageConstants.PAGE_ADD_DEPARTMENT );
                put(PageConstants.VIEW_EDIT_DEPARTMENT,PageConstants.PAGE_EDIT_DEPARTMENT );
            }
        };
    }
    
    public String getPage(String view) {
        return viewPageMap.get(view);
    }
    
}
