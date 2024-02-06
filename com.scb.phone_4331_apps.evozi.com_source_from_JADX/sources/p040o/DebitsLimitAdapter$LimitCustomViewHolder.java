package p040o;

import java.security.cert.CRLException;

/* renamed from: o.DebitsLimitAdapter$LimitCustomViewHolder */
final class DebitsLimitAdapter$LimitCustomViewHolder extends CRLException {
    private Throwable write;

    DebitsLimitAdapter$LimitCustomViewHolder(String str, Throwable th) {
        super(str);
        this.write = th;
    }

    public final Throwable getCause() {
        return this.write;
    }
}
