<template>
  <!-- 전체 화면 프레임 -->
  <div class="home-container">
    <!-- 클릭 시 이동 -->
    <!-- v-for 이용해서 userInfo.json 내의 각 유저에 대해 router-link 생성
      key : 각 객체가 고유한 key값을 가져야 함
      to : userInfo.json 각 유저의 id 값으로 페이지 이동
    -->
    <router-link
      v-for="user in userInfo"
      key="user.id"
      class="user-container"
      :to="{ path: `/profile/${user.id}` }"
    >
      <div class="profile-frame">
        <!-- userInfo.json에 saepo 항목 추가했습니다 -->
        <img :src="user.saepo" :alt="user.name" />
      </div>
      <div>{{ user.name }}</div>
    </router-link>
  </div>
</template>

<script setup>
import userInfo from '@/assets/userInfo.json';
</script>

<style scoped>
/* 전체 화면 프레임 */
.home-container {
  position: absolute;
  /* 상하좌우 끝에 맡게 크기 지정 */
  left: 0;
  right: 0;
  top: 0;
  bottom: 0;
  /* 내부 여백 */
  padding: 100px;
  /* 가로 기준 여백 동일하게 배치, 세로 기준 중앙에 배치 */
  display: flex;
  align-items: center;
  justify-content: space-around;
  /* 3차원 Z축 Navbar 보다 아래에 배치, Navbar 클릭할 수 있도록 */
  z-index: 1;
}

/* 프로필, 이름 들어가는 그림자 프레임 */
.user-container {
  padding: 40px 0;
  background-color: white;
  /* 모서리 곡률 */
  border-radius: 24px;
  /* home-container의 너비 대비 너비 */
  width: 20%;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: space-around;
  /* 그림자 */
  box-shadow: 2px 2px 10px 0px rgba(44, 85, 124, 0.04), 2px 2px 30px 0px rgba(0, 0, 0, 0.16);
  /* 폰트 색상 */
  color: black;
  /* 글자 밑줄 제거 */
  text-decoration: none;
  /* 폰트 크기 */
  font-size: 24px;
  /* 폰트 굵기 */
  font-weight: 700;
}

/* 그림자 프레임 마우스 호버 했을 때 */
.user-container:hover {
  /* 밝기 변경해서 어두워 보이도록 변경 */
  filter: brightness(84%);
}

/* 프로필 이미지 프레임 */
.profile-frame {
  /* 위 20px, 아래 32px 마진 */
  margin: 20px 0 32px 0;
  /* user-container 너비 대비 너비 */
  width: 64%;
  /* 너비/높이 비율 1/1은 1:1 */
  aspect-ratio: 1/1;
  /* 모서리 테두리 100% = 원 */
  border-radius: 100%;
  /* 내부 이미지가 원을 벗어났을 때 감추기*/
  overflow: hidden;
  display: flex;
  /* 이미지 가로세로 비율 유지하면서 크기에 맞추기 */
  object-fit: cover;
  /* 크기에 맞춰진 이미지를 가운데로 정렬 */
  object-position: center;
}
</style>
