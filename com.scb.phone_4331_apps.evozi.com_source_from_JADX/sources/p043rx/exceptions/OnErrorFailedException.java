package p043rx.exceptions;

/* renamed from: rx.exceptions.OnErrorFailedException */
public class OnErrorFailedException extends RuntimeException {
    public OnErrorFailedException(String str, Throwable th) {
        super(str, th);
    }

    public OnErrorFailedException(Throwable th) {
        super(th.getMessage(), th);
    }
}
