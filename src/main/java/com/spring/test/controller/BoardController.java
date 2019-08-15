package com.spring.test.controller;

import com.spring.test.dao.BoardImpl;
import com.spring.test.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardImpl bi;

    @RequestMapping(value = "/board/list")
    public ModelAndView boardList(Model model, BoardVO vo) throws Exception {
        System.out.println("Controller 작동");

        List<BoardVO> boardList = bi.listALL();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/list");
        mv.addObject("boardList", boardList);
        return mv;
    }
}
