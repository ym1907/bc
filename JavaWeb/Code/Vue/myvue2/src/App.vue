<template>
  <div id="app">
    <img src="./assets/logo.png">
    <h1>Harry</h1>

    <router-link to="/main">首页</router-link>
    <router-link to="/content">内容页</router-link>
    <router-link to="/kuang">Kuang</router-link>
    <router-view></router-view>

  </div>
</template>

<script>

  export default {
    name: 'App',
    components: {
    }
  }
</script>

<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
  }
</style>
