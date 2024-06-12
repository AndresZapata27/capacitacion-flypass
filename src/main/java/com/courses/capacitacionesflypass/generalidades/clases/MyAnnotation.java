package com.courses.capacitacionesflypass.generalidades.clases;


public @interface MyAnnotation {

    String value();
    int count() default 1;

}












@MyAnnotation(value = "example", count = 2)
class AnnotatedClass {

    @MyAnnotation(value = "example", count = 2)
    int atribute = 7;

    @MyAnnotation(value = "example", count = 2)
    void method(){

    }
}
