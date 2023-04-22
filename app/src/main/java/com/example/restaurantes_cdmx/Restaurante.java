package com.example.restaurantes_cdmx;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {


    private List<Menu> menus;

    public Restaurante(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.menus = new ArrayList<>();
    }

    public void agregarMenu(Menu menu) {
        menus.add(menu);
    }

    public List<Menu> obtenerMenus() {
        return menus;
    }

    // Nombres de los restaurantes y sus respectivos menús
    public static List<Restaurante> obtenerRestaurantes() {
        List<Restaurante> restaurantes = new ArrayList<>();

        // Restaurante 1
        Restaurante restaurante1 = new Restaurante("La Cantina", "Calle 1, Ciudad de México");

        // Menú 1
        Menu menuComida1 = new Menu("Comida");
        menuComida1.agregarItem(new ItemMenu("Tacos al pastor"));
        menuComida1.agregarItem(new ItemMenu("Tostadas de tinga"));
        menuComida1.agregarItem(new ItemMenu("Enchiladas verdes"));

        // Menú 2
        Menu menuBebidas1 = new Menu("Bebidas");
        menuBebidas1.agregarItem(new ItemMenu("Margarita"));
        menuBebidas1.agregarItem(new ItemMenu("Cerveza"));
        menuBebidas1.agregarItem(new ItemMenu("Tequila"));

        // Menú 3
        Menu menuComplementos1 = new Menu("Complementos");
        menuComplementos1.agregarItem(new ItemMenu("Guacamole"));
        menuComplementos1.agregarItem(new ItemMenu("Chips con salsa"));

        restaurante1.agregarMenu(menuComida1);
        restaurante1.agregarMenu(menuBebidas1);
        restaurante1.agregarMenu(menuComplementos1);

        restaurantes.add(restaurante1);

        // Restaurante 2
        Restaurante restaurante2 = new Restaurante("El Tizón", "Calle 2, Ciudad de México");

        // Menú 1
        Menu menuComida2 = new Menu("Comida");
        menuComida2.agregarItem(new ItemMenu("Chilaquiles"));
        menuComida2.agregarItem(new ItemMenu("Huevos rancheros"));
        menuComida2.agregarItem(new ItemMenu("Torta de milanesa"));

        // Menú 2
        Menu menuBebidas2 = new Menu("Bebidas");
        menuBebidas2.agregarItem(new ItemMenu("Café"));
        menuBebidas2.agregarItem(new ItemMenu("Jugo de naranja"));
        menuBebidas2.agregarItem(new ItemMenu("Agua de horchata"));

        // Menú 3
        Menu menuComplementos2 = new Menu("Complementos");
        menuComplementos2.agregarItem(new ItemMenu("Frijoles"));
        menuComplementos2.agregarItem(new ItemMenu("Papas fritas"));

        restaurante2.agregarMenu(menuComida2);
        restaurante2.agregarMenu(menuBebidas2);
        restaurante2.agregarMenu(menuComplementos2);
        restaurantes.add(restaurante2);

        // Restaurante 3
        Restaurante restaurante3 = new Restaurante("El Sabor de Mexico", "Avenida 2, Ciudad de México");

        // Menú 1
        Menu menuComida2 = new Menu("Comida");
        menuComida2.agregarItem(new ItemMenu("Chiles en Nogada"));
        menuComida2.agregarItem(new ItemMenu("Pozole"));
        menuComida2.agregarItem(new ItemMenu("Tamales"));

        // Menú 2
        Menu menuBebidas2 = new Menu("Bebidas");
        menuBebidas2.agregarItem(new ItemMenu("Agua de Horchata"));
        menuBebidas2.agregarItem(new ItemMenu("Tequila Sunrise"));
        menuBebidas2.agregarItem(new ItemMenu("Café de Olla"));

        // Menú 3
        Menu menuComplementos2 = new Menu("Complementos");
        menuComplementos2.agregarItem(new ItemMenu("Frijoles Refritos"));
        menuComplementos2.agregarItem(new ItemMenu("Arroz Rojo"));
        menuComplementos2.agregarItem(new ItemMenu("Salsa de Molcajete"));

        restaurante3.agregarMenu(menuComida2); // Se corrige el nombre del objeto menuComida1 a menuComida2
        restaurante3.agregarMenu(menuBebidas2); // Se corrige el nombre del objeto menuBebidas1 a menuBebidas2
        restaurante3.agregarMenu(menuComplementos2); // Se corrige el nombre del objeto menuComplementos1 a menuComplementos2

        restaurantes.add(restaurante3);

        // Restaurante 4
        Restaurante restaurante4 = new Restaurante("La Cocina Mexicana", "Calle 3, Ciudad de México");

        // Menú 1
        Menu menuComida3 = new Menu("Comida");
        menuComida3.agregarItem(new ItemMenu("Mole Poblano"));
        menuComida3.agregarItem(new ItemMenu("Chilaquiles"));
        menuComida3.agregarItem(new ItemMenu("Tacos de Pescado"));

        // Menú 2
        Menu menuBebidas3 = new Menu("Bebidas");
        menuBebidas3.agregarItem(new ItemMenu("Michelada"));
        menuBebidas3.agregarItem(new ItemMenu("Agua de Jamaica"));
        menuBebidas3.agregarItem(new ItemMenu("Margarita de Mango"));

        // Menú 3
        Menu menuComplementos3 = new Menu("Complementos");
        menuComplementos3.agregarItem(new ItemMenu("Chiles Toreados"));
        menuComplementos3.agregarItem(new ItemMenu("Quesadillas"));
        menuComplementos3.agregarItem(new ItemMenu("Frijoles Charros"));

        restaurante4.agregarMenu(menuComida3); // Se corrige el nombre del objeto menuComida1 a menuComida3
        restaurante4.agregarMenu(menuBebidas3); // Se corrige el nombre del objeto menuBebidas1 a menuBebidas3
        restaurante4.agregarMenu(menuComplementos3); // Se corrige el nombre del objeto menuComplementos1 a menuComplementos3

        restaurantes.add(restaurante4);
        return restaurantes; // Agregamos el return faltante
    }
}
