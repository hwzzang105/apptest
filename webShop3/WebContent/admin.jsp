<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<style>
	.intro{ background-image: url("./img/seoul_02.jpg"); background-repeat: repeat; width: 100%; height: 700px;}
</style>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<%
 	session.setAttribute("id", "admin");
 %>   
 
    <% request.setCharacterEncoding("utf-8"); %>
    
    <%
    	if(session.getAttribute("id") != "admin"){
   	%>
   		<script> 
   			alert("관리자가 아닙니다. 현재페이지는 관리자의 로그인이 필요합니다.");
   			history.go(-1);
   		</script>
   	<%
    	}else{
    %>
    	<script>
    		$(document).ready(function(){
    			var txt = $(".page_tit").text();
    			alert("현재는"+ txt + "페이지 입니다.");
    		});
    	</script>
    <%
    	}
    %>
 <header class="hd">
		<h2 class="tit"><a href="admin.jsp">관리자 화면</a></h2>
		<nav class="gnb">
			<ul>
               <li><a href="memberlist.jsp">회원관리</a></li>
               <li><a href="boardlist.jsp">게시판관리</a></li>
               <li><a href="saleslist.jsp">판매관리</a></li>
               <li><a href="productlist.jsp">상품관리</a></li>
               <li><a href="curtlist.jsp">구매관리</a></li>
               <li><a href="sendSms.jsp">고객문자발송</a></li>
            </ul>
			<div class="btn_fr">
				<a href="admin_logout.jsp" class="btn">관리자로그아웃</a>
			</div>
		</nav>
		
	</header>
	<hr />
 <main class="content">
 	<figure class="vs intro">
 		<img src="./img/intro.png" style="display:block; padding-top:50px; padding-left: 50px;" alt="" />
 	</figure>
 	<section class="page" id="page1">
 		<h2 class="page_tit">관리자 페이지 메인</h2>
 		<nav class="menu">
 			<ul>
               <li><a href="memberlist.jsp">회원관리</a></li>
               <li><a href="boardlist.jsp">게시판관리</a></li>
               <li><a href="saleslist.jsp">판매관리</a></li>
               <li><a href="productlist.jsp">상품관리</a></li>
               <li><a href="curtlist.jsp">구매관리</a></li>
               <li><a href="sendSms.jsp">고객문자발송</a></li>
               <li><a href="company_edit.jsp">회사정보 수정</a></li>
               <li><a href="admin_edit.jsp">관리자정보</a></li>
               <li><a href="protocol_edit.jsp">회원약관 수정</a></li>
               <li><a href="privacy_edit.jsp">개인정보처리방침 수정</a></li>
               <li><a href="product_edit.jsp">상품정보 수정</a></li>
               <li><a href="order_edit.jsp">주문정보 수정</a></li>
            </ul>
 		</nav>
 	</section>
 </main>
<footer class="ft">
		<div class="ft_wrap">
			<nav class="ft_link">
				<ul>
					<li><a href="admin_edit.jsp">관리자정보 수정</a></li>
					<li><a href="protocol_edit.jsp">회원약관 수정</a></li>
					<li><a href="privacy_edit.jsp">개인정보처리방침 수정</a></li>
					<li><a href="company_edit.jsp">회사정보 수정</a></li>
					<li><a href="product_edit.jsp">상품정보 수정</a></li>
					<li><a href="order_edit.jsp">주문정보 수정</a></li>
				</ul>
			</nav>
			<div class="admin_copy">
				<p class="copyright">COPYRIGHT © 2019 NERDY</p><br>
				<p class="copyright"> Personal Information Manager : Jung Jaehun (whoisnerdy.kr@gmail.com)</p>
			</div>
		</div>
	</footer>
 
