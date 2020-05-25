import java.util.Scanner;
/**
 * This program compares pairs of inequalities of length depending on how many pairs the user want to compare
 *
 * @author  Zeppelin Yin
 */
public class CompLen{
    public static void main(String[] args) {
        CompLen happyCoding = new CompLen();
        happyCoding.run();
    }

    /**
     * This method compares if the first inequality is bigger than the second
     * @param feet1 An int
     * @param feet2 An int
     * @param inch1 An float
     * @param inch2 An float
     * @param e An boolean
     */
    public boolean compareBig(int feet1, float inch1, int feet2, float inch2, boolean e){
        //Stop comparing the inch part if the feet part is already larger(Assume that inch part is always less than 12)
        if(feet1>feet2){
            return true;
        }
        //Compare the inch parts if the feet parts are equal
        else if(feet1==feet2){
            //if equal is considered true, compare if the inch parts are equal
            if(e == true&&inch1==inch2){
                return true;
            }
            if(inch1>inch2){
                return true;
            }
        }
        return false;
    } 

    /**
     * This method allows users to compare the inequalities as much as they wish to
     */
    public void run() {
        //The scanner reading the input of users
        Scanner reader = new Scanner(System.in);
        //The number of times of comparing
        int num;
        //Feet part of the first inequality of each pair
        int ineq1Feet;
        //Inch part of the first inequality of each pair
        float ineq1Inch;
        //Feet part of the second inequality of each pair
        int ineq2Feet;
        //Inch part of the second inequality of each pair
        float ineq2Inch;
        //Store the kind of comparison when user is asked to choose one
        String op;
        //Determine if to consider equal as true for compareBig method
        boolean e;
        //Read line from the input
        System.out.println("Enter the number of inequalities to compare: ");
        num = reader.nextInt();
        System.out.println("Number entered : " + num);
        for(int i =0; i<num; i++){
            //first number
            System.out.print("Enter Feet of the First Inequality(int) ");
            ineq1Feet = reader.nextInt();
            System.out.println();
            System.out.print("Enter Inch of the First Inequality(float) ");
            ineq1Inch = reader.nextFloat();
            System.out.println();
            //If the inch part is bigger than or equals 12
            //Convert the overflowing to feet part
            ineq1Feet+=(int)(ineq1Inch/12);
            ineq1Inch=ineq1Inch%12;

            //Choose operation
            System.out.println("Choose the operation");
            System.out.println("“gt” - means greater than");
            System.out.println("“lt” - means less than");
            System.out.println("“gte” - means greater than or equals");
            System.out.println("“lte” means less than or equals");
            op = reader.next();
            //Compare
            if(op.equals("gt")||op.equals("lt")||op.equals("lte")||op.equals("gte")){
                //second number
                System.out.print("Enter Feet of the Second Inequality(int) ");
                ineq2Feet = reader.nextInt();
                System.out.println();
                System.out.print("Enter Inch of the Second Inequality(float) ");
                ineq2Inch = reader.nextFloat();
                System.out.println();
                //If the inch part is bigger than or equals 12
                //Convert the overflowing to feet part
                ineq2Feet+=(ineq2Inch/12);
                ineq2Inch%=12;
                //Determine e according to the operation chosen
                if(op.equals("gte")||op.equals("lte")){
                    e = true;
                }
                else{
                    e=false;
                }
                //Compare the two lengths using compareBig
                //op determines the sequence of two lengths
                if(op.equals("gte")||op.equals("gt")){
                    System.out.println(compareBig(ineq1Feet,ineq1Inch,ineq2Feet,ineq2Inch,e));
                }
                else if(op.equals("lte")||op.equals("lt")){
                    System.out.println(compareBig(ineq2Feet,ineq2Inch,ineq1Feet,ineq1Inch,e));
                }
                //Notify the user that the next line is the next round
                System.out.println("Next Round");
            }
            //If the types words does not match the operation codes, go to this line and go to next round
            else{
                System.out.println("Wrong operation name, go to next round");
            }

        }
    }
}
