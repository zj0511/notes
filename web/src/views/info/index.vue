<template>
  <div class="wardrobe">
    <div class="main">
      <!--顶部按钮-->
      <head-buttons/>

      <!--返回-->
      <el-button type="text" class="back" @click="backToIndex"></el-button>

      <div>
        <el-button type="text" class="set" @click="openSet"></el-button>
      </div>
      <div class="avatar">
        <el-button type="text" class="vip" @click="openVip">
          <div class="vip-font">V{{info.vip}}</div>
        </el-button>
        <div class="level">{{info.level}}</div>
        <div class="exper">{{info.exper}}/{{experMax}}</div>
        <div class="nickname">{{info.nickname}}</div>
        <el-button type="text" class="edit" @click="openEdit"></el-button>
        <div class="avatar-main">
          <css-circle color="#ff767e" width=150 font-size=48 :pv="pv" bold=8 text-bg-color='#f0f0f0'
                      class="avatar-circle" ref="myCircle"></css-circle>
          <img :src="imageUrl" class="avatar-img">
        </div>
      </div>
    </div>
  </div>
</template>
<script>
  import headButtons from '@/components/headButtons'
  import CssCircle from '@/components/circle'

  export default {
    name: 'info',
    components: {headButtons, CssCircle},
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
        imageUrl: '/static/img/button/info/init.png',
        experMax: 0,
        pv: 0,
        myCircle: ''
      }
    },
    created() {
      this.getRole();
    },
    methods: {
      backToIndex() {
        this.$router.push('/');
      },
      openSet() {

      },
      openVip() {

      },
      openEdit() {

      },
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
            this.experMax = 100 * this.info.level;
            this.pv = ~~(this.info.exper / this.experMax * 100);
            this.$refs.myCircle.setPv(this.pv);  // 调用子组件myCirlce的setPv方法
          }
        })
      }
    }
  }
</script>

<style scoped>
  .wardrobe {
    background: url("/static/img/home/wardrobe.png") no-repeat;
    background-size: 100% 100%;
    width: 450px;
    height: 800px;
  }

  .main {
    background: url(/static/img/home/info.png) no-repeat;
    background-size: 100% 100%;
    width: 450px;
    height: 800px;
    position: relative;
  }

  .back {
    background: url(/static/img/button/back.png) no-repeat 100% 100%;
    position: relative;
    width: 60px;
    height: 60px;
    top: -42px;
    left: -3px;
    padding: 0 !important;
  }

  .set {
    background: url(/static/img/button/set.png) no-repeat 100% 100%;
    position: absolute;
    width: 80px;
    height: 40px;
    padding: 0 !important;
    margin: 0 !important;
    top: 75px;
    right: 10px;
  }

  .avatar {
    background: url(/static/img/button/info/avatar.png) 100% 100% no-repeat;
    width: 380px;
    height: 202px;
    margin: 8px 0 0 55px;
    text-align: center;
  }

  .vip {
    background: url(/static/img/button/info/vip.png) no-repeat 100% 100%;
    position: relative;
    width: 100px;
    height: 40px;
    padding: 0 !important;
    margin: 0 !important;
    right: 115px;
    top: 25px;
  }

  .vip-font {
    position: relative;
    width: 20px;
    left: 37px;
    top: 2px;
    font-size: 16px;
    color: #ffffff;
  }

  .level {
    position: relative;
    width: 20px;
    float: right;
    top: 74px;
    right: 70px;
    font-size: 20px;
    color: #644d4f;
  }

  .exper {
    position: relative;
    width: 100px;
    float: right;
    top: 115px;
    left: 12px;
    font-size: 20px;
    color: #644d4f;
  }

  .nickname {
    position: relative;
    width: 100px;
    left: 85px;
    top: 117px;
    color: #ffffff;
  }

  .edit {
    background: url(/static/img/button/edit.png) no-repeat 100% 100%;
    position: relative;
    width: 80px;
    height: 50px;
    padding: 0 !important;
    margin: 0 !important;
    float: right;
    top: 85px;
    right: 50px;
  }

  .avatar-circle {
    top: -63px;
    left: 54px;
    border-width: 0 !important;
  }

  .avatar-img {
    top: -209px;
    position: relative;
    z-index: 999;
    right: 61px;
  }
</style>
