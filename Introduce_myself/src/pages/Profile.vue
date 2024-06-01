<template>
  <!-- 전체 화면 프레임 -->
  <div class="profile-container">
    <!-- 그림자 프레임 -->
    <div class="user-container">
      <!-- 프로필 이미지 프레임 -->
      <div class="profile-frame">
        <img :src="userInfo.profileImage" :alt="userInfo.name" />
      </div>
      <div class="name">
        {{ userInfo.name }}
      </div>
      <div class="age">
        {{ userInfo.age }}
      </div>
      <div>
        {{ userInfo.location }}
      </div>
      <div>
        {{ userInfo.position }}
      </div>
      <div>
        {{ userInfo.hobby }}
      </div>
    </div>
  </div>
</template>

<script setup>
// json 파일 import
import oneUserInfo from '@/assets/userInfo.json';
// 현재 주소 불러오기 위한 기능 import
import { useRoute } from 'vue-router';

// 현재 주소 불러오는 기능
const currentRoute = useRoute();
// 콘솔창 키셔서 확인해보면 좋습니다
console.log(currentRoute.params.id);

// json 전체 중 유저의 id 값과 URL의 id값이 일치 하는 항목을 필터해서 배열에 저장
const userInfo = oneUserInfo.filter((user) => {
  if (user.id == currentRoute.params.id) {
    return user;
  }
  // 필터 된 모든 값중 가장 첫번째를 userInfo에 저장
  // filter 함수는 일치하는 항목을 배열에 저장하기 때문
})[0];
</script>

<style scoped>
/* Home과 동일합니다 */
.profile-container {
  position: absolute;
  left: 0;
  right: 0;
  top: 0;
  bottom: 0;
  padding: 100px;
  display: flex;
  align-items: center;
  justify-content: center;
  z-index: 1;
}

/* 그림자 프레임, Home과 비슷합니다 */
.user-container {
  padding: 16px 0;
  background-color: white;
  border-radius: 24px;
  width: 32%;
  aspect-ratio: 1/1.2;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: space-evenly;
  box-shadow: 2px 2px 10px 0px rgba(44, 85, 124, 0.04), 2px 2px 30px 0px rgba(0, 0, 0, 0.16);
}

/* 프로필 이미지 프레임, Home과 동일합니다 */
.profile-frame {
  width: 36%;
  aspect-ratio: 1/1;
  border-radius: 100%;
  overflow: hidden;
  display: flex;
  object-fit: cover;
  object-position: center;
}

/* 이름 폰트 크기, 굵기 변경 */
.name {
  font-weight: 700;
  font-size: 32px;
}

.age {
  margin-top: -24px;
}
</style>
