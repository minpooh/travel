<h1 align="center"> 🧳 MINPOOH Travel – 여행 기록 웹 프로젝트 </h1>

**🔗 Live Demo**: [**minpooh_travel**](https://travel-4nvd.onrender.com)


&nbsp;

## 📌 Project Overview

개인 여행 기록을 카테고리 기반으로 시각화한 SSR 기반 웹 프로젝트입니다.<br/>
메인 페이지에서 전체 콘텐츠를 소개하고,<br/>
여행 일정, 맛집 소개, 경험 콘텐츠, 포토스팟, 게시판 기능으로 구성했습니다.<br/>
현재는 정적 콘텐츠 기반이지만, 향후 DB 연동을 통해 동적 게시판 구조로 확장할 예정입니다.

&nbsp;

## 👩🏻‍💻 My Role

- 서비스 기획 및 UI 설계
- Thymeleaf 기반 SSR 구조 설계
- SCSS 구조 설계 및 반응형 대응
- Swiper / GSAP 인터랙션 구현
- Docker 기반 배포 및 환경 구성

&nbsp;

## 🏗 Architecture

현재는 정적 콘텐츠 중심 구조로,

Controller에서 View 라우팅을 담당하는 단순 SSR 구조로 구성했습니다.

향후 DB 연동 및 게시판 기능 확장을 고려하여

Service / Repository 계층 분리를 적용할 예정입니다.

현재 구조

```html
Controller
    ↓
Thymeleaf
    ↓
Static Resources
```

※ 향후 DB 연동 시 아래와 같은 계층형 구조로 확장 예정

```html
Controller → Service → Repository
```

&nbsp;

## ✨ Core Implementation

### 1. 슬라이드 기반 콘텐츠 구조 설계
- Swiper를 활용해 여행 콘텐츠를 카드형 구조로 구성
- autoplay 및 interaction 제어를 통해 몰입감 강화

### 2. 스크롤 인터랙션 설계
- GSAP ScrollTrigger를 활용해 viewport 진입 시 애니메이션 적용
- 사용자 시선 흐름을 고려한 순차 노출 구조 구현

### 3. 공통 레이아웃 모듈화
- Thymeleaf fragment로 header/footer 분리
- 유지보수성과 확장성 고려

&nbsp;

## 📈 개선 및 확장 예정

관리자 페이지 구축 (React 기반)

여행/음식 게시물 DB 연동

로그인 및 권한 관리

AWS 인프라 확장

이미지 최적화 (WebP 변환)

&nbsp;

## 🛠 Tech Stack

### Backend
- **Spring Boot** – Spring MVC 기반 SSR 서버 구현
- **Thymeleaf** – 서버 사이드 템플릿 렌더링 처리
- **JPA** – 향후 DB 연동을 고려한 데이터 접근 계층 확장 구조

### Frontend
- **SCSS** – 유지보수를 고려한 스타일 구조화
- **Swiper.js** – 슬라이드 기반 콘텐츠 구성
- **GSAP (ScrollTrigger)** – 스크롤 인터랙션 구현

### DevOps
- **Docker** – 실행 환경을 컨테이너화하여 배포 환경과 로컬 환경 차이 최소화
- **Render** – 클라우드 배포

&nbsp;

## 🚀 Run Locally
```bash
./gradlew bootRun
```
또는 Docker를 통해 실행 가능합니다.

