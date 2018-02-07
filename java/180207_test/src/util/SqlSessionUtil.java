package util;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {

	public static SqlSession getSession() {
		// mybatis-config.xml을 읽어오는
		// Reader 객체 생성

		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("config/mybatis-config.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}

		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

		SqlSessionFactory factory = builder.build(reader);

		// 결국 SqlSession 필요
		return factory.openSession(true);

	}// getSession() end
}