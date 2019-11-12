package com.training.assignments;

import com.training.assignments.exception.InvalidInputException;

public class CalculateDiscount {

	/*
	 * Calculating 35% discount and giving new price
	 */
	public static double calculateDiscount(double price) throws InvalidInputException
    {
        if(price<=0)
        {
            throw new InvalidInputException("Price should be greater than zero");
        }
        double discount=price*35/100;
        
        double newItemPrice=price - discount;
        return newItemPrice;
        
        
                
    }
}
