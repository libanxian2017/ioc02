package com.centit.ioc;

public class WindowsShowCmd implements ShowCmd{
    @Override
    public String ShowCmd() {
        return "dir";
    }
}
