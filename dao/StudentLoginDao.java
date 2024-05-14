package dao;

import java.util.List;

import util.JDBCUtil;
import vo.StudentVo;

public class StudentLoginDao {
	private static StudentLoginDao instance;

	private StudentLoginDao() {

	}

	public static StudentLoginDao getInstance() {
		if (instance == null) {
			instance = new StudentLoginDao();
		}
		return instance;
	}

	JDBCUtil jdbc = JDBCUtil.getInstance();

	public StudentVo findId(List<Object> param) {
		String sql = " SELECT *\r\n " + 
					 " FROM STUDENT\r\n " + 
					 " WHERE STU_NAME = ? AND STU_BIRTH = ? ";
		return jdbc.selectOne(sql, param, StudentVo.class);
	}
	
	public StudentVo findPass(List<Object> param) {
		String sql = " SELECT *\r\n " + 
					 " FROM STUDENT\r\n " + 
					 " WHERE STU_NO = ? AND STU_NAME = ? AND STU_BIRTH = ? ";
		return jdbc.selectOne(sql, param, StudentVo.class);
	}
	
	public StudentVo studentLogin(List<Object> param) {
		String sql = " SELECT *\r\n" + 
					 " FROM STUDENT\r\n" + 
					 " WHERE STU_NO = ? AND STU_PASSWORD = ? ";
		return jdbc.selectOne(sql, param, StudentVo.class);
	}
}
