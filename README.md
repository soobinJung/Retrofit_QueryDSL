
# Spring 공부하기 ! 내 맘대로 설정

## JPA (Java Persistence API)
    - 자바 ORM에 대한 API 표준 명세이고, 인터페이스의 모음이다. 
    - 따라서 구현체가 없고, 사용하기 위해서는 ORM프레임워크를 선택해야한다.
    
## QueryDSL
    - QueryDSL은 정적 타입을 이용해서 SQL 등의 쿼리를 생성해주는 프레임워크이다.
    - 장점
        - 문자가 아닌 코드로 쿼리를 작성함으로써, 컴파일 시점에 문법 오류를 쉽게 확인할 수 있다.
        - 자동 완성 등 IDE의 도움을 받을 수 있다.
        - 동적인 쿼리 작성이 편리하다.
        - 쿼리 작성 시 제약 조건 등을 메서드 추출을 통해 재사용할 수 있다.

## Retrofit
    - 외부 API 호출 라이브러리
    - LucyAPI 호출할 때 이용하면 편함.
    - 기존에는 HttpUrlConnection를 사용해 복잡하고 코드가 길어진다.
    - REST 뿐만 아니라 파일 업로드, 다운로드 등 모든 서버콜에 대해 짧고 간결한 코드로 대응이 가능하다.
    - okhttp 기반이라 매우 빠르다.
        - (OkHttp는 REST API, HTTP 통신을 간편하게 구현할 수 있도록 다양한 기능을 제공해주는 Java 라이브러리다)
    - JSON파싱을 gson파서가 알아서 해결 
    
## @Validated
    - 객체 값 검증 라이브러리
    - request 객체를 쉽게 검증할 수 있음
    
## junit
    - 테스트 코드 작성 라이브러리
