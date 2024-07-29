# Framework REST: 基于SpringBoot实现REST风格API标准化组件

该项目的目标是提供基于SpringBoot进行REST风格API的标准化提供扩展工具

## 能力清单

- 基于注解的 InterceptorRegistry 拦截器注册
- 居于注解的 HandlerMethodArgumentResolver 参数解析器

## 使用方法

1. 引用依赖 pom.xml

    ```xml
    <dependency>
        <groupId>top.swiftx.framework</groupId>
        <artifactId>spring-boot-starter-rest</artifactId>
        <version>${版本号}</version>
    </dependency>
    ```

2. 编辑配置文件 application.properties

    ```properties
   # 默认为true, 一般情况下可以省略该配置
   swiftx.rest.enabled=true
    ```
