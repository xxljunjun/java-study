### 循环结构
```js
//在某些情况下，反复执行特定代码的功能
for循环
while循环
do-while循环

//循环结构一般满足4个条件
初始化部分
循环条件部分
循环体部分
迭代部分
```
### breakt跳出for循环
```
//例题2输入两个正整数m和n,求最大公约数和最小公倍数。
//最大公约数12/3，，，，3是12的公约数
//最大公倍数60/12.。。60是12的公倍数
```

### While循环的使用
```
①初始化条件
②循环条件
③循环体
④迭代条件

①
While(②){
         ③;
         ④
}
1==2==3==4==2==3==4==、、、==2
for循环与While循环可以相互转换
```

### do...while...
```
①
do{
      ③;
      ④	
}while(②)
1==3==4==2==3==4==、、、==2
***do...while...至少会执行一遍循环体！！！
```

### while(true)
```
1、不存在循环条件部分限制次数的结构：for(;;)或while(true)
while(true){
	break;  //可以用break跳出循环
}
```


### for循环嵌套
```
//获取当前时间距离1970-1-1 00:00:00的毫秒数
long start = System.currentTimeMillis();

Math.sqrt()  //开方
```

### 特殊关键字的使用break、continue
```
//结束当前循环
break
	循环结构中
	switch-case
//结束当次循环
	循环结构中  

相同点：两者后面都不能在写语句，编译都过不了 你
break结束的默认的最近一层for

lable：
break lable

lable：
continue lable

```
