package com.testng;

import java.util.Scanner;

public class BillPrint
{
   double cost = 0.00;
   double s = 100.0;
   int n = 100;
   int z = 0;
   double discount = 0;
   String name[] = new String[n];
   double price[] = new double[n];

   public static void main(String args[]) 
   {
       Scanner s = new Scanner(System. in );
       boolean exit = false;
           System.out.println("########################");
           System.out.println("####WELCOME TO SHISHO####");
           System.out.println("#########################");
           System.out.println("SHOP NOW!!!Get more discouts every month...trendy,classy and totally your style");
           System.out.println("All Your Favourite Brands Are Here Now...");
           System.out.println("The brands we have here are -FOREVER 21,URBAN OUTFITTERS,MAX,NIKE,PUMA,BRANDY MELVILLE,ZARA,H&M,ADIDAS");
           Shisho ob = new Shisho();
           do {
               System.out.println("1 for women's clothes");
               System.out.println("2 for men's clothes");
               System.out.println("3 for kids clothes");
               System.out.println("4 for shoes");
               System.out.println("5 for exiting of the site");
               
               System.out.println("enter your choice");
               try {
                 int choice = s.nextInt();
                 switch (choice) {
                   case 1:
                       ob.Women();
                       break;
                   case 2:
                       ob.Men();
                       break;
                   case 3:
                       ob.kids();
                       break;
                   case 4:
                       ob.Shoes();
                       break;
                   case 5:
                     System.out.println("Thank You for visiting SHISHO.");
                     System.out.println("The Bill Is");
                    // System.out.println(name[z]+"  "+cost);
                     exit = true;
                     break;
                   default:
                       System.out.println("check your choice");
                       break;
                   }
               } catch (Exception e) {
                 s.nextLine();
                 System.out.println("Please enter a valid choice as the choice entered is not valid");
               }
               
           } while (exit == false );
   }
   public void Women() 
   {
       Scanner s = new Scanner(System. in );
       System.out.println("welcome to the women's section");
       System.out.println("we provide a huge collection of your choices");

       System.out.println("Kindly enter the  numbers given according to your choice");

       System.out.println("Enter 1:ETHINIC WEAR");
       System.out.println("Enter 2:CASUAL WEAR");
       System.out.println("Enter 3:PARTY WEAR");
       System.out.print("Extremely delighted to to announce that!!!!!!");
       System.out.println("We provide 15% discount in the Casual Wear section");
       int choice1 = s.nextInt();
       switch (choice1) {
       case 1:
           System.out.println(" Ethinic Section!");
           System.out.println("All sizes from S to XL are available");
           System.out.println("enter 1,2,3,4,5 according to your choice");
           System.out.println("Enter 1 for Sarees");
           System.out.println("Enter 2 for Patialas");
           System.out.println("Enter 3 for Plazos");
           System.out.println("Enter 4 for Kurtis");
           System.out.println("Enter 5 for Ghagras");
           int c1 = s.nextInt();
           if (c1 == 1)
           {
               name[z] = "Saree";
               price[z] = 900;
               z++;
               System.out.println("The Cost of Your Choice is Rs 900");
               cost = cost + 900;
           } 
           else if (c1 == 2)
           {
               name[z] = "Patialas";
               price[z] = 500;
               z++;
               System.out.println("The Cost of Your Choice is Rs 500");
               cost = cost + 500;

           } 
           else if (c1 == 3)
           {
               name[z] = "Plazos";
               price[z] = 400;
               z++;
               System.out.println("The Cost of Your Choice is Rs 400");
               cost = cost + 400;
           } 
           else if (c1 == 4) 
           {
               name[z] = "Kurtis";
               price[z] = 100;
               z++;
               System.out.println("The Cost Of Your Choice is Rs 100");
               cost = cost + 100;
           }
           else if (c1 == 5) 
           {
               name[z] = "Ghagras";
               price[z] = 500;
               z++;
               System.out.println("The Cost Of Your Choice is Rs 500");
               cost = cost + 500;
           }
           else
           System.out.println("not aplicable");
           break;
       case 2:
           System.out.println("yay!!!ready to chill in your casuals?!!");
           System.out.println("the latest designs are uppp!!!");
           System.out.println("DISCOUNT OF 15% ON THIS SECTION!!");
           System.out.println("All the designs from XS to XXL are available");
           System.out.println("Enter the no.s according to your choice");
           System.out.println("Enter 1 for Shirts and Tees");
           System.out.println("Enter 2 for Skirts and Shorts");
           System.out.println("Enter 3 for Jeans");
           System.out.println("Enter 4 for Hoodies and Jackets");
           int ch = s.nextInt();
           if (ch == 1) 
           {
               discount = 300 - (0.15 * 300);
               name[z] = "Shirts and Tees";
               price[z] = discount;
               z++;
               System.out.println("The Cost Of the Item is Rs 300 but after discount is" + discount);
               cost = cost + discount;
           }
           else if (ch == 2)
           {
               discount = 500 - (0.15 * 500);
               name[z] = "Skirts and Shorts";
               price[z] = discount;
               z++;
               System.out.println("The Cost Of the Item is Rs 500 but after discount is" + discount);
               cost = cost + discount;
           }
           else if (ch == 3)
           {
               discount = 700 - (0.15 * 700);
               name[z] = "Jeans";
               price[z] = discount;
               z++;
               System.out.println("The Cost Of the Item is Rs 700 but after discount is" + discount);
               cost = cost + discount;
           } 
           else if (ch == 4)
           {
               discount = 400 - (0.15 * 400);
               name[z] = "Hoodies and Jackets";
               price[z] = discount;
               z++;
               System.out.println("The Cost Of the Item is Rs 400 but after discount is" + discount);
               cost = cost + discount;
           } 
           else
           System.out.println("not applicable");break;
       case 3:
           System.out.println("Party and Western wear.....get ready to PARTY!!!!...");
           System.out.println("All sizes between S and XL are available");
           System.out.println("Enter the no. according to your choice");
           System.out.println("Enter 1 for denim");
           System.out.println("Enter 2 for Fancy Tops");
           System.out.println("Enter 3 for Dresses");
           int c2 = s.nextInt();
           if (c2 == 1) 
           {
               name[z] = "Denim";
               price[z] = 600;
               z++;
               System.out.println("The cost of the item is Rs 600");
               cost = cost + 600;
           } 
           else if (c2 == 2) 
           {
               name[z] = "Fancy Tops";
               price[z] = 400;
               z++;
               System.out.println("The cost of the item is Rs 400");
               cost = cost + 400;
           } 
           else if (c2 == 3) 
           {
               name[z] = "Dresses";
               price[z] = 500;
               z++;
               System.out.println("The cost of the item is Rs 500");
               cost = cost + 500;
           } 
           else 
           {
               System.out.println("not applicable");
           }

           break;
       default:
           System.out.println("not applicable");
       }
   }

   public void Men() 
   {

       Scanner s = new Scanner(System. in );
       System.out.println("WELCOME TO MEN'S SECTION");
       System.out.println("Enter the no.s according to your choice");
       System.out.println("Enter 1 for Ethnic Wear");
       System.out.println("Enter 2 for Casual Wear");
       System.out.println("Enter 3 for Formal Wear");
       System.out.println("There is a 30% discount on Ethnic Wears!!");
       int choice1 = s.nextInt();
       switch (choice1) 
       {
       case 1:
           System.out.println("Ethnic Section!!!");
           System.out.println("All sizes from S to XL are available");
           System.out.println("Enter the no.s according to your choice");
           System.out.println("Enter 1 for Kurtas");
           System.out.println("Enter 2  for Sherwanis");
           int c1 = s.nextInt();
           if (c1 == 1) 
           {
               discount = 700 - (0.30 * 700);
               cost = cost + discount;
               name[z] = "Kurtas";
               price[z] = discount;
               z++;
               System.out.println("The cost is Rs 700 but after discount" + discount);
           }
           else if (c1 == 2) 
           {
               discount = 1000 - (0.30 * 1000);
               cost = cost + discount;
               name[z] = "Sherwanis";
               price[z] = discount;
               z++;
               System.out.println("The cost is Rs 800 but after discount" + discount);
           }
           else 
           System.out.println("not valid");
           break;
       case 2:
           System.out.println("Chill in your casuals");
           System.out.println("All sizes from S to XL are available");
           System.out.println("Enter the no. according to your choice");
           System.out.println("Enter 1 for Casual T-shirts and shirts");
           System.out.println("Enter 2 for Casual Jeans");
           System.out.println("Enter 3 for Hoodies and Jackets");
           System.out.println("Enter 4 for Sweatpants and Shorts");
           c1 = s.nextInt();
           if (c1 == 1) 
           {
               name[z] = "Casual T-shirts and shirts";
               price[z] = 200;
               z++;
               System.out.println("The cost for the items is Rs 200");
               cost = cost + 200;
           }
           else if (c1 == 2) 
           {
               name[z] = "Casual Jeans";
               price[z] = 900;
               z++;
               System.out.println("The cost for the items is Rs 900");
               cost = cost + 900;
           }
           else if (c1 == 3) 
           {
               name[z] = "Hoodies and Jackets";
               price[z] = 440;
               z++;
               System.out.println("The Cost of the items is Rs 400");
               cost = cost + 400;
           } 
           else if (c1 == 4) 
           {
               name[z] = "Sweatpants and Shorts";
               price[z] = 300;
               z++;
               System.out.println("The Cost of the items is Rs 300");
               cost = cost + 300;
           } 
           else 
           System.out.println("Not valid");
           break;
       case 3:
           System.out.println("FORMALS for the run.....");
           System.out.println("All sizes from S to XL are available");
           System.out.println("enter the no. according to your choice");
           System.out.println("Enter 1 for Formal shirts");
           System.out.println("Enter 2 for Formal pants");
           System.out.println("Enter 3 for Coats and Blazers");
           System.out.println("Enter 4 for Suits");
           c1 = s.nextInt();
           if (c1 == 1) 
           {
               name[z] = "Formal shirts";
               price[z] = 600;
               z++;
               cost = cost + 600;
               System.out.println("The Cost Of The Item is Rs 600");
           } 
           else if (c1 == 2) 
           {
               name[z] = "Formal Pants";
               price[z] = 1000;
               z++;
               cost = cost + 1000;
               System.out.println("The Cost Of The Item is Rs 1000");
           } 
           else if (c1 == 3) 
           {
               name[z] = "Coats and Blazers";
               price[z] = 750;
               z++;
               cost = cost + 750;
               System.out.println("The Cost Of The Items is Rs 750");
           }
           else if (c1 == 4)
           {
               name[z] = "Suits";
               price[z] = 1500;
               z++;
               cost = cost + 1500;
               System.out.println("The Cost Items is Rs 1500");
           } 
           else 
           System.out.println("not valid");
           break;
       default:
           System.out.println("Not Valid");
       }
   }

   public void kids() 
   {
       Scanner s = new Scanner(System. in );
       System.out.println("Yay!!KID'S section");
       System.out.println("The categories in the clothes are:");
       System.out.println("Enter 1 for  0-12 months infants");
       System.out.println("Enter 2 for 1-6 years kids");
       System.out.println("Enter 3 for 7-14 years kids");
       System.out.println("enter the no. according to your choice");
       int choice1 = s.nextInt();
       switch (choice1) 
       {
       case 1:
           System.out.println("This the infant sections for your tots");
           System.out.println("Enter thr gender of the child-female or male");
           String gender = s.next();
           if (gender.equalsIgnoreCase("male")) 
           {
               System.out.println("Enter 1 for Pants and Shorts");
               System.out.println("Enter 2 for Shirts and and Jackets");
               int c1 = s.nextInt();
               if (c1 == 1) 
               {
                   name[z] = "Pants and Shorts";
                   price[z] = 450;
                   z++;
                   cost = cost + 450;
                   System.out.println("The Cost Of The Items is Rs 450");
               } 
               else if (c1 == 2) 
               {
                   name[z] = "Shirts and Jackets";
                   price[z] = 660;
                   z++;
                   cost = cost + 660;
                   System.out.println("The Cost Of The Items is Rs 660");
               }
               else
               System.out.println("Not valid");
           }
           else if (gender.equalsIgnoreCase("female")) 
           {
               System.out.println("Enter 1 for Skirts and Shorts");
               System.out.println("Enter 2 for T shirts");
               System.out.println("Enter 3 for Frocks/dresses");
               int c1 = s.nextInt();
               if (c1 == 1) 
               {
                   name[z] = "Skirts and Shorts";
                   price[z] = 550;
                   z++;
                   cost = cost + 550;
                   System.out.println("The Cost of the Items is Rs 550");
               } 
               else if (c1 == 2) 
               {
                   name[z] = "T shirts";
                   price[z] = 270;
                   z++;
                   cost = cost + 270;
                   System.out.println("The Cost Of The Items is Rs 270");
               } 
               else if (c1 == 3) 
               {
                   name[z] = "Frocks";
                   price[z] = 800;
                   z++;
                   cost = cost + 800;
                   System.out.println("The Cost Of The Items is Rs 800");
               }
               else 
               System.out.println("Not valid");
           }
           else 
           System.out.println("Not valid");
           break;
       case 2:
           System.out.println("All ages from 1 to 6 are available");
           System.out.println("Enter the gender");
           gender = s.next();
           if (gender.equalsIgnoreCase("female")) 
           {
               System.out.println("Choose the clothes according to the size");
               System.out.println("Enter 1 for Skirts/Shorts/Pants/Jeans");
               System.out.println("Enter 2 for T shirts/Shirts");
               System.out.println("Enter 3 for dresses");
               System.out.println("Enter 4 for Ghagras");
               int c1 = s.nextInt();
               if (c1 == 1) 
               {
                   name[z] = "Skirts/Shorts/Pants/Jeans";
                   price[z] = 670;
                   z++;
                   cost = cost + 670;
                   System.out.println("The Cost Of The Items is Rs 670");
               }
               else if (c1 == 2)
               {
                   name[z] = "T shirts/Shirts";
                   price[z] = 300;
                   z++;
                   cost = cost + 300;
                   System.out.println("The Cost Of The Items is Rs 300");
               }
               else if (c1 == 3) 
               {
                   name[z] = "Dresses";
                   price[z] = 700;
                   z++;
                   cost = cost + 700;
                   System.out.println("The Cost Of The Items is Rs 700");
               }
               else if (c1 == 4) 
               {
                   name[z] = "Ghagras";
                   price[z] = 2000;
                   z++;
                   cost = cost + 2000;
                   System.out.println("The Cost Of The Items is Rs 2000");
               } 
               else 
               System.out.println("Not valid");
           } 
           else if (gender.equalsIgnoreCase("male")) 
           {
               System.out.println("Choose the clothes according to the sizes");
               System.out.println("Enter 1 for shirts/T shirts/Jackets/Hoodies");
               System.out.println("Enter 2 for Pants/Shorts/Jeans");
               System.out.println("Enter 3 for sherwanis and kurtas");
               int c1 = s.nextInt();
               if (c1 == 1) 
               {
                   name[z] = "Shirts/T shirts/jackets/Hoodies";
                   price[z] = 580;
                   z++;
                   cost = cost + 580;
                   System.out.println("The Cost Of The Items is Rs 580");
               } 
               else if (c1 == 2)
               {
                   name[z] = "Pants/Shorts/Jeans";
                   price[z] = 700;
                   z++;
                   cost = cost + 700;
                   System.out.println("The Cost Of the Items is Rs 700");
               } 
               else if (c1 == 3)
               {
                   name[z] = "Sherwanis and Kurtas";
                   price[z] = 440;
                   z++;
                   cost = cost + 440;
                   System.out.println("The Cost Of the Items is Rs 440");
               } 
               else
               {
                   System.out.println("not valid");
               }
           }
           break;
       case 3:
           System.out.println("The clothing is categorised between age group 7 to 14");
           System.out.println("Enter the gender");
           gender = s.next();
           if (gender.equalsIgnoreCase("female")) 
           {
               System.out.println("Choose the clothes accordimg to the sizes");
               System.out.println("Enter 1 for shirts and tops");
               System.out.println("Enter 2 for Skirts/Pants/Jeans");
               System.out.println("Enter 3 for Dresses");
               System.out.println("Enter 4 for Ghagras");
               int c1 = s.nextInt();
               if (c1 == 1) 
               {
                   name[z] = "Shirts and Tops";
                   price[z] = 350;
                   z++;
                   cost = cost + 350;
                   System.out.println("The Cost Of The Items is Rs 350");
               }
               else if (c1 == 2) 
               {
                   name[z] = "Skirts/Pants/Jeans";
                   price[z] = 900;
                   z++;
                   cost = cost + 900;
                   System.out.println("The Cost of the items is Rs 900");
               }
               else if (c1 == 3) 
               {
                   name[z] = "Dresses";
                   price[z] = 490;
                   z++;
                   cost = cost + 490;
                   System.out.println("The Cost Of The Items is Rs 490");
               }
               else if (c1 == 4)
               {
                   name[z] = "Ghagras";
                   price[z] = 1000;
                   z++;
                   cost = cost + 1000;
                   System.out.println("The Cost Of teh Items Is Rs 1000");
               } else System.out.println("Not valid");
           } 
           else if (gender.equalsIgnoreCase("male")) 
           {
               System.out.println("Kindly choose the clothes according to the size of the child");
               System.out.println("Enter 1 for shirts/T shirts");
               System.out.println("Enter 2 for Jeans/Shorts/Sweatpants");
               System.out.println("Enter 3 for Jackets/sweaters/hoodies");
               System.out.println("Enter 4 for Kurtas and Sherwanis");
               int c1 = s.nextInt();
               if (c1 == 1) 
               {
                   name[z] = "Shirts/T shirts";
                   price[z] = 200;
                   z++;
                   cost = cost + 200;
                   System.out.println("The Cost Of the Items is Rs 200");
               } 
               else if (c1 == 2)
               {
                   name[z] = "Jeans/Shorts/Sweatpants";
                   price[z] = 990;
                   z++;
                   cost = cost + 990;
                   System.out.println("The Cost Of The Items is Rs 990");
               }
               else if (c1 == 3)
               {
                   name[z] = "Jackets/Sweaters/Hoodies";
                   price[z] = 510;
                   z++;
                   cost = cost + 510;
                   System.out.println("The cost of The Items is Rs 510");
               } 
               else if (c1 == 4) 
               {
                   name[z] = "Kurtas and Sherwanis";
                   price[z] = 2000;
                   z++;
                   cost = cost + 2000;
                   System.out.println("The Cost Of The Item is Rs 2000");
               } else System.out.println("Not valid");
           }
           break;
       default:
           System.out.println("not valid");
       }
   }

   public void Shoes()
   {
       Scanner s = new Scanner(System. in );
       System.out.println("SHOES ARE TRENDING!!!!");
       System.out.println("Make sure to choose what you like in your size!!");
       System.out.println("Enter 1 for men's footwear");
       System.out.println("Enter 2 for women's footwear");
       int choice1 = s.nextInt();
       switch (choice1) 
       {
       case 1:
           System.out.println("MEN'S FOOTWEAR!!!");
           System.out.println("Make sure to choose the shoes depending on the size");
           System.out.println("Enter 1 for Sports Shoes");
           System.out.println("Enter 2 for formal shoes");
           System.out.println("Enter 3 for sandals and flip flops");
           int c1 = s.nextInt();

           if (c1 == 1)
           {
               name[z] = "Sports Shoes";
               price[z] = 1400;
               z++;
               System.out.println("The cost of the Sports shoes is Rs 1400");
               cost = cost + 1400;
           } 
           else if (c1 == 2) 
           {
               name[z] = "Formal Shoes";
               price[z] = 700;
               z++;
               System.out.println("The Cost Of Formal Shoes is Rs 700");
               cost = cost + 700;
           }
           else if (c1 == 3)
           {
               name[z] = "Sandals and FLip-flops";
               price[z] = 600;
               z++;
               System.out.println("The cost of Sandals and Flip-flops is Rs 600");
               cost = cost + 600;
               System.out.println("The cost of Sandals and flip-flops is Rs 600");
           } 
           else
           {
               System.out.println("not valid");
           }

           break;

       case 2:
           System.out.println("WOMEN'S FOOTWEAR");
           System.out.println("Choose the items according to the size");
           System.out.println("Enter 1 for flats and sneakers");
           System.out.println("Enter 2 for Sports shoes");
           System.out.println("Enter 3 for heels");
           System.out.println("Enter 4 for Leather boots");
           int c2 = s.nextInt();

           if (c2 == 1) 
           {
               name[z] = "Flats and Sneakers";
               price[z] = 900;
               z++;
               System.out.println("The cost of the Flats and Sneakers is Rs 900");
               cost = cost + 900;
           } 
           else if (c2 == 2) 
           {
               name[z] = "Sports Shoes";
               price[z] = 1600;
               z++;
               System.out.println("The Cost Of Sports Shoes is Rs 1600");
               cost = cost + 1600;
           }
           else if (c2 == 3) 
           {
               name[z] = "Heels";
               price[z] = 2500;
               z++;
               System.out.println("The Cost Of Heels is Rs 2500");
               cost = cost + 2500;
           }
           else if (c2 == 4) 
           {
               name[z] = "Leather Boots";
               price[z] = 3000;
               z++;
               System.out.println("The Cost Of Leather Boots is Rs 3000");
               cost = cost + 3000;
           }
           else
           {
               System.out.println("not valid");
           }
           break;
       default:
           System.out.println("Error");
       }
   }
}

      
