<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<jsp:include page="/VIEW/jsp/jsp-component/head-css.jsp" />
<c:url var="url" scope="application" value="/VIEW"></c:url>
</head>

<body>
	<jsp:include page="/VIEW/jsp/jsp-component/menu.jsp"></jsp:include>
	<!-- Thanh menu loc du lieu va sap xep-->
	<c:import url="/VIEW/jsp/jsp-component/breadcumb.jsp">
		<c:param name="title" value="SỦa lại title nè"></c:param>
	</c:import>
	<!-- Page Content -->

	<div class="container">


		<!--Thanh bar tim kiem theo noi dung-->
		<div class="row">
			<jsp:include page="/VIEW/jsp/jsp-component/sidebar-filter.jsp"></jsp:include>
			<!--Noi dung ket qua sau khi tim kiem-->
			<div class="col-9" id="result-content">
				<!--Hang ket qua-->
			
				<div class="row-content">

					<div class="row">
						<div class="col-12">
							<div class="title-searching">

								<h4>
									Tìm thấy <span>2.502 </span>kết quả
								</h4>
								<i class="fas fa-search"> </i>
								<hr>
							</div>
						</div>
						<div class="col-4">
							<div class="card">
								<div class="card-img text-center">
									<a href="#"> <img
										src="${url }/image/image-user/product/1.jpg" width="80%"
										class="" alt="..."></a>
								</div>
								<div class="card-content">
									<div class="card-title">
										<a href="#">Iphone 12 64 GBIphone 12 64 GBIphone 12 64 GB</a>
									</div>
									<div class="card-price">
										<span>
											<div class="card-count">
												19.990.000 <span class="unit">đ</span>
											</div>
											<div class="card-discount">
												23.000.000 <span class="unit">đ</span>
											</div>
									</div>
									<div class="card-stars">
										<span> <i class="fas fa-star text-warning"></i></span> <span>
											<i class="fas fa-star text-warning"></i>
										</span> <span> <i class="fas fa-star text-warning"></i></span> <span>
											<i class="fas fa-star text-warning"></i>
										</span> <span> <i class="fas fa-star  text-dark"></i></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-4">
							<div class="card">
								<div class="card-img text-center">
									<a href="#"> <img src="image/img_phone/14.jpg" width="80%"
										class="" alt="..."></a>
								</div>
								<div class="card-content">
									<div class="card-title">
										<a href="#">Iphone 12 64 GBIphone 12 64 GBIphone 12 64 GB</a>
									</div>
									<div class="card-price">
										<span>
											<div class="card-count">
												19.990.000 <span class="unit">đ</span>
											</div>
											<div class="card-discount">
												23.000.000 <span class="unit">đ</span>
											</div>
									</div>
									<div class="card-stars">
										<span> <i class="fas fa-star text-warning"></i></span> <span>
											<i class="fas fa-star text-warning"></i>
										</span> <span> <i class="fas fa-star text-warning"></i></span> <span>
											<i class="fas fa-star text-warning"></i>
										</span> <span> <i class="fas fa-star  text-dark"></i></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-4">
							<div class="card">
								<div class="card-img text-center">
									<a href="#"> <img src="image/img_phone/16.jpg" width="80%"
										class="" alt="..."></a>
								</div>
								<div class="card-content">
									<div class="card-title">
										<a href="#">Iphone 12 64 GBIphone 12 64 GBIphone 12 64 GB</a>
									</div>
									<div class="card-price">
										<span>
											<div class="card-count">
												19.990.000 <span class="unit">đ</span>
											</div>
											<div class="card-discount">
												23.000.000 <span class="unit">đ</span>
											</div>
									</div>
									<div class="card-stars">
										<span> <i class="fas fa-star text-warning"></i></span> <span>
											<i class="fas fa-star text-warning"></i>
										</span> <span> <i class="fas fa-star text-warning"></i></span> <span>
											<i class="fas fa-star text-warning"></i>
										</span> <span> <i class="fas fa-star  text-dark"></i></span>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--Hang ket qua-->
				<div class="row-content">
					<div class="row">
						<div class="col-4">
							<div class="card">
								<div class="card-img text-center">
									<a href="#"> <img src="image/img_phone/17.jpg" width="80%"
										class="" alt="..."></a>
								</div>
								<div class="card-content">
									<div class="card-title">
										<a href="#">Iphone 12 64 GBIphone 12 64 GBIphone 12 64 GB</a>
									</div>
									<div class="card-price">
										<span>
											<div class="card-count">
												19.990.000 <span class="unit">đ</span>
											</div>
											<div class="card-discount">
												23.000.000 <span class="unit">đ</span>
											</div>
									</div>
									<div class="card-stars">
										<span> <i class="fas fa-star text-warning"></i></span> <span>
											<i class="fas fa-star text-warning"></i>
										</span> <span> <i class="fas fa-star text-warning"></i></span> <span>
											<i class="fas fa-star text-warning"></i>
										</span> <span> <i class="fas fa-star  text-dark"></i></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-4">
							<div class="card">
								<div class="card-img text-center">
									<a href="#"> <img src="image/img_phone/18.jpg" width="80%"
										class="" alt="..."></a>
								</div>
								<div class="card-content">
									<div class="card-title">
										<a href="#">Iphone 12 64 GBIphone 12 64 GBIphone 12 64 GB</a>
									</div>
									<div class="card-price">
										<span>
											<div class="card-count">
												19.990.000 <span class="unit">đ</span>
											</div>
											<div class="card-discount">
												23.000.000 <span class="unit">đ</span>
											</div>
									</div>
									<div class="card-stars">
										<span> <i class="fas fa-star text-warning"></i></span> <span>
											<i class="fas fa-star text-warning"></i>
										</span> <span> <i class="fas fa-star text-warning"></i></span> <span>
											<i class="fas fa-star text-warning"></i>
										</span> <span> <i class="fas fa-star  text-dark"></i></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-4">
							<div class="card">
								<div class="card-img text-center">
									<a href="#"> <img src="image/img_phone/19.jpg" width="80%"
										class="" alt="..."></a>
								</div>
								<div class="card-content">
									<div class="card-title">
										<a href="#">Iphone 12 64 GBIphone 12 64 GBIphone 12 64 GB</a>
									</div>
									<div class="card-price">
										<span>
											<div class="card-count">
												19.990.000 <span class="unit">đ</span>
											</div>
											<div class="card-discount">
												23.000.000 <span class="unit">đ</span>
											</div>
									</div>
									<div class="card-stars">
										<span> <i class="fas fa-star text-warning"></i></span> <span>
											<i class="fas fa-star text-warning"></i>
										</span> <span> <i class="fas fa-star text-warning"></i></span> <span>
											<i class="fas fa-star text-warning"></i>
										</span> <span> <i class="fas fa-star  text-dark"></i></span>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--Hang ket qua-->
				<div class="row-content">
					<div class="row">
						<div class="col-4">
							<div class="card">
								<div class="card-img text-center">
									<a href="#"> <img src="image/img_phone/20.jpg" width="80%"
										class="" alt="..."></a>
								</div>
								<div class="card-content">
									<div class="card-title">
										<a href="#">Iphone 12 64 GBIphone 12 64 GBIphone 12 64 GB</a>
									</div>
									<div class="card-price">
										<span>
											<div class="card-count">
												19.990.000 <span class="unit">đ</span>
											</div>
											<div class="card-discount">
												23.000.000 <span class="unit">đ</span>
											</div>
									</div>
									<div class="card-stars">
										<span> <i class="fas fa-star text-warning"></i></span> <span>
											<i class="fas fa-star text-warning"></i>
										</span> <span> <i class="fas fa-star text-warning"></i></span> <span>
											<i class="fas fa-star text-warning"></i>
										</span> <span> <i class="fas fa-star  text-dark"></i></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-4">
							<div class="card">
								<div class="card-img text-center">
									<a href="#"> <img src="image/img_phone/21.jpg" width="80%"
										class="" alt="..."></a>
								</div>
								<div class="card-content">
									<div class="card-title">
										<a href="#">Iphone 12 64 GBIphone 12 64 GBIphone 12 64 GB</a>
									</div>
									<div class="card-price">
										<span>
											<div class="card-count">
												19.990.000 <span class="unit">đ</span>
											</div>
											<div class="card-discount">
												23.000.000 <span class="unit">đ</span>
											</div>
									</div>
									<div class="card-stars">
										<span> <i class="fas fa-star text-warning"></i></span> <span>
											<i class="fas fa-star text-warning"></i>
										</span> <span> <i class="fas fa-star text-warning"></i></span> <span>
											<i class="fas fa-star text-warning"></i>
										</span> <span> <i class="fas fa-star  text-dark"></i></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-4">
							<div class="card">
								<div class="card-img text-center">
									<a href="#"> <img src="image/img_phone/22.jpg" width="80%"
										class="" alt="..."></a>
								</div>
								<div class="card-content">
									<div class="card-title">
										<a href="#">Iphone 12 64 GBIphone 12 64 GBIphone 12 64 GB</a>
									</div>
									<div class="card-price">
										<span>
											<div class="card-count">
												19.990.000 <span class="unit">đ</span>
											</div>
											<div class="card-discount">
												23.000.000 <span class="unit">đ</span>
											</div>
									</div>
									<div class="card-stars">
										<span> <i class="fas fa-star text-warning"></i></span> <span>
											<i class="fas fa-star text-warning"></i>
										</span> <span> <i class="fas fa-star text-warning"></i></span> <span>
											<i class="fas fa-star text-warning"></i>
										</span> <span> <i class="fas fa-star  text-dark"></i></span>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>

				<!-- pagination -->
				<div class="row ">
					<div class="col-12 d-flex justify-content-end">
						<nav aria-label="...">
							<ul class="pagination">
								<li class="page-item disabled"><a class="page-link"
									href="#" tabindex="-1" aria-disabled="true">Trở về</a></li>
								<li class="page-item active"><a class="page-link" href="#">1</a></li>
								<li class="page-item " aria-current="page"><a
									class="page-link" href="#">2 </a></li>
								<li class="page-item"><a class="page-link" href="#">3</a></li>
								<li class="page-item"><a class="page-link" href="#">Tiếp</a>
								</li>
							</ul>
						</nav>
					</div>
				</div>



			</div>
		</div>
	</div>




	<!-- /.container -->



	<jsp:include page="/VIEW/jsp/jsp-component/footer.jsp"></jsp:include>
	<!-- Bootstrap core JavaScript -->

	 
	   

</body>

</html>