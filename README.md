## 아임포트 결제서비스 연동

### 1. 회원가입 하기
<img src="https://user-images.githubusercontent.com/69130921/108605757-92b02380-73f9-11eb-9cc4-c8b5113a7286.PNG">

### 2. 사용할 PG사 선택후 저장
<img src="https://user-images.githubusercontent.com/69130921/108605799-d571fb80-73f9-11eb-8c82-2ab3709ce7c9.png">

### 3. 아임포트 라이브러리 추가
~~~
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
~~~

### 4. window.IMP 변수를 초기화
회원가입 후 생성된 가맹점 식별코드를 이용해서 window.IMP 변수를 초기화합니다.<br>
가맹점 식별코드는 관리자 페이지 로그인 한 뒤 시스템설정 → 내정보에서 확인할 수 있습니다.<br>
IMP.init()호출은 최초 1회 이루어져야하며, 페이지 로딩 단계에서 미리 호출해두시면 보다 효율적입니다.<br>
~~~
var IMP = window.IMP; // 생략가능
IMP.init('iamport'); // 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용
~~~
