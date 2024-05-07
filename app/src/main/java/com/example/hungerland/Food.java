package com.example.hungerland;

import java.util.HashMap;
import java.util.Map;



abstract class FoodItems{
    /**
        This class contains the identification for food Items , can
        contain properties like Taste, Rating of Food.
        Will Implement it later in the project
     */

}
final class NorthIndianFood extends FoodItems implements OutletDetails{
    /**
     This class contains an 2D array in which NorthIndian Food
     Items Category and it's Variety will be store.
        Categories are : Veg Thali, Non Veg Thali, SpecialThali

     This class implements an OutletInterface in which ShowMeny method
     needs to be override, else your class become an abstract!
     */
    private final Object[][] foodArray;

    public NorthIndianFood() {

        foodArray = new Object[3][10];
    }

    public void showMenu() {
        for (Object[] row : foodArray) {
            for (Object item : row) {
                if (item instanceof VegThali) {
                    System.out.println("NorthIndian - VegThali : " + ((VegThali) item).name + "    " + ((VegThali) item).price);
                } else if (item instanceof NonVegThali) {
                    System.out.println("NorthIndian - NonVegThali : " + ((NonVegThali) item).name + "   " + ((NonVegThali) item).price);
                } else if (item instanceof SpecialThali) {
                    System.out.println("NorthIndian - SpecialThali : " + ((SpecialThali) item).name + "   " + ((SpecialThali) item).price);
                }
            }
        }
    }

    // **********************************
    public Map<String, Object> getVegThalis(){
        Map<String, Object> vegThalisMap = new HashMap<>();
        int vegThaliCount = 1;

        for (Object[] row : foodArray) {
            for (Object item : row) {
                if (item instanceof VegThali) {
                    VegThali vegThali = (VegThali) item;
                    String vegThaliKey = "vegThali_" + vegThaliCount;
                    Map<String, Object> vegThaliMap = new HashMap<>();
                    vegThaliMap.put("name", vegThali.getName());
                    vegThaliMap.put("price", vegThali.getPrice());
                    vegThalisMap.put(vegThaliKey, vegThaliMap);  // storing this in vegThalis map
                    vegThaliCount++;
                }
            }
        }

        return vegThalisMap;

    }
    public Map<String, Object> getNonVegThalis(){
        Map<String, Object> nonVegThalisMap = new HashMap<>();
        int nonVegThaliCount = 1;

        for (Object[] row : foodArray) {
            for (Object item : row) {
                if (item instanceof NonVegThali) {
                    NonVegThali nonVegThali = (NonVegThali) item;
                    String nonVegThaliKey = "nonVegThali_" + nonVegThaliCount;
                    Map<String, Object> nonVegThaliMap = new HashMap<>();
                    nonVegThaliMap.put("name", nonVegThali.getName());
                    nonVegThaliMap.put("price", nonVegThali.getPrice());
                    nonVegThalisMap.put(nonVegThaliKey, nonVegThaliMap);  // storing this in nonVegThalis map
                    nonVegThaliCount++;
                }
            }
        }

        return nonVegThalisMap;

    }

    public Map<String, Object> getSpecialThalis(){
        Map<String, Object> specialThalisMap = new HashMap<>();
        int specialThaliCount = 1;

        for (Object[] row : foodArray) {
            for (Object item : row) {
                if (item instanceof SpecialThali) {
                    SpecialThali specialThali = (SpecialThali) item;
                    String specialThaliKey = "specialThali_" + specialThaliCount;
                    Map<String, Object> specialThaliMap = new HashMap<>();
                    specialThaliMap.put("name", specialThali.getName());
                    specialThaliMap.put("price", specialThali.getPrice());
                    specialThalisMap.put(specialThaliKey, specialThaliMap);
                    specialThaliCount++;
                }
            }
        }

        return specialThalisMap;

    }

    //****************************************************************8

    public final class VegThali extends FoodIdentification {
        VegThali(String name, float price) {

            super(name,price);
        }

        public void addVegThali(int row, int col) {

            foodArray[row][col] = this;
        }
    }

    public final class NonVegThali extends FoodIdentification {
        NonVegThali(String name, float price) {

            super(name,price);
        }

        public void addNonVegThali(int row, int col) {

            foodArray[row][col] = this;
        }

    }

    public final class SpecialThali extends FoodIdentification {
        SpecialThali(String name, float price) {
            super(name,price);
        }

        public void addSpecialThali(int row, int col) {
            foodArray[row][col] = this;

        }
    }
}
final class SouthIndianFood extends FoodItems implements OutletDetails {
    /**
      This class contains an 2D array in which SouthIndian Food
      Items Category and it's Variety will be store.
     Categories are : Idli, Dosa, VadaPaw

     This class implements an OutletInterface in which ShowMeny method
     needs to be override, else your class become an abstract!
     */
    private final Object[][] foodArray;

    public SouthIndianFood() {
        foodArray = new Object[3][10];
    }

    public void showMenu() {
        for (Object[] row : foodArray) {
            for (Object item : row) {
                if (item instanceof Idli) {
                    System.out.println("South-Indian - Idli : " + ((Idli) item).name + "    " + ((Idli) item).price);
                } else if (item instanceof Dosa) {
                    System.out.println("South-Indian - Dosa : " + ((Dosa) item).name + "   " + ((Dosa) item).price);
                } else if (item instanceof VadaPaw) {
                    System.out.println("South-Indian - VadaPaw : " + ((VadaPaw) item).name + "   " + ((VadaPaw) item).price);
                }
            }
        }
    }
    //***************************************************************
    public Map<String, Object> getIdlis(){
        Map<String, Object> idlisMap = new HashMap<>();
        int idliCount = 1;

        for (Object[] row : foodArray) {
            for (Object item : row) {
                if (item instanceof Idli) {
                    Idli idli = (Idli) item;
                    String idliKey = "idli_" + idliCount;
                    Map<String, Object> idliMap = new HashMap<>();
                    idliMap.put("name", idli.getName());
                    idliMap.put("price", idli.getPrice());
                    idlisMap.put(idliKey, idliMap);
                    idliCount++;
                }
            }
        }

        return idlisMap;

    }
    public Map<String, Object> getDosas(){
        Map<String, Object> dosasMap = new HashMap<>();
        int dosaCount = 1;

        for (Object[] row : foodArray) {
            for (Object item : row) {
                if (item instanceof Dosa) {
                    Dosa dosa = (Dosa) item;
                    String dosaKey = "dosa_" + dosaCount;
                    Map<String, Object> dosaMap = new HashMap<>();
                    dosaMap.put("name", dosa.getName());
                    dosaMap.put("price", dosa.getPrice());
                    dosasMap.put(dosaKey, dosaMap);
                    dosaCount++;
                }
            }
        }

        return dosasMap;
    }
    public Map<String, Object> getVadaPaws(){
        Map<String, Object> vadaPawsMap = new HashMap<>();
        int vadaPawCount = 1;

        for (Object[] row : foodArray) {
            for (Object item : row) {
                if (item instanceof VadaPaw) {
                    VadaPaw vadaPaw = (VadaPaw) item;
                    String vadaPawKey = "vadaPaw_" + vadaPawCount;
                    Map<String, Object> vadaPawMap = new HashMap<>();
                    vadaPawMap.put("name", vadaPaw.getName());
                    vadaPawMap.put("price", vadaPaw.getPrice());
                    vadaPawsMap.put(vadaPawKey, vadaPawMap);
                    vadaPawCount++;
                }
            }
        }

        return vadaPawsMap;

    }

    //***********************************************8

    public final class Idli extends FoodIdentification {
        Idli(String name, float price) {
            super(name,price);
        }

        public void addIdli(int row, int col) {
            foodArray[row][col] = this;

        }
    }

    public final class Dosa extends FoodIdentification {
        Dosa(String name, float price) {
            super(name,price);
        }

        public void addDosa(int row, int col) {
            foodArray[row][col] = this;

        }
    }

    public final class VadaPaw extends FoodIdentification {

        VadaPaw(String name, float price) {
            super(name,price);
        }

        public void addVadaPaw(int row, int col) {
            foodArray[row][col] = this;

        }
    }
}
final class ChineseFood extends FoodItems implements OutletDetails{
    /**
     This class contains an 2D array in which Chinese Food
     Items Category and it's Variety will be store.
     Categories are : Noodles, Momoose, SpringRole

     This class implements an OutletInterface in which ShowMeny method
     needs to be override, else your class become an abstract!
     */
    private final Object[][] foodArray;
    public ChineseFood(){
        foodArray= new Object[3][10];
    }
    public void showMenu(){
        for (Object[] row : foodArray) {
            for (Object item : row) {
                if (item instanceof Noodles) {
                    System.out.println("Chinese - Noodles : " + ((Noodles) item).name+ "    "+ ((Noodles) item).price);
                } else if (item instanceof SpringRoll) {
                    System.out.println("Chinese - SpringRoll : " + ((SpringRoll) item).name+ "   "+ ((SpringRoll) item).price);
                }
                else if(item instanceof Momoose){
                    System.out.println("Chinese - Momoose : " + ((Momoose) item).name+ "   "+ ((Momoose) item).price);
                }
            }
        }
    }

    //**********************************************8

    public Map<String, Object> getNoodles(){
        Map<String, Object> noodlessMap = new HashMap<>();
        int noodlesCount = 1;

        for (Object[] row : foodArray) {
            for (Object item : row) {
                if (item instanceof Noodles) {
                    Noodles noodles = (Noodles) item;
                    String  noodlesKey = " noodles_" +  noodlesCount;
                    Map<String, Object>  noodlesMap = new HashMap<>();
                    noodlesMap.put("name",  noodles.getName());
                    noodlesMap.put("price",  noodles.getPrice());
                    noodlessMap.put( noodlesKey,  noodlesMap);
                    noodlesCount++;
                }
            }
        }

        return noodlessMap;

    }

    public Map<String, Object> getSpringRolls(){
        Map<String, Object> springRollssMap = new HashMap<>();
        int springRollsCount = 1;

        for (Object[] row : foodArray) {
            for (Object item : row) {
                if (item instanceof SpringRoll) {
                    SpringRoll springRolls = (SpringRoll) item;
                    String  springRollsKey = " springRolls_" +  springRollsCount;
                    Map<String, Object>  springRollsMap = new HashMap<>();
                    springRollsMap.put("name",  springRolls.getName());
                    springRollsMap.put("price",  springRolls.getPrice());
                    springRollssMap.put( springRollsKey,  springRollsMap);
                    springRollsCount++;
                }
            }
        }

        return springRollssMap;
    }

    public Map<String, Object> getMomoose(){
        Map<String, Object> momoosesMap = new HashMap<>();
        int momooseCount = 1;

        for (Object[] row : foodArray) {
            for (Object item : row) {
                if (item instanceof Momoose) {
                    Momoose momoose = (Momoose) item;
                    String  momooseKey = " momoose_" +  momooseCount;
                    Map<String, Object>  momooseMap = new HashMap<>();
                    momooseMap.put("name",  momoose.getName());
                    momooseMap.put("price",  momoose.getPrice());
                    momooseMap.put( momooseKey,  momooseMap);
                    momooseCount++;
                }
            }
        }

        return momoosesMap;

    }

    //****************************************************************
    public final class Noodles extends FoodIdentification {

        Noodles(String name, float price){
            super(name,price);
        }
        public void addNoodles(int row, int col){
            foodArray[row][col]=this;

        }
    }
    public final class Momoose extends FoodIdentification{
        Momoose(String name, float price){
            super(name,price);
        }
        public void addMomoose(int row, int col){
            foodArray[row][col]=this;

        }

    }
    public final class SpringRoll extends FoodIdentification{

        SpringRoll(String name, float price){
            super(name,price);
        }
        public void addSpringRoll(int row, int col){
            foodArray[row][col]=this;

        }
    }

}
 final class ItalianFood extends FoodItems implements OutletDetails {
    /**
     This class contains an 2D array in which Italian Food
     Items Category and it's Variety will be store.
     Categories are : Idli, Dosa, VadaPaw

     This class implements an OutletInterface in which ShowMeny method
     needs to be override, else your class become an abstract!
     */
    private  Object[][] foodArray;


    public ItalianFood() {
        foodArray = new Object[2][10];
    }
     public Object[][] getFoodArray(){
         return foodArray;
     }

    public void showMenu() {
        for (Object[] row : foodArray) {
            for (Object item : row) {
                if (item instanceof Pizza) {
                    System.out.println("Italian - Pizza: " + ((Pizza) item).getName() + "    " + ((Pizza) item).getPrice());
                } else if (item instanceof Burger) {
                    System.out.println("Italian - Burger: " + ((Burger) item).getName() + "   " + ((Burger) item).getPrice());
                }
            }
        }
    }
     public Map<String, Object> getPizzas(){
         Map<String, Object> pizzasMap = new HashMap<>();
         int pizzaCount = 1;

         for (Object[] row : foodArray) {
             for (Object item : row) {
                 if (item instanceof Pizza) {
                     Pizza pizza = (Pizza) item;
                     String pizzaKey = "pizza_" + pizzaCount;
                     Map<String, Object> pizzaMap = new HashMap<>();
                     pizzaMap.put("name", pizza.getName());
                     pizzaMap.put("price", pizza.getPrice());
                     pizzasMap.put(pizzaKey, pizzaMap);  // storing this in pizzas map
                     pizzaCount++;
                 }
             }
         }

         return pizzasMap;

     }
     public Map<String, Object> getBurgers(){
         Map<String, Object> burgersMap = new HashMap<>();
         int burgerCount = 1;

         for (Object[] row : foodArray) {
             for (Object item : row) {
                 if (item instanceof Burger) {
                     Burger burger = (Burger) item;
                     String burgerKey = "burger_" + burgerCount;
                     Map<String, Object> burgerMap = new HashMap<>();
                     burgerMap.put("name", burger.getName());
                     burgerMap.put("price", burger.getPrice());
                     // Add any other pizza properties you want to include
                     burgersMap.put(burgerKey, burgerMap);
                     burgerCount++;
                 }
             }
         }

         return burgersMap;

     }


    public final class Pizza extends FoodIdentification {

        Pizza(String name, float price) {
            super(name,price);
        }

        public void addPizza(int row, int col) {
            foodArray[row][col] = this;

        }
    }

    public final class Burger extends FoodIdentification {

        Burger(String name, float price) {
            super(name,price);
        }

        public void addBurger(int row, int col) {
            foodArray[row][col] = this;

        }

    }
}
// OUTLETS
abstract class FoodOutlets{
    /**
        This class contains the necessity of any FoodOutlets have
        It has Properties like name, location and there getter and setter

        By Default name is given to any outlet is "Unknown", and Location: "India"

     This class will be modified in future as per to project requirements!

     */
    private String name;
    private String location;
    FoodOutlets(){
        this("Unknown","India");

    }
    FoodOutlets(String name, String location){
        this.name=name;
        this.location=location;
    }
    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getLocation() {
        return location;
    }

    public final void setLocation(String location) {
        this.location = location;
    }

}

class SouthIndianFoodOutlet extends FoodOutlets implements OutletDetails{

    /**
        This class is meant for Outlets for Presenting SouthIndian Food.
        This class inherit necessity properties of any food outlet can have from
        FoodOutlets class
        And it also implements functionality for showMenu, else your class become abstract!
     */
    private final SouthIndianFood southFood;
    private static int IDLICOUNT;
    private static int DOSACOUNT;
    private static int VADAPAWCOUNT;
    public SouthIndianFoodOutlet(){
        this("Unkown","India");
    }
    public  SouthIndianFoodOutlet(String name, String location){
        super(name,location);
        this.southFood=new SouthIndianFood();
    }
    public final void enterIdliInMenu(String name, float price){
        SouthIndianFood.Idli newIdli=southFood.new Idli(name,price);
        newIdli.addIdli(0,++IDLICOUNT);
    }
    public final void enterDosaInMenu(String name, float price){
        SouthIndianFood.Dosa newDosa=southFood.new Dosa(name,price);
        newDosa.addDosa(1,++DOSACOUNT);
    }
    public final void enterVadaPawInMenu(String name, float price){
        SouthIndianFood.VadaPaw newVadaPaw=southFood.new VadaPaw(name,price);
        newVadaPaw.addVadaPaw(2,++VADAPAWCOUNT);
    }
    public final void showMenu(){
        southFood.showMenu();
    }


//  ***********************************************

    public Map<String,Object> getIdlis(){

        return southFood.getIdlis();
    }
    public Map<String,Object> getVadaPaws(){
        return southFood.getVadaPaws();
    }
    public Map<String,Object> getDosas(){
        return southFood.getDosas();

    }
//****************************************************8
}


class NorthIndianFoodOutlet extends FoodOutlets implements OutletDetails{
    /**
     This class is meant for Outlets for Presenting NorthIndian Food.
     This class inherit necessity properties of any food outlet can have from
     FoodOutlets class
     And it also implements functionality for showMenu, else your class become abstract!
     */
    private final NorthIndianFood northFood;
    private static int VEGTHALICOUNT;
    private static int NONVEGTHALICOUNT;
    private static int SPECIALTHALICOUNT;

    public NorthIndianFoodOutlet(){
        this("Unkown","India");
    }
    public  NorthIndianFoodOutlet(String name, String location){
        super(name,location);
        this.northFood=new NorthIndianFood();
    }
    public final void enterVegThaliInMenu(String name, float price){
        NorthIndianFood.VegThali newVegThali=northFood.new VegThali(name,price);
        newVegThali.addVegThali(0,++VEGTHALICOUNT);
    }
    public final void enterNonVegThaliInMenu(String name, float price){
        NorthIndianFood.NonVegThali newNonVegThali=northFood.new NonVegThali(name,price);
        newNonVegThali.addNonVegThali(1,++NONVEGTHALICOUNT);

    }
    public final void enterSpecialThaliInMenu(String name, float price){
        NorthIndianFood.SpecialThali newSpecialThali=northFood.new SpecialThali(name,price);
        newSpecialThali.addSpecialThali(2,++SPECIALTHALICOUNT);
    }
    public final void showMenu(){
        northFood.showMenu();
    }
    //**********************************************
    public Map<String,Object> getVegThalis(){

        return northFood.getVegThalis();
    }
    public Map<String,Object> getNonVegThalis(){
        return northFood.getNonVegThalis();

    }
    public Map<String,Object> getSpecialThalis(){
        return northFood.getSpecialThalis();

    }
    //***************************************************

}
class ChineseFoodOutlet extends FoodOutlets implements OutletDetails{
    /**
     This class is meant for Outlets for Presenting Chinese Food.
     This class inherit necessity properties of any food outlet can have from
     FoodOutlets class
     And it also implements functionality for showMenu, else your class become abstract!
     */
    private final ChineseFood chineseFood;
    private static int NOODLESCOUNT;
    private static int MOMOOSECOUNT;
    private static int SPRINGROLECOUNT;
    public ChineseFoodOutlet(){
        this("Unkown","India");
    }
    public  ChineseFoodOutlet(String name, String location){
        super(name,location);
        this.chineseFood=new ChineseFood();
    }

    public final void enterNoodlesInMenu(String name, float price){
        ChineseFood.Noodles newNoodles=chineseFood.new Noodles(name,price);
        newNoodles.addNoodles(0,++NOODLESCOUNT);
    }
    public final void enterMomooseInMenu(String name, float price){
        ChineseFood.Momoose newMomoose=chineseFood.new Momoose(name,price);
        newMomoose.addMomoose(1,++MOMOOSECOUNT);
    }
    public final void enterSpringRoleInMenu(String name, float price){
        ChineseFood.SpringRoll newSpringRole=chineseFood.new SpringRoll(name,price);
        newSpringRole.addSpringRoll(2,++SPRINGROLECOUNT);
    }
    public final void showMenu(){
        chineseFood.showMenu();
    }
    //*****************************************
    public Map<String,Object> getNoodles(){

        return chineseFood.getNoodles();
    }
    public Map<String,Object> getMomoose(){
        return chineseFood.getMomoose();

    }
    public Map<String,Object> getSpringRolls(){
        return chineseFood.getSpringRolls();

    }
//****************************************************
}
class ItalianFoodOutlet extends FoodOutlets implements OutletDetails {
    /**
     * This class is meant for Outlets for Presenting Italian Food.
     * This class inherit necessity properties of any food outlet can have from
     * FoodOutlets class
     * And it also implements functionality for showMenu, else your class become abstract!
     */

    private final ItalianFood italicFood;
    private static int PIZZACOUNT;
    private static int BURGERCOUNT;

    public ItalianFoodOutlet() {
        this("Unkown", "India");
    }

    public ItalianFoodOutlet(String name, String location) {
        super(name, location);
        this.italicFood = new ItalianFood();

    }

    public final void enterPizzaInMenu(String name, float price) {
        ItalianFood.Pizza newPizza = italicFood.new Pizza(name, price);
        newPizza.addPizza(0, ++PIZZACOUNT);
    }

    public final void enterBurgerInMenu(String name, float price) {
        ItalianFood.Burger newBurger = italicFood.new Burger(name, price);
        newBurger.addBurger(1, ++BURGERCOUNT);
    }

    public  void  showMenu() {
       italicFood.showMenu();
    }
    public Map<String,Object> getPizzas(){

        return italicFood.getPizzas();
    }
    public Map<String,Object> getBurgers(){
        return italicFood.getBurgers();

    }



}
class AllInOne extends FoodOutlets implements OutletDetails{
    /**
     This class is meant for Outlets for Presenting All Categories of Food.
     This class inherit necessity properties of any food outlet can have from
     FoodOutlets class
     And it also implements functionality for showMenu, else your class become abstract!
     */
    private final ItalianFood italicFood;
    private static int PIZZACOUNT;
    private static int BURGERCOUNT;
    private final NorthIndianFood northFood;
    private static int VEGTHALICOUNT;
    private static int NONVEGTHALICOUNT;
    private static int SPECIALTHALICOUNT;
    private final SouthIndianFood southFood;
    private static int IDLICOUNT;
    private static int DOSACOUNT;
    private static int VADAPAWCOUNT;
    private final ChineseFood chineseFood;
    private static int NOODLESCOUNT;
    private static int MOMOOSECOUNT;
    private static int SPRINGROLECOUNT;


    public AllInOne(){
        this("Unkown","India");

    }
    public AllInOne(String name, String location){
        super(name,location);
        this.italicFood =new ItalianFood();
        this.northFood=new NorthIndianFood();
        this.southFood=new SouthIndianFood();
        this.chineseFood=new ChineseFood();

    }
    // Italian
    public final void enterPizzaInMenu(String name, float price){
        ItalianFood.Pizza newPizza= italicFood.new Pizza(name,price);
        newPizza.addPizza(0,++PIZZACOUNT);
    }
    public final void enterBurgerInMenu(String name, float price){
        ItalianFood.Burger newBurger= italicFood.new Burger(name,price);
        newBurger.addBurger(1,++BURGERCOUNT);
    }

    // North Indian
    public final void enterVegThaliInMenu(String name, float price){
        NorthIndianFood.VegThali newThali=northFood.new VegThali(name,price);
        newThali.addVegThali(0,++VEGTHALICOUNT);
    }
    public final void enterNonVegThaliInMenu(String name, float price){
        NorthIndianFood.NonVegThali newThali=northFood.new NonVegThali(name,price);
        newThali.addNonVegThali(1,++NONVEGTHALICOUNT);
    }
    public final void enterSpecialThaliInMenu(String name, float price){
        NorthIndianFood.SpecialThali newThali=northFood.new SpecialThali(name,price);
        newThali.addSpecialThali(2,++SPECIALTHALICOUNT);
    }


    // South Indian

    public final void enterIdliInMenu(String name, float price){

        SouthIndianFood.Idli newIdli=southFood.new Idli(name,price);
        newIdli.addIdli(0,++IDLICOUNT);
    }
    public final void enterDosaInMenu(String name, float price){
        SouthIndianFood.Dosa newDosa=southFood.new Dosa(name,price);
        newDosa.addDosa(1,++DOSACOUNT);
    }
    public final void enterVadaPawInMenu(String name, float price){
        SouthIndianFood.VadaPaw newVadaPaw=southFood.new VadaPaw(name,price);
        newVadaPaw.addVadaPaw(2,++VADAPAWCOUNT);
    }
    // Chineese

    public final void enterNoodlesInMenu(String name, float price){
        ChineseFood.Noodles newNoodles=chineseFood.new Noodles(name,price);
        newNoodles.addNoodles(0,++NOODLESCOUNT);
    }
    public final void enterMomooseInMenu(String name, float price){
        ChineseFood.Momoose newMomoose=chineseFood.new Momoose(name,price);
        newMomoose.addMomoose(1,++MOMOOSECOUNT);
    }
    public final void enterSpringRoleInMenu(String name, float price){
        ChineseFood.SpringRoll newSpringRole=chineseFood.new SpringRoll(name,price);
        newSpringRole.addSpringRoll(2,++SPRINGROLECOUNT);
    }

    // Show Menu Card of the Outlet
    public final void showMenu(){
        italicFood.showMenu();
        northFood.showMenu();
        southFood.showMenu();
        chineseFood.showMenu();
    }

    public Map<String,Object> getPizzas(){

        return italicFood.getPizzas();
    }
    public Map<String,Object> getBurgers(){
        return italicFood.getBurgers();

    }
    public Map<String,Object> getNoodles(){

        return chineseFood.getNoodles();
    }
    public Map<String,Object> getMomoose(){
        return chineseFood.getMomoose();

    }
    public Map<String,Object> getSpringRolls(){
        return chineseFood.getSpringRolls();

    }
    public Map<String,Object> getIdlis(){

        return southFood.getIdlis();
    }
    public Map<String,Object> getVadaPaws(){
        return southFood.getVadaPaws();
    }
    public Map<String,Object> getDosas(){
        return southFood.getDosas();

    }
    public Map<String,Object> getVegThalis(){

        return northFood.getVegThalis();
    }
    public Map<String,Object> getNonVegThalis(){
        return northFood.getNonVegThalis();

    }
    public Map<String,Object> getSpecialThalis(){
        return northFood.getSpecialThalis();

    }



}



public class Food {
    public static void main(String [] args){
        // Italian Outlet
        System.out.println("\n\nItali Taste Outlet Menu\n\n");
        ItalianFoodOutlet italiTaste= new ItalianFoodOutlet("Itali Taste","Chandigarh");

        italiTaste.enterPizzaInMenu("Magretta Pizza",150.00f);
        italiTaste.enterPizzaInMenu("Cheese Overloaded Pizza",370.00f);
        italiTaste.enterPizzaInMenu("Fresh Farm Pizza",280.00f);
        italiTaste.enterBurgerInMenu("Aalo Tikki Burger",70.00f);
        italiTaste.enterBurgerInMenu("Maharaja Mac Burger",180.00f);
        italiTaste.enterBurgerInMenu("Jai-Veeru Burger",210.00f);
        italiTaste.showMenu();

        // All In One Outlet
        System.out.println("\n\nAll In One Taste Outlet Menu\n\n");
        AllInOne uniqueTaste= new AllInOne("Unique Taste","Delhi");
        uniqueTaste.enterPizzaInMenu("Cheese Corn Pizza",210.00f);
        uniqueTaste.enterPizzaInMenu("Itali Special Pizza",350.00f);
        uniqueTaste.enterPizzaInMenu("All In One Special Pizza",480.0f);
        uniqueTaste.enterBurgerInMenu("Mac Aalo Tikki",30);
        uniqueTaste.enterBurgerInMenu("Big Saver Burger",170);
        uniqueTaste.enterVegThaliInMenu("DaalMakhni+SahiPanner+4 Roti",220.0f);
        uniqueTaste.enterVegThaliInMenu("Mushroom+ Rice+Rajma+ 3 Roti",120.0f);
        uniqueTaste.enterNonVegThaliInMenu("ChickenTikka+ 6 Roti ",199.0f);
        uniqueTaste.enterNonVegThaliInMenu("Kabab+ Chicken + 6 Roti",399.0f);
        uniqueTaste.enterSpecialThaliInMenu("All In One Special Thali", 340.f);
        uniqueTaste.enterDosaInMenu("Masala Dosa", 200);
        uniqueTaste.enterNoodlesInMenu("Haqqa Noodles",70.00f);
        uniqueTaste.enterMomooseInMenu("Steam Momoose",40);
        uniqueTaste.showMenu();

        System.out.println("\n\nUnique South Taste Outlet Menu\n\n");
        SouthIndianFoodOutlet uniqueSouth=new SouthIndianFoodOutlet("Unique South Taste","Kerla");
        uniqueSouth.enterDosaInMenu("Masala Dosa",200);
        uniqueSouth.enterDosaInMenu("Cheese Panner Dosa",320);
        uniqueSouth.enterDosaInMenu("Special Dosa",350);
        uniqueSouth.enterIdliInMenu("Special Idli",50);
        uniqueSouth.enterVadaPawInMenu("Ultimate Vada",40);
        uniqueSouth.showMenu();

        System.out.println("\n\nYoo Chinese Outlet Menu\n\n");
        ChineseFoodOutlet yoChinese= new ChineseFoodOutlet("Yo Chinese","Delhi");
        yoChinese.enterNoodlesInMenu("Haqqa Noodles",70);
        yoChinese.enterNoodlesInMenu("Masala Noodles",70);
        yoChinese.enterMomooseInMenu("Steam Momoose",40);
        yoChinese.enterMomooseInMenu("Veg Momoose",30);
        yoChinese.enterMomooseInMenu("Non Veg Momoose",50);
        yoChinese.enterSpringRoleInMenu("Yo yo special Spring Roll",50);
        yoChinese.showMenu();


        System.out.println("\n\n Spicy North Outlet Menu\n\n");
        NorthIndianFoodOutlet spicyNorth= new NorthIndianFoodOutlet("Spicy North","Chandigarh");
        spicyNorth.enterVegThaliInMenu("North Special Veg",200);
        spicyNorth.enterVegThaliInMenu(" 3 Makki Di Roti + Sarso Ka Saag",300);
        spicyNorth.enterNonVegThaliInMenu("Butter Chicken+ 6 Roti",350);
        spicyNorth.enterSpecialThaliInMenu("Special North Thali",380);
        spicyNorth.showMenu();



    }
}

