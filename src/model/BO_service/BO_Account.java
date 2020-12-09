package model.BO_service;

import java.util.List;

import model.DAO.DAO_Account;
import model.beans.Admin;
import model.beans.Customer;
import model.utility.Const;
import model.utility.EncryptPassword;

public class BO_Account {

	private int pageNumber;
	private int numRowPerPage;
	private DAO_Account dao = new DAO_Account();

	public BO_Account() {
	}

	public BO_Account(String pageNumber_str, String numRowPerPage_str) {
		this.pageNumber = Integer.parseInt(pageNumber_str);
		this.numRowPerPage = Integer.parseInt(numRowPerPage_str);
	}

	public Customer getCustomerInfo(String email) {
		Customer acc = dao.getCustomerInfo(email);
		return acc;
	}

	public List<Customer> getListAccount() {
		List<Customer> listAcc = dao.getListAccount(startRow(), endRow());
		return listAcc;

	}

	public boolean isExsit(String email) {
		Customer acc = getCustomerInfo(email);
		if (acc != null) {
			return true;
		}
		return false;
	}

	public void add(Customer customer) {
		customer.setPassword(EncryptPassword.md5(customer.getPassword()));
		dao.add(customer);

	}

	/**
	 * @param email
	 * @param passwordPlaintext
	 * @param loại              tài khoản cần checks
	 * @return 1 là đăng nhập thành công. 2 là thông tin tài khoản không đúng. 3 là
	 *         tài khoản bị khóa
	 */
	public int checkCustomerLogin(String email, String passwordPlaintext) {
		Customer acc = dao.getCustomerInfoLogin(email);
		// kiểm tra mail
		if (acc != null) {
			String encrytPass = acc.getPassword();
			// kiểm tra trạng thái (có bị khóa không)
			if (acc.getStatus().equals(Const.ACCONT_DISABLE)) {
				return 3;
			}
			// kiểm tra pass
			if (EncryptPassword.md5(passwordPlaintext).equals(encrytPass)) {
				return 1;
			}
		}
		return 2;
	}

	public void changePassword(String email, String passpordPlaintext) {
		Customer acc = dao.getCustomerInfo(email);
		acc.setPassword(EncryptPassword.md5(passpordPlaintext));
		(new DAO_Account()).update(acc);
	}

	public void update(Customer customer) {
		(new DAO_Account()).update(customer);
	}

	/**
	 * @param email
	 * @note : thường dùng kết hợp với hàm isExist()
	 */
	public boolean isDisable(String email) {
		Customer acc = getCustomerInfo(email);
		if (acc.getStatus().equals(Const.ACCONT_DISABLE)) {
			return true;
		}
		return false;
	}

	// _____________________________________________________________________________
	public int getTotalAccount() {
		int total;
		total = dao.getTotal();
		return total;
	}

	public int getTotalStatusAccount(String status) {
		int total = dao.getTotalStatusAccount(status);
		return total;
	}

// dùng làm pagination
	public int totalPage() {
		int num = getTotalAccount() / numRowPerPage;
		return num;
	}

	public int startRow() {
		int startRow = 0;
		if (pageNumber <= totalPage()) {
			startRow = endRow() - numRowPerPage + 1;
		}
		return startRow;
	}

	public int endRow() {
		int endRow = 0;
		if (pageNumber <= totalPage()) {
			endRow = pageNumber * numRowPerPage;
		}
		return endRow;
	}

	public int totalSearch(String keyword) {
		int total = dao.totalSearch(keyword);
		return total;
	}

	public int totalPageSearch(String keyword) {
		int num = totalSearch(keyword) / numRowPerPage;
		return num;
	}

	public void on_off_account(String email) {
		Customer acc = getCustomerInfo(email);
		if (acc.getStatus().equals(Const.ACCOUNT_ENABLE)) {
			acc.setStatus(Const.ACCONT_DISABLE);
			update(acc);
		} else {
			acc.setStatus(Const.ACCOUNT_ENABLE);
			update(acc);
		}

	}

	public List<Customer> search(String keyword, int start, int end) {
		List<Customer> listAcc = dao.search(keyword, start, end);
		return listAcc;

	}

	public List<Customer> getListDisableAccount() {
		List<Customer> listAcc = dao.getListAcountStatus(Const.ACCONT_DISABLE);
		return listAcc;
	}

//_____________________________________________________________________________

	public boolean checkAdminLogin(String username, String password) {
		Admin admin = getAdmin(username);
		if (admin == null) {
			return false;
		}
		if (admin.getPassword().equals(EncryptPassword.md5(password))) {
			return true;
		}
		return false;
	}

	public Admin getAdmin(String username) {
		return (new DAO_Account()).getAdmin(username);
	}

	public static void main(String[] args) {
		System.out.println(new BO_Account().checkCustomerLogin("1", "123"));
	}

}