## `Spring`怎么加载配置文件
* 在装配`Bean`前怎么对`Bean`进行配置
    *  
* `Bean`的装配方法
    *  在`XML`中进行显示配置
        * `<constructor-arg>:`构造器中声明`DI`，属性`value`是注入值，`ref`是注入对象引用  
    
    *  在`Java`中进行显示配置
        * 可以实现基本数据类型的值、字符串字面量、类字面量等注入  
    *  隐式的`bean`发现机制和自动装配
        *  `@Autowired：`将一个类的依赖bean装配进来

