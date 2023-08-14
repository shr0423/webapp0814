package org.sp.webapp0814.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//서블릿이란? 오직 서버에서만 해석 및 실행될 수 있는 javaEE기반의 클래스
public class TestServlet extends HttpServlet{
	//요청이 Get방식인 경우 doGet으로 Post인 경우 doPost메서드로 요청을 처리
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//jsp의 page지시영역의 컨텐트 타입 세팅과 동일효과..
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out=response.getWriter();
		
		out.print("<table width=\"300px\">");
		for(int i=1;i<=10;i++) {
		out.print("<tr>");
		out.print("<td>"+i+"</td>");
		out.print("<td>제목</td>");
		out.print("<td>작성자</td>");
		out.print("</tr>");
		}
		out.print("</table>");
	}
	//Post방식의 요청에는 아래의 메서드가 동작함
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	public void destroy() {
		
	}
}
