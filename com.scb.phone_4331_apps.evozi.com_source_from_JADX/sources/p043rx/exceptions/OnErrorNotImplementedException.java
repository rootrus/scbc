package p043rx.exceptions;

/* renamed from: rx.exceptions.OnErrorNotImplementedException */
public class OnErrorNotImplementedException extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnErrorNotImplementedException(Throwable th) {
        super(th != null ? th.getMessage() : null, th == null ? new NullPointerException() : th);
    }
}
