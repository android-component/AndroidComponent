## AndroidComponent
Android组件化的过程和文档记录

## 组件化需解决的问题
- 单独开发，单独调试，动态修改gradle配置【done】
- 页面跳转，使用第三方ARouter【done】
- 组件的AndroidManifest.xml，单独调试和发布阶段使用同一个配置，动态删除单独调试的主入口和应用图标
- 资源冲突问题
- 代码隔离
- 打包AAR，要将依赖都打入包中

## Gradle资源依赖方式
- implementation 模块内使用，其他模块无法访问
- api 参与编译和打包，都可以访问
- compileOnly 只在编译时有效，不会参与打包
- runtimeOnly 只参与打包，编译时不会参与，适合做代码隔离