## `Web`项目的启动过程
 
*  过程
    * `WEB`容器读取`web.xml`配置文件，读取`<context-param>`结点
    
    * 容器创建一个`ServletContext`，这个`Web`项目的所有部分都将共享这个上下文信息
    * 容器将`<context-param>`转换为键值对，并交给 `servletContext`。 因为`listener`, `filter` 等在初始化时会用到这些上下文中的信息，所以要先加载。
    * 容器创建`<listener>`中的类实例，创建监听器
    * 加载`filter`和`servlet`

* `Filter，Listener，Servlet`怎么加载的


