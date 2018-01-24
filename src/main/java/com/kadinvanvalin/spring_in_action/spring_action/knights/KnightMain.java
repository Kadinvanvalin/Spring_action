package com.kadinvanvalin.spring_in_action.spring_action.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
