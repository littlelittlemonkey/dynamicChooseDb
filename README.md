# ssm_demo
数据库动态读写分离

一、用spring aop 进行具体方法的AOP拦截（DataSourceAspect），切换数据源(不同方法调用不同数据源)  
二、使用ThreadLocal确保线程一致性,判断是读/写操作(DataSourceHandler)
三、利用ChooseDataSource(继承自AbstractRoutingDataSource)类，来确认使用哪个数据库，来动态获取数据源，用于动态切换数据源