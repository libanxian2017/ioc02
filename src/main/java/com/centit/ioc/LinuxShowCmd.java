package com.centit.ioc;

public class LinuxShowCmd implements ShowCmd{
    @Override
    public String ShowCmd() {
        return "ls";
    }
}
