<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="./css/admin_footer.css">
</head>
<body>
	
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
	
</body>
</html>