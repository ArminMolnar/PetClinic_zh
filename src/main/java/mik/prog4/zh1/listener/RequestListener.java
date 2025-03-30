package mik.prog4.zh1.listener;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

import java.util.logging.Logger;

public class RequestListener implements ServletRequestListener {

    private static final Logger LOGGER = Logger.getLogger(RequestListener.class.getName());

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        LOGGER.info("Source:" + servletRequestEvent.getSource());
        LOGGER.info("Request: " + servletRequestEvent.getServletRequest());
    }
}
