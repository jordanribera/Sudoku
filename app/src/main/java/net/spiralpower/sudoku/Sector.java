package net.spiralpower.sudoku;

/**
 * Created by jordan on 5/4/15.
 */
public class Sector
{

    public static final int NORTH = 0x00;
    public static final int NORTHEAST = 0x01;
    public static final int EAST = 0x02;
    public static final int SOUTHEAST = 0x03;
    public static final int SOUTH = 0x04;
    public static final int SOUTHWEST = 0x05;
    public static final int WEST = 0x06;
    public static final int NORTHWEST = 0x07;
    public static final int CENTER = 0x08;

    public static int fromCoordinates(int gColumn, int gRow)
    {
        int output = 0;
        //determine sector
        switch (gColumn)
        {
            case 0:
            case 1:
            case 2:
                //western column
                switch(gRow)
                {
                    case 0:
                    case 1:
                    case 2:
                        //northern row
                        output = Sector.NORTHWEST;
                        break;

                    case 3:
                    case 4:
                    case 5:
                        //central row
                        output = Sector.WEST;
                        break;

                    case 6:
                    case 7:
                    case 8:
                        //southern row
                        output = Sector.SOUTHWEST;
                        break;
                }
                break;

            case 3:
            case 4:
            case 5:
                //central column
                switch(gRow)
                {
                    case 0:
                    case 1:
                    case 2:
                        //northern row
                        output = Sector.NORTH;
                    break;

                    case 3:
                    case 4:
                    case 5:
                        //central row
                        output = Sector.CENTER;
                    break;

                    case 6:
                    case 7:
                    case 8:
                        //southern row
                        output = Sector.SOUTH;
                    break;
                }
                break;

            case 6:
            case 7:
            case 8:
                //eastern column
                switch(gRow)
                {
                    case 0:
                    case 1:
                    case 2:
                        //northern row
                        output = Sector.NORTHEAST;
                    break;

                    case 3:
                    case 4:
                    case 5:
                        //central row
                        output = Sector.EAST;
                    break;

                    case 6:
                    case 7:
                    case 8:
                        //southern row
                        output = Sector.SOUTHEAST;
                    break;
                }
                break;
        }
        return output;
    }

}
