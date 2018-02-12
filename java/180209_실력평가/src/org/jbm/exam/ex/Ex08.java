package org.jbm.exam.ex;
 
import org.jbm.exam.dao.GenresDAO;
import org.jbm.exam.util.ScannerUtil;
import org.jbm.exam.util.ScannerUtil.InputType;

/**
 * 장르 입력 프로그램
 * @author KUHYUN PARK
 *
 */
public class Ex08 {

	public static void main(String[] args) {

		String genre = (String) ScannerUtil.getInputData(InputType.STRING, "추가할 장르를 입력하세요.");		
		int result = GenresDAO.insert(genre);

		System.out.println(result + "개의 장르가 입력되었습니다.");
	}// main() end
}// Ex8 end
