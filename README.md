## AndroidComponent
Android组件化的过程和文档记录

## 组件化需解决的问题
- 单独开发，单独调试，动态修改gradle配置【done】
- 页面跳转，使用第三方ARouter【done】
- 组件的AndroidManifest.xml，单独调试和发布阶段使用同一个配置，动态删除单独调试的主入口和应用图标。增加应用层调试模块，组件不再单独提供调试功能【done】
- 代码隔离，项目架构向下依赖【done】
    - 应用层，依赖复合组件或基础组件，尽量不依赖基础库
    - 组件层，基础组件尽量不相互依赖，需要有依赖时，沉淀到基础层；复合组件依赖基础组件，不要依赖同层的复合组件
    - 基础层，provider依赖代理库和基础库，代理库依赖基础库
- 资源冲突问题，开发过程中规避此问题，手动添加模块前缀【done】
- 打包AAR，要将依赖都打入包中【todo】

## Gradle资源依赖方式
- implementation 模块内使用，其他模块无法访问
- api 参与编译和打包，都可以访问
- compileOnly 只在编译时有效，不会参与打包
- runtimeOnly 只参与打包，编译时不会参与，适合做代码隔离

## 打包AAR方案选择
- [android-fat-aar](https://github.com/adwiv/android-fat-aar)，二三年前更新过，作者不再维护，脚本无法正常运行。
- [merge-module](https://github.com/byhook/merge-module)，基于fat-aar修改，作者最近半年有更新，项目需求也是对外输出sdk。
    - 优点，可以打包依赖AAR中所有资源，满足业务需求。
    - 缺点，只支持android gradle 2.2.3，gradle wrap 3.5，不满足高版本gradle需求。
    - 测试代码在develop_fat分支
- [fat-aar](https://github.com/NicoToast/fat-aar)，作者半年前更新过
    - 优点，支持android gradle 3.0.1的版本，gradle wrap 4.4
    - 缺点，子AAR的资源ID打进去了，但是打包到apk后，子AAR的资源ID变了，运行时找不到
- [fataar-gradle-plugin](https://github.com/Mobbeel/fataar-gradle-plugin)
    - 优点
    - 缺点，无法打包Manifest文件
