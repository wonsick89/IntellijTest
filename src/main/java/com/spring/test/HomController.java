package com.spring.test;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Controller
public class HomController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @RequestMapping(value = "/index")
    public ModelAndView home() throws SQLException {

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        System.out.println(sqlSessionFactory);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println(sqlSession);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");


        return mv;
    }
}
