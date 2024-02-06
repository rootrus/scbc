package androidx.core.p000os;

/* renamed from: androidx.core.os.OperationCanceledException */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this((byte) 0);
    }

    private OperationCanceledException(byte b) {
        super("The operation has been canceled.");
    }
}
