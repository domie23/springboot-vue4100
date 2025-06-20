
var projectName = '自媒体社区平台';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '需求通告',
	url: './pages/xuqiutonggao/list.html'
}, 
{
	name: '优质案例',
	url: './pages/youzhianli/list.html'
}, 

{
	name: '帮助中心',
	url: './pages/news/list.html'
},
{
	name: '意见反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/springboot3c707/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"商家","menuJump":"列表","tableName":"shangjia"}],"menu":"商家管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["新增","查看","修改","删除"],"menu":"普通管理员","menuJump":"列表","tableName":"putongguanliyuan"}],"menu":"普通管理员管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","删除"],"menu":"需求通告","menuJump":"列表","tableName":"xuqiutonggao"}],"menu":"需求通告管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","删除"],"menu":"接单信息","menuJump":"列表","tableName":"jiedanxinxi"}],"menu":"接单信息管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","删除","查看评论"],"menu":"优质案例","menuJump":"列表","tableName":"youzhianli"}],"menu":"优质案例管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","删除"],"menu":"申请信息","menuJump":"列表","tableName":"shenqingxinxi"}],"menu":"申请信息管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","删除"],"menu":"社区公告","menuJump":"列表","tableName":"shequgonggao"}],"menu":"社区公告管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除"],"menu":"领域类型","menuJump":"列表","tableName":"lingyuleixing"}],"menu":"领域类型管理"},{"child":[{"appFrontIcon":"cuIcon-message","buttons":["查看","修改","回复","删除"],"menu":"意见反馈","tableName":"messages"}],"menu":"意见反馈"},{"child":[{"appFrontIcon":"cuIcon-service","buttons":["新增","查看","修改","删除"],"menu":"在线咨询","tableName":"chat"},{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"帮助中心","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","接单"],"menu":"需求通告列表","menuJump":"列表","tableName":"xuqiutonggao"}],"menu":"需求通告模块"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"优质案例列表","menuJump":"列表","tableName":"youzhianli"}],"menu":"优质案例模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看"],"menu":"接单信息","menuJump":"列表","tableName":"jiedanxinxi"}],"menu":"接单信息管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除"],"menu":"申请信息","menuJump":"列表","tableName":"shenqingxinxi"}],"menu":"申请信息管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","接单"],"menu":"需求通告列表","menuJump":"列表","tableName":"xuqiutonggao"}],"menu":"需求通告模块"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"优质案例列表","menuJump":"列表","tableName":"youzhianli"}],"menu":"优质案例模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除","查看评论"],"menu":"需求通告","menuJump":"列表","tableName":"xuqiutonggao"}],"menu":"需求通告管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","删除","审核"],"menu":"接单信息","menuJump":"列表","tableName":"jiedanxinxi"}],"menu":"接单信息管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","接单"],"menu":"需求通告列表","menuJump":"列表","tableName":"xuqiutonggao"}],"menu":"需求通告模块"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"优质案例列表","menuJump":"列表","tableName":"youzhianli"}],"menu":"优质案例模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"商家","tableName":"shangjia"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","删除","审核","查看评论"],"menu":"需求通告","menuJump":"列表","tableName":"xuqiutonggao"}],"menu":"需求通告管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["新增","查看","修改","删除","查看评论"],"menu":"优质案例","menuJump":"列表","tableName":"youzhianli"}],"menu":"优质案例管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","删除","审核"],"menu":"申请信息","menuJump":"列表","tableName":"shenqingxinxi"}],"menu":"申请信息管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["新增","查看","修改","删除"],"menu":"社区公告","menuJump":"列表","tableName":"shequgonggao"}],"menu":"社区公告管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","接单"],"menu":"需求通告列表","menuJump":"列表","tableName":"xuqiutonggao"}],"menu":"需求通告模块"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"优质案例列表","menuJump":"列表","tableName":"youzhianli"}],"menu":"优质案例模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"普通管理员","tableName":"putongguanliyuan"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
