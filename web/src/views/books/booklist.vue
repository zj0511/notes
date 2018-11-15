<template>
  <div class="select">
    <el-table :data="books" style="width: 100%">
      <el-table-column prop="isbn" label="编号"></el-table-column>
      <el-table-column prop="title" label="名称"></el-table-column>
      <el-table-column prop="author" label="作者"></el-table-column>
      <el-table-column prop="categoryId" label="类别"></el-table-column>
      <el-table-column fixed="right" label="操作" width="200">
        <template slot-scope="scope">
          <el-button @click="update(scope.row)" type="primary" size="small">编辑</el-button>
          <el-button @click="select(scope.row)" type="primary" size="small">查看</el-button>
        </template>
      </el-table-column>
    </el-table>

    <el-dialog title="查看图书详情" :visible.sync="dialogFormVisible">
      <el-form :inline="true" :model="form">
        <el-form-item label="名称">
          <el-input v-model="form.title" placeholder="请输入图书名称"></el-input>
        </el-form-item>
        <el-form-item label="作者">
          <el-input v-model="form.author" placeholder="请输入作者"></el-input>
        </el-form-item>
        <el-form-item label="类别">
          <el-input v-model="form.categoryId" placeholder="请选择图书类别"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="onSubmit">查询</el-button>
        </el-form-item>
      </el-form>
    </el-dialog>
  </div>
</template>

<script>
  export default {
    name: 'bookList',
    data() {
      return {
        books: [],
        dialogFormVisible: false,
        form: {
          title: '',
          author: '',
          categoryId: ''
        }
      }
    },
    created() {
      this.getBookList();
    },
    methods: {
      /**
       * 获取图书列表
       */
      getBookList() {
        this.$axios.post('api/getBookList').then(response => {
          if (response.status === 200) {
            this.books = response.data.books;
          }
        })
      },
      /**
       * 编辑
       * @param row
       */
      update(row) {
        this.$axios.post
      },
      /**
       * 查看
       * @param row
       */
      select(row) {
        this.$axios({
          method: 'post',
          url: 'api/getBook',
          params: {
            id: row.id
          }
        }).then(response => {
          this.form = response.data;
          this.dialogFormVisible = true;
        })
      }
    }
  }
</script>

<style scoped>

</style>
