package service;

import java.util.List;

import dao.StudentLoginDao;
import vo.StudentVo;

public class StudentLoginService {
	private static StudentLoginService instance;

	private StudentLoginService() {

	}

	public static StudentLoginService getInstance() {
		if (instance == null) {
			instance = new StudentLoginService();
		}
		return instance;
	}

	StudentLoginDao studentLoginDao = StudentLoginDao.getInstance();

	public StudentVo findId(List<Object> param) {
		return studentLoginDao.findId(param);
	}

	public StudentVo findPass(List<Object> param) {
		return studentLoginDao.findPass(param);
	}

	public boolean studentLogin(List<Object> param) {
		StudentVo stuLogin = studentLoginDao.studentLogin(param);
		if (stuLogin == null)
			return false;
		return true;
	}
}
