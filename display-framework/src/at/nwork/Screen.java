package at.nwork;

public class Screen {
    private int width;
    private int height;

    private byte[] screen;

    public Screen(int width, int height) {
        this.setWidth(width);
        this.setHeight(height);
        screen = new byte[width * height * 3];
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public byte[] getScreen() {
        return screen;
    }

    public void setPixel(int x, int y, Color color) {
        int offset = y * width * 3 + x * 3;
        screen[offset + 0] = (byte)color.getRed();
        screen[offset + 1] = (byte)color.getGreen();
        screen[offset + 2] = (byte)color.getBlue();
    }

    public void clear() {
        screen = new byte[width * height * 3];
    }

    public Color getPixel(int x, int y) {
        int offset = y * width * 3 + x * 3;
        return new Color(screen[offset + 0],screen[offset + 1],screen[offset + 2]);
    }
}
