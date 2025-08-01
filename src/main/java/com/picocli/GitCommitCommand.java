package com.picocli;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
        name = "commit"
)
public class GitCommitCommand implements Runnable {

    @CommandLine.Option(names = {"-m", "--message"})
    private String message;

    @Override
    public void run() {
        System.out.println("Committing files in the staging area, how wonderful?");
        if (message != null) {
            System.out.println("The commit message is " + message);
        }    }
}
