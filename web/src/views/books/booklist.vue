<template>
  <div>
    <el-table :data="books" style="width: 100%">
      <el-table-column prop="isbn" label="编号"></el-table-column>
      <el-table-column prop="title" label="名称"></el-table-column>
      <el-table-column prop="author" label="作者"></el-table-column>
      <el-table-column prop="categoryId" label="类别"></el-table-column>
    </el-table>
  </div>
</template>

<script>
  export default {
    name: 'bookList',
    data() {
      return {
        books: []
      }
    },
    created() {
      this.getBookList();
    },
    methods: {
      getBookList() {
        this.$axios.post('api/getBookList').then(response => {
          if (response.status === 200) {
            this.books = response.data.books;
          }
        })
      }
    }
  }
</script>

<style scoped>

</style>
