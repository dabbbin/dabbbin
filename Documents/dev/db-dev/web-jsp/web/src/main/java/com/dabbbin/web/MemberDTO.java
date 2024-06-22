package com.dabbbin.web;

public class MemberDTO {
    private String name;
    private String email;
    private String joinDate;

    public MemberDTO() {
        System.out.println("MemberDAO 생성자 호출");
    }

    public MemberDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public MemberDTO(String name, String email, String joinDate) {
        this.name = name;
        this.email = email;
        this.joinDate = joinDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", joinDate='" + joinDate + '\'' +
                '}';
    }
}
