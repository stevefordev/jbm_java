package org.jbm.exam.ex;

import java.util.List;

import org.jbm.exam.dao.MoviesDAO;
import org.jbm.exam.util.ScannerUtil;
import org.jbm.exam.util.ScannerUtil.InputType;
import org.jbm.exam.vo.Movie;

/**
 * 영화 번호로 영화 테이블에서 데이터 삭제
 * 
 * @author KUHYUN PARK
 *
 */
public class Ex12 {

	public static void main(String[] args) {

		// 현재 영화 리스트 호출
		List<Movie> list = MoviesDAO.selectList();

		for (int i = 0; i < list.size(); i++) {
			// 영화의 실제 디비 번호와 이름으로 출력
			System.out.print(String.format("%d) %s  ", list.get(i).getNo(), list.get(i).getName()));

			// 가산점:한줄에 4개씩 출력
			if ((i + 1) % 4 == 0) {
				System.out.println("");
			}
		} // for end

		int no = (int) ScannerUtil.getInputData(InputType.NUMBER, "삭제할 영화번호는?");

		int result = MoviesDAO.delete(no);

		String msg = "삭제 되지 않았습니다";
		if (result > 0) {
			msg = (result + "개 의 영화가 삭제되었습니다.");
		}

		System.out.println(msg);
	} // main() end
} // Ex12 end
