/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshopping;

public class OnlineShopping {

    public static void main(String[] args) {
        ShoppingContext context=new ShoppingContext();
        LoginState loginstate=new LoginState();
        loginstate.doShopping(context);
        System.out.println(context.getShoppingState().toString()+"\n");
        
        ProductSearchState productsearchstate=new ProductSearchState();
        productsearchstate.doShopping(context);
        System.out.println(context.getShoppingState().toString()+"\n");
        
        CheckOutState checkoutstate=new CheckOutState();
        checkoutstate.doShopping(context);
        System.out.println(context.getShoppingState().toString()+"\n");
        
        PaymentState paymentstate=new PaymentState();
        paymentstate.doShopping(context);
        System.out.println(context.getShoppingState().toString()+"\n");
        
        OrderCompleteState ordercompletestate=new OrderCompleteState();
        ordercompletestate.setOrderID(1234).setTotalAmount(2525.75);
        ordercompletestate.doShopping(context);
        System.out.println(context.getShoppingState().toString()+"\n");
    }
    
}
