package com.dabbbin.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/mem.do")
public class MemberController extends HttpServlet {
    private static final long serialVersionID =1L;
    MemberDAO memberDAO;

    public void init(){
        memberDAO = new MemberDAO();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doHandle(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doHandle(req, resp);
    }

    protected void doHandle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        ArrayList<MemberDTO> memberList = memberDAO.ListMembers();
        req.setAttribute("memberList", memberList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/member.jsp");
        dispatcher.forward(req, resp);
    }
}
