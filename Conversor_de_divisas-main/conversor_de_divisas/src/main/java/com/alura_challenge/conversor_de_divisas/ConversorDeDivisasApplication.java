package com.alura_challenge.conversor_de_divisas;

import com.alura_challenge.conversor_de_divisas.Recursos.Conversiones;
import com.alura_challenge.conversor_de_divisas.Recursos.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ConversorDeDivisasApplication implements CommandLineRunner {
    @Autowired
    private Conversiones conversiones;
    @Autowired
    private Menu menu;

    public static void main(String[] args) {
        SpringApplication.run(ConversorDeDivisasApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int conversion;

        do {
            menu.mostrarMenu(); // Muestra el menú
            conversion = scanner.nextInt(); // Captura la entrada del usuario después de mostrar el menú
            try {
                switch (conversion) {
                    case 1:
                        conversiones.convertirUSDaARS();
                        break;
                    case 2:
                        conversiones.convertirARSaUSD();
                        break;
                    case 3:
                        conversiones.convertirUSDaBRL();
                        break;
                    case 4:
                        conversiones.convertirBRLaUSD();
                        break;
                    case 5:
                        conversiones.convertirUSDaCOP();
                        break;
                    case 6:
                        conversiones.convertirCOPaUSD();
                        break;
                    case 7:
                        break;

                    default:
                        System.out.println("Se Debe Digitar Una Opcion Valida ");

                }
            } catch (Exception e) {
                System.out.println("Debe Unicamente Digitar Números que Correspondan al Menu");
            }
        } while (conversion != 7);
        scanner.close();
        System.exit(0);
    }
}



