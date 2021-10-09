/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshopping;


public class OrderCompleteState implements ShoppingState {
    private int orderID;
    private double totalAmount;
    public OrderCompleteState setOrderID(int orderID)
    {
        this.orderID=orderID;
        return this;
    }
    public OrderCompleteState setTotalAmount(double totalAmount)
    {
        this.totalAmount=totalAmount;
        return this;
    }
    @Override
    public void doShopping(ShoppingContext context)
     {
         System.out.println("You are in Order Completed state");
         context.setShoppingState(this);
     }
    @Override
     public String toString()
     {
         return "-->Order Completed State<--\n,OrderID="+orderID+",\nTotal Amount="+totalAmount;
     }   
}
