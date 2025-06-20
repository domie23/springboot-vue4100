import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import shenqingxinxi from '@/views/modules/shenqingxinxi/list'
    import putongguanliyuan from '@/views/modules/putongguanliyuan/list'
    import jiedanxinxi from '@/views/modules/jiedanxinxi/list'
    import discussyouzhianli from '@/views/modules/discussyouzhianli/list'
    import discussxuqiutonggao from '@/views/modules/discussxuqiutonggao/list'
    import xuqiutonggao from '@/views/modules/xuqiutonggao/list'
    import shangjia from '@/views/modules/shangjia/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import youzhianli from '@/views/modules/youzhianli/list'
    import shequgonggao from '@/views/modules/shequgonggao/list'
    import lingyuleixing from '@/views/modules/lingyuleixing/list'
    import messages from '@/views/modules/messages/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '帮助中心',
        component: news
      }
      ,{
	path: '/shenqingxinxi',
        name: '申请信息',
        component: shenqingxinxi
      }
      ,{
	path: '/putongguanliyuan',
        name: '普通管理员',
        component: putongguanliyuan
      }
      ,{
	path: '/jiedanxinxi',
        name: '接单信息',
        component: jiedanxinxi
      }
      ,{
	path: '/discussyouzhianli',
        name: '优质案例评论',
        component: discussyouzhianli
      }
      ,{
	path: '/discussxuqiutonggao',
        name: '需求通告评论',
        component: discussxuqiutonggao
      }
      ,{
	path: '/xuqiutonggao',
        name: '需求通告',
        component: xuqiutonggao
      }
      ,{
	path: '/shangjia',
        name: '商家',
        component: shangjia
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/chat',
        name: '在线咨询',
        component: chat
      }
      ,{
	path: '/youzhianli',
        name: '优质案例',
        component: youzhianli
      }
      ,{
	path: '/shequgonggao',
        name: '社区公告',
        component: shequgonggao
      }
      ,{
	path: '/lingyuleixing',
        name: '领域类型',
        component: lingyuleixing
      }
      ,{
	path: '/messages',
        name: '意见反馈',
        component: messages
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
