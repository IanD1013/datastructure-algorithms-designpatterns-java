package designpattern.behavioural.template_method;

public class GenerateReportTask extends Task {
    @Override
    protected void doExecute() {
        System.out.println("Generate Report");
    }
}
