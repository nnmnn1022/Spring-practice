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
