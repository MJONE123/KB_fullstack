<template>
  <!-- 부트스트랩 Navbar -->
  <nav class="navbar navbar-expand-lg">
    <span class="navbar-brand">3조</span>
    <button
      class="navbar-toggler"
      type="button"
      data-bs-toggle="collapse"
      data-bs-target="#navbarSupportedContent"
      aria-controls="navbarSupportedContent"
      aria-expanded="false"
      aria-label="Toggle navigation"
    >
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportContent">
      <ul class="navbar-nav">
        <li class="nav-item">
          <!-- 클릭 시 router "/"로 이동 -->
          <router-link class="nav-link" to="/">홈</router-link>
        </li>
        <li class="nav-item">
          <!-- 클릭 시 router "/profile"로 이동 -->
          <router-link class="nav-link" to="/profile">프로필</router-link>
        </li>
      </ul>
    </div>
  </nav>
  <!-- 라우터 페이지 -->
  <RouterView />
</template>

<script setup>
import { RouterLink, RouterView } from 'vue-router';
</script>

<style>
/* 프리텐다드 폰트 import */
@font-face {
  font-family: 'Pretendard-Regular';
  src: url('https://fastly.jsdelivr.net/gh/Project-Noonnu/noonfonts_2107@1.1/Pretendard-Regular.woff')
    format('woff');
  font-weight: 400;
  font-style: normal;
}

/* Navbar CSS */
.navbar {
  /* 배경색 */
  background-color: white;
  /* 내부 여백 상하 12px, 좌우 24px */
  padding: 12px 24px;
  /* 아래 테두리 */
  border-bottom: 1px solid #e5e8eb;
  /* 항상 위에 있도록 (3차원 높이 값 지정) */
  z-index: 999;
}

/* 전체 CSS */
* {
  /* 프리텐다드 폰트 적용 */
  font-family: 'Pretendard-Regular' !important;
  /* 드래그 방지 */
  user-select: none;
}
</style>
