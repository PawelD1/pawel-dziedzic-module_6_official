package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;

public class OrderProcessor
{
    private static Map<String,Shop> warehouse=new HashMap<>();
    static{
        for(String product:ExtraFoodShop.getProductsNames())
        {
            warehouse.put(product,new ExtraFoodShop());
        }
        for(String product:GlutenFreeShop.getProductsNames())
        {
            warehouse.put(product,new GlutenFreeShop());
        }
        for(String product:HealthyShop.getProductsNames())
        {
            warehouse.put(product,new HealthyShop());
        }
    }
    private Shop findShop(Order order) throws ShopNotExistException
    {
        if(warehouse.containsKey(order.getName()))
        {
            return warehouse.get(order.getName());
        }
        else
            throw new ShopNotExistException("None of all ahop has got this product.");
    }
    public void process(Order order) throws ShopNotExistException
    {
        Shop shop=findShop(order);
        shop.process(order);

    }
}
