package mik.prog4.zh1.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

import java.util.logging.Logger;

public class ProjectServletContextListener implements ServletContextListener {

    private static final Logger LOGGER = Logger.getLogger(ProjectServletContextListener.class.getName());

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent){
        LOGGER.info("Source: " + servletContextEvent.getSource());
        LOGGER.info("Path: " + servletContextEvent.getServletContext().getContextPath());
    }
}
