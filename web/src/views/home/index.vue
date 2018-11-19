<template>
  <div class="home">
    <div class="info-head">
      <div>
        <span style="position: relative; top: 8px; left: 67px;">V{{info.vip}}</span>
        <span style="color: rgb(0, 0, 0); position: relative; top: 49px; left: 42px;">{{info.level}}</span>
      </div>
      <div class="info-head-sub">
        <span>{{info.energy}}</span>
        <span>{{info.money}}</span>
        <span>{{info.diamond}}</span>
      </div>
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
        }
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
    background: url("../../assets/img/home/index.jpg") no-repeat;
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
    left: 72px;
  }

  .info-head-sub > span {
    margin-left: 101px;
  }
</style>
