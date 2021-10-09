/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshopping;


public class CheckOutState implements ShoppingState {
    @Override
    public void doShopping(ShoppingContext context)
     {
         System.out.println("You are in Checkout state");
         context.setShoppingState(this);
     }
    @Override
     public String toString()
     {
         return "-->Checkout State<--\n";
     }
}
