package proxy;

public class Proxy implements Subject {
    Subject subject = null;
    // change to AtomicInt
    int cnt = 0;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public void preRequest() throws Exception {
        if (cnt == 3)
            throw new Exception("only three request can be handled");
        ++cnt;
        System.out.println("preRequest");
    }

    public void postRequest() {
        System.out.println("postRequest");
        // --cnt;
    }

    @Override
    public void request() throws Exception {
        preRequest();
        subject.request();
        postRequest();
    }
}