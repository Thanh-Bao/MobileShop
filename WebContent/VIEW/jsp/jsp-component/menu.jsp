<%@page import="model_DAO.DAO_IconMenu"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="model_utility.Config"%>
<%
DAO_IconMenu dao = new DAO_IconMenu();
request.setAttribute("icon", dao.listIconMenu());
request.setAttribute("color", dao.colorWeb());
%>
<%-- <%@ page import="model_utility.Const"%> --%>
<!-- Thanh navigation Bar cho khach hang -->
<nav style="background-color: ${color.colorMenu}"
	class="navbar navbar-expand-lg navbar-dark bg-menu fixed-top">

	<div class="container">
		<a class="navbar-brand"
			href="${pageContext.request.contextPath}/index"><i
			class="fas fa-mobile-alt"></i> ${SHOPINFO.name}</a>

		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="input-group md-form form-sm form-2 pl-5 pr-5">
			<input id="keyWord" class="form-control my-0 py-1 lime-border"
				type="text" placeholder="Bạn tìm gì..." aria-label="Search">
			<div class="input-group-append">
				<span class="input-group-text lime lighten-2" id="basic-text1">
					<a href="${pageContext.request.contextPath}/search"><i
						class="fas fa-search text-grey" aria-hidden="true"></i></a>
				</span>
			</div>
		</div>

		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto pt-3">
				<li class="nav-item "><a
					href="${pageContext.request.contextPath}/contact">
						<div class="item-menu">

							${icon.get(0).icon}
							<div class="item-menu-text">
								<p>${icon.get(0).content}</p>

							</div>

						</div>
				</a></li>
				<li class="nav-item"><a
					href="${pageContext.request.contextPath}/check-receipt">
						<div class="item-menu">
							${icon.get(1).icon}
							<div class="item-menu-text">
								<p>${icon.get(1).content}</p>
							</div>

						</div>
				</a></li>


				<!-- xử lý nút login - START -->
				<c:choose>

					<c:when
						test="${CUSTOMER_LOGINED!=null && CUSTOMER_LOGINED.name == '' }">
						<li class="nav-item"><a
							href="${pageContext.request.contextPath}/member/profile">
								<div class="item-menu">
									<i class="fas fa-user"></i>
									<div class="item-menu-text">
										<p>Cập nhật thông tin!</p>
									</div>

								</div>
						</a></li>
					</c:when>

					<c:when test="${CUSTOMER_LOGINED!=null }">
						<li class="nav-item"><a
							href="${pageContext.request.contextPath}/member/profile">
								<div class="item-menu">
									<i class="fas fa-user"></i>
									<div class="item-menu-text">
										<p><fmt:message key="hello-menu-item"></fmt:message>, ${CUSTOMER_LOGINED.getFirstName()} !</p>
									</div>

								</div>
						</a></li>
					</c:when>
					<c:otherwise>

						<li class="nav-item hover-account"><a
							href="${pageContext.request.contextPath}/login">
								<div class="item-menu">
									${icon.get(2).icon}
									<div class="item-menu-text">
										<p>${icon.get(2).content}</p>
									</div>
								</div>
						</a>
							<div class="frame-account">
								<div class="triangle">
									<i class=" fas fa-caret-up"></i>
								</div>
								<ul>
									<li class="item-acc"><a
										href="${pageContext.request.contextPath}/login">
											<div class="acc">
												<fmt:message key="login-menu-item"></fmt:message>
											</div>
									</a></li>
									<li class="item-acc"><a
										href="${pageContext.request.contextPath}/register">
											<div class="acc"><fmt:message key="createAccount-menu-item"></fmt:message></div>
									</a></li>
									<li class="item-acc"><a
										href="${Config.GOOGLE_URL_HREF_JSP}">
											<div class=" login-google">
												<i class="fab fa-google-plus-g"
													style="font-size: 20px; float: left; padding: 2px 6px;"></i>
												<fmt:message key="loginGoogle-menu-item"></fmt:message>
											</div>
									</a></li>
								</ul>
							</div></li>

					</c:otherwise>

				</c:choose>

				<!-- xử lý nút login END -->


				<!--  xử lý nút giỏ hàng START > -->
				<c:choose>
					<c:when test="${CUSTOMER_LOGINED.role == 'ADMIN'}">
					</c:when>
					<c:otherwise>
						<li class="nav-item"><a
							href="${pageContext.request.contextPath}/cart">
								<div class="item-menu" id="cart">
									<i class="fas fa-shopping-cart"></i>
									<div class="item-menu-text">
										<p>
											<fmt:message key="cart-menu-item"></fmt:message>
										</p>

									</div>
									<c:if
										test="${QUANTITY_INSTANCE_PRODUCT != 0 && QUANTITY_INSTANCE_PRODUCT != null }">
										<label class="quantity-cart" id="quantity-cart123">${QUANTITY_INSTANCE_PRODUCT}</label>
									</c:if>
								</div>


								<style>
#quantity-cart123 {
	position: absolute;
	top: -5px;
	left: 55px;
	color: black;
	background-color: #d88e3f;
	border-radius: 4px;
	padding: 4px 8px;
	font-size: 10px;
	font-weight: 700;
}
</style>

						</a></li>
					</c:otherwise>
				</c:choose>
				<!--  xử lý nút giỏ hàng END > -->

				<c:if test="${CART_QUANTITY !=0 && CART_QUANTITY != null }">
					<!-- <nút thanh toán -->
					<li class="nav-item"><a
						href="${pageContext.request.contextPath}/payment">
							<div class="item-menu">
								<i class="fas fa-dollar-sign"></i>
								<div class="item-menu-text">
									<p>Thanh toán</p>
								</div>

							</div>
					</a></li>

				</c:if>

			</ul>
		</div>
	</div>

</nav>