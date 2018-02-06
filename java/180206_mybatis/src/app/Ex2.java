package app;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Ex2 {
	
	public static void main(String[] args) throws Exception {
		
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
		
		int result = session.delete("idols.delete","태연");
		
		System.out.println(result+"명 삭제");
		
	}//main() end 

}//Ex2 end
