    
    /**
     * A shop simulation
     *
     * @author Zeppelin
     * @version 0.114514
     */
    public class Shop
    {
        //startTime=0 means 11am;
        Customers c;
        int time;
        int servCus=0;
        float totalCus=0;
        int totalWT =0;
        /**
         * Constructor for objects of class Shop
         */
        public Shop(Customers c,int startTime)
        {
            this.c=c;
            time =startTime;
        }
    
        /**
         * shop simulation
         *
         * @return    The amount of customers served and average waiting time
         */
        public String run()
        {
            //First determine if the customer has given up
            //Then edit the current time and change the status of the current customer
            while(!c.isEmpty()){
                Customer cT=c.pop();
                totalCus++;
                if(time<(cT.arrival+cT.giveUpTime)){
                    cT.served=true;
                    cT.left=true;
                    totalWT+=time-cT.arrival;
                    servCus++;
                    time+=cT.orderingTime;
                }
                else{
                    cT.left=true;
                    totalWT+=cT.giveUpTime;  
                }
            }
            //Display the output
            String output = "";
            output+=servCus;
        output+=", ";
        System.out.println(totalCus);
        output+=String.format("%.2f",totalWT/totalCus);
        return output;
    }
}
