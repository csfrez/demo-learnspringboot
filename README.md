# Springboot学习示例
## 使用Bench进行压测
```
执行命令
./ab -n 10000 -c 500 http://localhost:8080/test
压测结果
$ ./ab -n 10000 -c 500 http://localhost:8080/test
This is ApacheBench, Version 2.3 <$Revision: 1874286 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 1000 requests
Completed 2000 requests
Completed 3000 requests
Completed 4000 requests
Completed 5000 requests
Completed 6000 requests
Completed 7000 requests
Completed 8000 requests
Completed 9000 requests
Completed 10000 requests


Server Software:
Server Hostname:        localhost
Server Port:            8080

Document Path:          /test
Document Length:        4 bytes

Concurrency Level:      500
Time taken for tests:   11.625 seconds
Complete requests:      10000
Failed requests:        0
Total transferred:      1360000 bytes
HTML transferred:       40000 bytes
Requests per second:    860.19 [#/sec] (mean)
Time per request:       581.267 [ms] (mean)
Time per request:       1.163 [ms] (mean, across all concurrent requests)
Transfer rate:          114.24 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   7.1      0     506
Processing:     2  521 295.1    532    1154
Waiting:        1  517 292.1    526    1153
Total:          2  521 295.3    532    1391

Percentage of the requests served within a certain time (ms)
  50%    532
  66%    677
  75%    769
  80%    821
  90%    924
  95%    977
  98%   1058
  99%   1081
 100%   1391 (longest request)
Finished 10000 requests

```
