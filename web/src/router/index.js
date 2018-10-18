import Vue from 'vue'
import Router from 'vue-router'
import bookList from '@/views/books/booklist'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: '图书列表',
      component: bookList
    }
  ]
})
