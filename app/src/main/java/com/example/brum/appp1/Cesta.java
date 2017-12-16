package com.example.brum.appp1;
import java.util.*;

public class Cesta {

       ArrayList<Corte> cortes = new ArrayList<>();

       ArrayList<Bebidas> bebidas = new ArrayList<>();

       ArrayList<OutrasBebidas> trago = new ArrayList<>();

       public void Checkout() {

       }

       static private Cesta instance;

       static  public Cesta getInstance() {
              if(instance == null)
                     instance = new Cesta();
              return instance;
       }
}
