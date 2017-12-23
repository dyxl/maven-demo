package com.bdqn.web;

import org.apache.log4j.Logger;

import javax.management.RuntimeErrorException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 这个监听器并不是log4j的启动程序，仅仅是用来演示log4j 已经启动
 */
@WebListener
public class Log4jListener implements ServletContextListener{
    private static final Logger logger=Logger.getLogger(Log4jListener.class);

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        logger.info("hello log4j!");
//        try{
//            throw new RuntimeException("yes");
//        }catch (RuntimeErrorException e){
//            logger.error(e.getMessage(),e);
//            throw e;
//        }
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
