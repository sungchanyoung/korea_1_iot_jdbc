// javadatabase Connectivity
// : 자바에서 관계형 데이터베이스 사이에 통신을 담당하는 인터페이스 
// -sql 쿼리를 실행, 데이터를 처리하기 위한 API
// -플랫폼에 독립적인 인터페이스 
// JDBC API는 DB의 테이블에서 데이터를 CRUD하는 작업을 수행하도록 도와줌 

// JDBC의 구조 
// 1. JDBC의  Diver Manger
//  :데이터베이스 와 연결을 설정하는데 사용 

//JDBC Driver 
//: 각 DBMS에 맞는 드라이버를 통해 자바와 통신 

// 3Connection 
//: DB와연결을 유지하는객체 
//  쿼리 실해에 필요+ 연결 종료시 반드시 닫아야함 

//  Statement 객체 
// sql 쿼리를 실행하는데 사용 

// RedultSet 객체 
// 쿼리의 결과를 저장하고 데이터를 탐색할 수 있도록  하는 객체 

//JDBC JPA Spring
// JDBC
// sql을 직접 작성하여 데이터베이스와 상호작용하는 방식 
// SQL을 직접 작성하기 때문에 코드의 복잡성이 증가, 유지보수 어려움 

// JPA(Java Persistence API)
// 객체 지향적으로 DB와 상호작용하는 방법 
// SQL을 직접  작성하지 않음 , 엔티티  객체를 통해 DB와 상호 작용 

// Spring 
// JDBC와 JPA를 더 쉽게 처리하기 위한 템플릿 
