package com.application.web.controller;

import junit.framework.TestCase;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by IntelliJ IDEA.
 * User: Sudeepta
 * Date: 2/10/12
 * Time: 11:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloControllerTests extends TestCase{

    public void testHandleRequestView() throws Exception{
    HelloController controller = new HelloController();
    ModelAndView modelAndView = controller.handleRequest(null, null);
    assertEquals("hello", modelAndView.getViewName());
    }
}
