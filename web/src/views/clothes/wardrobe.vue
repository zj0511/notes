<template>
  <div class="wardrobe">
    <head-buttons/>
    <el-button type="text" class="back" @click="backToIndex"><img src="/static/img/button/back.png" width="50"/></el-button>
    <div>发型 0/0</div>
    <el-tabs tab-position="left" style="height: 200px;">
      <el-tab-pane label="用户管理">用户管理</el-tab-pane>
      <el-tab-pane label="配置管理">配置管理</el-tab-pane>
      <el-tab-pane label="角色管理">角色管理</el-tab-pane>
      <el-tab-pane label="定时任务补偿">定时任务补偿</el-tab-pane>
    </el-tabs>
  </div>
</template>
<script>
  import headButtons from '@/components/headButtons'
  export default {
    name: 'wardrobe',
    components: {headButtons},
    methods: {
      backToIndex(){
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
</style>
