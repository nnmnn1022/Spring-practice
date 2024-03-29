# Spring-practice
## Maven / Gradle
필요한 라이브러리 가져오고 빌드하는 라이프 사이클까지 관리하는 툴
요즘 추세는 Gradle로 넘어가는 추세.

### Spring Boot
SNAPSHOT은 아직 만들고 있는 버전
Group에는 기업명
Artifact는 결과물의 이름을 넣는다.
![image](https://user-images.githubusercontent.com/41253926/175758134-5eb70bc3-347c-40a0-92b3-aded83a0ad08.png)

### Dependencies
기본적으로 *Spring Web*
템플릿 엔진은 다른 선택지가 있지만 현재는 *Thymeleaf* 사용

### Memo
![image](https://user-images.githubusercontent.com/41253926/175759265-d41bc9c3-e7ea-43ce-b5c6-caee647b6ca0.png)

#### `./gradlew build`
build/libs 안에 내가 만든 spring 프로젝트를 jar로 만들어 줌.
실행시키면 서버를 구동시키고 있는 것과 동일하게 굴러감
이 파일을 서버에 넣고 실행만 시키면 됨.

#### `./gradlew clean`
이전에 만들었던 빌드를 삭제함

#### `./gradlew clean build`
클린 후 

## Template Engine
템플릿 엔진을 통해 변수를 사용할 수 있는데,
html을 넘기기 전에 처리를 하기 때문에 변수가 아닌 단순 String만 넘어가게 된다.

### 스프링 빈을 등록하는 2가지 방법
- 컴포넌트 스캔과 자동 의존관계 설정 : @Controller, @Serviece, @Repository 이 어노테이션 안에는 @Component 어노테이션이 있음. 그래서 컴포넌트 스캔방식

- 자바 코드로 직접 스프링 빈 등록하기 : main 클래스가 있는 폴더에 SpringConfig라는 클래스를 만들어서 빈을 직접 추가하는 방식


# Spring 한글 처리하기
- application.properties 파일 열기
- 

# Mybatis 연결하기
- https://devncj.tistory.com/48