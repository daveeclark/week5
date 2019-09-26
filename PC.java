package com.week5;

public class PC {
    private Case aCase;
    private MotherBoard motherboard;
    private Monitor monitor;

    public PC(Case aCase, MotherBoard motherboard, Monitor monitor) {
        this.aCase=aCase;
        this.motherboard=motherboard;
        this.monitor=monitor;
    }

    public PC() {

    }

    private Case getaCase() {
        return aCase;
    }

    private MotherBoard getMotherboard() {
        return motherboard;
    }

    private Monitor getMonitor() {
        return monitor;
    }

        private void drawLogo(){
            monitor.drawPixelAt(120,60,"silver");
    }


    public void description(){
        System.out.println(aCase);
        System.out.println(monitor);
        System.out.println(motherboard);
    }

    public void powerUp(){
        aCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("OSX is not loading...");
    }

    private String loadProgram() {
        return "OSX 12 is now loading...";
    }

    private char pressPowerButton() {
        return 0;
    }

    @Override
    public String toString() {
        return "PC{" +
                "aCase=" + aCase +
                ", motherboard=" + motherboard +
                ", monitor=" + monitor +
                '}';
    }
}
