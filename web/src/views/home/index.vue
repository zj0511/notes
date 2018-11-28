<template>
  <div class="home">
    <!--顶部按钮-->
    <head-buttons/>

    <!--头像-->
    <el-button type="text" class="avatar" @click="openInfo">
      <div class="vip">V{{info.vip}}</div>
      <div class="level">{{info.level}}</div>
      <div class="nickname">{{info.nickname}}</div>
    </el-button>

    <!--右边栏按钮-->
    <div class="info-right">
      <ul>
        <li v-for="(item,index) in menu">
          <img :src="item.path" width="60" @click="showDialog(item.name)"/>
        </li>
      </ul>
    </div>

    <el-dialog :visible="showWardrobe" :modal="false" :show-close="false" top="0" width="450px" class="aaa">
      <div class="wardrobe">
        <div class="wardrobe-sub">
          <span><el-button type="text" class="energy">{{info.energy}}/60</el-button></span>
          <span><el-button type="text" class="money">{{info.money}}</el-button></span>
          <span><el-button type="text" class="diamond">{{info.diamond}}</el-button></span>
        </div>
        <div slot="title" class="dialog-title">
          <el-button @click="back">返回</el-button>
        </div>
        <p>hhh</p>
        <p>hhh</p>
        <p>hhh</p>
        hhh
        hhh
      </div>
    </el-dialog>
  </div>
</template>

<script>
  import headButtons from '@/components/headButtons'

  export default {
    name: 'home',
    components: {headButtons},
    data() {
      return {
        info: {
          nickname: '',
          level: 0,
          exper: 0,
          vip: 0,
          clothingId: '',
          friendId: '',
          taskId: ''
        },
        menu: [],
        showWardrobe: false
      }
    },
    created() {
      this.getRole();
      this.getMenu();
    },
    methods: {
      /**
       * 获取用户信息
       * @param row
       */
      getRole(row) {
        this.$axios({
          method: 'post',
          url: 'api/getRole',
          params: {
            id: '1'
          }
        }).then(response => {
          if (response.status === 200) {
            this.info = response.data.data;
          }
        })
      },
      /**
       * 获取菜单
       */
      getMenu() {
        this.$axios({
          method: 'post',
          url: 'api/getMenus',
          params: {
            offset: 0,
            limit: 10
          }
        }).then(response => {
          if (response.status === 200) {
            this.menu = response.data.data;
          }
        })
      },
      /**
       * 显示边栏各按钮的弹框
       * @param name
       */
      showDialog(name) {
        if (name === '衣柜') {
          this.$router.push('/wardrobe')
        } else {

        }
      },
      back() {
        this.showWardrobe = false;
      },
      /**
       * 头像页面
       */
      openInfo() {
        this.$router.push('/info')
      }
    }
  }
</script>

<style scoped>
  .home {
    background: url("/static/img/home/index.png") no-repeat;
    background-size: 100% 100%;
    width: 450px;
    height: 800px;
  }

  .avatar {
    background: url(/static/img/button/avatar.png) no-repeat 100% 100%;
    position: relative;
    width: 120px;
    height: 110px;
    top: -37px;
    padding: 0 !important;
  }

  .vip {
    position: relative;
    width: 20px;
    left: 71px;
    top: -19px;
    color: #ffffff;
  }

  .level {
    position: relative;
    width: 10px;
    left: 71px;
    top: 11px;
    color: #000000;
  }

  .nickname {
    position: relative;
    width: 100px;
    left: 9px;
    top: 25px;
    color:  #ffffff;
  }

  .info-right {
    float: right;
    margin-right: 8px;
  }

  li {
    list-style: none; /*去除无序列表前面的符号*/
  }
</style>

