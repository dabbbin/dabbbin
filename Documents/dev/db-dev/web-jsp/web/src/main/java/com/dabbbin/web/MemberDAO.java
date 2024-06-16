package com.dabbbin.web;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.awt.*;
import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

    private DataSource dataFactory;
    private Connection conn;
    private PreparedStatement psmt;

    public MemberDAO() {
        try {
            Context context = new InitialContext();
            Context envContext = (Context) context.lookup("java:/comp/env");
            dataFactory = (DataSource) envContext.lookup("jdbc/mysql");
        } catch (NamingException e) {
            e.printStackTrace();
        }

    }

    public List ListMembers() {
        List memberList = new List();

        try {
            conn = dataFactory.getConnection();
            String query = "select * from member";
            System.out.println(query);
            psmt = conn.prepareStatement(query);
            ResultSet rs = psmt.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                MemberDTO member = new MemberDTO(name, email);
                memberList.add(member);
            }

            rs.close();
            psmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return memberList;
    }
}
