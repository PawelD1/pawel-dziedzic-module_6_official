package com.kodilla.spring.calculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator
{
    private final Display display;
    public Calculator(final Display display)
    {
        this.display=display;
    }
    public double add(double a, double b)
    {
        display.displayValue(a+b);
        return a+b;
    }
    public double sub(double a, double b)
    {
        display.displayValue(a-b);
        return a-b;
    }
    public double mul(double a, double b)
    {
        display.displayValue(a*b);
        return a*b;
    }
    public double div(double a, double b)
    {
        if(b!=0)
        {
            display.displayValue(a/b);
            return a/b;
        }
        else
        {
            display.displayValue(0);
            return 0.0;
        }
    }
}
