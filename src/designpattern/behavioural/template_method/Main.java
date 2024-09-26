package designpattern.behavioural.template_method;

public class Main {
    public static void main(String[] args) {
        var task = new TransferMoneyTask();
        task.execute();
    }
}
