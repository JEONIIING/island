## ISLAND
해당 프로젝트는 국비지원 교육에서 Final Project로 진행한 작업물 입니다. 😃  <br />
Final Project는 Springframework를 이용해 웹페이지 제작의 전체적인 과정을 직접 겪어보기 위한 Project 입니다. 

## 목차
1. 프로젝트 전체 설명
2. 참여 소감 (What I Lean)
3. 구현 화면

&nbsp;

## 1. 어떤 프로젝트 인가? 
- 세미나 및 소모임 검색을 통해 사용자들이 자신의 관심사와 목표에 맞는 세미나 및 소모임을 쉽게 찾고 참여할 수 있도록 합니다. 또한 회원들 간의 소통과 정보 공유를 촉진하기 위해 커뮤니티 기능을 통해 소통하고, 지식과 경험을 공유할 수 있습니다.
- 프로젝트 아일랜드는 이러한 목표를 달성함으로써 사용자들에게 효율적인 세미나/소모임 운영 및 협업 환경을 제공하고, 지식과 경험을 공유하며, 다양한 분야와 관심사를 가진 사람들과의 교류할 수 있는 기회를 제공합니다.



&nbsp;

## 2-1. 내가 작업한 구현 기능은?
**이러한 기능**을 담당하였습니다.
- 세미나 서비스
   - 세미나 검색하기
   - 세미나 목록 조회
   - 상세 조회(카카오맵)
   - 개설하기
   - 수정하기
   - 삭제하기
   - 신청하기
   - 관심 내역 추가
   - 댓글 등록/삭제
   - 세미나 신고하기
   - 회원 신고하기
   - 결제하기
- 세미나 리뷰
   - 리뷰 검색하기
   - 리뷰 목록 조회
   - 리뷰 작성하기
   - 리뷰 수정하기
   - 리뷰 삭제하기
   - 리뷰 신고하기

- FAQ
   - 카테고리별 조회하기
   - 목록 조회하기 
&nbsp;
<br />


## 2-2. 개발 환경 ?
**개발환경**
- Back-end : Java (JDK 1.8), Spring 5.3.22, Mybatis , JSP
- Front-end : HTML, CSS3, Javascript, Ajax, JSON, Bootstrap
- API, 라이브러리 : KAKAO, 토스, 아임포트, jQuery, JSTL, GSON, 롬복(Lombok)
- Server: Apach Tomcat 9.0
- DB : Oracle 11g
- IDE  : VScode, STS3, SQLDeveloper
- Tool : Github, SourceTree, ERD Cloud , Figma, Discord, Notion, Trello



&nbsp;


## 2-3. 프로젝트 참여 소감 및 What I Lean ?
**- 스프링 프레임워크를 배우면서 개발 과정에서 많은 편의성을 누릴 수 있었습니다.** <br />
  주입(DI)과 관련된 기능을 활용하여 객체 간의 결합도를 낮출 수 있었고, 애노테이션 기반의 설정을 통해 반복적이고 번거로운 작업을 줄이며 개발 생산성을 향상시킬 수 있다는 걸 배우게 되어 유익한 시간이었습니다.<br /><br />
**- 상황에 따른 동적인 화면을 구현할 수 있었습니다.** <br />
  구현하려고 했던 세미나 참가신청 버튼을 누구에게는 보여주지 않거나, 모집 마감, 참여 완료라는 문구로 대체해 주는 기능을 	구현해야 했습니다. 그러기 위해서 화면을 그대루 놔둔 상태에서 서버에 요청을 보내 상황에 따라 화면 동적 변화 필요성  을 느꼈고 Ajax를 통해 세미나를 상세 조회할 때마다 클라이언트 측에 다르게 보여줄 수 있는 기능을 구현할 수 	있었습니다.  <br /><br />
**- 기능으로 이어지는 경로를 설계할 때 어떤 데이터를 받을 건지 생각할 수 있었습니다.** <br />
 각자가 구현한 기능을 수행하는  경로들을 공유하기 위해 문서화하여 프로젝트를 진행하였습니다. 
	 하지만, 기획 초기에 구체적으로 어떤 데이터를 받을 건지 설계하지 않고 공유 되어 서로의 경로가 상이하게 되는 문제점이 발생하였고 경로를 하나하나 다시 수정해야 되는 상황을 겪게 되었습니다.	
	 이를 해결하기 위해서 경로를 설계할 때 어떤 데이터를 받을지를 고려하여 설계하고 공유해야겠다는 깨달음을 얻게 되었습니다.




&nbsp;



## 2-4. 완성된 화면
<details>
  <summary>세미나 개설 화면</summary>
  <br />
  <div markdown="1">
    <image src="https://github.com/JEONIIING/island/blob/main/FinalPrjScreen/seminarCreate.png" />
  </div>
  <div markdown="1">
    <image src="https://github.com/JEONIIING/island/blob/main/FinalPrjScreen/seminarCreate2.png" />
  </div>
</details>
<details>
  <summary>세미나 목록 화면</summary>
  <br />
  <div markdown="1">
    <image src="https://github.com/JEONIIING/island/blob/main/FinalPrjScreen/seminarList.png" />
  </div>
</details>
<details>
  <summary>세미나 상세 조회 화면</summary>
  <br />
  <div markdown="1">
    <image src="https://github.com/JEONIIING/island/blob/main/FinalPrjScreen/seminarInfo1.png" />
  </div>
  <div markdown="1">
    <image src="https://github.com/JEONIIING/island/blob/main/FinalPrjScreen/seminarInfo2.png" />
  </div>
  <div markdown="1">
    <image src="https://github.com/JEONIIING/island/blob/main/FinalPrjScreen/seminarReport.png" />
  </div>
  <div markdown="1">
    <image src="https://github.com/JEONIIING/island/blob/main/FinalPrjScreen/memberReport.png" />
  </div>
</details>
<details>
  <summary>세미나 신청 화면</summary>
  <br />
  <div markdown="1">
    <image src="https://github.com/JEONIIING/island/blob/main/FinalPrjScreen/seminarApply.png" />
  </div>
   <div markdown="1">
    <image src="https://github.com/JEONIIING/island/blob/main/FinalPrjScreen/seminarKakaopay.png" />
  </div>
   <div markdown="1">
    <image src="https://github.com/JEONIIING/island/blob/main/FinalPrjScreen/seminarToss.png" />
  </div>
</details>
<details>
  <summary>세미나 수정 화면</summary>
  <br />
  <div markdown="1">
    <image src="https://github.com/JEONIIING/island/blob/main/FinalPrjScreen/seminarModify.png" />
  </div>
</details>
<details>
  <summary>세미나 리뷰 작성 화면</summary>
  <br />
  <div markdown="1">
    <image src="https://github.com/JEONIIING/island/blob/main/FinalPrjScreen/ReviewWrite.png" />
  </div>
</details>
<details>
  <summary>세미나 리뷰 목록 화면</summary>
  <br />
  <div markdown="1">
    <image src="https://github.com/JEONIIING/island/blob/main/FinalPrjScreen/ReviewList.png" />
  </div>
</details>
<details>
  <summary>세미나 리뷰 상세 조회 화면</summary>
  <br />
  <div markdown="1">
    <image src="https://github.com/JEONIIING/island/blob/main/FinalPrjScreen/ReviewInfo.png" />
  </div>
  <div markdown="1">
    <image src="https://github.com/JEONIIING/island/blob/main/FinalPrjScreen/ReviewReport.png" />
  </div>
</details>
<details>
  <summary>세미나 리뷰 목록 화면</summary>
  <br />
  <div markdown="1">
    <image src="https://github.com/JEONIIING/island/blob/main/FinalPrjScreen/ReviewModify.png" />
  </div>
</details>
<details>
  <summary>FAQ 목록 조회</summary>
  <br />
  <div markdown="1">
    <image src="https://github.com/JEONIIING/island/blob/main/FinalPrjScreen/FAQList.png" />
  </div>
</details>
