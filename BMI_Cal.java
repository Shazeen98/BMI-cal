import java.util.Scanner;
public class BMI_Cal {
    public static void main(String[] args)
    {
        Scanner conver = new Scanner(System.in);


        Double BMI,weight,height,inch,roundBMI;
        /*BMI=BMI value
        weight=entered weight in pounds
        height=height in meters
        inch=entered weight in inches
        kg=the pounds in kilograms
        roundBMI=The BMI value have been rounded off to two decimal places
         */


             try
        {

            System.out.print("Enter Your Weight (In pounds): ");
            weight = conver.nextDouble();


            System.out.print("Enter Your Height(In Inches): ");
            inch = conver.nextDouble();


        height=inch*0.0254;
            Double kg = weight * 0.4535;


            BMI=kg/(height*height);
        roundBMI=Math.round(BMI*100.0)/100.0;

        System.out.println("your BMI Is "+roundBMI);

            if(BMI<=18.5)
            System.out.println("Under Weight ");


            else if(BMI>=30.0)
            System.out.println("Obese");


             else if(BMI>=25.00)
            System.out.println("over Weight");


            else if(BMI>=18.5)
            System.out.println("normal Weight");


            else
            System.out.println("Error");
        } catch (Exception e) {
                 System.out.print("Please Enter An Integer ");

             }
        }
    }

