### HttpServletRequest 类的常用方法
```
i. getRequestURI() 获取请求的资源路径
ii. getRequestURL() 获取请求的统一资源定位符（绝对路径）
iii. getRemoteHost() 获取客户端的ip 地址
iv. getHeader() 获取请求头
v. getParameter() 获取请求的参数
vi. getParameterValues() 获取请求的参数（多个值的时候使用）
vii. getMethod() 获取请求的方式GET 或POST
viii. setAttribute(key, value); 设置域数据
ix. getAttribute(key); 获取域数据
x. getRequestDispatcher() 获取请求转发对象
```

###  doGet中文乱码
```
//1 先以iso8859-1 进行编码
//2 再以utf-8 进行解码
username = new String(username.getBytes("iso-8859-1"), "UTF-8");
```

### doPost中文乱码
```
req.setCharacterEncoding("UTF-8");
```

### 请求转发
```
RequestDispatcher requestDispatcher = req.getRequestDispatcher("/servlet2");
```

### base标签
```
<base href="http://localhost:8080/07_servlet/a/b/">
```

### HttpServletResponse类
```
//两个流同时只能使用一个
字节流getOutputStream(); 常用于下载（传递二进制数据）
字符流getWriter(); 常用于回传字符串（常用）
```

### 响应乱码
```js
//解决响应中文乱码方案一（不推荐使用）
// 设置服务器字符集为UTF-8
resp.setCharacterEncoding("UTF-8");
// 通过响应头，设置浏览器也使用UTF-8 字符集
resp.setHeader("Content-Type", "text/html; charset=UTF-8");

解决响应中文乱码方案二（推荐）：
// 它会同时设置服务器和客户端都使用UTF-8 字符集，还设置了响应头
// 此方法一定要在获取流对象之前调用才有效
resp.setContentType("text/html; charset=UTF-8");
```

### 请求重定向
```js
请求重定向的第一种方案：
// 设置响应状态码302 ，表示重定向，（已搬迁）
resp.setStatus(302);
// 设置响应头，说明新的地址在哪里
resp.setHeader("Location", "http://localhost:8080");

请求重定向的第二种方案（推荐使用）：
resp.sendRedirect("http://localhost:8080");
```

