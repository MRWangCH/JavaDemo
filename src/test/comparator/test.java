package test.comparator;

public class test {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        comparator comparator = new comparator();
        int result = comparator.compare(i, j);
        System.out.println(result);


        StringBuilder stringBuilder = new StringBuilder();
        int g = stringBuilder.append(1).append('g').length();
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder);


        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("1").append("2").append("3");
        System.out.println(stringBuffer.indexOf("2"));
        System.out.println(stringBuffer.charAt(0));//返回指定索引处的字符
        System.out.println(stringBuffer);

    }

/*
        spring中的bean的生命周期有哪些？
    1.singleton 单例，在整个spring中只会存在一个bean实例
    2.prototype 原型，每次从ioc容器获取指定bean的时候，都会返回一个新的实例对象
    3.request 请求，每次ruquset请求都会产生一个新的bean
    4.session 相同的session共享一个bean，不同的session产生不同的bean
    5.globalsession 全局的session共享一个bean
*/

    /*
        spring中的事务传播行为，
    REQUIRED 默认的事务传播级别，如果有这个事务则加入，没有则新建一个,
    REQIURED_NEW,不管有没有都新建一个，新老事务各自独立，互不影响
    NESTED 如果当前存在事务，则嵌套在当前事务中执行。如果当前没有事务，则新建一个事务，类似于REQUIRE_NEW
    SUPPORTED 表示支持当前事务，如果当前不存在事务，以非事务的方式执行
    NOT_SUPPORTED 表示以非事务的方式来运行，如果当前存在事务，则把当前事务挂起
    MANDATORY 强制事务执行，若当前不存在事务，则抛出异常
    NEVER 以非事务的方式执行，如果当前存在事务，则抛出异常
    */



    /*
    Spring Bean生命周期的执行流程
    1、创建前准备阶段
    这个阶段主要是在开始Bean加载之前，从Spring上下文和相关配置中解析并查找Bean有关的配置内容，
    比如`init-method`-容器在初始化bean时调用的方法、`destory-method`，容器在销毁Bean时调用的方法。
    以及，BeanFactoryPostProcessor这类的bean加载过程中的前置和后置处理。
    这些类或者配置其实是Spring提供给开发者，用来实现Bean加载过程中的扩展机制，在很多和Spring集成的中间件经常使用，比如Dubbo。
    2、创建实例阶段
    这个阶段主要是通过反射来创建Bean的实例对象，并且扫描和解析Bean声明的一些属性。
    3、依赖注入阶段
    在这个阶段，会检测被实例化的Bean是否存在其他依赖，如果存在其他依赖，就需要对这些被依赖Bean进行注入。
    比如通过读取`@Autowired`、@Setter等依赖注入的配置。在这个阶段还会触发一些扩展的调用，比如常见的扩展类：BeanPostProcessors（用来实现Bean初始化前后的回调）、
    InitializingBean类（这个类有一个afterPropertiesSet()方法，给属性赋值）、还有BeanFactoryAware等等。
    4、容器缓存阶段
    容器缓存阶段主要是把Bean保存到IoC容器中缓存起来，到了这个阶段，Bean就可以被开发者使用了。
    这个阶段涉及到的操作，常见的有，`init-method`这个属性配置的方法，会在这个阶段调用。
    在比如BeanPostProcessors方法中的后置处理器方法如：postProcessAfterInitialization，也是在这个阶段触发的。
    5、销毁实例阶段
    这个阶段，是完成Spring应用上下文关闭时，将销毁Spring上下文中所有的Bean。
    如果Bean实现了DisposableBean接口，或者配置了`destory-method`属 性，将会在这个阶段被调用
     */


}
