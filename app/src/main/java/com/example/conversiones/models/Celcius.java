package com.example.conversiones.models;

public class Celcius extends Grados{
   public Celcius parse(Fahrenteit F)
   {
       Celcius C = new Celcius();
       C.setValor((F.getValor()-32)/1.8);
       return C;
   }

    public Celcius parse(Kelvin K)
   {
       Celcius C = new Celcius();
       C.setValor((K.getValor()-273.15));
       return C;
   }

}
/// agregar los metodos que faltan -- -- -- --
// y hacer una interfaz bonita
// Tendra splash (inicio 5s y la siguiente pagina donde estaran los metodos o bueno las conversiones)