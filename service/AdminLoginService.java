package service;

import java.util.List;

import dao.AdminLoginDao;
import vo.AdminVo;

public class AdminLoginService {
	private static AdminLoginService instance;

	private AdminLoginService() {

	}

	public static AdminLoginService getInstance() {
		if (instance == null) {
			instance = new AdminLoginService();
		}
		return instance;
	}

	AdminLoginDao adminLoginDao = AdminLoginDao.getInstance();

	public boolean adminLogin(List<Object> param) {
		AdminVo admLogin = adminLoginDao.adminLogin(param);
		if (admLogin == null)
			return false;
		return true;
	}
}
