/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrovic.jovan.fon.fisweb.config;

import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author KORISNIK
 */
@ComponentScan(basePackages = {
    "petrovic.jovan.fon.fisweb.controller",
    "petrovic.jovan.fon.fisweb.viewresolver",
    "petrovic.jovan.fon.fisweb.action"
})
public class MyAppConfig {
    
}
