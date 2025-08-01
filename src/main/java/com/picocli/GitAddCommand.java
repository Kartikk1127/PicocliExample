package com.picocli;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
        name = "add"
)
public class GitAddCommand implements Runnable{

    @CommandLine.Option(names = {"-A", "--all"})
    private boolean allFiles;

    @Override
    public void run() {
        if (allFiles) {
            System.out.println("Adding all files to the staging area");
        } else {
            System.out.println("Adding some files to the staging area");
        }    }
}
