package designpattern.behavioural.chain_of_responsibility;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest request) {   // template method pattern
        if (doHandle(request))                  // process then return an indicator
            return;                             // true: end of pipeline; false: not end of pipeline, keep processing
        if (next != null)
            next.handle(request);
    }

    // boolean return type bc want to know if the request is completely handled or not
    public abstract boolean doHandle(HttpRequest request);
}