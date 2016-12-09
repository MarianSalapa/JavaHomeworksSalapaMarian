/*
 * Cars will implement first Class with status and behavious
 */
package carFactory;

/**
 * class implements attributes and behavior of a car
 *
 * @author MMM
 */
 class Car2 {

    //create enumaeratiom a new type in java
    public enum Color {
        WHITE, RED, GREEN, BLUE, MAGENTA, YELLOW, NONE
    };
    private String name;
    private Color color;
    private short speed;

    Car2() {
        name = "Default car name";
        color = Color.GREEN;
        speed = 100;
    }

    Car2(String newName, Color newColor, short newSpeed) {
        name = newName;
        color = newColor;
        speed = newSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public void increaseSpeed(short newSpeed) {
        if (newSpeed > speed) {
            speed = newSpeed;
        } else {
            decreaseSpeed(newSpeed);
        }
    }

    /**
     * Test and if OK (new speed< actual speed) decrease the speed of car @param
     * newSpeed
     */
    public void decreaseSpeed(short newSpeed) {
        if (newSpeed <= speed) {
            speed = newSpeed;
        } else {
            increaseSpeed(newSpeed);
        }
    }

    public static Color colorOrdered(String colorOrdered) {
        colorOrdered = colorOrdered.toLowerCase();
        if (colorOrdered.equals("white")){
        return Color.WHITE;
        }
        else if (colorOrdered.equals("white")){
        return Color.WHITE;
        }
        else if (colorOrdered.equals("white")){
        return Color.WHITE;
        }
        else if (colorOrdered.equals("red")){
        return Color.RED;
        }
        else if (colorOrdered.equals("green")){
        return Color.GREEN;
        }
        else if (colorOrdered.equals("blue")){
        return Color.BLUE;
        }
        else if (colorOrdered.equals("magenta")){
        return Color.MAGENTA;
        }
        else if (colorOrdered.equals("yellow")){
        return Color.YELLOW;
        }
        else {return Color.NONE;}
                
    }   
}
