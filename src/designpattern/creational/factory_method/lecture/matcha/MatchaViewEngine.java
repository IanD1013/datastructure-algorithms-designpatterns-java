package designpattern.creational.factory_method.lecture.matcha;

import java.util.Map;

public class MatchaViewEngine implements ViewEngine {
    // return type String: which will be the html contents we are going to return to the client
    // 1st parameter: name of the view
    // 2nd parameter: data that we gonna pass to the view, which is products, use Map so we can pass multiple objects to the view

    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by Matcha";
    }

    // next need to implement a controller which is a class that response to user action
}
