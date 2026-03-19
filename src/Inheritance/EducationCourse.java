package com.gla.Inheritance;
class Course{
    String coursename;
    int duration;
    void di(){
        System.out.println(coursename);
        System.out.println(duration);
    }
}
class OnlineCourse extends Course{
    String Platform;
    String IsRecorded;
    void dis(){
        System.out.println(Platform+" "+IsRecorded);
    }
}
class PaidOnlineCourse extends OnlineCourse{
    int fee;
    int discount;
    void display(){
        System.out.println(discount+" "+discount);
    }
}
public class EducationCourse {
    static void main(String[] args) {
    PaidOnlineCourse p=new PaidOnlineCourse();
    p.di();
    p.dis();
    p.display();
    }
}
