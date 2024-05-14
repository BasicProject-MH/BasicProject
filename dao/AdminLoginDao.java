package dao;

import java.util.List;

import util.JDBCUtil;
import vo.AdminVo;

public class AdminLoginDao {
	private static AdminLoginDao instance;

	private AdminLoginDao() {

	}

	public static AdminLoginDao getInstance() {
		if (instance == null) {
			instance = new AdminLoginDao();
		}
		return instance;
	}

	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public AdminVo adminLogin(List<Object> param) {
		String sql = "SELECT *\r\n" + 
					 "FROM ADMIN\r\n" + 
					 "WHERE ADMIN_ID = ? AND ADMIN_PASSWORD = ?";
		return jdbc.selectOne(sql, param, AdminVo.class);
	}
}
