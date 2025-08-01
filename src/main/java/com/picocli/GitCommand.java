package com.picocli;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
        subcommands = {
                GitAddCommand.class,
                GitCommitCommand.class
        }
)
public class GitCommand implements Runnable{

    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine(new GitCommand());
        commandLine.addSubcommand("add", new GitAddCommand());
        commandLine.addSubcommand("commit", new GitCommitCommand());

        commandLine.parseWithHandler(new CommandLine.RunLast(), args);
    }
    @Override
    public void run() {
        System.out.println("The popular git command");
    }
}
