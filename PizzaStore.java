import java.io.*; 
class Pizza_Store
{ //Start of class Pizza_Store
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader buf=new BufferedReader(in);
    int type = 0;String city,local,sb,fhn;
    int pizz[]=new int[15];int pizzq[]=new int[15];int qua[]=new int[5];int crus[]=new int[15];String sizes[]=new String[15];int sides[]=new int[15];
    String name;int bev[]=new int[5];int bevq[]=new int[5];
    int crust;int stuff;int top[];int oven;int pie;String size;
    int n2 = (int)(Math.random()*100);int n3 = (int)(Math.random()*100);int n1 = (int)(Math.random()*100);
    boolean flag=false;String times="";
    public void Main() throws IOException
    {   //Start of Main()
        xyz:
        while(true)
        {  //Start of while loop xyz
            System.out.print("\u000c");
            while(true)
            {  //Start of inner while loop
                if(flag==false)
                {  //if statement to display 3 options of order type  
                    menu1();
                }
                else
                {  // if the person chooses option three and then wants to order then this will be shown
                    menu2();
                }
                try // try for checking whether there is a problem risen due to an exception
                {   
                    type = Integer.parseInt(buf.readLine());
                }
                catch(NumberFormatException obj) // catch for problem solving of exception (if any) which was detected in try
                {
                    System.out.println("Please enter only digits and that too from the options given to you ");
                    continue;
                }
                switch(type)
                {   //Start of switch for checking which type he chose
                    case 1 : System.out.println("So, You've chosen for a delivery option");
                             break;
                    case 2 : System.out.println("So, You've chosen for a take away");
                             break;
                    case 3 : if(flag==false)
                              {   //if statement to check if flag equals false
                                  System.out.println("So,you are just browsing");         
                                  break;
                              }
                              else if(flag==true)
                              {   //for checking if flag equals true
                                  System.out.println("Enter only from 1 and 2");
                                  continue;
                              }
                                 
                    default : if(flag==false)
                              {   //if statement to check if flag equals false
                                  System.out.println("You have to enter a '1', '2' or '3' according to your choice");         
                                  continue;
                              }
                              else if(flag==true)
                              {   //for checking if flag equals true
                                  System.out.println("Enter only from 1 and 2");
                                  continue;
                              }
                } // End of switch
                break;
            } // End of inner while loop
            if(type == 1)
            {
                while(true)
                {  //Start of while loop
                    System.out.println("Please enter your address as we proceed :");
                    System.out.println("Type City name");
                    while(true)
                    {  //Start of inner while loop
                        String city = (buf.readLine());
                        if(city.length()==0)
                        {  //if statement for checking that whether the user has entered nothing or not
                            System.out.println("Enter properly");
                            continue;
                        }
                        else
                        {
                            break;
                        }
                    }   //End of inner while loop
                    System.out.println("Type Locality");;
                    while(true)
                    {  //Start of inner while loop
                        String local = (buf.readLine());
                        if(local.length()==0)
                        {   //if statement for checking that whether the user has entered nothing or not
                            System.out.println("Enter properly");
                            continue;
                        }
                        else 
                        {
                            break;
                        }
                    }   //End of inner while loop
                    System.out.println("Type Street/Building name");
                    while(true)
                    {   //start of inner while loop
                        String sb = (buf.readLine());
                        if(sb.length()==0)
                        {   //if statement for checking that whether the user has entered nothing or not
                            System.out.println("Enter properly");
                            continue;
                        }
                        else
                        {
                            break;
                        }
                    }   //End of inner while loop
                    System.out.println("Type Flat/House No.");
                    while(true)
                    {   //Start of inner while loop
                        String fhn = (buf.readLine());
                        if(fhn.length()==0)
                        {   //if statement for checking that whether the user has entered nothing or not
                            System.out.println("Enter properly");
                            continue;
                        }
                        else
                        {
                            break;
                        }
                    }   //End of inner while loop
                    while(true)
                    {   //Start of inner while loop
                        try // try for checking whether there is a problem risen due to an exception
                        {
                            System.out.println("When do you want it to be delivered ?(According to 24 hour clock and only between 11 to 23)");
                            int time = Integer.parseInt(buf.readLine());
                            if(time >=11 && time <=23)
                            { //if for checking whether the time entered is correct 
                                times = times + time;
                                
                            }
                            else if(time <11 || time>23)
                            {  //for checking if user entered something wrong
                                System.out.println("Please enter between 11 and 23 only");
                                continue;
                            }
                            while(true)
                            {   //Start of while loop
                                System.out.println("Enter the minute number(Example:- 34,4,40,etc)");
                                int time1=Integer.parseInt(buf.readLine());
                                if(time1<0 || time>60)
                                {   //if statement to check if time1 is smaller than 0 or greater than 60
                                    System.out.println("Enter properly");
                                    continue;
                                }
                                if(time1>=0 && time1<10)
                                {
                                    times = times +":0"+time1;
                                    break;
                                }
                                else
                                {
                                    times = times +":"+time1;
                                    break;
                                }
                            }
                        }
                         catch(Exception obj)
                        {
                            System.out.println("Enter properly");
                        }
                        break;
                    } // End of inner while loop
                    break;
                }//End of while loop
            } 
            if(type == 2)
            {
                System.out.println("Please enter your address so,we can place your order in our franchise nearest to you");
                System.out.println("Type City name");
                while(true)
                {  //Start of inner while loop
                    String city = (buf.readLine());
                    if(city.length()==0)
                    {  //if statement for checking that whether the user has entered nothing or not
                        System.out.println("Enter properly");
                        continue;
                    }
                    else
                    {
                        break;
                    }
                }   //End of inner while loop
                System.out.println("Type Locality");
                while(true)
                {  //Start of inner while loop
                    String local = (buf.readLine());
                    if(local.length()==0)
                    {   //if statement for checking that whether the user has entered nothing or not
                        System.out.println("Enter properly");
                        continue;
                    }
                    else 
                    {
                        break;
                    }
                }   //End of inner while loop
                while(true)
                {   //Start of inner while loop
                    try // try for checking whether there is a problem risen due to an exception
                    {
                        System.out.println("When do you want it to be delivered ?(According to 24 hour clock and only between 11 to 23)");
                        int time = Integer.parseInt(buf.readLine());
                        if(time >=11 && time <=23)
                        { //if for checking whether the time entered is correct 
                            times = ""+time;
                            
                        }
                        else if(time <11 || time>23)
                        {  //for checking if user entered something wrong
                            System.out.println("Please enter between 11 and 23 only");
                            continue;
                        }
                        while(true)
                        {   //Start of while loop
                            System.out.println("Enter the minute number(Example:- 34,4,40,etc)");
                            int time1=Integer.parseInt(buf.readLine());
                            if(time1<0 || time>60)
                            {   //if statement to check if time1 is smaller than 0 or greater than 60
                                System.out.println("Enter properly");
                                continue;
                            }
                            if(time1>=0 && time1<10)
                            {
                                times = times +":0"+time1;
                                break;
                            }
                            else    
                            {
                                times = times +":"+time1;
                                break;
                            }
                        }
                    }
                    // }  //End of while loop
                    
                    catch(Exception obj) // catch for problem solving of exception (if any) which was detected in try
                    {
                        System.out.println("Please enter digits only"); 
                        continue;
                    }
                    break;
                }
            }
            //End of inner while loop
            if(type == 3)
            {
                // Printing the whole menu
                System.out.println("     VEG PIZZAS :   ");                
                System.out.println("        NAME                                                                REGULAR(r)   MEDIUM(m)   LARGE(l)");                
                System.out.println("   1. Cheese Overloaded Big Pizza                                             100          180         330");
                System.out.println("        (Mozarella Cheese with hand stretched crust)");              
                System.out.println("   2. El Mexicano Nacho Pizza                                                 100          180         330");
                System.out.println("        (Jalapeno sauce with corn,parsley and nachos)");
                System.out.println("   3. Exotica                                                                 130          265         425");            
                System.out.println("        (Red Capsicum,baby corn,olives and jalapeno)");
                System.out.println("   4. Tomatino                                                                130          265         425");            
                System.out.println("        (Cheese and Tomato)");
                System.out.println("   5. Double Cheese                                                           130          265         425");
                System.out.println("       (Topped with extra cheese)");
                System.out.println("   6. Super veg                                                               130          265         425");
                System.out.println("      (Mushroom,capsicum,onions,sweet corn Red paprika ,Black olives & cheese)");
                System.out.println("   7. Paneer Makhani                                                          175          325         490");
                System.out.println("      (Paneer,capsicum & red paprika)");
                System.out.println("   8. Veggie Lovers                                                           175          325         490");
                System.out.println("      (Mushroom,onion,tomato & capsicum)");
                System.out.println("   9. Fiery Ride                                                              175          325         490");
                System.out.println("      (Tomato,onion,capsicum,sweet corn,olives,jalapenos & green chillies");
                System.out.println("  10. Veggie Crunch                                                           175          325         490");
                System.out.println("      (Onion & Crunch) \n \n \n");
                System.out.println("     NON VEG PIZZAS :");
                System.out.println("        NAME                                                                REGULAR(r)   MEDIUM(m)   LARGE(l)");
                System.out.println("  11. Chicken Supreme                                                           175          325        490");
                System.out.println("      (Chicken Hot n' Spicy, Chicken Tikka and Chunky Ckicken)");
                System.out.println("  12. Chicken Tikka                                                             175          330        490");
                System.out.println("      (Chicken Tikka,onion and green Chillies)");
                System.out.println("  13. Fiery Chicken                                                             175          330        490");  
                System.out.println("      (Chunks of chicken,olives and green chillies)");
                System.out.println("  14. Zesty Chicken                                                             210          370        525");
                System.out.println("      (Chunks of chicken and green chillies)");
                System.out.println("  15. Chicken Crunch                                                            210          370        525");
                System.out.println("      (Chicken,capsicum & lebanese sprinkle) \n\n\n");
                System.out.println("We have the following types of crusts of your pizza:");
                System.out.println("1)All American Pan Pizza    No Additional Charges");
                System.out.println("2)So Cheezy                 Additional Rs.150");
                System.out.println("3)Stuffed Crust             Additional Rs.180");
                System.out.println("4)Cheesy Bites              Additional Rs.250 \n **prices of crusts will not reflect in your bill** \n \n");
                System.out.println("     SIDES                       PRICE(in Rs)          ");
                System.out.println("  a)   Choco Mousse                    69              ");
                System.out.println("  b)   Choco truffle cake              69              ");
                System.out.println("  c)   Garlic bread sticks             85              ");
                System.out.println("  d)   Cheese garlic bread             99              ");
                System.out.println("  e)   Potato wedges                  110              ");
                System.out.println("  f)   Chicken wings                  140              \n\n");
                System.out.println("     BEVERAGES                   Price(Rs.)            ");
                System.out.println("  1) Coca-Cola                        35              ");
                System.out.println("  2) Pepsi                            35              ");
                System.out.println("  3) Thums-Up                         35              ");
                System.out.println("  4) Fanta                            35              ");
                System.out.println("  5) 7 Up                             35              \n\n");
                System.out.println("**these are default prices and may vary with additions** \n \n \n ");
                System.out.println("ONE CAN DESIGN ONE'S OWN PIZZA : \n");
                System.out.println("The crusts are :");
                System.out.println("1) Hand stretched crust(crust made using hands)  Costing Rs. 100");
                System.out.println("2) Ready-made base(basic)(normal base with nothing but only bread)  Costing Rs. 110");
                System.out.println("3) Ready-made base(cheese laden i.e., cheese on the inside and cheese on the outside)  Costing Rs. 190");
                System.out.println("4) Thin crust made out of wheat(the slimest crust possible made out of healthy wheat)  Costing Rs. 80");
                System.out.println("5) Fully stuffed pizza(Stuffing of your choice)  Costing based on the stuffing you choose for");
                System.out.println("6) Only spices crust  Costing Rs. 140 \n\n");
                System.out.println("The toppings are :       |    Their costing(in Rs.) : ");
                System.out.println("1)  Extra cheese                    15           ");
                System.out.println("2)  Mushrooms                       20           ");
                System.out.println("3)  Black olives                    15           ");
                System.out.println("4)  Green olives                    15           ");
                System.out.println("5)  Capsicum                        25           ");
                System.out.println("6)  Pineapple                       30           ");
                System.out.println("7)  Tomato                          25           ");
                System.out.println("8)  Onion                           25           ");
                System.out.println("9)  Pepperoni                       40           ");
                System.out.println("10) Sausage                         50           ");
                System.out.println("11) Spinach                         15           ");
                System.out.println("12) Bacon                           55           ");
                System.out.println("13) Green Peppers                   35           ");
                System.out.println("14) Paneer                          60           \n\n");
                System.out.println("There are two oven types : ");
                System.out.println("1)Conveyor oven(The modern type of oven works on electricity) ");
                System.out.println("2)Brick oven (Old fashioned oven with brick lining)");
                System.out.println("You can select the size our your pizza");
                System.out.println("You will have to accept the number of slices you want to have");
                while(true)
                {   //Start of while loop
                    System.out.println("So,do you want to order?(type yes/no)");
                    String more = buf.readLine();
                    if(more.equalsIgnoreCase("yes"))
                    {  //if statement for checking if user has entered a yes and executing accordingly
                        flag=true;
                        continue xyz;
                    }   
                    else if(more.equalsIgnoreCase("no"))
                    {   // for checking if user has entered a no and executing accordingly
                        System.out.println("Okay,see you later");
                        break xyz;
                    }
                    else
                    {  //if user has entered something wrong then to print the following message and again ask the user whether wants to order or not and executing accordingly
                        System.out.println("Please enter properly");
                        continue;
                    }
                }   //End of while loop
            }
            if(type < 3)
            {
                System.out.println("DO YOU KNOW THAT YOU CAN EVEN DESIGN YOUR OWN PIZZA ? ");
                abc:
                while(true)
                {   //Start of while loop abc
                    System.out.println("Do you want to design your pizza for yourself ?(type yes/no)");
                    String design = buf.readLine();
                    if(design.equalsIgnoreCase("yes"))
                    {   //if statement for checking if user has entered a yes and executing accordingly
                        System.out.println("Thank you for choosing for designing your own pizza");
                        design();
                    }
                    else if(design.equalsIgnoreCase("no"))
                    {   //for checking if user has entered a no and executing accordingly
                        while(true)
                        {   //Start of inner while loop
                            System.out.println("So,do you want to choose from our Menu ?(type yes/no)");
                            String more = buf.readLine();
                            if(more.equalsIgnoreCase("yes"))
                            {   //if statement for checking if user has entered a yes and executing accordingly
                                menu();
                                break;
                            }
                            else if(more.equalsIgnoreCase("no"))
                            {   // for checking if user has entered a no and executing accordingly
                                System.out.println("So,you do not want to order right now. See you again next time.");
                                break abc;
                            }
                            else
                            {   //if user has entered something wrong then to print the following message and again ask the user whether wants to order or not and executing accordingly 
                                System.out.println("Please type properly");
                                continue;
                            }
                        }
                    }
                    else
                    {   //if user has entered something wrong then to print the following message and again ask the user whether wants to order or not and executing accordingly
                        System.out.println("Please type properly");
                        continue abc;
                    }
                }
            }
            break;
        }// End of while loop xyz 
    } // End of Main()       
    
    public void design() throws IOException
    {   //Start of design()
        crust = 0;
        stuff = 0;
        do
        {   //Start of do-while loop
            System.out.println("You are now ready to design your own pizza");
            System.out.println("Lets start with a crust :");
            System.out.println("Choose the number alongside the crust you want to have from below");
            System.out.println("1) Hand stretched crust(crust made using hands)  Costing Rs. 100");
            System.out.println("2) Ready-made base(basic)(normal base with nothing but only bread)  Costing Rs. 110");
            System.out.println("3) Ready-made base(cheese laden i.e., cheese on the inside and cheese on the outside)  Costing Rs. 190");
            System.out.println("4) Thin crust made out of wheat(the slimest crust possible made out of healthy wheat)  Costing Rs. 80");
            System.out.println("5) Fully stuffed pizza(Stuffing of your choice)  Costing based on the stuffing you choose for");
            System.out.println("6) Only spices crust  Costing Rs. 140");
            try // try for checking whether there is a problem risen due to an exception
            {
                System.out.println("Whats your choice ?");
                crust = Integer.parseInt(buf.readLine());
            }
            catch(Exception obj) // catch for problem solving of exception (if any) which was detected in try
            {
                System.out.println("Please enter digits only");
                continue;
            }
            if(crust>0 && crust<=6)
            {   // if statement for checking if user has entered correctly
                if(crust == 5)
                {   //if statement to check whether user has entered 5
                    System.out.println("Choose the number besides the stuffing you want to have");
                    System.out.println("1) Only cheese stuffing(stuffing of mozarella cheese) Costing Rs. 100");
                    System.out.println("2) Paneer Stuffing(soft and spicy paneer stuffing) Costing Rs. 120");
                    System.out.println("3) Mixed vegetables with cheese stuffing(crispy vegetables with cheese) Costing Rs. 150");
                    System.out.println("4) Cheese and paneer stuffing(cheese with soft and spicy paneer stuffing) Costing Rs. 110");
                    System.out.println("5) Mofongo Stuffing(a Puerto Rican specialty of fried green plantains mashed up with bacon, sofrito and olive oil) Costing Rs. 250");
                    while(true)
                    {   //Start of while loop
                        try // try for checking whether there is a problem risen due to an exception
                        {
                            System.out.println("Whats your choice ?");
                            stuff = Integer.parseInt(buf.readLine());
                            if(stuff<1 || stuff>5)
                            {
                                System.out.println("Enter only from the given options(according to your choice)");
                                continue;
                            }
                        }
                        catch(Exception obj) // catch for problem solving of exception (if any) which was detected in try
                        {
                            System.out.println("Please enter digits only");
                            continue;
                        }
                        break;
                    }   //End of while loop
                }
                System.out.println("Time for the toppings : ");
                System.out.println("The toppings are given below and and you can choose as many as you want !");
                System.out.println("The toppings are :       |    Their costing(in Rs.) : ");
                System.out.println("1)  Extra cheese                    15           ");
                System.out.println("2)  Mushrooms                       20           ");
                System.out.println("3)  Black olives                    15           ");
                System.out.println("4)  Green olives                    15           ");
                System.out.println("5)  Capsicum                        25           ");
                System.out.println("6)  Pineapple                       30           ");
                System.out.println("7)  Tomato                          25           ");
                System.out.println("8)  Onion                           25           ");
                System.out.println("9)  Pepperoni                       40           ");
                System.out.println("10) Sausage                         50           ");
                System.out.println("11) Spinach                         15           ");
                System.out.println("12) Bacon                           55           ");
                System.out.println("13) Green Peppers                   35           ");
                System.out.println("14) Paneer                          60           ");
                top = new int[14];
                try // try for checking whether there is a problem risen due to an exception
                {
                    System.out.println("*Please enter the numbers one by one and not in one line.If you need no more then enter 15*");
                    System.out.println("If you enter a number other than numbers between 1 and 15 ,then you'll have to enter the number at that place again");
                    for(int i=0;i<top.length;i++)
                    {   //Start of for loop
                        System.out.print("Topping number "+(i+1)+")");
                        top[i] = Integer.parseInt(buf.readLine());
                        if(top[i]==15)
                        {   // if statement to check whether the user has entered 15 and executing accordingly
                            break;
                        }
                        else if(top[i]>=1 && top[i]<15)
                        {   // for checking whether user entered between 1 and 15 but not 15 and executing accordingly
                            continue;                        
                        }
                        else
                        {   // if user entered something wrong then to exceute accordingly
                            System.out.println("Enter again");
                            i--;
                            continue;
                        }                        
                    }   //End of for loop
                    System.out.println();
                }
                catch(Exception obj) // catch for problem solving of exception (if any) which was detected in try
                {
                    System.out.println("Please enter digits only and that to between 1 and 15");
                    continue;
                }
                System.out.println("There are two oven types : ");
                System.out.println("1)Conveyor oven ");
                System.out.println("2)Brick oven ");
                System.out.println("Choose an oven and type the number alongside it");
                while(true)
                {   //Start of while loop
                    try  // try for checking whether there is a problem risen due to an exception
                    {
                        oven = Integer.parseInt(buf.readLine());
                        if(oven == 1 || oven == 2)
                        {   //if statement for checking whehter user entered 1 or 2 
                            break;
                        }
                        else
                        {   // if user entered neither 1 nor 2 then execute accordingly
                            System.out.println("Please enter either 1 or 2");
                            continue;
                        }
                    }
                    catch(Exception obj) // catch for problem solving of exception (if any) which was detected in try
                    {
                        System.out.println("Please Enter digits only");
                        continue;
                    }
                }   //End of while loop
                System.out.println("Please enter the number of pieces you want");
                System.out.println("You cannot enter more than 8 and enter only even numbers");
                while(true)
                {   //Start of while loop
                    try // try for checking whether there is a problem risen due to an exception
                    {
                        pie = Integer.parseInt(buf.readLine());
                        if(pie>0 && pie<9 && pie % 2 == 0)
                        {   //if statement for checking wheter the user entered even number of pieces and that to less than equal to 8 and greater than 0
                            break;
                        }
                        else
                        {   //if users enters something wrong then to exceute accordingly
                            System.out.println("Enter only even numbers between 0 and 8 but not 0");
                            continue;
                        }
                    }
                    catch(Exception obj) // catch for problem solving of exception (if any) which was detected in try
                    {
                        System.out.println("Enter only digits");
                    }
                }   //End of while loop
                while(true)
                {   //Start of whie loop
                    System.out.println("Enter the size of your pizza(regular (Rs. 0)/medium(Rs. 100)/large(Rs. 200))(type regular ,medium or large)");
                    size = buf.readLine();
                    if(size.equalsIgnoreCase("regular") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")) 
                    {   //if statement to check if user entered from amongst these three
                        break;
                    }
                    else
                    {   //if user enters something wrong then to execute accordingly
                        System.out.println("Enter only from the options given above");
                        continue;
                    }
                }   //End of while loop
            }
            else
            {   //if user enters something wrong then to execute accordingly
                System.out.println("Please enter digits from the given options only.");
                continue;
            }
            System.out.println(" Name your pizza");
            name = buf.readLine();
            break;
        }while(true); //End of do-while loop 
        System.out.println("Do you now want to order from our menu ?(type yes/no)");
        while(true)
        {
            String more = buf.readLine();
            if(more.equalsIgnoreCase("yes"))
            {   //if statement to check whether user entered a yes and execute accordingly
                menu();
            }
            else if(more.equalsIgnoreCase("no"))
            {   //for checking if user entered a no and execute accordingly
                System.out.println("If you want to play the game of fortune,then type 'fortunegame' else type 'nofortunegame'.");
                while(true)
                {   //Start of while loop
                    more = buf.readLine();
                    if(more.equalsIgnoreCase("fortunegame"))
                    {  //if statement for checking if user has entered fortunegame and execute accordingly
                        lottery();
                        break;
                    }
                    else if(more.equalsIgnoreCase("nofortunegame"))
                    {   //for checking whether user has entered nofortunegame and execute accordingly
                        System.out.println("So, you chose that you'll not play.");
                        billing();
                        break;
                    }
                    else 
                    {   //if user enters something wrong then to print the following and execute accordingly
                        System.out.println("Enter properly");
                        continue;
                    }
                }   //End of while loop
            }
            else
            {
                System.out.println("Please enter properly");
                continue;
            }
            break;
        }        
    } //End of design()
    
    public void menu() throws IOException
    {   //Start of menu()
        System.out.println("Do you want to order ...");
        System.out.println("1) Pizza ");
        System.out.println("2) Side ");
        System.out.println("3) Beverage");
        System.out.println("Enter the number alongside your choice");
        while(true)
        {   //Start of while loop
            try // try for checking whether there is a problem risen due to an exception
            {
                int more = Integer.parseInt(buf.readLine());
                switch(more)
                {   //Start of switch
                    case 1 : pizza();
                             break;
                    case 2 : side();
                             break;
                    case 3 : beverage();
                             break;
                    default : System.out.println("Enter only '1','2' or '3' according to your choice");
                              continue;
                }   //End of switch
            }
            catch(Exception obj) // catch for problem solving of exception (if any) which was detected in try
            {
                System.out.println("please enter digits only");
                continue;
            }
            break;
        }  //End of while loop
    }   //End of menu()
    public void pizza() throws IOException
    {   //Start of pizza()
        //printing the list of pizzas
        System.out.println("     VEG PIZZAS :   ");                
        System.out.println("        NAME                                                                REGULAR(r)   MEDIUM(m)   LARGE(l)");                
        System.out.println("   1. Cheese Overloaded Big Pizza                                             100          180         330");
        System.out.println("        (Mozarella Cheese with hand stretched crust)");              
        System.out.println("   2. El Mexicano Nacho Pizza                                                 100          180         330");
        System.out.println("        (Jalapeno sauce with corn,parsley and nachos)");
        System.out.println("   3. Exotica                                                                 130          265         425");            
        System.out.println("        (Red Capsicum,baby corn,olives and jalapeno)");
        System.out.println("   4. Tomatino                                                                130          265         425");            
        System.out.println("        (Cheese and Tomato)");
        System.out.println("   5. Double Cheese                                                           130          265         425");
        System.out.println("       (Topped with extra cheese)");
        System.out.println("   6. Super veg                                                               130          265         425");
        System.out.println("      (Mushroom,capsicum,onions,sweet corn Red paprika ,Black olives & cheese)");
        System.out.println("   7. Paneer Makhani                                                          175          325         490");
        System.out.println("      (Paneer,capsicum & red paprika)");
        System.out.println("   8. Veggie Lovers                                                           175          325         490");
        System.out.println("      (Mushroom,onion,tomato & capsicum)");
        System.out.println("   9. Fiery Ride                                                              175          325         490");
        System.out.println("      (Tomato,onion,capsicum,sweet corn,olives,jalapenos & green chillies");
        System.out.println("  10. Veggie Crunch                                                           175          325         490");
        System.out.println("      (Onion & Crunch) \n \n \n");
        System.out.println("     NON VEG PIZZAS :");
        System.out.println("        NAME                                                                REGULAR(r)   MEDIUM(m)   LARGE(l)");
        System.out.println("  11. Chicken Supreme                                                           175          325        490");
        System.out.println("      (Chicken Hot n' Spicy, Chicken Tikka and Chunky Ckicken)");
        System.out.println("  12. Chicken Tikka                                                             175          330        490");
        System.out.println("      (Chicken Tikka,onion and green Chillies)");
        System.out.println("  13. Fiery Chicken                                                             175          330        490");  
        System.out.println("      (Chunks of chicken,olives and green chillies)");
        System.out.println("  14. Zesty Chicken                                                             210          370        525");
        System.out.println("      (Chunks of chicken and green chillies)");
        System.out.println("  15. Chicken Crunch                                                            210          370        525");
        System.out.println("      (Chicken,capsicum & lebanese sprinkle) \n\n\n");
        System.out.println("We have the following types of crusts of your pizza:");
        System.out.println("1)All American Pan Pizza    No Additional Charges");
        System.out.println("2)So Cheezy                 Additional Rs.150");
        System.out.println("3)Stuffed Crust             Additional Rs.180");
        System.out.println("4)Cheesy Bites              Additional Rs.250 \n **prices of crusts will not reflect in your bill** \n \n");
        int i =0;
        for( i=0;i<pizz.length;i++)
        {   //Start of for loop
            System.out.println("Enter the number along side the pizza you want(Enter 16 to stop)");
            try // try for checking whether there is a problem risen due to an exception
            {
                pizz[i]=Integer.parseInt(buf.readLine());
                if(pizz[i] == 16)
                {   //if statement to check if user entered 16
                    break;
                }
                if(pizz[i]<1 || pizz[i]>15)
                {   //if statement for checking if user entered less than 1 or greater than 
                    System.out.println("Please enter from the given options(according to your choice)");
                    i--;
                    continue;
                }
                System.out.println("Enter quantity");
                while(true)
                {
                    pizzq[i] = Integer.parseInt(buf.readLine());
                    if(pizzq[i]<1)
                    {
                        System.out.println("Please enter properly");
                    }
                    else
                    {
                        break;
                    }
                }
            }
            catch(Exception obj) // catch for problem solving of exception (if any) which was detected in try
            {
                System.out.println("Enter only digits");
                i--;
                continue;
            }
            while(true)
            {
                System.out.println("Enter the type of crust you want");
                try // try for checking whether there is a problem risen due to an exception
                {
                    crus[i]=Integer.parseInt(buf.readLine());
                    if(crus[i]<1 || crus[i]>4)
                    {   //if statement for checking if user entered greater than 4 or less than 1 
                        System.out.println("Please enter from the given options(according to your choice)");
                        continue;
                    }
                }
                catch(Exception obj) // catch for problem solving of exception (if any) which was detected in try
                {
                    System.out.println("Enter only digits");
                    continue;
                }
                System.out.println("Please enter the size you want for your pizza(type regular/medium/large)");
                sizes[i]=(buf.readLine());
                if(sizes[i].equalsIgnoreCase("regular") || sizes[i].equalsIgnoreCase("medium") || sizes[i].equalsIgnoreCase("large"))
                {   // if statement for checking whether user entered from the above options only
                    sizes[i]=sizes[i];
                }
                else
                {   // if user enters something other than the options above then to execute accordingly
                    System.out.println("Please enter the size properly");
                    i--;
                    continue;
                }
                break;
            }
        }
        System.out.println("Do you want...");
        System.out.println("1) Side \n OR");
        System.out.println("2) Beverage \n OR ");
        System.out.println("3) Play the fortune game");
        while(true)
        {   //Start of while loop
            try // try for checking whether there is a problem risen due to an exception
            {
                int more = Integer.parseInt(buf.readLine());
                if(more == 1 || more == 2 ||more == 3)
                {   //if statement to check if user entered 1 ,2 or 3
                    //if statements to check if user entered 1 or 2 or 3 and execute accordingly
                    if(more == 1)
                    {
                        side();
                    }
                    else if(more ==2)
                    {
                        beverage();
                    }
                    else 
                    {
                         lottery();
                    }
                }
                else
                {   //if user enters digits otherthan those between 1 and 3 then to execute accordingly
                    System.out.println("Enter '1' , '2' or '3' according to your choice");
                    continue;
                }
            }
            catch(Exception obj) // catch for problem solving of exception (if any) which was detected in try
            {
                System.out.println("Enter only digits");
                i--;
                continue;
            }
            break;
        }  //End of while loop
    }   //End of pizza()
    public void side() throws IOException
    {   //Start of side()
        System.out.println("     SIDES                       PRICE(in Rs)          ");
        System.out.println("  1)  Choco Mousse                    69              ");
        System.out.println("  2)  Choco truffle cake              69              ");
        System.out.println("  3)  Garlic bread sticks             85              ");
        System.out.println("  4)  Cheese garlic bread             99              ");
        System.out.println("  5)  Potato wedges                  110              ");
        System.out.println("  6)  Chicken wings                  140              ");
        int i=-1;
        do
        {   //Start of do-while loop
            if(i<=6)
            {   //if statement to check if user did notenter 6 and execute accoerdingly
                i++;
                System.out.println("Enter the number alongside the side of your choice(Enter '0' to stop)");
                while(true)
                {   //Start of while loop
                    try // try for checking whether there is a problem risen due to an exception
                    {
                        sides[i] = Integer.parseInt(buf.readLine());
                        if(sides[i]<0 || sides[i]>6)
                        {
                            System.out.println("Please enter numbers from the given options(according to your choice)");
                            continue;
                        }
                    }
                    catch(Exception obj) // catch for problem solving of exception (if any) which was detected in try
                    {
                        System.out.println("Please enter digits only");
                        continue;
                    }
                    break;
                }   //End of while loop
                if(sides[i] == 0)
                {   // to check if sides[i] is equal to 0 or not
                    break;
                }
                System.out.println("Please enter the quantity of this side you chose");
                while(true)
                {   //Start of while loop
                    try // try for checking whether there is a problem risen due to an exception
                    {
                        qua[i] =Integer.parseInt(buf.readLine());
                        if(qua[i]<1)
                        {
                            System.out.println("Please enter neither 0 nor negative numbers");
                            continue;
                        }
                    }
                    catch(NumberFormatException obj) // catch for problem solving of exception (if any) which was detected in try
                    {
                        System.out.println("Please enter digits only");
                        continue;
                    }
                    break;
                }   //End of while loop
            }
            else
            {   //if value of i exceeds 6 then to tell the user that no more sides can be ordered
                System.out.println("You can order no more sides");
            }
        }while(sides[i]!=0);//End of do-whileloop
        
        System.out.println("Do you want ...");
        System.out.println("1)something to drink");
        System.out.println("2)want to play fortune game");
        while(true)
        {   //Start of while loop
            try // try for checking whether there is a problem risen due to an exception
            {
                int more = Integer.parseInt(buf.readLine());
                if(more == 1 || more == 2)
                {   //if statement to check if user entered 1 or 2
                    //if statements to check separately whether user entered 1 or 2 and execute accordingly
                    if(more ==1)
                    {
                        beverage();
                    }
                    else 
                    {
                         lottery();
                    }
                }             
                else
                {   //if user does not enter 1 or 2 then to exeute accordingly
                    System.out.println("Enter '1' or '2' according to your choice");
                    continue;
                }
            }
            catch(Exception obj) // catch for problem solving of exception (if any) which was detected in try
            {
                System.out.println("Enter only digits");
                i--;
                continue;
            }
            break;
        }   //End of while loop
    }   //End of side()
    public void beverage()throws IOException
    {   //Start of beverage()
        System.out.println("     BEVERAGES                   Price(Rs.)            ");
        System.out.println("  1) Coca-Cola                        35              ");
        System.out.println("  2) Pepsi                            35              ");
        System.out.println("  3) Thums-Up                         35              ");
        System.out.println("  4) Fanta                            35              ");
        System.out.println("  5) 7 Up                             35              ");
        int i =-1;
        do
        {   //Start of do-while loop
            if(i<=5)
            {   //to check if value of i is less than or equal to 5
                i++;
                System.out.println("Enter the number alongside the beverage of your choice(Enter '0' to stop)");
                while(true)
                {   //Start of while loop
                    try // try for checking whether there is a problem risen due to an exception
                    {
                        bev[i] = Integer.parseInt(buf.readLine());
                        if(bev[i]<0 || bev[i]>5)
                        {   //to check if user enter a value greater than 5 or less than 1
                            System.out.println("Please enter numbers from the given options(according to your choice)");
                            continue;
                        }
                    }
                    catch(Exception obj) // catch for problem solving of exception (if any) which was detected in try
                    {
                        System.out.println("Please enter digits only");
                        continue;
                    }
                    break;
                }   //End of while loop
                if(bev[i] == 0)
                {   //to check if bev[i] equals 0
                    break;
                }
                System.out.println("Please enter the quantity of this beverage you chose");
                while(true)
                {   //Start of while loop
                    try // try for checking whether there is a problem risen due to an exception
                    {
                        bevq[i] = Integer.parseInt(buf.readLine());
                        if(bevq[i]<1)
                        {   //to check if user has entered a value less than 1
                            System.out.println("Please enter neither 0 nor negative numbers");
                            continue;
                        }
                    }
                    catch(Exception obj) // catch for problem solving of exception (if any) which was detected in try
                    {
                        System.out.println("Please enter digits only");
                        continue;
                    }
                    break;
                }   //End of while loop
            }
            else
            {   //if value if i exceeds 5 then to print the following message
                System.out.println("You can order no more beverages");
            }
        }while(bev[i]!=0 && i<=5);//End of do-while loop
        lottery();    
    } //End of beverage()
    
    public void lottery() throws IOException
    {   //Start of lottery
        System.out.println("You have started the fortune game !");
        System.out.println("You can play and win upto 100 % off");
        while(true)
        {   //Start of while loop
            System.out.println("Type ready when you are");
            String ready = buf.readLine();
            if(ready.equalsIgnoreCase("ready"))
            {   //to check if user entered ready
                //delay loop
                n1 = (int)(Math.random()*100);
                n2 = (int)(Math.random()*100);
                n3 = (int)(Math.random()*100);
                System.out.println("If you get all three numbers same and are 95 or 99,then you get 80% off on your bill");
                System.out.println("If you get all numbers same and between 90 and 94,then you get 60% off on your bill");
                System.out.println("If you get all numbers same and between 85 and 89,then you get 40% off on your bill");
                System.out.println("If you get all numbers same and between 80 and 84,then you get 20% off on your bill");
                System.out.println("If you get all numbers same and between 75 and 79,then you get a choco mousse free");
                System.out.println("If you get all numbers same and between 65 and 74,then you get a choco trufflecake free");
                System.out.println("If you get all numbers same and between 64 and 35,then you get a coca-cola free");
                System.out.println("If you get all numbers same and between 34 and 10,then you get a free coupon");
                System.out.println("If you get all numbers same and between 1 and 9,then you have hit the jackpot,you get 100% off on your bill");
                System.out.println("The numbers are : "+n1+" , "+n2+" & "+n3);            
                if(n1==n2 && n2 == n3 && n1 <+100)
                {   //to check if all three random numbers are equal or not and less than or equal to 100
                    System.out.println("you have won in the game");
                    //if statements to check and give rewards accordingly
                    if(n1>=1 && n1<=9)
                    {
                        System.out.println("You have hit a jackpot!");
                        System.out.println("You have won 100 % off on your bill!");
                    }
                    else if(n1>=10 && n1<=34)
                    {
                        System.out.println("You have won a free coupon");
                        System.out.println("You can only use the coupon when you order on the phone");
                        int no =(int)(Math.random()*100000000);
                        System.out.println("Your coupon code is : "+no);
                    }
                    else if(n1>=35 && n1<=64)
                    {
                        System.out.println("You get a coca- cola free");
                    }
                    else if(n1>=65 && n1<=74)
                    {
                        System.out.println("You get a choco trufflecake free");
                    }
                    else if(n1>=75 && n1<=79)
                    {
                        System.out.println("You get a choco mousse");
                    }
                    else if(n1>=80 && n1<=84)
                    {
                        System.out.println("You get 20% off on your bill");
                    }
                    else if(n1>=85 && n1<=89)
                    {
                        System.out.println("You get 40% off on your bill");
                    }
                    else if(n1>=90 && n1<=94)
                    {
                        System.out.println("You get 60% off on your bill");
                    }
                    else if(n1>=95 && n1<=99)
                    {
                        System.out.println("You get 80% off on your bill");
                    }
                }
                else
                {   //if all three numbers are unequal then to print the following
                    System.out.println("Oops, you did not win anything! Better luck next time.");
                }
                System.out.println("You order has been taken.Now is time for us to print the bill");
                billing();
            }
            else 
            {
                System.out.println("Please type properly");
                continue;
            }
            break;
        } //End of while loop
    } //End of lottery()
    public void billing() throws IOException
    {   //Start of billing()
        System.out.println("\t\t Your bill:");
        System.out.println("\t\t Pizza Store");
        System.out.println("\t\t ___________");
        System.out.println("Name");
        int sum = 0;
        int grand = 0;
        if(crust == 0)
        {   //to check if crust is not equal to 0
            sum = sum + 0;
        }
        else
        {
            //if statements to check accordingly and find total accordingly
            if(crust == 1)
            {
                sum = sum + 100; 
            }
            else if(crust == 2)
            {
                sum = sum + 110;
            }
            else if(crust == 3)
            {
                sum = sum + 190;
            }
            else if(crust == 4)
            {
                sum = sum + 80;
            }
            else if(crust == 5)
            {
                if(stuff == 1)
                {
                    sum = sum + 100;
                }
                else if(stuff == 2)
                {
                    sum = sum + 120;
                }
                else if(stuff == 3)
                {
                    sum = sum + 150;
                }
                else if(stuff == 4)
                {
                    sum = sum + 110 ;
                }
                else if(stuff == 5)
                {
                    sum = sum + 250;
                }
            }
            else if(crust == 6)
            {
                sum = sum + 140;
            }
            for(int i = 0;i<top.length;i++)
            {   //Start of for loop 
                //if statements to check which toppings the ueser has chosen and find total accordingly
                if(top[i] == 1)
                {
                    sum = sum + 15;
                }
                else if(top[i] == 2)
                {
                    sum = sum + 20;
                }
                else if(top[i] == 3)
                {
                    sum = sum + 15;
                }
                else if(top[i] == 4)
                {
                    sum = sum + 15;
                }
                else if(top[i] == 5)
                {
                    sum = sum + 25;
                }
                else if(top[i] == 6)
                {
                    sum = sum + 30;
                }
                else if(top[i] == 7)
                {
                    sum = sum + 25;
                }
                else if(top[i] == 8)
                {
                    sum = sum + 25;
                }
                else if(top[i] == 9)
                {
                    sum = sum + 40;
                }
                else if(top[i] == 10)
                {
                    sum = sum + 50;
                }
                else if(top[i] == 11)
                {
                    sum = sum + 15;
                }
                else if(top[i] == 12)
                {
                    sum = sum + 55;
                }
                else if(top[i] == 13)
                {
                    sum = sum + 35;
                }
                else if(top[i] == 14)
                {
                    sum = sum + 60;
                }
                else if(top[i] == 15)
                {
                    break;
                }
            }   //End of for loop
            //if statements to check which size the user chose
            if(size.equalsIgnoreCase("regular"))
            {
                sum = sum + 0;
            }
            if(size.equalsIgnoreCase("medium"))
            {
                sum = sum + 100;
            }
            if(size.equalsIgnoreCase("large"))
            {
                sum = sum + 200;
            }
            System.out.println(name+"   Rs."+sum);
            grand = grand + sum;
        }
        
        if(pizz[0]==0 || pizz[0]==16);
        else
        {
        
            for(int i = 0; i<pizz.length;i++)
            {   //Start of for loop
                if(pizz[i]==16)
                {   //to ccheck if pizz[i] equals 16 or not
                    break;
                }
                //if statements to check the conditions and find total accordingly
                if(pizz[i]>=1&&pizz[i]<=2&& sizes[i].equalsIgnoreCase("regular"))
                {   
                    grand = grand + (100 * pizzq[i]);
                    if(pizz[i] == 1)
                    {
                        System.out.println("Cheese Overloaded Big Pizza   Rs.100     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 2)
                    {
                        System.out.println("El Mexicano nacho pizza   Rs.100     Quantity="+pizzq[i]);
                    }
                }
                if(pizz[i]>=1&&pizz[i]<=2&& sizes[i].equalsIgnoreCase("medium"))  
                {
                    grand = grand + (180* pizzq[i]);
                    if(pizz[i] == 1)
                    {
                        System.out.println("Cheese Overloaded Big Pizza   Rs.180     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 2)
                    {
                        System.out.println("El Mexicano nacho pizza   Rs.180     Quantity="+pizzq[i]);
                    }
                }
                if(pizz[i]>=1&&pizz[i]<=2&& sizes[i].equalsIgnoreCase("large"))  
                {
                    grand = grand + (330* pizzq[i]);
                    if(pizz[i] == 1)
                    {
                        System.out.println("Cheese Overloaded Big Pizza   Rs.330     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 2)
                    {
                        System.out.println("El Mexicano nacho pizza   Rs.330     Quantity="+pizzq[i]);
                    }
                }
                if(pizz[i]>=3&&pizz[i]<=6&& sizes[i].equalsIgnoreCase("regular"))  
                {
                    grand = grand + (130* pizzq[i]);
                    if(pizz[i] == 3)
                    {
                        System.out.println("Exotica   Rs.130     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 4)
                    {
                        System.out.println("Tomatino  Rs.130     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 5)
                    {
                        System.out.println("Double cheese   Rs.130     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 6)
                    {
                        System.out.println("Super veg   Rs.130     Quantity="+pizzq[i]);
                    }
                }
                if(pizz[i]>=3&&pizz[i]<=6&& sizes[i].equalsIgnoreCase("medium"))  
                {
                    grand = grand + (265* pizzq[i]);
                    if(pizz[i] == 3)
                    {
                        System.out.println("Exotica   Rs.265     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 4)
                    {
                        System.out.println("Tomatino  Rs.265     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 5)
                    {
                        System.out.println("Double cheese   Rs.265     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 6)
                    {
                        System.out.println("Super veg   Rs.265     Quantity="+pizzq[i]);
                    }
                }
                if(pizz[i]>=3&&pizz[i]<=6&& sizes[i].equalsIgnoreCase("large"))
                {
                    grand = grand + (425* pizzq[i]);
                    if(pizz[i] == 3)
                    {
                        System.out.println("Exotica   Rs.425     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 4)
                    {
                        System.out.println("Tomatino  Rs.425     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 5)
                    {
                        System.out.println("Double cheese   Rs.425     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 6)
                    {
                        System.out.println("Super veg   Rs.425     Quantity="+pizzq[i]);
                    }
                }
                if(pizz[i]>=7&&pizz[i]<=13&& sizes[i].equalsIgnoreCase("regular"))
                {
                    grand = grand + (175* pizzq[i]); 
                    if(pizz[i] == 7)
                    {
                        System.out.println("Paneer Makhani   Rs.175     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 8)
                    {
                        System.out.println("Veggie Lovers  Rs.175     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 9)
                    {
                        System.out.println("Fiery ride   Rs.175     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 10)
                    {
                        System.out.println("Veggie crunch   Rs.175     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 11)
                    {
                        System.out.println("Chicken supreme   Rs.175     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 12)
                    {
                        System.out.println("Chicken tikka  Rs.175     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 13)
                    {
                        System.out.println("Fiery chicken   Rs.175     Quantity="+pizzq[i]);
                    }
                }
                if(pizz[i]>=7&&pizz[i]<=13&& sizes[i].equalsIgnoreCase("medium")) 
                {
                    grand = grand + (325* pizzq[i]);
                    if(pizz[i] == 7)
                    {
                        System.out.println("Paneer Makhani   Rs.325     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 8)
                    {
                        System.out.println("Veggie Lovers  Rs.325     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 9)
                    {
                        System.out.println("Fiery ride   Rs.325     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 10)
                    {
                        System.out.println("Veggie crunch   Rs.325     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 11)
                    {
                        System.out.println("Chicken supreme   Rs.325     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 12)
                    {
                        System.out.println("Chicken tikka  Rs.325     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 13)
                    {
                        System.out.println("Fiery chicken   Rs.325     Quantity="+pizzq[i]);
                    }
                }
                if(pizz[i]>=7&&pizz[i]<=13&& sizes[i].equalsIgnoreCase("large"))
                {
                    grand = grand + (490* pizzq[i]);
                    if(pizz[i] == 7)
                    {
                        System.out.println("Paneer Makhani   Rs.490     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 8)
                    {
                        System.out.println("Veggie Lovers  Rs.490     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 9)
                    {
                        System.out.println("Fiery ride   Rs.490     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 10)
                    {
                        System.out.println("Veggie crunch   Rs.490     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 11)
                    {
                        System.out.println("Chicken supreme   Rs.490     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 12)
                    {
                        System.out.println("Chicken tikka  Rs.490     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 13)
                    {
                        System.out.println("Fiery chicken   Rs.490     Quantity="+pizzq[i]);
                    }
                }
                if(pizz[i]>=14&&pizz[i]<=15&& sizes[i].equalsIgnoreCase("regular"))
                {  
                    grand = grand + (210* pizzq[i]);
                    if(pizz[i] == 14)
                    {
                        System.out.println("Zesty chicken   Rs.210     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 15)
                    {
                        System.out.println("Chicken crunch   Rs.210     Quantity="+pizzq[i]);
                    }
                }
                if(pizz[i]>=14&&pizz[i]<=15&& sizes[i].equalsIgnoreCase("medium"))
                {
                    grand = grand + (370* pizzq[i]);
                    if(pizz[i] == 14)
                    {
                        System.out.println("Zesty chicken   Rs.370     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 15)
                    {
                        System.out.println("Chicken crunch   Rs.370     Quantity="+pizzq[i]);
                    }
                }
                if(pizz[i]>=14&&pizz[i]<=15&& sizes[i].equalsIgnoreCase("large"))
                {
                    grand = grand + (525* pizzq[i]);
                    if(pizz[i] == 14)
                    {
                        System.out.println("Zesty chicken   Rs.525     Quantity="+pizzq[i]);
                    }
                    if(pizz[i] == 15)
                    {
                        System.out.println("Chicken crunch   Rs.525     Quantity="+pizzq[i]);
                    }
                }  
                switch(crus[i])
                {
                    case 1 : grand = grand + 0;
                             break;
                    case 2 : grand = grand + (150 * pizzq[i]);
                             break;
                    case 3 : grand = grand + (180 * pizzq[i]);
                             break;
                    case 4 : grand = grand + (250 * pizzq[i]);
                             break;
                }
            }   //End of for loop 
        }
        for(int i = 0;i<sides.length;i++)
        {   //Start of for loop
            //if statements to check the conditions for sides and find total accordingly
            if(sides[i]==0)
            {
                break;
            }
            if(sides[i] == 1)
            {
                grand = grand +(69 *qua[i]);
                System.out.println("Choco Mousse     Rs.69    Quantity ="+qua[i]);
            }
            else if(sides[i] == 2)
            {
                grand = grand +(69 *qua[i]);
                System.out.println("Choco truffle cake     Rs.69    Quantity ="+qua[i]);
            }
            else if(sides[i] == 3)
            {
                grand = grand +(85 *qua[i]);
                System.out.println("Garlic Bread Sticks     Rs.85    Quantity ="+qua[i]);
            }
            else if(sides[i] == 4)
            {
                grand = grand +(99 *qua[i]);
                System.out.println("Cheese garlic bread     Rs.99    Quantity ="+qua[i]);
            }
            else if(sides[i] == 5)
            {
                grand = grand +(110 *qua[i]);
                System.out.println("Potato wedges     Rs.110    Quantity ="+qua[i]);
            }
            else if(sides[i] == 6)
            {
                grand = grand +(140 *qua[i]);
                System.out.println("Chicken wings     Rs.140    Quantity ="+qua[i]);
            }
        }   //End of for loop 
        for(int i = 0;i<bev.length;i++)
        {   //Start of for loop
            //if statements to check for conditions for beverages and find total accordingly
            if(bev[i]==0)
            {
                break;
            }
            if(bev[i] == 1)
            {
                grand = grand + (35*bevq[i]);
                System.out.println("Coca-cola    Rs.35    Quantity = "+bevq[i]);
            }
            else if(bev[i] == 2)
            {
                grand = grand + (35*bevq[i]);
                System.out.println("Pepsi    Rs.35    Quantity = "+bevq[i]);
            } 
            else if(bev[i] == 3)
            {
                grand = grand + (35*bevq[i]);
                System.out.println("Thums-up    Rs.35    Quantity = "+bevq[i]);
            }
            else if(bev[i] == 4)
            {
                grand = grand + (35*bevq[i]);
                System.out.println("Fanta    Rs.35    Quantity = "+bevq[i]);
            }
            else if(bev[i] == 5)
            {
                grand = grand + (35*bevq[i]);
                System.out.println("7-up    Rs.35    Quantity = "+bevq[i]);
            }
        }   //End of for loop 
        System.out.println("Grand total = "+grand);
        if(n1==n2 && n2 == n3 && n1 <=100)
        {   //if statement to find if the three umbers are equal as well as less than equal to 100 or not
            System.out.println("you have won in the game");
            //if statements to check the conditions and give the rewards accordingly
            if(n1>=1 && n1<=9)
            {   
                grand = 0 ;System.out.println("grand="+grand);
                System.out.println("You have won 100 % off on your bill!");
            }
            else if(n1>=10 && n1<=34)
            {
                System.out.println("You have won a free coupon");
                int no =(int)(Math.random()*100000000);
                System.out.println("Your coupon code is : "+no);
            }
            else if(n1>=35 && n1<=64)
            {
                System.out.println("You got a coca-cola free");
            }
            else if(n1>=65 && n1<=74)
            {
                System.out.println("You got a choco trufflecake free");
            }
            else if(n1>=75 && n1<=79)
            {
                System.out.println("You got a choco mousse");
            }
            else if(n1>=80 && n1<=84)
            {
                grand = grand - (grand *20/100);
            }
            else if(n1>=85 && n1<=89)
            {
                grand = grand - (grand *40/100);
            }
            else if(n1>=90 && n1<=94)
            {
                grand = grand - (grand *60/100);
            }
            else if(n1>=95 && n1<=99)
            {
                grand = grand - (grand *80/100);
            }
        }
        else
        {
            System.out.println("You did not win anything! Better luck next time.");
        }
        System.out.println("Your order will be made by:"+times);
        System.out.println("You have to pay :"+grand);
        System.out.println("You can call us on : "+((int)(Math.random()*100000000)));
        //delay loops
        for(int i =0; i<=10000000;i++)
        {
            for(int j=0;j<=1000;j++);
        }
        for(int i =0; i<=10000000;i++)
        {
            for(int j=0;j<=1000;j++);
        }
        for(int i =0; i<=10000000;i++)
        {
            for(int j=0;j<=1000;j++);
        }
        System.exit(0);
    }   //End of billing()
    
    public void menu1()
    {   // Start of menu1()
        System.out.println("\t     PIZZA STORE");
        System.out.println("\t___________________");
        System.out.println("\t   Make It Great");
        System.out.println("Welcome To Pizza Store");
        System.out.println("Choose from below ...");
        System.out.println("***Please choose from below and input the number alongside it***");
        System.out.println("1) A Delivery");
        System.out.println("2) A Take Away");
        System.out.println("3) Just Browsing");
    }   //End of menu1()
    
    public void menu2()
    {   //Start of menu2()
        System.out.println("\t     PIZZA STORE");
        System.out.println("\t___________________");
        System.out.println("\t   Make It Great");
        System.out.println("Welcome To Pizza Store");
        System.out.println("Choose from below ...");
        System.out.println("***Please choose from below and input the number alongside it***");
        System.out.println("1) A Delivery");
        System.out.println("2) A Take Away");
    }   //End of menu2()
}  //End of class Pizza_Store


public class PizzaStore 
{
    public static void main(String args[]) throws IOException
    {
        Pizza_Store obj = new Pizza_Store();
        obj.Main();
    }
}