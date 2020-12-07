<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<jsp:include page="/VIEW/jsp/jsp-component/head-css.jsp" />
<c:url var="url" scope="application" value="/VIEW" ></c:url>
  <style>

  </style>
</head>

<body >
	<jsp:include page="/VIEW/jsp/jsp-component/menu.jsp"></jsp:include>
	<!-- Thanh menu loc du lieu va sap xep-->
	  <div class="container"style="margin: 60px auto;max-width:80%;">
    <div class="py-1 text-center">
      <img class="d-block mx-auto mb-4" src="../image/img_checkOut/icon.png" alt="" width="72" height="72">
      <h2>Xác nhận thanh toán</h2>

    </div>

    <div class="row mt-5">
      <div class="col-md-4 order-md-2 mb-4">
        <h4 class="d-flex justify-content-between align-items-center mb-3">
          <span class="text-muted">Sản phẩm của bạn</span>
          <span class="badge badge-secondary badge-pill">3</span>
        </h4>
        <ul class="list-group mb-3">
          <li class="list-group-item d-flex justify-content-between lh-condensed">
            <div>
              <h6 class="my-0">Iphone 8S</h6>
            </div>
            <span class=" price">9.000.000 <span class='unit'>đ</span></span>
          </li>
          <li class="list-group-item d-flex justify-content-between lh-condensed">
            <div>
              <h6 class="my-0"> Sony Xpreria</h6>
            </div>
            <span class=" price">8.000.000 <span class='unit'>đ</span></span>
          </li>
          <li class="list-group-item d-flex justify-content-between lh-condensed">
            <div>
              <h6 class="my-0">Oppo A8 Plus</h6>
            </div>
            <span class=" price" style="color: red;">5.000.000 <span class='unit'>đ</span></span>
          </li>
          <li class="list-group-item d-flex justify-content-between lh-condensed">
            <div>
              <h6 class="my-0">Phí giao hàng</h6>
              <!-- <small class="text-muted">Phiên bản limited edition</small> -->
            </div>
            <span class=" price" style="color: red;">500.000 <span class='unit'>đ</span></span>
          </li>

          <li class="list-group-item d-flex justify-content-between">
            <span>Tổng cộng</span>
            <strong class="price">19.000.000 <span class='unit'>đ</span></strong>
          </li>
        </ul>
        <!-- 
        <form class="card p-2">
          <div class="input-group">
            <input type="text" class="form-control" placeholder="Nhập mã giảm giá">
            <div class="input-group-append">
              <button type="submit" class="btn btn-secondary">Áp dụng</button>
            </div>
          </div>
        </form> -->
        <div class="row" style="margin-top: 20px;">
          <a href="../Bill_Page/Bill.html" style="margin: auto;">
            <button class="btn btn-primary" style="padding: 5px 100px;
            ; text-align: center; margin: auto; " type="submit">Thanh
              Toán</button>
          </a>
        </div>
      </div>

      <div class="col-md-8 order-md-1">

        <form class="needs-validation" action="../../Bill_Page/Bill.html" novalidate>


          <h4 class="mb-3">Chọn phương thức thanh toán</h4>

          <div class="d-block my-3">
            <div class="custom-control custom-radio">
              <input id="credit" name="paymentMethod" type="radio" class="custom-control-input"
                onclick="hidenForm(this)" checked required>
              <label class="custom-control-label" for="credit">Thanh toán Online</label>
            </div>

            <div class="custom-control custom-radio " style="margin-top: 20px;">
              <input id="COD" name="paymentMethod" type="radio" class="custom-control-input" onclick="hidenForm(this)"
                required>
              <label class="custom-control-label " for="COD">Thanh toán khi nhận hàng</label>
            </div>
          </div>

          <div id="FormThanhToanBangThe">
            <div class="row">
              <div class="col-md-6 mb-3">
                <label for="cc-name">Tên chủ tài khoản</label>
                <input type="text" class="form-control" id="cc-name" placeholder="Nhập tên của bạn" required>
                <div class="invalid-feedback">
                  Không được để trống
                </div>
              </div>
              <div class="col-md-6 mb-3">
                <label for="cc-number">Số thẻ</label>
                <input type="text" class="form-control" id="cc-number" placeholder="Nhập số thẻ" required>
                <div class="invalid-feedback">
                  Không được để trống
                </div>
              </div>
            </div>
            <div class="row">
              <div class="col-md-3 mb-3">
                <label for="cc-expiration">Thời hạn</label>
                <input type="date" class="form-control" id="cc-expiration" placeholder=" " required>
                <div class="invalid-feedback">
                  Không được để trống
                </div>
              </div>
              <div class="col-md-3 mb-3">
                <label for="cc-cvv">CVV</label>
                <input type="text" class="form-control" id="cc-cvv" placeholder="Nhập mã CVV" required>
                <div class="invalid-feedback">
                  Không được để trống
                </div>
              </div>

            </div>

          </div>

          <div id="diaChiForm">
            <label for="cc-name">Địa chỉ</label>
            <input type="text" class="form-control" id="cc-name" placeholder="Nhập địa chỉ" required>
            <div class="invalid-feedback">
              Không được để trống
            </div>
            <hr class="mb-4">
          </div>
        </form>




      </div>
    </div>

    <!-- Footer -->

  </div>


	<!-- /.container -->



	<jsp:include page="/VIEW/jsp/jsp-component/footer.jsp"></jsp:include>
	<!-- Bootstrap core JavaScript -->
 <script>
    function hidenForm(x) {
      if (x.id == "credit") {
        var form = document.getElementById("FormThanhToanBangThe");
        // var formDC = document.getElementById("diaChiForm");
        form.style.display = "block";
        formDC.style.display = "none";
      } else {
        var form = document.getElementById("FormThanhToanBangThe");
        var formDC = document.getElementById("diaChiForm");
        form.style.display = "none";
        formDC.style.display = "block";
      }
    }
  </script>
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="${url }/js/js-page/form-validation.js"></script>
</body>

</html>