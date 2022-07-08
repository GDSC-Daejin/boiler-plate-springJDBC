<aside>
🧩 스프링부트를 사용하여 TO-DO-LIST REST API SERVER 를 만듭니다.

**화면 구성할 필요 없이, API 코드만 동일하게 만들어서 제출하면 됩니다.**

**Android , Frontend 팀과 협업 하여 REST API 협업과정을 이해합니다.**

**팀에서 추가적인 기능을 넣으면 다른 팀과 차별점을 보여줄 수 있어서 좋아요!**
  - ex : Login(Security) , Interceptor , Filter, 명시되지 않은 기능 
  - 그렇지만 아래 요구한 사항을 모두 이행 하고 나서 진행 해주세요. 

</aside>

### **요구사항**

- TO DO LIST  사이트를 구현해주세요.
- TO DO LIST 의 CRUD를 구현해주세요.
- 카테고리는 계속 추가가 될 수 있습니다. 
- 메인페이지에는, 각 게시판의 최신글이 10개 나와야 합니다.
- Boiler Plate 세팅은 Mysql 로 되어있지만 다른 Database를 사용해도 좋아요 
- 최종 결과물은 각 카테고리별 LIST 300개 이상 만들어 주세요.

- 중요 !!! JDBC 템플릿을 이용합니다. JPA ORM 은  Entity 자동 생성에만 이용합니다. 
  - JDBC 를 이용하는 이유는 기초를 모르고 넘어가면 ORM을 관성적으로 사용하기 때문이에요

- 중요 !!! 모든 Request , Response 각각의 DTO 를 만들어서 데이터 처리를 해주세요.
  - Entity(DAO) 클래스를 사용하는건 데이터 베이스에 접근 할 때 뿐이에요
- 중요 !!! GIT FLOW 를 지켜주세요. 협업에 있어서 지켜야 할 룰이에요 
  - 참고 링크 https://github.com/CodeTest-StudyGroup/Code-Test-Study/wiki/%F0%9F%A7%B2-Pull-Request-&-Commit-Message-%EA%B7%9C%EC%B9%99
  
- 테이블 구성은 주어지지 않아요 팀원과 의논하여 테이블을 구성해봐요
  - 백엔드 엔지니어의 기본은 테이블 설계라고 할 수 있어요 
  - JPA ORM Entity , 또는 DB DDL을 직접 사용해서 해주세요 
    - 원하지 않는 데이터 변경 / 삭제를 방지하기 위해서 제약조건을 설정 해주세요.
    - 데이터 베이스 용량 낭비를 줄이기 위해서 정확한 도메인 설계를 부탁 드릴게요.
    - 차후에 DB 설계는 좋은 포트폴리오가 될 수 있어요.
    

### 배포 요구사항 
- AWS / OCP / Heroku / GCP / 구름 IDE 등을 이용하여  실제 외부 환경에서 접속 할 수 있도록 해주세요
- AWS / OCP / GCP 등 LINUX 환경을 체험해 볼 수 있는  IaaS Platform 을 가장 추천드려요.
  -OCP 구성의 경우 아래 링크에 How-To-Do 를 정리해놨어요 
    - https://www.notion.so/gdsc-dju/Rocoli-dda3bf8fb3db4790b7f93c51b8a5b6c1
    - IaaS는 차후 프로젝트에도 이용 할 수 있어서 꼭 구성해두길 바랄게요.
- 도메인은 https://xn--220b31d95hq8o.xn--3e0b707e/ 여기서 간단하게 구할 수 있어요.
  - 간단하게 도메인 관리 탭에서 IaaS Platform IP 주소를 연결하면 되요 사용법은 구글에 많이 나와있어요 
- NGINX 와 같은 로드밸런싱을 이용하여 도메인과 웹 서버를 연결 해봐요 
  - API 요청은 도메인으로 합니다. 
  - API 요청시 80 , 443 포트로 요청할 수 있어야 합니다. 

### 최종 결과물 
- 협업 칸반 TASK
- 회의 LOG 
- 실 서버 배포 주소 

- GIT HUB 주소 

### **엔드포인트 예시**

---
- /toDoList
    - 내용 : toDoList 내용 생성 
    - HTTP 메소드 : POST
- /toDoList/{Category}
    - 내용 : 각 게시판별 최신글 10개씩 노출
    - HTTP 메소드 : GET
- /toDoList/page?=1
    - 내용 : 최신글 10개씩 노출 // 1 페이지 
    - HTTP 메소드 : GET
- /toDoList/{toDoListId}
    - 내용 : ToDoList 대한 내용 상세 보기 
    - HTTP 메소드 : GET
- /toDoList/{toDoListId}
    - 내용 : ToDoList 대한 내용 수정하기
    - HTTP 메소드 : PUT
- /toDoList/{toDoListId}
    - 내용 : ToDoList 대한 내용 삭제하기
    - HTTP 메소드 : DELETE


