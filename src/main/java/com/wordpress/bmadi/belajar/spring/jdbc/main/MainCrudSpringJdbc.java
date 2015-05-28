package com.wordpress.bmadi.belajar.spring.jdbc.main;

import com.wordpress.bmadi.belajar.spring.jdbc.dao.ProdukDao;
import com.wordpress.bmadi.belajar.spring.jdbc.model.Produk;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCrudSpringJdbc {

    public static void main(String[] args) {
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:spring-jdbc.xml");
        ProdukDao pd = (ProdukDao) ctx.getBean("produkDao");
    }

}
