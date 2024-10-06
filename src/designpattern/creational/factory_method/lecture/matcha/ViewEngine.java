package designpattern.creational.factory_method.lecture.matcha;

import java.util.Map;

public interface ViewEngine {
    String render(String viewName, Map<String, Object> context);
}
