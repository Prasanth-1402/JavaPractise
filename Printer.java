import jdk.nashorn.api.tree.BreakTree;

import java.sql.SQLOutput;
import java.util.ArrayList;
public class Printer {
    private int tonerLevel;
    private int pagePrinted;
    private boolean duplex;
    public Printer(int tonerLevel, int pagePrinted, boolean duplex){
        if(tonerLevel > 0 && tonerLevel<=100)
              this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = 0;
        this.duplex = duplex;
        this.pagePrinted = pagePrinted;
    }


    public int printPage(){
        if(this.duplex)
         return pagePrinted+2;
        else
            return pagePrinted + 1;
    }
    public int AddToner(int tonerAmount){
        if(this.tonerLevel+ tonerAmount>100)
            return -1;
        else
            return this.tonerLevel+=tonerAmount;
    }
}
