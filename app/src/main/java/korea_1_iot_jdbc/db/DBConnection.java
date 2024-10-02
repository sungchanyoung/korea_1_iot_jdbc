package korea_1_iot_jdbc.db;
//DBConnection 클래스
// :DB 연결을 관리하는 역할 

import java.sql.Connection;// DB연결을 위한 인터페이스 연결
import java.sql.DriverManager;// db 드라이버를 관리하는 역할 
import java.sql.SQLException;// sql 작업 발생 가능한 예외 처리를 위해 사용 

public class DBConnection {
	//DB연결 url을 상수로 선언 MYSQL DB 연결 
	// localhost(로컬 컴퓨터),3306(mysql 서버의 기본 포트 번호)
	private static final String URL = "jdbc:mysql://localhost:3306/korea_iot";
	private static final String USER = "root";
	//DB사용자 이름 /비밀번호 상수로 선언 
	//: DB 접속시 사용할 사용자 계정 이름 /비밀번호 
	private static final String PASSWORD ="zkzk0209";
	
	public static final Connection getConnection() throws SQLException {
		
		// DB연결을 시도하고 연결 객체를 반환 
		//: 연결 시도시 URL,사용자 이름 , 비밀번호 인자로 제공 
		return DriverManager.getConnection(URL,USER,PASSWORD);
	}
}
