package service;

import java.util.List;

import dao.MenuListDao;
import vo.MenuVo;

public class MenuListService {
	private static MenuListService instance;

	private MenuListService() {

	}

	public static MenuListService getInstance() {
		if (instance == null) {
			instance = new MenuListService();
		}
		return instance;
	}

	MenuListDao menuListDao = MenuListDao.getInstance();

	public List<MenuVo> menuRiceList(List<Object> param) {
		return menuListDao.menuRiceList(param);
	}
}
