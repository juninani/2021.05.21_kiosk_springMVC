<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴 리스트</title>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>

<script src="../resources/js/httpRequest.js"></script>
<script src="../resources/js/main.js"></script>
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
<script>
	
</script>

<link rel="stylesheet" href="/resources/css/main.css">
</head>
<body>
	<!-- <div class="row">
<div class="col-6"> -->



	<!-- <div class="container-fluid">
		<img src="/resources/image/logo/logo.png" class="d-block w-100"
			height="500">
	</div> -->
	<div class="container">
		<div class="row">
			<div class="btn-group" role="group" aria-label="Basic example">
				<button id="button1" type="button"
					class="btn btn-dark btn-lg-2 p-4 m-1 " onclick="button(1)">버거(세트)</button>

				<button id="button2" type="button"
					class="btn btn-right btn-lg-2 p-4 m-1" onclick="button(2)">버거(단품)</button>

				<button id="button3" type="button"
					class="btn btn-right btn-lg-2 p-4 m-1" onclick="button(3)">음료</button>

				<button id="button4" type="button"
					class="btn btn-right btn-lg-2 p-4 m-1" onclick="button(4)">사이드
					메뉴</button>
			</div>

			<img src="/resources/image/logo/logo.png" class="rounded float-end"
				alt="...">


		</div>

		<div class="row row-cols-1 row-cols-md-2 g-4" id="setBerger">

			<c:forEach var="setBerger" items="${setBerger}">
				<div class="card mb-3" style="max-width: 540px;">
					<div class="row g-0">
						<div class="col-md-4">
							<img src="${setBerger.img}" alt="...">
						</div>
						<div class="col-md-8">
							<div class="card-body">
								<h5 class="card-title">${setBerger.name}</h5>
								<p class="card-text">${setBerger.title}</p>
								<p class="card-text"></p>
								<p class="text-muted">${setBerger.price}</p>
								<button id="button4" type="button" class="btn btn-dark"
									onclick="addCart('${setBerger.name}','${setBerger.price}')">담기</button>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>

		<div class="row row-cols-1 row-cols-md-2 g-4 d-none"
			id="berger">
			<c:forEach var="berger" items="${berger}">
				<div class="card mb-3" style="max-width: 540px;">
					<div class="row g-0">

						<div class="col-md-4">
							<img src="${berger.img}" alt="...">
						</div>
						<div class="col-md-8">
							<div class="card-body">
								<h5 class="card-title">${berger.name}</h5>
								<p class="card-text">${berger.title}</p>
								<p class="card-text">		</p>
								<p class="text-muted">${berger.price}</p>
								<button id="button4" type="button" class="btn btn-dark"
									onclick="addCart('${berger.name}','${berger.price}');">담기</button>
						
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>

		<div class="row row-cols-1 row-cols-md-2 g-4 d-none"
			id="drink">
			<c:forEach var="drink" items="${drink}">
				<div class="card mb-3" style="max-width: 540px;">
					<div class="row g-0">

						<div class="col-md-4">
							<img src="${drink.img}" alt="...">
						</div>
						<div class="col-md-8">
							<div class="card-body">
								<h5 class="card-title">${drink.name}</h5>
								<p class="card-text">${drink.title}</p>
								<p class="card-text"></p>
								<p class="text-muted">${drink.price}</p>
								<button id="button4" type="button" class="btn btn-dark"
									onclick="addCart('${drink.name}','${drink.price}');">담기</button>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>

		<div class="row row-cols-1 row-cols-md-2 g-4  d-none"
			id="sideMenu">
			<c:forEach var="sideMenu" items="${sideMenu}">
				<div class="card mb-3" style="max-width: 540px;">
					<div class="row g-0">

						<div class="col-md-4">
							<img src="${sideMenu.img}" alt="...">
						</div>
						<div class="col-md-8">
							<div class="card-body">
								<h5 class="card-title">${sideMenu.name}</h5>
								<p class="card-text">${sideMenu.title}</p>
								<p class="card-text"></p>
								<p class="text-muted">${sideMenu.price}</p>
								<button id="button4" type="button" class="btn btn-dark"
									onclick="addCart('${sideMenu.name}','${sideMenu.price}');">담기</button>


							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>

		<button class="btn btn-dark col-lg-12 p-3 " type="button"
			onclick="location.href='cart.do'">장바구니</button>

	</div>


</body>
</html>
