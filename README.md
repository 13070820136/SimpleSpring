##### SimpleSpring
- spring学习

##### 理解实现过程

- v1.0
    1. BeanDefinition作为管理bean的实体
    2. 通过ConcurrentHashMap做为容器存入和获取
    
    
- v2.0
    1. 应用简单工厂模式来设计对bean的管理
    2. 工厂中bean的创建交由具体类来实现
    
    
- v3.0
    1. java.lang.reflect
    2. 应用反射中Filed来注入属性值
