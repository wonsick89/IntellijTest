package com.spring.test.dao;

import com.spring.test.vo.BoardVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardImpl {

    @Autowired
    private SqlSession session;

    @Autowired
    private static String namespace = "org.spring.test.BoardMapper";

    public List<BoardVO> listALL() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("dao 작동");
        return session.selectList(namespace+".listAll");


    }


}
