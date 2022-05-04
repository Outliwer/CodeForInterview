## `Tomcat` 架构

* `Conector` + `Container` 

* `Container` -> `Engine` -> `Host` -> `Servlet容器` -> `Context`
* `contextConfig`在`Tomcat`创建`Context`容器时被加入到`servletContext`中，`contextConfig`负责整个Web应用的配置文件（包括web.xml）的解析工作
* 具体的`listener`
    * 在`Servlet容器`启动的时候，触发`servletContextEvent`事件,并通知相应的监听器`servletContextListener`
    * `servletContextListener`监听`Servlet`的初始化、销毁、使用等状态
* 运行机制：
    * `servletContext,servletConfig,servletRequest,servletResponse` 
    
    * `servletConfig`：交换场景的描述

