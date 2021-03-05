package tankinobjects;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BattleField extends JPanel {
    private int xTank;
    private int yTank;
    private int xBullet;
    private int yBullet;
    private int speedTank;
    private int speedBullet;
    public static final int FIELD_WIDTH = 576;
    public static final int FIELD_HEIGHT = 576;
    public static final int CELL_WIDTH = 64;
    public static final int CELL_HEIGHT = 64;

//
//    @Override
//    protected void paintComponent(Graphics g)
//    {
//        paintBF(g);
//
//        g.setColor(Color.GREEN);
//
//        for (String point : valid)
//        {
//            g.fillOval(Integer.parseInt(point.split("_")[0]) - 4, Integer.parseInt(point.split("_")[1]) - 4, 7, 7);
//        }
//
//        g.setColor(Color.RED);
//
//        for (String point : invalid)
//        {
//            g.fillOval(Integer.parseInt(point.split("_")[0]) - 4, Integer.parseInt(point.split("_")[1]) - 4, 7, 7);
//        }
//    }
//
//    private void paintBF(Graphics g)
//    {
//        super.paintComponent(g);
//
//        int i = 0;
//        Color cc;
//        for (int v = 0; v < 9; v++)
//        {
//            for (int h = 0; h < 9; h++)
//            {
//                if (i % 2 == 0)
//                {
//                    cc = Color.BLACK;
//                }
//                else
//                {
//                    cc = Color.WHITE;
//                }
//                i++;
//                g.setColor(cc);
//                g.fillRect(h * 64, v * 64, 64, 64);
//            }
//        }
//
//        g.drawString("A", 25, 590);
//        g.drawString("B", 64 + 25, 590);
//        g.drawString("C", 2 * 64 + 25, 590);
//        g.drawString("D", 3 * 64 + 25, 590);
//        g.drawString("E", 4 * 64 + 25, 590);
//        g.drawString("F", 5 * 64 + 25, 590);
//        g.drawString("G", 6 * 64 + 25, 590);
//        g.drawString("H", 7 * 64 + 25, 590);
//        g.drawString("I", 8 * 64 + 25, 590);
//
//        g.drawString("1", 583, 25);
//        g.drawString("2", 583, 64 + 25);
//        g.drawString("3", 583, 2 * 64 + 25);
//        g.drawString("4", 583, 3 * 64 + 25);
//        g.drawString("5", 583, 4 * 64 + 25);
//        g.drawString("6", 583, 5 * 64 + 25);
//        g.drawString("7", 583, 6 * 64 + 25);
//        g.drawString("8", 583, 7 * 64 + 25);
//        g.drawString("9", 583, 8 * 64 + 25);
//    }
}
