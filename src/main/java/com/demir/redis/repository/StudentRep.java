package com.demir.redis.repository;

import com.demir.redis.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRep {

    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate template;
    private String HASH_KEY = "Student";

    public Student addStudent(Student student){
        template.opsForHash().put(HASH_KEY, student.getId(), student);

        return student;
    }

    public Student updateStudent(Student student) {
        template.opsForHash().put(HASH_KEY, student.getId(), student);

        return student;
    }


    public List<Student> getAll(){
        return template.opsForHash().values(HASH_KEY);
    }

    public Student getStudentId(String id){

        return (Student) template.opsForHash().get(HASH_KEY,id);

    }

    public String deleteStudent(String id){

        try{

            template.opsForHash().delete(HASH_KEY, id);

            return "Student delete";

        }catch (Exception e){

            return e.toString();

        }

    }

}
