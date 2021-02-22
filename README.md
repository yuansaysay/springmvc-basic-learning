# springmvc-basic-learning
springmvc配置基础学习

**关注点：**
- web.xml关键配置
  - 根容器的启动
  - servlet 子容器的启动
  
- <mvc:annotation-driven/> 标签解析
  - RequestMappingHandlerMapping bean 在容器的初始化
  - RequestMappingHandlerAdapter bean 在容器的初始化
  
- DispatchrServlet 处理请求时，调用service接口的关键逻辑
  - 参数解析，可以@RequestBody注解入手，RequestResponseBodyMethodProcessor#resolveArgument
  - 返回值解析，可以@ResponseBody注解入手，RequestResponseBodyMethodProcessor#handleReturnValue
  - 统一异常处理，ExceptionHandlerExceptionResolver#afterPropertiesSet
