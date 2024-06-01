import { createApp } from 'vue';
// npm install bootstrap@5 후 import 해주어야함
import 'bootstrap/dist/css/bootstrap.css';
import App from './App.vue';
import router from './router';

const app = createApp(App);

app.use(router);

app.mount('#app');
