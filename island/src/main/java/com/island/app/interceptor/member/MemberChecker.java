package com.island.app.interceptor.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

import com.island.app.member.vo.MemberVo;

public class MemberChecker implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		  MemberVo loginMember = (MemberVo)session.getAttribute("loginMember");
	      if(loginMember == null) {
	         session.setAttribute("alertMsg", "로그인을 먼저 진행해주세요.");
	         response.sendRedirect(request.getContextPath()+"/member/login");
	         return false;
	      }
		
		
		
		return true;
	
	
	}
	
	
}
