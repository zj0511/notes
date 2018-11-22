import Vue from 'vue'
import Router from 'vue-router'
import home from '@/views/home'
import info from '@/views/info'
import wardrobe from '@/views/clothes/wardrobe'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: '首页',
      component: home
    }, {
      path: '/info',
      name: '个人信息',
      component: info
    }, {
      path: '/wardrobe',
      name: '衣柜',
      component: wardrobe
    }
  ]
})
