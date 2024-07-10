package com.alura_challenge.conversor_de_divisas.Recursos;

import com.alura_challenge.conversor_de_divisas.Servicios.ConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Conversiones {
    private double pesoArgentino;
    private double realBrasileño;
    private double pesoColombiano;

    private final ConnectionService connectionService;

    @Autowired
    public Conversiones(ConnectionService connectionService) {
        this.connectionService = connectionService;
    }

    public void convertirUSDaARS() {
        pesoArgentino = connectionService.pesoArgentino;
        System.out.println("Digite la Cantidad de Dolares que Desea Convertir en Pesos Argentinos: ");
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();
        double conversion = numero * pesoArgentino;
        System.out.println("El Total de Dolares en Pesos Argentinos es de: "+conversion);
        System.out.println("Digite 0 Para Volver al menu");
        int volverAlMenu = scanner.nextInt();
        if(volverAlMenu == 0){
        return;}
    }

    public void convertirARSaUSD() {
        pesoArgentino = connectionService.pesoArgentino;
        System.out.println("Digite la Cantidad de Pesos Argentinosque Desea Convertir en Dolares: ");
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();
        double conversion = numero / pesoArgentino;
        System.out.println("El Total de Pesos Argentinos en Dolares es de: "+conversion);
        System.out.println("Digite 0 Para Volver al menu");
        int volverAlMenu = scanner.nextInt();
        if(volverAlMenu == 0){
            return;}
    }

    public void convertirUSDaBRL() {
        realBrasileño = connectionService.realBrasileño;
        System.out.println("Digite la Cantidad de Dolares que Desea Convertir en Reales Brasileños: ");
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();
        double conversion = numero * realBrasileño;
        System.out.println("El Total de Reales Brasileños en Dolares es de: "+conversion);
        System.out.println("Digite 0 Para Volver al menu");
        int volverAlMenu = scanner.nextInt();
        if(volverAlMenu == 0){
            return;}
    }

    public void convertirBRLaUSD() {
        realBrasileño = connectionService.realBrasileño;
        System.out.println("Digite la Cantidad Reales Brasileños que Desea Convertir en Dolares: ");
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();
        double conversion = numero / realBrasileño;
        System.out.println("El Total de Reales Brasileños en Pesos Dolares es de: "+conversion);
        System.out.println("Digite 0 Para Volver al menu");
        int volverAlMenu = scanner.nextInt();
        if(volverAlMenu == 0){
            return;}
    }

    public void convertirUSDaCOP() {
        pesoColombiano = connectionService.pesoColombiano;
        System.out.println("Digite la Cantidad de Dolares que Desea Convertir en Pesos Colombianos: ");
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();
        double conversion = numero * pesoColombiano;
        System.out.println("El Total de Pesos Colombianos en Dolares es de: "+conversion);
        System.out.println("Digite 0 Para Volver al menu");
        int volverAlMenu = scanner.nextInt();
        if(volverAlMenu == 0){
            return;}
    }

    public void convertirCOPaUSD() {
        pesoColombiano = connectionService.pesoColombiano;
        System.out.println("Digite la Cantidad de Pesos Colombianos que Desea Convertir a Dolares: ");
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();
        double conversion = numero / pesoColombiano;
        System.out.println("El Total de Dolares en Pesos Colombianos es de: "+conversion);
        System.out.println("Digite 0 Para Volver al menu");
        int volverAlMenu = scanner.nextInt();
        if(volverAlMenu == 0){
            return;}
    }
}

