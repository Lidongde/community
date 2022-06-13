**问答社区-java练手项目**

0 springframework[框架](https://spring.io/guides/gs/serving-web-content/) 搭建，
使用到了Web组件和thymeleaf组件(?)

1 使用Web UI框架([Bootstrap](https://v3.bootcss.com/components/#navbar)) 搭建前端，
铺垫工作以便更好投入后端的开发。
    
1.1 使用框架提供的导航条，不做ui上的修改；

1.2 使用[github登录](https://docs.github.com/cn/developers/apps/building-oauth-apps/creating-an-oauth-app)
，使用github的oauth进行登录验证的流程分为步（**服务端**、**客户端**以及前两者的服务端
**github**）：客户端 --*登录，携带应用id*--> GitHub(将客户端的请求重定向至服务端的
登录页面)；服务端 --*携带id和密码*--> Github(给服务端返回accesstoken)；服务端 --
*携带accesstoken*--> Github(给服务端返回用户信息)。注意，用户信息是用户注册github所
用的信息，并不是用户注册服务端应用所设置的信息，后续服务端记录用户也只能通过这些信息，合乎实际。

1.3 借助mybatis持久化框架实现“服务端利用数据库保存用户并验证客户”，上述验证只是比较初级
的验证，具体实现上就是服务端使用UUID工具自定义token作为用户cookie，并将token和其他必要信息
如用户名字、用户id（前两个都来自github）和时间一起持久化到数据库中，后续验证cookie中的token
和数据库的token是否一致，一致则设置session、并对应设置index登录初始页面的html逻辑。并没有
设置“记住用户一段时间”、“多久后需要再次登录”等功能


2 

