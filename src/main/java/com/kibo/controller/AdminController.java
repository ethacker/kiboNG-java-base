package com.kibo.controller;

import com.mozu.base.controllers.AdminControllerHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AdminController {
    private static final Logger log = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    ApplicationContext context;

    @Value("${SharedSecret}")
    String sharedSecret;

    @Value("${spice}")
    String spice;

    @RequestMapping(value = {"/","/index"},method = {RequestMethod.POST, RequestMethod.GET})
    public ResponseEntity<String> index(HttpServletRequest request, HttpServletResponse response, Model model) {
//        try {
//            AdminControllerHelper adh = adminControllerHelperFactory(spice, sharedSecret);
//            if (!adh.securityCheck(request, response)) {
//                log.warn("Not authorized");
//                return new ResponseEntity<String>("unauthorized", HttpStatus.UNAUTHORIZED);
//            }
//        } catch (Exception e) {
//            log.warn("Validation exception: " + e.getMessage());
//            return new ResponseEntity<String>("unauthorized",HttpStatus.UNAUTHORIZED);
//        }

        return new ResponseEntity<String>("Hello world!",HttpStatus.OK);
    }

}
