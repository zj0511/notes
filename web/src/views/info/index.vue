<template>
  <div class="wardrobe">
    <div class="main">
      <!--顶部按钮-->
      <head-buttons/>

      <!--返回-->
      <el-button type="text" class="back" @click="backToIndex"></el-button>

      <el-button type="text" class="vip" @click="openVip"></el-button>



    </div>
  </div>
</template>
<script>
  import headButtons from '@/components/headButtons'

  export default {
    name: 'info',
    components: {headButtons},
    methods: {
      backToIndex() {
        this.$router.push('/');
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
</style>
