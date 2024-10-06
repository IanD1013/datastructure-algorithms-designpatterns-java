package designpattern.creational.factory_method.lecture;


import designpattern.creational.factory_method.lecture.matcha.Controller;
import designpattern.creational.factory_method.lecture.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends SharpController {
    public void listProducts() {
        // Get products from a database
        Map<String, Object> context = new HashMap<>();
        // context.put(products)
        render("products.html", context);
    }
}
