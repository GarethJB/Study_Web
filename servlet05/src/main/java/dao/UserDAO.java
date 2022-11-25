package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.UserDTO;
import mybatis.MybatisFactory;

public class UserDAO {
	private SqlSession sql;
	
	// DB연결
	void connect() {
		SqlSessionFactory factory = MybatisFactory.getInstance();
		sql = factory.openSession(true);
	}
	
	public String select_name() {
		connect();
		String name = sql.selectOne("user.user_name");
		return name;
	}
	
	public int select_money() {
		connect();
		int money = sql.selectOne("user.user_money");
		return money;
	}
	
	public List<String> select_all() {
		List<String> list = null;
		list = sql.selectOne("user.user_all");
		return list;
	}
	
	public List<UserDTO> select_user_listr() {
		connect();
		List<UserDTO> list = sql.selectList("user.user_list");
		return list;
		
		
	}
	
	
	
}
