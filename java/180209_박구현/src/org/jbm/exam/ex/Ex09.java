package org.jbm.exam.ex;

import org.jbm.exam.dao.GenresDAO;
import org.jbm.exam.util.ScannerUtil;
import org.jbm.exam.util.ScannerUtil.InputType;
import org.jbm.exam.vo.Genre;

/**
 * 장르 테이블 업데이트 프로그램
 * 
 * @author KUHYUN PARK
 *
 */
public class Ex09 {

	public static void main(String[] args) {

		int no = (int) ScannerUtil.getInputData(InputType.NUMBER, "변경할 장르번호를 입력하세요.");
		String name = (String) ScannerUtil.getInputData(InputType.STRING, "변경할 장르명을 입력하세요.");

		Genre genre = new Genre(no, name);
		int result = GenresDAO.update(genre);

		if (result > 0) {
			System.out.println(result + "개의 장르명이 잘 변경되었습니다.");
		} else {
			System.out.println("유효한 장르 번호인지 확인 부탁 드립니다.");
		}
	}
}
