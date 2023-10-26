package eTicaret.models;

import eTicaret.models.Category;
import eTicaret.models.Product;
import eTicaret.models.Order;
import eTicaret.models.User;

public class Main{

    public static void main(String[] args) {

        Category category = new Category("Kırtasiye",1);
        Category category1 = new Category("Spor",2);


        Product product = new Product(2,"Kalem");
        Product product1 = new Product(3,"Telefon");


        Order order = new Order("135",3);
        Order order1 = new Order("357",5);


        User user = new User("Ege",26);
        User user1 = new User("Harun",33);

    }
}