package com.codeminders.ardrone.commands;

public class TakeOffCommand extends RefCommand
{
    public TakeOffCommand()
    {
        value |= (1<<9);
    }
}