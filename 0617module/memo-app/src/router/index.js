import { createRouter, createWebHistory } from 'vue-router';
import MemoDetailPage from '@/pages/MemoDetailPage.vue';
import MemoListPage from '@/pages/MemoListPage.vue';

const HomeView = () => import('../pages/MemoListPage.vue');

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/memo',
      name: 'memo',
      component: MemoListPage
    },
    {
      path: '/memo/view/:id',
      name: 'memo/id',
      component: MemoDetailPage
    },
  ],
});

export default router;
