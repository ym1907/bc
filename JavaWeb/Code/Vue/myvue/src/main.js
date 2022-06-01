import Vue from 'vue'
import App from './App'
import VueRouter from 'vue-router'

Vue.config.productionTip = false

Vue.use()

new Vue({
  el: '#app',
  components: { App },
  template: '<App/>'
})
