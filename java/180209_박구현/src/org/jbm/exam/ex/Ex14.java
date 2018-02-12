package org.jbm.exam.ex;

import java.sql.Date;
import java.util.Collections;
import java.util.List;

import org.jbm.exam.dao.GenresDAO;
import org.jbm.exam.dao.MoviesDAO;
import org.jbm.exam.util.ScannerUtil;
import org.jbm.exam.util.ScannerUtil.InputType;
import org.jbm.exam.vo.Genre;
import org.jbm.exam.vo.Movie;

/**
 * 영화 입력 프로그램
 * 
 * @author KUHYUN PARK
 *
 */
public class Ex14 {

	public static void main(String[] args) {

		// 가산점: 장르 테이블에서 호출해서 출력
		List<Genre> genreList = GenresDAO.selectList();

		// 장르가 한개라도 있어야 영화 입력 수행
		if (genreList.size() > 0) {

			// 번호 순으로 정렬
			Collections.sort(genreList);

			int genreNo = 0, countTry = 0;
			boolean isFindGenre = false;
			
			// 가산점:장르의 번호가 숫자가 아니거나 숫자라 하더라도 실제 저장된 번호가 아닌경우			
			// 정확히 입력 할때 까지 반복 인풋 요청
			/*
			 * 반복시 출력되는 장르 리스트는 매번 디비에 질의 하지 않고
			 * 처음에 한번 호출한 List<Genre> genreList 재활용 하였습니다. 
			 * */			
			while (!isFindGenre) {

				// 첫 시도 메시지와 2회자 이상 시도의 장르 번호 선택 메시지를 구분
				String msg = (countTry++ == 0 ? "" : "정확한 장르 번호를 입력해주세요\r\n") + printGenreList(genreList)
						+ "장르번호를 입력해주세요.";

				genreNo = (int) ScannerUtil.getInputData(InputType.NUMBER, msg);

				for (Genre genre : genreList) {
					if (genreNo == genre.getNo()) {
						isFindGenre = true;
					}
				} // for (Genre genre : genreList) end

			} // while (!isFindGenre) end

			String movieName = (String) ScannerUtil.getInputData(InputType.STRING, "영화이름을 입력해주세요.^-^");
			String director = (String) ScannerUtil.getInputData(InputType.STRING, "감독이름을 입력해주세요.^-^");
			Date releaseDate = (Date) ScannerUtil.getInputData(InputType.DATE,
					"아래와 같은 포맷으로 개봉일을 입력해주세요.\r\n2018-02-09(년-월-일)");
			
			//가산점:종료일은 빈값일경우 null
			Date endDate = (Date) ScannerUtil.getInputData(InputType.DATE,
					"아래와 같은 포맷으로 종료일을 입력해주세요.\r\n2018-02-09(년-월-일)", true);
			
			//가산점:관객수는 빈값일경우 0
			int audienceNum = (int) ScannerUtil.getInputData(InputType.NUMBER, "관객수를 입력해주세요.(없으면 그냥 엔터)", true);

			Movie movie = new Movie(movieName, director, releaseDate, endDate, audienceNum, genreNo);

			int result = MoviesDAO.insert(movie);
			System.out.println(result + "개의 영화가 등록 되었습니다.");
		} else {
			System.out.println("최소 한개 이상의 장를가 필요합니다.");
		} // if (genreList.size() > 0) end
	} // main() end

	/**
	 * 장르 리스트를 String 으로 반환
	 * 
	 * @param genreList
	 */
	private static String printGenreList(List<Genre> genreList) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < genreList.size(); i++) {
			sb.append(String.format("%d) %s", genreList.get(i).getNo(), genreList.get(i).getName()));
			if (i < genreList.size() - 1) {
				sb.append(" / ");
			} else {
				sb.append("\r\n");
			}
		} // for end

		return sb.toString();
	} // printGenreList() end
} // Ex14 end
