package p039io.reactivex.exceptions;

/* renamed from: io.reactivex.exceptions.OnErrorNotImplementedException */
public final class OnErrorNotImplementedException extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private OnErrorNotImplementedException(String str, Throwable th) {
        super(str, th == null ? new NullPointerException() : th);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OnErrorNotImplementedException(java.lang.Throwable r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p039io.reactivex.exceptions.OnErrorNotImplementedException.<init>(java.lang.Throwable):void");
    }
}
