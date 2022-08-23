![](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) ![](https://img.shields.io/badge/redis-%23DD0031.svg?&style=for-the-badge&logo=redis&logoColor=white) ![](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot) ![](https://img.shields.io/badge/Docker-2CA5E0?style=for-the-badge&logo=docker&logoColor=white)

# REST API with Redis and Spring Boot

![Untitled](https://user-images.githubusercontent.com/54184905/186088124-3f5d44c8-3abe-4ac1-9760-e436df9a5f88.png)

**What is Redis ?**
Redis is a NoSQL database written in C programming language and designed as key-value. Because it keeps the data in memory and is written in a language close to the hardware, reading and writing is done very quickly.

This API I wrote can perform CRUD (Create - Read - Update - Delete) operations on Redis.

```terminal
# Cleaning up Docker images
docker rm -f $(docker ps -a -q)
docker volume rm $(docker volume ls -q)

# Running all images (Redis and Java-Spring images)
docker-compose up
```


**RAM test I did on Redis**

![Screenshot_2022-08-22_23-55-03](https://user-images.githubusercontent.com/54184905/186089608-fa95f820-c948-4e9e-90b1-46be89adee15.png)

I connected to the API I wrote with Spring boot with Python, I opened 4 processes in the Python script and opened 2 threads under each process, that is, I made an endless loop request to the API with 8 threads in total. I started this infinite loop request at 21:55 and ended at 00:00, within 2 hours and 5 minutes I opened 10 million student records in Redis and these 10 million student records took up 3 GB of RAM.