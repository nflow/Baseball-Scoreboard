package at.nwork;


public class Color {

    private static final String HEX_REGEX = "^((0x){0,1}|#{0,1})([0-9A-F]{8}|[0-9A-F]{6})$";

    private int r;
    private int g;
    private int b;

    public Color(int r, int g, int b) {
        this.setRed(r);
        this.setGreen(g);
        this.setBlue(b);
    }

    public int[] getColor() {
        return new int[] {getRed(), getGreen(), getBlue()};
    }

    public int getRed() {
        return r;
    }

    public void setRed(int r) {
        this.r = r;
    }

    public int getGreen() {
        return g;
    }

    public void setGreen(int g) {
        this.g = g;
    }

    public int getBlue() {
        return b;
    }

    public void setBlue(int b) {
        this.b = b;
    }
}
