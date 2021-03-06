package model_DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BeanProduct.Config;
import BeanProduct.Detail_Config;
import BeanProduct.Detail_Propertie;
import BeanProduct.Propertie;
import model_ConnectDB.ExecuteCRUD;
import model_beans.Product;
import model_beans.ProductAdmin;

public class DAO_Product extends ExecuteCRUD {

	public DAO_Product() {

	}

	public String thumbnail(String id) {
		String query = "SELECT ANH FROM HINHANH WHERE MASP = ? AND LOAIANH = 'NEN'";
		String link = "";
		try (ResultSet rs = super.ExecuteQuery(query, id)) {
			while (rs.next()) {
				link = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return link;
	}

	public ArrayList<Product> getList(int start, int end) {
		ArrayList<Product> listProduct = new ArrayList<Product>();
		String query = "WITH X AS (select ROW_NUMBER() OVER (ORDER BY SANPHAM.MASP DESC) AS STT,SANPHAM.MASP, SANPHAM.TENSP,SANPHAM.GIOITHIEU,GIA,GIA_KM,MACH FROM  SANPHAM\r\n"
				+ "				inner join GIA_SP on SANPHAM.MASP = GIA_SP.MASP) SELECT * FROM X WHERE STT BETWEEN ? AND ?";
		try (ResultSet rs = super.ExecuteQuery(query, start, end)) {
			while (rs.next()) {
				listProduct.add(new Product(rs.getString("MASP").trim(), thumbnail(rs.getString("MASP").trim()),
						rs.getString("TENSP"), rs.getString("GIOITHIEU"), rs.getInt("GIA"), rs.getInt("GIA_KM"),
						rs.getString("MACH")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listProduct;
	}

	private final String PRODUCT = "SANPHAM";
	// tên các cột của bảng ACCOUNT
	private final String MASP1 = "SANPHAM.MASP";
	private final String MASP = "MASP";
	private final String TENSP = "TENSP";
	private final String LOAI_SP = "LOAI_SP";
	private final String MATH = "MATH";
	private final String TINHTRANG = "TINHTRANG";
	private final String NGAYCAPNHAT = "NGAYCAPNHAT";
	private final String GIOITHIEU = "GIOITHIEU";
	private final String SOLUONG = "SOLUONG";
	private final String SL_DABAN = "SL_DABAN";
	private final String MACH = "MACH";

	public Product getProduct(String id) {
		String query = "select SANPHAM.TENSP,SANPHAM.GIOITHIEU,GIA,GIA_KM,MACH FROM " + PRODUCT
				+ " inner join GIA_SP on SANPHAM.MASP = GIA_SP.MASP WHERE " + MASP1 + " = ? ";
		Product product = null;
		try (ResultSet rs = super.ExecuteQuery(query, id)) {
			while (rs.next()) {
				Product pro = new Product(id, thumbnail(id), rs.getString(1), rs.getString(2), rs.getInt(3),
						rs.getInt(4), rs.getString(5));
				product = pro;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return product;
	}

	private final String CONFIG = "CAUHINH";

	public Config getConfig(String id) {
		String query = "SELECT * FROM " + CONFIG + " WHERE " + MACH + " = ? ";
		Config conf = null;
		try (ResultSet rs = super.ExecuteQuery(query, getProduct(id).getIdConfig())) {
			while (rs.next()) {
				conf = new Config( //
						rs.getString(MACH), //
						Integer.parseInt(rs.getString("SLTT")) //

				);//
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conf;
	}

	private final String DETAIL_CONFIG = "CH_CTTT";

	public ArrayList<Detail_Config> getDetailConfig(String id) {
		ArrayList<Detail_Config> detail = new ArrayList<Detail_Config>();
		String query = "SELECT * FROM " + DETAIL_CONFIG + " WHERE " + MACH + " = ? ";
		try (ResultSet rs = super.ExecuteQuery(query, getConfig(id).getId())) {
			while (rs.next()) {
				detail.add(new Detail_Config( //
						rs.getString(MACH), //
						rs.getString("MACT"), //
						listDetailPro(rs.getString("MACT"))));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return detail;
	}

	private final String PROPERTIES = "THUOCTINH";

	public ArrayList<Propertie> listProper(String idTT) {
		ArrayList<Propertie> proper = new ArrayList<Propertie>();
		String query = "SELECT * FROM " + PROPERTIES + " WHERE " + "MATT" + " = ? ";
		try (ResultSet rs = super.ExecuteQuery(query, idTT)) {
			while (rs.next()) {
				proper.add(new Propertie(rs.getString("MATT"), rs.getString("LOAI_GIATRI"), rs.getString("NOIDUNG") //

				));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return proper;
	}

	private final String DETAIL_PRO = "CHITIET_THUOCTINH";

	public Detail_Propertie listDetailPro(String idCT) {
		Detail_Propertie proper = null;
		String query = "SELECT * FROM " + DETAIL_PRO + " WHERE " + "MACT" + " = ? ";
		try (ResultSet rs = super.ExecuteQuery(query, idCT)) {
			while (rs.next()) {
				proper = (new Detail_Propertie(rs.getString("MACT"), rs.getString("GIATRI"), rs.getString("NOIDUNG"), //
						rs.getString("MATT"), listProper(rs.getString("MATT"))));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return proper;
	}

	private final String DANHGIA = "DANHGIA";

	public int countStar(String numberStar, String id) {
		String query = "SELECT  COUNT(MUCDANHGIA) FROM " + DANHGIA + " WHERE " + "MASP" + " = ? AND " + "MUCDANHGIA =?";
		int star = 0;
		try (ResultSet rs = super.ExecuteQuery(query, id, numberStar)) {
			while (rs.next()) {
				star = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return star;
	}

	public void addEvaluate(String idProduct, String idUser, String mountStar, String content, String date) {
		try {
			String query = "INSERT INTO " + "DANHGIA" + " VALUES(?,?,?,?,?)";
			String[] parameters = { //
					idProduct, //
					idUser, //
					mountStar, //
					content, //
					date };

			try (ResultSet rs = super.ExecuteQuery(query, parameters)) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// lấy giá ngày cập nhật gần nhất
	public ArrayList<String> price(String id) {
		ArrayList<String> pri = new ArrayList<String>();
		String[] para = { id, id };
		String price = "";
		String priceSale = "";
		String query = "SELECT * FROM GIA_SP WHERE MASP = ? AND NGAYCAPNHAT = (SELECT MAX(NGAYCAPNHAT) FROM GIA_SP WHERE MASP = ?)";
		try (ResultSet rs = super.ExecuteQuery(query, para)) {
			while (rs.next()) {
				price = rs.getString("GIA").replace(".0000", "");
				priceSale = (rs.getString("GIA_KM"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (priceSale != null) {
			priceSale = priceSale.replace(".0000", "");
		} else {
			priceSale = "Không";
		}
		pri.add(price);
		pri.add(priceSale);
		return pri;
	}

	public String stateProduct(String id) {
		String state = "";
		String query = "select TINHTRANG from sanpham where masp = ?";
		try (ResultSet rs = super.ExecuteQuery(query, id)) {
			while (rs.next()) {
				state = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return state;
	}

	public String stateBrand(String id) {
		String state = "";
		String query = "select THUONGHIEU.TRANGTHAI from THUONGHIEU inner join SANPHAM on THUONGHIEU.MATH = SANPHAM.MATH where SANPHAM.MASP = ?\r\n"
				+ "";
		try (ResultSet rs = super.ExecuteQuery(query, id)) {
			while (rs.next()) {
				state = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return state;
	}

	public ArrayList<ProductAdmin> listProductAdmin(int start, int end) {
		ArrayList<ProductAdmin> product = new ArrayList<ProductAdmin>();
		String query = "WITH X AS (select ROW_NUMBER() OVER (ORDER BY SANPHAM.NGAYCAPNHAT DESC) AS STT, SANPHAM.*,THUONGHIEU.TENTH,HINHANH.ANH FROM ((SANPHAM INNER JOIN HINHANH ON SANPHAM.MASP = HINHANH.MASP)) INNER JOIN THUONGHIEU ON THUONGHIEU.MATH = SANPHAM.MATH WHERE HINHANH.LOAIANH = 'NEN') SELECT * FROM X WHERE STT BETWEEN ? AND ?";
		try (ResultSet rs = super.ExecuteQuery(query, start, end)) {
			while (rs.next()) {
				product.add(new ProductAdmin(rs.getString("STT"), rs.getString("MASP").trim(), rs.getString("ANH"),
						rs.getString("TENSP"), rs.getString("TENTH"), rs.getString("NGAYCAPNHAT"),
						rs.getInt("SOLUONG") - rs.getInt("SL_DABAN"), rs.getInt("SL_DABAN"),
						price(rs.getString("MASP").trim()).get(0), price(rs.getString("MASP").trim()).get(1),
						rs.getString("TINHTRANG")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return product;
	}

	public boolean updateState(String id) {
		String state = stateProduct(id);
		String stateBrand = stateBrand(id);
		if (state.equals("Đang bán")) {
			try {
				String query = "UPDATE SANPHAM SET TINHTRANG = N'Ngừng bán' WHERE MASP = ?";

				try (ResultSet rs = super.ExecuteQuery(query, id)) {
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (state.equals("Ngừng bán") && !stateBrand.equals("Ngừng kinh doanh")) {
			try {
				String query = "UPDATE SANPHAM SET TINHTRANG = N'Đang bán' WHERE MASP = ?";

				try (ResultSet rs = super.ExecuteQuery(query, id)) {
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		return false;
	}

}
