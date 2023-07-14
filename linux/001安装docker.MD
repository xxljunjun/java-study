### 安装docker
```
yum remove docker \
                docker-client \
                docker-client-latest \
                docker-common \
                docker-latest \
                docker-latest-logrotate \
                docker-logrotate \
                docker-engine

```

### 阿里云官网

### 之前linux前端配置
```conf
# pc端beauty
server{
        listen 80;
        server_name 47.102.216.222;
        gzip on;
        gzip_min_length 1k;
        gzip_comp_level 9;
        gzip_types text/plain application/javascript application/x-javascript text/css application/xml text/javascript application/x-httpd-php image/jpeg image/gif image/png;
        gzip_vary on;
        gzip_disable "MSIE [1-6]\.";
        location / {
                root /root/xxl/myself;
                index index.html;
                try_files $uri $uri/ xxl/myself/index.html;
        }
        location /vuestudy {
                alias /root/xxl/vuestudy;
                index index.html;
                try_files $uri $uri/ xxl/vuestudy/index.html;
        }
        location /redbook {
                alias /root/xxl/redbook;
         index index.html;
         try_files $uri $uri/ xxl/redbook/index.html;
        }
        location /dajiang {
                alias /root/xxl/dajiang;
         index index.html;
         try_files $uri $uri/ xxl/dajiang/index.html;
        }
        location /showscreen {
                alias /root/xxl/showscreen;
                index index.html;
                try_files $uri $uri/ xxl/showscreen/index.html;
        }
}
```


