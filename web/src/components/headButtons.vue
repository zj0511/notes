<template>
    <div class="head-buttons">
      <span><el-button type="text" class="energy">{{info.energy}}/60</el-button></span>
      <span><el-button type="text" class="money">{{info.money}}</el-button></span>
      <span><el-button type="text" class="diamond">{{info.diamond}}</el-button></span>
    </div>
</template>

<script>
  export default {
    name: 'headButtons',
    data() {
      return {
        info: {
          energy: 0,
          money: 0,
          diamond: 0,
          star: 0
        }
      }
    },
    created() {
      this.getRole();
    },
    methods: {
      /**
       * 获取用户信息
       * @param row
       */
      getRole(row) {
        this.$axios({
          method: 'post',
          url: 'api/getAssets',
          params: {
            id: '1'
          }
        }).then(response => {
          if (response.status === 200) {
            this.info = response.data.data;
          }
        })
      }
    }
  }
</script>

<style scoped>
  .head-buttons {
    position: relative;
    left: 96px;
  }

  .head-buttons > span {
    margin-left: -2px;
  }

  .head-buttons > span > button {
    width: 115px;
    text-align: right;
  }
</style>
<style>
  .energy {
    background: url('/static/img/button/head/energy.png') no-repeat;
  }

  .money {
    background: url('/static/img/button/head/money.png') no-repeat;
  }

  .diamond {
    background: url('/static/img/button/head/diamond.png') no-repeat;
  }

  .energy.el-button--text > span, .money.el-button--text > span, .diamond.el-button--text > span {
    display: inline-block;
    position: relative;
    margin: 0 27px 0 5px;
    top: -5px;
    color: #ffffff;
  }
</style>
