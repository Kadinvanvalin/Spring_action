package com.kadinvanvalin.spring_in_action.spring_action.knights;
import java.io.PrintStream;

public class SlayDragonQuest implements Quest{

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }

    public void embark(){
        stream.println("Embarking on Quest to slay Dragon!");
    }
}
