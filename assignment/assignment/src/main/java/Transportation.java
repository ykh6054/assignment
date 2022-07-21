public class Transportation {
    String number;
    int gas;
    int speed;
    int speedChange;
    int maxPass;
    int x,y;

    public Transportation(String number, int gas, int speed, int speedChange, int maxPass, int x, int y) {
        this.number = number;
        this.gas = gas;
        this.speed = speed;
        this.speedChange = speedChange;
        this.maxPass = maxPass;
        this.x = x;
        this.y = y;


    }

    public transportation(String number, int gas, int speed) {
        this.(number,gas,speed, x:0, y:0);
    }

    public String getLoccation(){
        return "("+x+","+y+")";
    }
    protected void printWhoAmI(){"My number is "+number+""

    }
}