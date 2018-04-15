package com.lal;

import com.lal.Model.Item;
import com.lal.Services.MobileDAOService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("context.xml");
        MobileDAOService mobileInventory = (MobileDAOService) beanFactory.getBean("mobileInventoryDAO");
        List<Item> items = mobileInventory.getAllInventorySvc();
        items.forEach(item -> System.out.println(item.getEmpName()));
    }
}
