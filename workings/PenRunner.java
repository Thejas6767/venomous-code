class PenRunner {
    public static void main(String[] args) {
        Ink ink = new Ink("Blue");
        Pen pen = new Pen(ink);

        pen.displayPen();
    }
}
