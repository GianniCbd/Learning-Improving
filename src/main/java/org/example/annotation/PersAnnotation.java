package org.example.annotation;

import java.lang.reflect.Method;

public class PersAnnotation {

    public static void main(String[] args) {

Class<ForestLevel> obj = ForestLevel.class;

if( obj.isAnnotationPresent(GameInfo.class)){
    GameInfo gameInfo = obj.getAnnotation(GameInfo.class);
    System.out.println("Level Name: " + gameInfo.levelName());
    System.out.println("Difficulty: " + gameInfo.difficulty());
    System.out.println("Creator: " + gameInfo.creator());
}

        Method[] methods = obj.getDeclaredMethods();
        for(Method method : methods){
            if(method.isAnnotationPresent(GameInfo.class)){
        GameInfo gameInfo = method.getAnnotation(GameInfo.class);
                System.out.println("Level Name: " + gameInfo.levelName());
                System.out.println("Difficulty: " + gameInfo.difficulty());
                System.out.println("Creator: " + gameInfo.creator());
    }
}

    }
}
