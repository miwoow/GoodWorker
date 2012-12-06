GoodWorker
==========

A server and client struct. Used to do any typte of work.

这是一个客户/服务器的编程架构。

服务端可以分布式部署到多台机器上。而且客户端可以通过连接各服务器，将自己需要计算的内容上传到服务器上。

客户端提交的工作，通过在服务器上运算让服务器的计算资源达到共享。

Tec Note
=========

基于Java Mina 来实现。