package designpattern.creational.factory_method.lecture.sharp;

import designpattern.creational.factory_method.lecture.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by Sharp";
    }
}
