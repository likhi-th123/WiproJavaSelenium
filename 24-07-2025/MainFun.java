package newpack;

public class MainFun {
    public static void main(String[] args) {
    	
    	//PhysicalProductOrder
        Order physicalOrder = new PhysicalProductOrder("ORD01");
        physicalOrder.process_order();
        physicalOrder.print_order_summary();
        
        System.out.println("-------------------------------");

        //DigitalProductOrder
        Order digitalOrder = new DigitalProductOrder("DGORD12");
        digitalOrder.process_order();
        digitalOrder.print_order_summary();
        
        System.out.println("-------------------------------");

        //ServiceOrder
        Order serviceOrder = new ServiceOrder("SRORD456");
        serviceOrder.process_order();
        serviceOrder.print_order_summary();
    }
}
