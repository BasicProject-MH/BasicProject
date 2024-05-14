package dao;

import java.util.List;

import util.JDBCUtil;
import vo.MenuVo;

public class MenuListDao {
	private static MenuListDao instance;

	private MenuListDao() {

	}

	public static MenuListDao getInstance() {
		if (instance == null) {
			instance = new MenuListDao();
		}
		return instance;
	}

	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public List<MenuVo> menuRiceList(List<Object> param) {
		String sql = " SELECT *\r\n " + 
				 	 " FROM MENU\r\n " + 
				 	 " WHERE MENU_DATE BETWEEN ? AND ? ";
		return jdbc.selectList(sql, param, MenuVo.class);
	}
}
