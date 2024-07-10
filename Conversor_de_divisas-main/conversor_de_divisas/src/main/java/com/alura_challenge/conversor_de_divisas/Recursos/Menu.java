package com.alura_challenge.conversor_de_divisas.Recursos;

import org.springframework.stereotype.Component;

@Component
public class Menu {
     public void mostrarMenu(){
         System.out.println("""
                    ****************************
                    ****Conversor de Divisas****
                    ****************************
                    Digite la Conversion que Desea Realizar

                    1) Dolar a Peso Argentino
                    2) Peso Argentino a Dolar
                    3) Dolar a Real Bracileño
                    4) Real Bracileño a Dolar
                    5) Dolar a peso colombiano
                    6) Peso Colombiano a Dolar
                    7) Salir
                    """);
    }
}
