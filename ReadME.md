<aside>
๐งฉ ์คํ๋ง๋ถํธ๋ฅผ ์ฌ์ฉํ์ฌ TO-DO-LIST REST API SERVER ๋ฅผ ๋ง๋ญ๋๋ค.

**ํ๋ฉด ๊ตฌ์ฑํ  ํ์ ์์ด, API ์ฝ๋๋ง ๋์ผํ๊ฒ ๋ง๋ค์ด์ ์ ์ถํ๋ฉด ๋ฉ๋๋ค.**

**Android , Frontend ํ๊ณผ ํ์ ํ์ฌ REST API ํ์๊ณผ์ ์ ์ดํดํฉ๋๋ค.**

**ํ์์ ์ถ๊ฐ์ ์ธ ๊ธฐ๋ฅ์ ๋ฃ์ผ๋ฉด ๋ค๋ฅธ ํ๊ณผ ์ฐจ๋ณ์ ์ ๋ณด์ฌ์ค ์ ์์ด์ ์ข์์!**
  - ex : Login(Security) , Interceptor , Filter, ๋ช์๋์ง ์์ ๊ธฐ๋ฅ 
  - ๊ทธ๋ ์ง๋ง ์๋ ์๊ตฌํ ์ฌํญ์ ๋ชจ๋ ์ดํ ํ๊ณ  ๋์ ์งํ ํด์ฃผ์ธ์. 

</aside>

### **์๊ตฌ์ฌํญ**

- TO DO LIST  ์ฌ์ดํธ๋ฅผ ๊ตฌํํด์ฃผ์ธ์.
- TO DO LIST ์ CRUD๋ฅผ ๊ตฌํํด์ฃผ์ธ์.
- ์นดํ๊ณ ๋ฆฌ๋ ๊ณ์ ์ถ๊ฐ๊ฐ ๋  ์ ์์ต๋๋ค. 
- ๋ฉ์ธํ์ด์ง์๋, ๊ฐ ๊ฒ์ํ์ ์ต์ ๊ธ์ด 10๊ฐ ๋์์ผ ํฉ๋๋ค.
- Boiler Plate ์ธํ์ Mysql ๋ก ๋์ด์์ง๋ง ๋ค๋ฅธ Database๋ฅผ ์ฌ์ฉํด๋ ์ข์์ 
- ์ต์ข ๊ฒฐ๊ณผ๋ฌผ์ ๊ฐ ์นดํ๊ณ ๋ฆฌ๋ณ LIST 300๊ฐ ์ด์ ๋ง๋ค์ด ์ฃผ์ธ์.

- ์ค์ !!! JDBC ํํ๋ฆฟ์ ์ด์ฉํฉ๋๋ค. JPA ORM ์  Entity ์๋ ์์ฑ์๋ง ์ด์ฉํฉ๋๋ค. 
  - JDBC ๋ฅผ ์ด์ฉํ๋ ์ด์ ๋ ๊ธฐ์ด๋ฅผ ๋ชจ๋ฅด๊ณ  ๋์ด๊ฐ๋ฉด ORM์ ๊ด์ฑ์ ์ผ๋ก ์ฌ์ฉํ๊ธฐ ๋๋ฌธ์ด์์

- ์ค์ !!! ๋ชจ๋  Request , Response ๊ฐ๊ฐ์ DTO ๋ฅผ ๋ง๋ค์ด์ ๋ฐ์ดํฐ ์ฒ๋ฆฌ๋ฅผ ํด์ฃผ์ธ์.
  - Entity(DAO) ํด๋์ค๋ฅผ ์ฌ์ฉํ๋๊ฑด ๋ฐ์ดํฐ ๋ฒ ์ด์ค์ ์ ๊ทผ ํ  ๋ ๋ฟ์ด์์
- ์ค์ !!! GIT FLOW ๋ฅผ ์ง์ผ์ฃผ์ธ์. ํ์์ ์์ด์ ์ง์ผ์ผ ํ  ๋ฃฐ์ด์์ 
  - ์ฐธ๊ณ  ๋งํฌ https://github.com/CodeTest-StudyGroup/Code-Test-Study/wiki/%F0%9F%A7%B2-Pull-Request-&-Commit-Message-%EA%B7%9C%EC%B9%99
  
- ํ์ด๋ธ ๊ตฌ์ฑ์ ์ฃผ์ด์ง์ง ์์์ ํ์๊ณผ ์๋ผํ์ฌ ํ์ด๋ธ์ ๊ตฌ์ฑํด๋ด์
  - ๋ฐฑ์๋ ์์ง๋์ด์ ๊ธฐ๋ณธ์ ํ์ด๋ธ ์ค๊ณ๋ผ๊ณ  ํ  ์ ์์ด์ 
  - JPA ORM Entity , ๋๋ DB DDL์ ์ง์  ์ฌ์ฉํด์ ํด์ฃผ์ธ์ 
    - ์ํ์ง ์๋ ๋ฐ์ดํฐ ๋ณ๊ฒฝ / ์ญ์ ๋ฅผ ๋ฐฉ์งํ๊ธฐ ์ํด์ ์ ์ฝ์กฐ๊ฑด์ ์ค์  ํด์ฃผ์ธ์.
    - ๋ฐ์ดํฐ ๋ฒ ์ด์ค ์ฉ๋ ๋ญ๋น๋ฅผ ์ค์ด๊ธฐ ์ํด์ ์ ํํ ๋๋ฉ์ธ ์ค๊ณ๋ฅผ ๋ถํ ๋๋ฆด๊ฒ์.
    - ์ฐจํ์ DB ์ค๊ณ๋ ์ข์ ํฌํธํด๋ฆฌ์ค๊ฐ ๋  ์ ์์ด์.

- ์ฐ๋ฆฌ ๋ชจ๋ ํ์คํธ ์ฝ๋๋ฅผ ๊ฒฝํํด๋ด์ 
  - ์๋ฒ ๋ฐฐํฌ , ๋ฐฑ์๋๋ ์์์น ๋ชปํ ์ค๋ฅ์ ์ง๋ฉดํ๋ ๊ฒฝ์ฐ๊ฐ ๋ง์์ , ๋จ์ํ ํ๋์ class ๊ตฌ์กฐ๋ฅผ ๋ฐ๊ฟ๋ ๋ง์ ๋ฌธ์ ๊ฐ ์ผ์ด๋  ์ ์์ด์ 
  - ์ด๋ด ๊ฒฝ์ฐ ์ด์ ์ ์์ ํ๋ ๊ฒ์ ์ผ์ผํ ๊ฒ์ฆ ํด๋ด์ผ ํด์.
  - ์ด๋ฐ ๋์ฐธ์ฌ๋ฅผ ๋ง๊ธฐ ์ํด์ ํ์คํธ ์ฝ๋๊ฐ ํ์ํด์.
  - ์ํ๋ฆฌํฐ๊ฐ ํฌํจ๋์ง ์์ API ํ์คํธ๋ ์๋นํ ์ฌ์์! 
  - **ํ์๋ ์๋์ง๋ง ๊ผญ ๋ง๋ค์ด ์คฌ์ผ๋ฉด ์ข๊ฒ ์ด์**

### ๋ฐฐํฌ ์๊ตฌ์ฌํญ 
- AWS / OCP / Heroku / GCP / ๊ตฌ๋ฆ IDE ๋ฑ์ ์ด์ฉํ์ฌ  ์ค์  ์ธ๋ถ ํ๊ฒฝ์์ ์ ์ ํ  ์ ์๋๋ก ํด์ฃผ์ธ์
  - AWS / OCP / GCP ๋ฑ LINUX ํ๊ฒฝ์ ์ฒดํํด ๋ณผ ์ ์๋  IaaS Platform ์ ๊ฐ์ฅ ์ถ์ฒ๋๋ ค์.
    - OCP ๊ตฌ์ฑ์ ๊ฒฝ์ฐ ์๋ ๋งํฌ์ How-To-Do ๋ฅผ ์ ๋ฆฌํด๋จ์ด์ 
      - https://www.notion.so/gdsc-dju/Rocoli-dda3bf8fb3db4790b7f93c51b8a5b6c1
        - IaaS๋ ์ฐจํ ํ๋ก์ ํธ์๋ ์ด์ฉ ํ  ์ ์์ด์ ๊ผญ ๊ตฌ์ฑํด๋๊ธธ ๋ฐ๋๊ฒ์.
      - Heroku ๊ตฌ์ฑ์ ๊ฒฝ์ฐ๋ ์๋ ๋งํฌ์ How-to-Do๋ฅผ ์ ๋ฆฌํด๋ณด์์ด์
        - https://blog.naver.com/shinequasar/222659965540
- ๋๋ฉ์ธ์ https://xn--220b31d95hq8o.xn--3e0b707e/ ์ฌ๊ธฐ์ ๊ฐ๋จํ๊ฒ ๊ตฌํ  ์ ์์ด์.
  - ๊ฐ๋จํ๊ฒ ๋๋ฉ์ธ ๊ด๋ฆฌ ํญ์์ IaaS Platform IP ์ฃผ์๋ฅผ ์ฐ๊ฒฐํ๋ฉด ๋์ ์ฌ์ฉ๋ฒ์ ๊ตฌ๊ธ์ ๋ง์ด ๋์์์ด์ 
- NGINX ์ ๊ฐ์ ๋ก๋๋ฐธ๋ฐ์ฑ์ ์ด์ฉํ์ฌ ๋๋ฉ์ธ๊ณผ ์น ์๋ฒ๋ฅผ ์ฐ๊ฒฐ ํด๋ด์ 
  - API ์์ฒญ์ ๋๋ฉ์ธ์ผ๋ก ํฉ๋๋ค. 
  - API ์์ฒญ์ 80 , 443 ํฌํธ๋ก ์์ฒญํ  ์ ์์ด์ผ ํฉ๋๋ค. 

### ์ต์ข ๊ฒฐ๊ณผ๋ฌผ 
- ํ์ ์นธ๋ฐ TASK
- ํ์ LOG 
- ์ค ์๋ฒ ๋ฐฐํฌ ์ฃผ์ 

- GIT HUB ์ฃผ์ 

### **์๋ํฌ์ธํธ ์์**
- ์๋ํฌ์ธํธ๋ฅผ ์ค๊ณํ  ๋๋ URI์ ๋ธ์ถ๋์ด๋ ๊ด์ฐฎ์ ์์์ ๋ณด์, ๋ณด์์ ๊ฐ์ถฐ๋๋ฉด ์ข์ ์์์ ๊ณ ๋ คํด ์ค๊ณํด๋ณด๋ฉด ์ข์์
  -  ์๋ฅผ๋ค์ด ํ์ฌ page์ ์๋ฒ๊ฐ์ ์์์ ๋ธ์ถ๋์ด๋ ๊ด์ฐฎ์ง๋ง, user์ ๊ฐ์ธ์ ๋ณด ๋ฑ๊ณผ ๊ฐ์ ์์์ ์๋ํฌ์ธํธ์ ๋ฃ์ผ๋ฉด ๋ณด์์ ์ทจ์ฝํด์ง ์ ์์ด์.
---
- /toDoList
    - ๋ด์ฉ : toDoList ๋ด์ฉ ์์ฑ 
    - HTTP ๋ฉ์๋ : POST
- /toDoList/{Category}
    - ๋ด์ฉ : ๊ฐ ๊ฒ์ํ๋ณ ์ต์ ๊ธ 10๊ฐ์ฉ ๋ธ์ถ
    - HTTP ๋ฉ์๋ : GET
- /toDoList/page?=1
    - ๋ด์ฉ : ์ต์ ๊ธ 10๊ฐ์ฉ ๋ธ์ถ // 1 ํ์ด์ง 
    - HTTP ๋ฉ์๋ : GET
- /toDoList/{toDoListId}
    - ๋ด์ฉ : ToDoList ๋ํ ๋ด์ฉ ์์ธ ๋ณด๊ธฐ 
    - HTTP ๋ฉ์๋ : GET
- /toDoList/{toDoListId}
    - ๋ด์ฉ : ToDoList ๋ํ ๋ด์ฉ ์์ ํ๊ธฐ
    - HTTP ๋ฉ์๋ : PUT
- /toDoList/{toDoListId}
    - ๋ด์ฉ : ToDoList ๋ํ ๋ด์ฉ ์ญ์ ํ๊ธฐ
    - HTTP ๋ฉ์๋ : DELETE


