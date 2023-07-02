
### 踩坑：SpringBoot导包坑之spring-boot-starter-parent
```
pom.xml的版本问题
```

### 踩坑：jva17无效源
```
jdk与项目的版本统一
```

### 踩坑：mogongDB数据库报错
```
springboot启动时会
在启动类上加
@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})

```

### 踩坑：打包springboot报错，utf-8
```js
// maven的版本太高了
    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-resources-plugin</artifactId>
        <version>3.0.2</version>
    </plugin>
```

### 访问不了url
```
controler包放在与主程序相同的包路径下
```


### yml的配置文件格式！！！
```
空格要注意！！！
```