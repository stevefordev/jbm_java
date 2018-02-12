package org.jbm.exam.ex;

import java.util.Scanner;

import org.jbm.exam.dao.GenresDAO;
import org.jbm.exam.util.ScannerUtil;
import org.jbm.exam.util.ScannerUtil.InputType;

/**
 * 장르 테이블 삭제 프로그램
 * 
 * @author KUHYUN PARK
 *
 */
public class Ex10 {

	public static void main(String[] args) {

		String genre = (String) ScannerUtil.getInputData(InputType.STRING, "삭제할 장르를 입력하세요.");
		int result = GenresDAO.delete(genre);

		if (result > 0) {
			System.out.println(result + "개의 장르가 삭제되었습니다.");
		} else {
			System.out.println(genre + " 라는  장르가 존재 하지 않습니다.");
		}

	}// main() end

}// Ex10 end
