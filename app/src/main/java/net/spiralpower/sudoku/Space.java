package net.spiralpower.sudoku;

import java.util.ArrayList;

/**
 * Created by jordan on 5/4/15.
 */
public class Space
{

    private Board mParentBoard;

    private int mColumn;
    private int mRow;
    private int mSector;

    private int mOriginalValue;
    private int mPlayerValue;
    private ArrayList<Integer> mPlayerNotes;

    public Space(Board nParentBoard, int nColumn, int nRow)
    {
        this.mParentBoard = nParentBoard;
        this.setCoordinates(nColumn, nRow);

        this.mSector = Sector.fromCoordinates(this.getColumn(), this.getRow());

    }

    private boolean setCoordinates(int sColumn, int sRow)
    {
        return (this.setColumn(sColumn) && this.setRow(sRow));
    }

    private boolean setColumn(int sColumn)
    {
        if(sColumn > -1 && sColumn < 9)
        {
            this.mColumn = sColumn;
            return true;
        }
        return false;
    }

    public int getColumn()
    {
        return this.mColumn;
    }

    private boolean setRow(int sRow)
    {
        if(sRow > -1 && sRow < 9)
        {
            this.mRow = sRow;
            return true;
        }
        return false;
    }

    public int getRow()
    {
        return this.mRow;
    }

    private boolean setSector(int sSector)
    {
        if (sSector > 0 && sSector < 9)
        {
            this.mSector = sSector;
            return true;
        }
        return false;
    }

    public int getSector()
    {
        return this.mSector;
    }

}
