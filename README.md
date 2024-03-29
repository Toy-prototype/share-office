# share-office

## 초기 컨셉
유저 기능
- 회원 정보 조회(그룹/팀 및 본인이 참여한 회의 내용) 조회 가능
- 그룹/팀에 속한 유저 조회 가능

소속 기능
- 여러 그룹(NAVER,KAKAO,LINE..)이 존재.
- 하나의 그룹에는 팀(모바일본부 , 서버본부 , 커머스본부)이 존재.
- 하나의 팀에 팀원(재우 , 성우 , 만진)이 존재.

예약 기능
- 여러 회의실을 같은시간/참석인원으로 예약 한번으로 예약 할 수 있다.
- 예약시 회의 내용을 비공개 / 공개 설정가능.
- 참석인원 최소 1명 이상이어야 한다 , 참조인원은 없어도 된다.
- 예약시 회의 제목,내용,결론을 저장해야 한다.
- 예약시간 단위는 1시간이다.
- 예약 취소 가능하다.

검색 기능
- 검색엔진을 활용한 회의실 내용,제목,결론 조회 

공통 요구사항
- 등록일과 수정일은 항시 포함되야한다.
- 회의실은 여러개(큰회 , 작회)가 존재 할 수있다.
- 회의실 예약비는 0원이다, 추후에 금액부과 가능

## 도메인 설계
- 사용자
  - GROUP
  - TEAM
  - USER
- 예약
  - RESERVATION
- 회의실
  - OFFICE

## USECASE
- 회원
  - 가입 
    - id/password/소속/팀 등등 기입하여 가입
  - 조회
    - 같은 소속 회원 조회 기능 

- 예약
  - 회의실 예약
    - 회의시간, 참석인원, 회의실, 회의 제목/내용, 공개여부 등등
  - 조회
    - 예약 내역 상세 조회
    - 예약 내역 목록 조회

- 회의실
  - 조회
    - 특정 회의실 예약 조회