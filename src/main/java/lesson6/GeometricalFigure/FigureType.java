package main.java.lesson6.GeometricalFigure;

public enum FigureType {
    CIRCLE(true), RECTANGLE(false), SQUARE(false);

    public boolean round;

    FigureType(boolean round) {
        this.round = round;
    }

    public boolean isRound() {
        return round;
    }
}
