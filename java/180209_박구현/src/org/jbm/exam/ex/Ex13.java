package org.jbm.exam.ex;

import java.util.List;

import org.jbm.exam.dao.MoviesDAO;
import org.jbm.exam.util.ScannerUtil;
import org.jbm.exam.util.ScannerUtil.InputType;
import org.jbm.exam.vo.Movie;

/**
 * 영화 이름으로 검색하는 프로그램
 * 
 * @author KUHYUN PARK
 *
 */
public class Ex13 {

	public static void main(String[] args) {

		String name = (String) ScannerUtil.getInputData(InputType.STRING, "검색할 영화제목을 입력해주세요.");
		List<Movie> list = MoviesDAO.selectListByName(name);

		if (list.size() > 0) {
			for (Movie movie : list) {
				//가산점, toString 오버라이딩에 날짜 포맷과, 숫자포맷 으로 출력
				System.out.println(movie.toString());
			}
		} else {
			// 가산점:검색한 영화가 없는 경우 없다고 출력
			System.out.println("검색된 영화가 없습니다.");
		}
	}// main() end
}// Ex13
