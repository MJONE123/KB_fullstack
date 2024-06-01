import { createRouter, createWebHistory } from 'vue-router';
import Home from '@/pages/Home.vue';
import Profile from '@/pages/Profile.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home,
    },
    {
      path: '/profile/:id',
      name: 'Profile',
      component: Profile,
    },
  ],
});

export default router;
