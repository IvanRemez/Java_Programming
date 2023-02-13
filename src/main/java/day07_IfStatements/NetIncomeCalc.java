package day07_IfStatements;

public class NetIncomeCalc {

    public static void main(String[] args) {

        int salary = 115000;
        double taxRate = 0;
        boolean isMarried = true;

        if (salary >= 130000) {
            taxRate = 0.35;
        }
        if (salary >= 100000 && salary <= 129999) {
            taxRate = 0.30;
        }
        if (salary >= 80000 && salary <= 99999) {
            taxRate = 0.25;
        }
        if (salary <= 79000) { // if the salary is less than 80k
            taxRate = 0.20; // then the tax rate is 20%
        }
        if (isMarried) { // if the person is married
            taxRate -= 0.05; // tax is reduced by 5%
        }

        double totalTax = salary * taxRate;
        double netIncome = salary - totalTax;
        // double netIncome = salary * (1 - taxRate);

        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);

    }
}

/*
3. Create a class named NetIncomeCalc,
Write a program that can calculate the salary after tax based on the
following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129,999k
                        25% for salary of 80K to 99,999K
                        20% for salary of 79K or less
                in addition:
                	if the person is married, he/she will pay 5% less tax
 */