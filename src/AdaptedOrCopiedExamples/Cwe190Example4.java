package AdaptedOrCopiedExamples;

// adapted from example 4 of https://cwe.mitre.org/data/definitions/190.html

public class Cwe190Example4 {
    //@ subtype i16(short x)() = -32767 <= x && x <= 32767;

    // implementations should not matter
    /*@ i16 @*/ short getMonthlySales(int month) {return -1;}

    float calculateRevenueForQuarter(short quarterSold) {return -1;}

    void saveFirstQuarterRevenue(float revenue) {}

    int determineFirstQuarterRevenue() {

        // Variable for sales revenue for the quarter
        float quarterRevenue = 0.0f;

        /*@ i16 @*/ short JanSold = getMonthlySales(1); /* Get sales in January */
        /*@ i16 @*/ short FebSold = getMonthlySales(2); /* Get sales in February */
        /*@ i16 @*/ short MarSold = getMonthlySales(3); /* Get sales in March */

        // Calculate quarterly total
        /*@ i16 @*/ short quarterSold = (/*@ i16 @*/ short) (JanSold + FebSold + MarSold);

        // Calculate the total revenue for the quarter
        quarterRevenue = calculateRevenueForQuarter(quarterSold);

        saveFirstQuarterRevenue(quarterRevenue);

        return 0;
    }
}
