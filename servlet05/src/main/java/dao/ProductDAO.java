package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.ProductDTO;
import mybatis.MybatisFactory;

public class ProductDAO {
	private SqlSession sql;
	
	void connect() {
		SqlSessionFactory factory = MybatisFactory.getInstance();
		sql = factory.openSession(true);
	}
	
	public List<ProductDTO> select_product() {
		connect();
		List<ProductDTO> list = sql.selectList("product.product_list");
		return list;
	}
	
	public ProductDTO info_product(int num) {
		connect();
		ProductDTO info = sql.selectOne("product.product_info", num);
		return info;
	}
	
}
