package model_DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.http.client.fluent.Executor;

import model_ConnectDB.ExecuteCRUD;
import model_beans.Color_Web;
import model_beans.IconMenu;

public class DAO_IconMenu extends ExecuteCRUD {
	public ArrayList<IconMenu> listIconMenu() {
		ArrayList<IconMenu> listicon = new ArrayList<IconMenu>();
		String query = "select * from ICON_MENU ORDER BY MAIC ASC";

		try (ResultSet rs = super.ExecuteQueryNonParameter(query)) {
			while (rs.next()) {
				listicon.add(new IconMenu(rs.getString("ICON"), rs.getString("TIEUDE")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listicon;
	}

	public Color_Web colorWeb() {

		String query = "SELECT * FROM QL_GIAODIEN";
		Color_Web color = null;
		try (ResultSet rs = super.ExecuteQueryNonParameter(query)) {
			if (rs.next()) {
				color = new Color_Web(rs.getString("MAU_NEN").trim(), rs.getString("MAU_THANHLOC").trim(), rs.getString("MAU_CHUDAO").trim(),
						rs.getString("MAU_CHU").trim());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return color;
	}

	public void updateColor(String colornen, String colorchudao, String colorloc, String colorchu) {
		try {
			String query = "UPDATE QL_GIAODIEN SET MAU_NEN = ?,MAU_CHUDAO = ?,MAU_THANHLOC = ?,MAU_CHU = ? WHERE MAGD = 'GD01'";
			try (ResultSet rs = super.ExecuteQuery(query, colornen,colorchudao,colorloc,colorchu)) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateIcon(String icon1, String content1, String icon2, String content2, String icon3, String content3,
			String icon4, String content4) {

		try {
			String query = "UPDATE ICON_MENU SET ICON = ? , TIEUDE = ? WHERE MAIC = 'IC1'";
			try (ResultSet rs = super.ExecuteQuery(query, icon1, content1)) {
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		try {
			String query = "UPDATE ICON_MENU SET ICON = ? , TIEUDE = ? WHERE MAIC = 'IC2'";

			try (ResultSet rs = super.ExecuteQuery(query, icon2, content2)) {
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		try {
			String query = "UPDATE ICON_MENU SET ICON = ? , TIEUDE = ? WHERE MAIC = 'IC3'";

			try (ResultSet rs = super.ExecuteQuery(query, icon3, content3)) {
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		try {
			String query = "UPDATE ICON_MENU SET ICON = ? , TIEUDE = ? WHERE MAIC = 'IC4'";

			try (ResultSet rs = super.ExecuteQuery(query, icon4, content4)) {
			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public int countIcon() {
		String query = "SELECT COUNT(*) FROM ICON_MENU";
		int count = 0;
		try (ResultSet rs = super.ExecuteQueryNonParameter(query)) {
			if (rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(new DAO_IconMenu().colorWeb().toString());
	}

}
