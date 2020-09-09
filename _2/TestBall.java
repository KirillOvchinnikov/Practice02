package ru.mirea.Practice02._2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(5.1, 4.4);
        Ball ball2 = new Ball();
        ball2.setX(2.1);
        ball2.setY(1.3);
        ball2.setXY(5.6,5.6);
        System.out.println(ball);
        System.out.println(ball2);
    }
}
