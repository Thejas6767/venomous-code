class Pen {
    public String penColor;
    public Ink ink;

    public Pen(Ink ink) {
        this.penColor = ink.inkColor;
        this.ink = ink;
    }

    public void displayPen() {
        ink.inkDetails();
    }
}