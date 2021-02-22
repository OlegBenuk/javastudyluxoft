package com.luxoft.jva001p1.basics.part2.xtasks;

import javax.swing.*;
import java.awt.*;

public class T5_TanksMoveToQuadrant extends JPanel
{
    int tankX = 0;
    int tankY = 0;

    void runTheGame()
    {
        moveToQuadrant("h3");
        moveToQuadrant("b6");
        moveToQuadrant("a3");
    }

    /**
     * One method call should smoothly move the tank one quadrant according to given direction.
     *
     * @param direction can be 1 - up, 2 - right, 3 - down, 4 - right
     */
    void move(int direction)
    {
        System.out.println(direction);
        switch (direction){
            case 1: moveUp(); break;
            case 2: moveRight(); break;
            case 3: moveDown(); break;
            case 4: moveLeft(); break;
        }
    }

    void moveRight()
    {
        int slow=0;
        while(slow++<64) {
            sleep(5);
            tankX += 1;
            repaint();
        }
    }

    void moveLeft()
    {
        int slow=0;
        while(slow++<64) {
            sleep(5);
            tankX -= 1;
            repaint();
        }
    }

    void moveUp()
    {
        int slow=0;
        while(slow++<64) {
            sleep(5);
            tankY -= 1;
            repaint();
        }
    }

    void moveDown()
    {
        int slow=0;
        while(slow++<64) {
            sleep(5);
            tankY += 1;
            repaint();
        }
    }

    void moveToQuadrant(String quadrant)
    {
        //h3
        System.out.println(quadrant);
        int targetX = quadrant.charAt(0)-'a'+1;
        System.out.println(targetX);
        int targetY = quadrant.charAt(1)-'1'+1;
        System.out.println(targetY);

        while(targetX!=(tankX/64)+1 && targetY!=(tankY/64)+1) {
            if (targetX < tankX / 64+1) {
                System.out.println(1 + "targetX  "+targetX+"  tankX "+ tankX);
                moveLeft();
            } else
            if (targetX > tankX / 64+1) {
                System.out.println(2+ "targetX  "+targetX+"  tankX "+ tankX);
                moveRight();
            }else
            if (targetY > tankY / 64+1) {
                System.out.println(3+ "targetY  "+targetY+"  tankY "+ tankY);
                moveDown();
            }else
            if (targetY < tankY / 64+1) {
                System.out.println(4+ "targetY  "+targetY+"  tankY "+ tankY);
                moveUp();
            }
            System.out.println("targetX!=tankX/64  "+targetX+" "+tankX/64 +"   targetY!=tankY/64) "+targetY+" "+tankY/64);
        }
    }


    // Magic bellow. Do not worry about this now, you will understand everything in this course.
    // Please concentrate on your tasks only.

    final int BF_WIDTH = 576;
    final int BF_HEIGHT = 576;

    public static void main(String[] args) throws Exception
    {
        T5_TanksMoveToQuadrant bf = new T5_TanksMoveToQuadrant();
        bf.runTheGame();
    }

    public T5_TanksMoveToQuadrant() throws Exception
    {
        JFrame frame = new JFrame("MOVE TANK FORWARD");
        frame.setLocation(500, 150);
        frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 22));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
    }

    void sleep(int millis)
    {
        try
        {
            Thread.sleep(millis);
        }
        catch (InterruptedException e)
        {

        }
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        paintBF(g);

        g.setColor(new Color(255, 0, 0));
        g.fillRect(tankX, tankY, 64, 64);
    }

    private void paintBF(Graphics g)
    {
        super.paintComponent(g);

        int i = 0;
        Color cc;
        for (int v = 0; v < 9; v++)
        {
            for (int h = 0; h < 9; h++)
            {
                if (i % 2 == 0)
                {
                    cc = new Color(252, 241, 177);
                }
                else
                {
                    cc = new Color(233, 243, 255);
                }
                i++;
                g.setColor(cc);
                g.fillRect(h * 64, v * 64, 64, 64);
            }
        }
    }

}
