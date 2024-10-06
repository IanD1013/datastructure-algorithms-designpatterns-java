package designpattern.creational.factory_method.lecture.matcha;

import java.util.Map;

/**
 * This is the base class for all our controllers
 */
public class Controller {
    public void render(String viewName, Map<String, Object> context) {
        var engine = createViewEngine();
        var html = engine.render(viewName, context);
        System.out.println(html);
    }

    protected ViewEngine createViewEngine() {
        return new MatchaViewEngine();
    }

    // protected abstract ViewEngine createViewEngine();
}
