package com.example.hungerland;
import android.app.*;

import android.os.Bundle;

import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class PojoObjectsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pojo_objects); // Set the layout for this activity
        EdgeToEdge.enable(this);

        // Creating our Food Outlets Objects:

        // Italian Food Outlets
        ItalianFoodOutlet italiTaste= new ItalianFoodOutlet("Itali Taste","Chandigarh");
        italiTaste.enterPizzaInMenu("Magretta Pizza",150.00f);
        italiTaste.enterPizzaInMenu("Cheese Overloaded Pizza",370.00f);
        italiTaste.enterPizzaInMenu("Fresh Farm Pizza",280.00f);
        italiTaste.enterBurgerInMenu("Aalo Tikki Burger",70.00f);
        italiTaste.enterBurgerInMenu("Maharaja Mac Burger",180.00f);
        italiTaste.enterBurgerInMenu("Jai-Veeru Burger",210.00f);


        SouthIndianFoodOutlet uniqueSouth=new SouthIndianFoodOutlet("Unique South Taste","Kerla");
        uniqueSouth.enterDosaInMenu("Masala Dosa",200);
        uniqueSouth.enterDosaInMenu("Cheese Panner Dosa",320);
        uniqueSouth.enterDosaInMenu("Special Dosa",350);
        uniqueSouth.enterIdliInMenu("Special Idli",50);
        uniqueSouth.enterVadaPawInMenu("Ultimate Vada",40);

        NorthIndianFoodOutlet spicyNorth= new NorthIndianFoodOutlet("Spicy North","Chandigarh");
        spicyNorth.enterVegThaliInMenu("North Special Veg",200);
        spicyNorth.enterVegThaliInMenu(" 3 Makki Di Roti + Sarso Ka Saag",300);
        spicyNorth.enterNonVegThaliInMenu("Butter Chicken+ 6 Roti",350);
        spicyNorth.enterSpecialThaliInMenu("Special North Thali",380);

        ChineseFoodOutlet yoChinese= new ChineseFoodOutlet("Yo Chinese","Delhi");
        yoChinese.enterNoodlesInMenu("Haqqa Noodles",70);
        yoChinese.enterNoodlesInMenu("Masala Noodles",70);
        yoChinese.enterMomooseInMenu("Steam Momoose",40);
        yoChinese.enterMomooseInMenu("Veg Momoose",30);
        yoChinese.enterMomooseInMenu("Non Veg Momoose",50);
        yoChinese.enterSpringRoleInMenu("Yo yo special Spring Roll",50);

        AllInOne uniqueTaste= new AllInOne("Unique Taste","Delhi");
        uniqueTaste.enterPizzaInMenu("Cheese Corn Pizza",210.00f);
        uniqueTaste.enterPizzaInMenu("Itali Special Pizza",350.00f);
        uniqueTaste.enterPizzaInMenu("All In One Special Pizza",480.0f);
        uniqueTaste.enterBurgerInMenu("Mac Aalo Tikki",30);
        uniqueTaste.enterBurgerInMenu("Big Saver Burger",170);
        uniqueTaste.enterVegThaliInMenu("Daal Makhni + Sahi Panner + 4 Roti",220.0f);
        uniqueTaste.enterVegThaliInMenu("Mushroom+ Rice + Rajma+ 3 Roti",120.0f);
        uniqueTaste.enterNonVegThaliInMenu("Chicken Tikka+ 6 Roti ",199.0f);
        uniqueTaste.enterNonVegThaliInMenu("Kabab+ Chicken + 6 Roti",399.0f);
        uniqueTaste.enterSpecialThaliInMenu("All In One Special Thali", 340.f);
        uniqueTaste.enterDosaInMenu("Masala Dosa", 200);
        uniqueTaste.enterNoodlesInMenu("Haqqa Noodles",70.00f);
        uniqueTaste.enterIdliInMenu("Special Idli",50);
        uniqueTaste.enterSpringRoleInMenu("Veg Roll",20);
        uniqueTaste.enterSpringRoleInMenu("Non Veg Roll",40);
        uniqueTaste.enterVadaPawInMenu("Vada Paw with Gravy",50);
        uniqueTaste.enterMomooseInMenu("Steam Moomose",20);
        uniqueTaste.enterMomooseInMenu("Fried Moomose",30);

        //  Preparing  and Storing Italian Outlet Object in Firebase Cloud Database

              // --> 1. Preparing outlet: italiTaste object

        FirebaseFirestore db = FirebaseFirestore.getInstance();
        Map<String, Object> italiTasteMap = new HashMap<>();
        italiTasteMap.put("name", italiTaste.getName());
        italiTasteMap.put("location", italiTaste.getLocation());

        // Menu Card
        Map<String, Object> menuMap = new HashMap<>();
        menuMap.put("Pizza", italiTaste.getPizzas());
        menuMap.put("Burger", italiTaste.getBurgers());
        italiTasteMap.put("Menu Card", menuMap);


             // --->2. Storing italiTaste in Firestore

        db.collection("Italian Food Outlets")
                .document("Italic Taste")
                .set(italiTasteMap)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        // Data successfully written
                    }
                });

        //   Preparing  and Storing SouthIndian Outlet Object in Firebase Cloud Database
                   // --> 1. Preparing outlet: unique South object
        db = FirebaseFirestore.getInstance();
        Map<String, Object> uniqueSouthMap = new HashMap<>();
        uniqueSouthMap.put("name", uniqueSouth.getName());
        uniqueSouthMap.put("location", uniqueSouth.getLocation());

        // Menu Card
        Map<String, Object> MenuMap = new HashMap<>();
        MenuMap.put("Dosa", uniqueSouth.getDosas());
        MenuMap.put("Idli", uniqueSouth.getIdlis());
        MenuMap.put("Vada Paw", uniqueSouth.getVadaPaws());
        uniqueSouthMap.put("Menu Card", MenuMap);


        // Store the uniqueSouth Outlet in Firestore
        db.collection("South Indian Food Outlets")
                .document("Unique South")
                .set(uniqueSouthMap)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        // Data successfully written
                    }
                });



        //   Preparing  and Storing NorthIndian Outlet Object in Firebase Cloud Database
                // --> 1. Preparing outlet: spicyNorth object

        db = FirebaseFirestore.getInstance();
        Map<String, Object> spicyNorthMap = new HashMap<>();
        spicyNorthMap.put("name", spicyNorth.getName());
        spicyNorthMap.put("location", spicyNorth.getLocation());

        // Menu
        Map<String, Object> spicyNorthMenuMap = new HashMap<>();
        spicyNorthMenuMap.put("VegThali", spicyNorth.getVegThalis());
        spicyNorthMenuMap.put("Non Veg Thali",  spicyNorth.getNonVegThalis());
        spicyNorthMenuMap.put("Special Thali",  spicyNorth.getSpecialThalis());
        spicyNorthMap.put("Menu Card", spicyNorthMenuMap);


        //  --->2. Storing spicyNorth in Firestore

        db.collection("North Indian Food Outlets")
                .document("Spicy North")
                .set(spicyNorthMap)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        // Data successfully written
                    }
                });

        //   Preparing  and Storing Chinese Outlet Object in Firebase Cloud Database
              // --> 1. Preparing outlet: yoChinese object

        db = FirebaseFirestore.getInstance();
        Map<String, Object> YoChineseMap = new HashMap<>();
        YoChineseMap.put("name", yoChinese.getName());
        YoChineseMap.put("location", yoChinese.getLocation());

        // Menu
        Map<String, Object> YoChineseMenuMap = new HashMap<>();
        YoChineseMenuMap.put("Noodles", yoChinese.getNoodles());
        YoChineseMenuMap.put("Momoose",  yoChinese.getMomoose());
        YoChineseMenuMap.put("Spring Rolls", yoChinese.getSpringRolls());
        YoChineseMap.put("Menu Card", YoChineseMenuMap);

        //  --->2. Storing yoChinese in Firestore

        db.collection("Chinese Food Outlets")
                .document("Yo Chinese")
                .set(YoChineseMap)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        // Data successfully written
                    }
                });


        //   Preparing  and Storing All In One Outlet Object in Firebase Cloud Database
        // --> 1. Preparing outlet: uniqueTaste object
        db = FirebaseFirestore.getInstance();
        Map<String, Object> uniqueTasteMap = new HashMap<>();
        uniqueTasteMap.put("name", uniqueTaste.getName());
        uniqueTasteMap.put("location", uniqueTaste.getLocation());

        // Menu
        Map<String, Object> uniqueTasteMenuMap = new HashMap<>();
        uniqueTasteMenuMap.put("Noodles", uniqueTaste.getNoodles());
        uniqueTasteMenuMap.put("Momoose",  uniqueTaste.getMomoose());
        uniqueTasteMenuMap.put("Spring Rolls",  uniqueTaste.getSpringRolls());
        uniqueTasteMenuMap.put("Pizzas", uniqueTaste.getPizzas());
        uniqueTasteMenuMap.put("Burgers", uniqueTaste.getBurgers());
        uniqueTasteMenuMap.put("Dosa", uniqueTaste.getDosas());
        uniqueTasteMenuMap.put("Idli", uniqueTaste.getIdlis());
        uniqueTasteMenuMap.put("Vada Paw",  uniqueTaste.getVadaPaws());
        uniqueTasteMenuMap.put("Veg Thali", uniqueTaste.getVegThalis());
        uniqueTasteMenuMap.put("Non Veg Thali", uniqueTaste.getNonVegThalis());
        uniqueTasteMenuMap.put("Special Thali", uniqueTaste.getSpecialThalis());
        uniqueTasteMap.put("Menu Card", uniqueTasteMenuMap);


        //  --->2. Storing uniqueTaste in Firestore
        db.collection("All In One Food Outlets")
                .document("Unique Taste")
                .set(uniqueTasteMap)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        // Data successfully written
                    }
                });




    }
}
