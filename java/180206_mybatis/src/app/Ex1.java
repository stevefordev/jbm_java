package app;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Ex1 {
	
	public static void main(String[] args)
	throws Exception {
		
		//mybatis-config.xml을 읽어오는
		//Reader 객체 생성
		Reader reader = 
				Resources.getResourceAsReader("config/mybatis-config.xml");
		
		SqlSessionFactoryBuilder builder = 
				new SqlSessionFactoryBuilder();
		
		SqlSessionFactory factory = 
				builder.build(reader);
		
		//결국 SqlSession 필요
		SqlSession session = 
				factory.openSession(true);
		
		// 1번째 인자 : 네임스페이스.아이디
		// 2번째 인자 : 파라미터가 있으면
		int result =
				session.delete("groups.delete",40);
		
		System.out.println(result+"개 삭제");
		
		
	}//main() end

}//Ex1 end
