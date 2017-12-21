package com.company;

public class Calculator {
    private String mColor;
    private boolean mPower;

    public Calculator(String color) {
        mColor = color;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }

    public boolean checkPower() {
        return mPower;
    }

    public void setOn() {
        mPower = true;
    }

    public void setOff() {
        mPower= false;
    }


    public int addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int longDivision(int number1, int number2) {
        return number1 + number2 + 1;
    }
}
