<template>
  <div class="background">
    <img :src="imgSrc" width="100%" height="100%" alt=""/>
  </div>
</template>
<script>
  export default {
    name: 'App',
    data() {
      return {
        imgSrc: require('../src/assets/welcome.jpg'),
      };
    },
  };
</script>
<style>
  .background {
    width: 99%;
    height: 99%;
    position: absolute;
  }
</style>
