const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot3c707/",
            name: "springboot3c707",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot3c707/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "自媒体社区平台"
        } 
    }
}
export default base
