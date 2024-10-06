package designpattern.creational.factory_method.lecture.sharp;

import designpattern.creational.factory_method.lecture.matcha.Controller;
import designpattern.creational.factory_method.lecture.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
