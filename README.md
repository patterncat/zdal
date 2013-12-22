zdal:Zhifubao Distributed Data Layer
Zdal是支付宝自主研发的数据中间件产品，采用标准的JDBC规范，可以在分布式环境下看上去像传统数据库一样提供海量数据服务，是一种通用的分库分表数据库访问框架，解决单库单表数据库访问压力，Zdal主要提供分库分表，结果集合并，sql解析，数据库failover动态切换等功能，提供互联网金融行业的数据访问层统一解决方案，目前已经在支付宝的交易，支付，会员，金融等大部分关键应用上使用，并且在2013年双11大促中运行稳定：
SQL解析：采用阿里巴巴开源框架Druid，支持解析mysql/Oracle 99% sql语句，基本上能满足支付宝全站应用的业务sql解析需求；
规则引擎：采用Groovy语言，便于应用自定义java代码确定分库分表规则；
交易failover模型：与业务配合确定在主库宕机的情况下，通过failover库保证交易创建和推进地高可用性；
