<template>
  <div class="home">
    <div class="info-head">
      <div>
        <span style="position: relative; top: 8px; left: 67px;">V{{info.vip}}</span>
        <span style="color: rgb(0, 0, 0); position: relative; top: 49px; left: 42px;">{{info.level}}</span>
      </div>
      <div class="info-head-sub">
        <span>{{info.energy}}/60</span>
        <span>{{info.money}}</span>
        <span>{{info.diamond}}</span>
      </div>
    </div>
    <div class="info-right">
      <ul>
        <li v-for="(item,index) in menu">
          <img :src="item" width="60"/>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'home',
    data() {
      return {
        info: {
          energy: 0,
          money: 0,
          diamond: 0,
          star: 0,
          level: 0,
          vip: 0,
          clothingId: '',
          friendId: '',
          taskId: ''
        },
        menu: ['/static/img/button/wardrobe.png','/static/img/button/wardrobe.png']
      }
    },
    created() {
      this.getRole();
    },
    methods: {
      getRole(row) {
        this.$axios({
          method: 'post',
          url: 'api/getRole',
          params: {
            id: '1'
          }
        }).then(response => {
          console.log(response)
          if (response.status === 200) {
            this.form = response.data;
            this.dialogFormVisible = true;
          }
        })
      }
    }
  }
</script>

<style scoped>
  .home {
    background: url("/static/img/home/index.jpg") no-repeat;
    background-size: 100% 100%;
    width: 450px;
    height: 800px;
  }

  .info-head {
    color: #ffffff;
  }

  .info-head-sub {
    position: relative;
    top: -18px;
    left: 47px;
  }

  .info-head-sub > span {
    margin-left: 101px;
  }

  .info-right {
    float: right;
    margin: -20px 8px 0 0;
  }

  li {
    list-style:none; /*去除无序列表前面的符号*/
  }
</style>
