<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니</title>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>

<script src="../resources/js/httpRequest.js"></script>
<script src="../resources/js/cart.js"></script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">



<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>
</head>

<script type="text/javascript">

</script>
<body>
<form action="buy.do">
<h1>장바구니</h1>
<table class="table table-striped">
	<tr>
	<th>주문번호</th><th>상품명</th><th>가격</th><th>수량</th><th>주문여부</th>
	<tr>
	<c:set var="sum" value="0"/>

	<c:forEach var="cart" items="${cart}">

	<td></td>

	<tr>
	<td>${cart.idx}</td><td>${cart.name}</td><td>${cart.price}</td>
	<td><input type="number" id="${cart.idx}" value="${cart.cnt}" min="1" onchange="su('${cart.idx}');"></td>
	<td><a href="cart_del.do?idx=${cart.idx}">취소</a></td>
	</tr>
	<input type="hidden" id="name" name="name" value="${cart.name}">
	<c:set var="sum" value="${sum+(cart.price*cart.cnt)}"/>

	</c:forEach>
</table>
<h1>총합:${sum}</h1>
<input type="hidden" name="price"value="${sum}">
<div class="d-grid gap-2">
  <button class="btn btn-primary" type="button" onclick="buyConform(this.form);">주문하기</button>
  <button class="btn btn-primary" type="button" onclick="deleteConform();">주문취소</button>

</div>
  </form>
</body>
</html>