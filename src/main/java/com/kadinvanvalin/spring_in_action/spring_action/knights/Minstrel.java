package com.kadinvanvalin.spring_in_action.spring_action.knights;

import java.io.PrintStream;

public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("Fa la la the knight is so brave");
    }

    public void singAfterQuest() {
        stream.println("Te he he the knight did embark on a quest");
    }
}
