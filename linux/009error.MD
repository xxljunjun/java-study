2023/07/24 22:50:31 [notice] 1#1: signal 3 (SIGQUIT) received, shutting down
2023/07/24 22:50:31 [notice] 23#23: gracefully shutting down
2023/07/24 22:50:31 [notice] 23#23: exiting
2023/07/24 22:50:31 [notice] 23#23: exit
2023/07/24 22:50:31 [notice] 1#1: signal 17 (SIGCHLD) received from 23
2023/07/24 22:50:31 [notice] 1#1: worker process 23 exited with code 0
2023/07/24 22:50:31 [notice] 1#1: exit
/docker-entrypoint.sh: /docker-entrypoint.d/ is not empty, will attempt to perform configuration
/docker-entrypoint.sh: Looking for shell scripts in /docker-entrypoint.d/
/docker-entrypoint.sh: Launching /docker-entrypoint.d/10-listen-on-ipv6-by-default.sh
10-listen-on-ipv6-by-default.sh: info: IPv6 listen already enabled
/docker-entrypoint.sh: Launching /docker-entrypoint.d/20-envsubst-on-templates.sh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/30-tune-worker-processes.sh
/docker-entrypoint.sh: Configuration complete; ready for start up
2023/07/24 22:50:55 [warn] 1#1: server name "http://47.102.216.222:8080" has suspicious symbols in /etc/nginx/nginx.conf:32
nginx: [warn] server name "http://47.102.216.222:8080" has suspicious symbols in /etc/nginx/nginx.conf:32
2023/07/24 22:50:55 [warn] 1#1: the "ssl" directive is deprecated, use the "listen ... ssl" directive instead in /etc/nginx/nginx.conf:50
nginx: [warn] the "ssl" directive is deprecated, use the "listen ... ssl" directive instead in /etc/nginx/nginx.conf:50
2023/07/24 22:50:55 [emerg] 1#1: cannot load certificate "/root/nginx/cert/xxljunjun.pem": BIO_new_file() failed (SSL: error:02001002:system library:fopen:No such file or directory:fopen('/root/nginx/cert/xxljunjun.pem','r') error:2006D080:BIO routines:BIO_new_file:no such file)
nginx: [emerg] cannot load certificate "/root/nginx/cert/xxljunjun.pem": BIO_new_file() failed (SSL: error:02001002:system library:fopen:No such file or directory:fopen('/root/nginx/cert/xxljunjun.pem','r') error:2006D080:BIO routines:BIO_new_file:no such file)