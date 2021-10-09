/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshopping;

public class ShoppingContext {
    private ShoppingState state;
    public ShoppingContext()
    {
        state=null;
    }
    public void setShoppingState(ShoppingState state)
    {
        this.state=state;
    }
    public ShoppingState getShoppingState()
    {
        return state;
    }

  
    
}
