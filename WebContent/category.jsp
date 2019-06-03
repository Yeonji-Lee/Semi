<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Document</title>
<script src="https://code.jquery.com/jquery-3.4.0.min.js"></script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link href="https://fonts.googleapis.com/css?family=Do+Hyeon|Noto+Sans+KR&display=swap" rel="stylesheet">
</head>
<style>
*{
font-family: 'Noto Sans KR', sans-serif;
}

#logo{
position: relative;
bottom:20px;
cursor: pointer;
}

div {
	width: 100%;
	text-align: center;
}

#header {
	height: 200px;
	width: 100%;
	padding:64px 32px;
}

.headBtn {
	color: white;
}

.headBtn:hover {
	background-color: burlywood;
	border: 1px solid burlywood;
	color: white;
}

#navi {
	width: 100%;
	height: auto;
	position: static;
}

.collapse {
	text-align: center;
}

.menu {
	height: 100%;
	width: 33.33%;
	float: left;
}

.loactionMenu {
	padding: 0px;
}

.dropdown-menu {
	width: 100%;
	text-align: center;
	opacity: 50%;
}

#content {
	margin: auto;
	width: 80%;
	height: auto;
}

.custom-select {
	width: 200px;
	float: right;
}

#navi {
	background-color: #fced80;
	text-align: center;
}

.nav-item {
	width: 33.3%;
	margin: auto;
	padding: 20px;
	font-size: 20px;
	font-weight: bold;
}

a {
	color: #ffb100;
	width: 200px;
	font-family: 'Raleway', sans-serif;
}

a:hover {
	color: #d8b13a;
}

.has-megamenu {
	position: static;
}

.dropdown-menu li a {
	padding: 5px 5px;
	font-weight: 400;
	color: #d8b13a;
}

.multi-column-dropdown {
	list-style: none;
	padding: 0px;
}

.location, .category {
	background-color: #fffce7;
}

.dropdown-menu {
	padding: 0;
	border: 0px;
	margin: auto;
}

.multi-column-dropdown li a {
	display: block;
	clear: both;
	line-height: 1.428571429;
	color: #d8b13a;
	white-space: normal;
	padding: 5px;
	width: 100%;
}

.multi-column-dropdown li a:hover {
	text-decoration: none;
	color: #ffb100;
	font-weight: bold;
}

.count {
	position: relative;
	right: 100px;
	top: 50px;
	z-index: 10;
}

.cardItem {
	width: 100%;
}

.card {
	margin: 20px auto;
	cursor: pointer;
}

.card-text:hover {
	text-decoration: underline;
}

.face {
	float: right;
	border-radius: 50px;
}

#naviBox {
	width: 50%;
	margin: 30px auto;
	padding: 10px;
}

.naviBtn {
	background-color: white;
	font-weight: bold;
	border: 0px;
	padding: 0px 10px;
}

.naviBtn:hover {
	background-color: #a6e2bf;
}

#footer {
	height: 150px;
	margin: auto;
}

#sns>img {
	width: 50px;
}
</style>
<body>

	<div id=wrapper>
		<div id=header class=row>
			<div class="col-12 col-lg-4">
				<img src="logo.png" id=logo>
			</div>
			<div class="col-12 col-lg-4" id=search>
				<form class="form-inline my-2 my-lg-0">
					<div class="row justify-content-center">
						<input class="form-control mr-sm-2" type="search"
							placeholder="취미를 검색해 보세요!" aria-label="Search">
						<button class="btn btn-warning my-2 my-sm-0 headBtn"
							type="submit">Search</button>
					</div>
				</form>
			</div>
			<div class="col-12 col-lg-4">
				<button class="btn btn-warning my-2 my-sm-0 headBtn" type="submit">join</button>
				<button class="btn btn-warning my-2 my-sm-0 headBtn" type="submit">login</button>
				<button class="btn btn-warning my-2 my-sm-0 headBtn" type="submit"
					id=mypage>mypage</button>
			</div>
		</div>

		<div id=navi>
			<nav class="navbar navbar-expand navbar-light">
				<ul class="nav justify-content-center">
					<li class="nav-item"><a class="nav-link active"
						href="info.category?category=main">추천</a></li>
					<li class="nav-item dropdown has-megamenu"><a href="#"
						class="dropdown-toggle nav-link" data-toggle="dropdown"
						d="navbarDropdown" role="button" aria-haspopup="true"
						aria-expanded="false">카테고리</a>

						<ul class="dropdown-menu multi-column columns-6">
							<div class="row category">
								<div class="col-12 col-md-4 col-lg-2 locationMenu">
									<ul class="multi-column-dropdown">
										<li><a href="info.category?category=design&select=info_avgstar desc&addr=all"> 디자인 <input
												type=hidden value="design" class=cate>
										</a></li>

									</ul>
								</div>
								<div class="col-12 col-md-4 col-lg-2  locationMenu">
									<ul class="multi-column-dropdown">
										<li><a href="info.category?category=it&select=info_avgstar desc&addr=all" class=cateA>IT
										</a> <input type=hidden value="it" class=cate></li>

									</ul>
								</div>
								<div class="col-12 col-md-4 col-lg-2 locationMenu">
									<ul class="multi-column-dropdown">
										<li><a href="info.category?category=lang&select=info_avgstar desc&addr=all">언어 </a> <input
											type=hidden value="lang" class=cate></li>
									</ul>
								</div>
								<div class="col-12 col-md-4 col-lg-2  locationMenu">
									<ul class="multi-column-dropdown">
										<li><a href="info.category?category=life&select=info_avgstar desc&addr=all">라이프 스타일 </a> <input
											type=hidden value="life" class=cate></li>
									</ul>
								</div>
								<div class="col-12 col-md-4 col-lg-2 locationMenu">
									<ul class="multi-column-dropdown">
										<li><a href="info.category?category=money&select=info_avgstar desc&addr=all">재테크 </a> <input
											type=hidden value="beauty" class=cate></li>
									</ul>
								</div>
							</div>
						</ul></li>


					<li class="nav-item dropdown has-megamenu"><a href="#"
						class="dropdown-toggle nav-link" data-toggle="dropdown"
						d="navbarDropdown" role="button" aria-haspopup="true"
						aria-expanded="false">지역별</a>

						<ul class="dropdown-menu multi-column columns-6">

							<div class="row location">
								<div class="col-12 col-md-4 col-lg-2 locationMenu">
									<ul class="multi-column-dropdown">
										<li><a href="info.category?addr=se&select=info_avgstar desc"> 서울 </a></li>

										<div class="col d-none d-md-block">
											<div class="dropdown-divider"></div>
											<li><a href="info.category?addr=se-1">강남</a></li>
											<li><a href="info.category?addr=se-2">신촌/홍대</a></li>
											<li><a href="info.category?addr=se-3">건대</a></li>
											<li><a href="info.category?addr=se-4">잠실</a></li>
											<li><a href="info.category?addr=se-5">종로</a></li>
											<li><a href="info.category?addr=se-6">노원</a></li>
											<li><a href="info.category?addr=se-7">사당</a></li>
											<li><a href="info.category?addr=se-8">성북</a></li>
											<li><a href="info.category?addr=se-9">신림</a></li>
											<li><a href="info.category?addr=se-10">목동</a></li>
											<li><a href="info.category?addr=se-11">용산</a></li>
										</div>
									</ul>
								</div>
								<div class="col-12 col-md-4 col-lg-2  locationMenu">
									<ul class="multi-column-dropdown">
										<li><a href="info.category?addr=kk&select=info_avgstar desc"> 경기 </a></li>

										<div class="col d-none d-md-block">
											<div class="dropdown-divider&select=info_avgstar desc"></div>
											<li><a href="info.category?addr=kk-1">일산/파주</a></li>
											<li><a href="info.category?addr=kk-2">용인/분당/수원</a></li>
											<li><a href="info.category?addr=kk-3">인천/부천</a></li>
											<li><a href="info.category?addr=kk-4">남양주/구리/하남</a></li>
											<li><a href="info.category?addr=kk-5">안양/안산/광명</a></li>
										</div>
									</ul>
								</div>
								<div class="col-12 col-md-4 col-lg-2 locationMenu">
									<ul class="multi-column-dropdown">
										<li><a href="info.category?addr=ch&select=info_avgstar desc"> 충청 </a></li>

										<div class="col d-none d-md-block">
											<div class="dropdown-divider"></div>
											<li><a href="info.category?addr=ch-1">대전</a></li>
											<li><a href="info.category?addr=ch-2">충청</a></li>
										</div>
									</ul>
								</div>
								<div class="col-12 col-md-4 col-lg-2  locationMenu">
									<ul class="multi-column-dropdown">
										<li><a href="info.category?addr=ks&select=info_avgstar desc"> 경상 </a></li>
										<div class="col d-none d-md-block">
											<div class="dropdown-divider"></div>
											<li><a href="info.category?addr=ks-1">대구</a></li>
											<li><a href="info.category?addr=ks-2">경북</a></li>
											<li><a href="info.category?addr=ks-3">부산</a></li>
											<li><a href="info.category?addr=ks-4">경남</a></li>
										</div>
									</ul>
								</div>
								<div class="col-12 col-md-4 col-lg-2 locationMenu">
									<ul class="multi-column-dropdown">
										<li><a href="info.category?addr=jl&select=info_avgstar desc"> 전라 </a></li>
										<div class="col d-none d-md-block">
											<div class="dropdown-divider"></div>
											<li><a href="info.category?addr=jl-1">광주</a></li>
											<li><a href="info.category?addr=jl-2">전라</a></li>
										</div>
									</ul>
								</div>
								<div class="col-12 col-md-4 col-lg-2  locationMenu">
									<ul class="multi-column-dropdown">
										<li><a href="info.category?addr=kwjj&select=info_avgstar desc"> 강원 / 제주 </a></li>
										<div class="col d-none d-md-block">
											<div class="dropdown-divider"></div>
											<li><a href="info.category?addr=kwjj-1">강원</a></li>
											<li><a href="info.category?addr=kwjj-2">제주</a></li>
										</div>
									</ul>
								</div>
							</div>
						</ul></li>

				</ul>
			</nav>
		</div>
</div>
		<div id=content>
			<select class="custom-select">
				<option selected>분류</option>
				<option value="info_avgstar desc">추천순</option>
				<option value="info_classid desc">최신순</option>
				<option value="info_price">낮은 가격순</option>
			</select>


			<div class="row cardItem">
				<c:forEach var="list" items="${list }">
					<div class="col-12 col-md-6 col-lg-4 cardItem">
						<!-- N명참여 배치용 -->
						<span class="count"> <span
							class="badge badge-pill badge-success"> <span
								class="badge badge-success">${list.totalcount }</span> 명 참여
						</span>
						</span>
						<!----------------->
						<div class="card" style="width: 18rem">
							<!-- 캐러셀 시작 -->
							<div class="carousel slide" data-ride="carousel">
								<div class="carousel-inner">
									<div class="carousel-item active">
										<img src="임시1.png" class="d-block w-100" alt="..."
											width="200px" height="200px">
									</div>
									<div class="carousel-item">
										<img src="임시2.png" class="d-block w-100" alt="..."
											width="200px" height="200px">
									</div>
									<div class="carousel-item">
										<img src="임시3.png" class="d-block w-100" alt="..."
											width="200px" height="200px">
									</div>
								</div>
								<a class="carousel-control-prev" href="#carouselExampleFade"
									role="button" data-slide="prev"> <span
									class="carousel-control-prev-icon" aria-hidden="true"></span> <span
									class="sr-only">Previous</span>
								</a> <a class="carousel-control-next" href="#carouselExampleFade"
									role="button" data-slide="next"> <span
									class="carousel-control-next-icon" aria-hidden="true"></span> <span
									class="sr-only">Next</span>
								</a>
							</div>
							<!-- 캐러셀 끝 -->
							<div class="card-body">
								<img src=${list.m_photo } width="80px" height="80px"
									alt="이미지.png" class=face>
								<div class="card-text">
									<b>${list.info_title }</b>
								</div>
								<div>
									<span>${list.info_avgstar }</span> | <span>${list.info_addr2 }</span>
								</div>
								<div>
									<span>${list.info_price }원</span> | <span>${list.m_nickname }</span>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
			<div id=naviBox class="row justify-content-center">
				<c:forEach var="i" begin="0" end="${size-1}">
					<form action="info.category" method="post" class=btnForm>
<%-- 					<button class="naviBtn">${navi[i] }</button> --%>
					<input type=submit value=${navi[i]} class="naviBtn" name="nowPage">
					</form>
				</c:forEach>
			</div>
		</div>
		<div id=footer class="row">
			<div class="col-12 col-md-8"></div>
			<div class="col-12 col-md-4" id=sns>
				<img src="블로그.png"> <img src="인스타그램.png"> <img
					src="트위터.png"> <img src="페이스북.png">
			</div>
		</div>

		<script>
			
			$(".custom-select").on("click",function(){
				var select = $(this).val();
				console.log(select);

				if(select == 'info_price' || select == 'info_classid desc' || select == 'info_avgstar desc'){
					location.href="info.category?select="+select;
				}
				
			})
			
			
			
			$("#logo").on("click",function(){
				location.href="index.jsp";
			})
			
			
		</script>
</body>
</html>
