package p040o;

/* renamed from: o.HmlCropDocumentActivity */
public final class HmlCropDocumentActivity implements HmlNTBPromptPayNotFoundActivity<Object> {
    public static final HmlCropDocumentActivity read = new HmlCropDocumentActivity();

    public final String toString() {
        return "This continuation is already complete";
    }

    private HmlCropDocumentActivity() {
    }

    public final HmlPromptPayVerificationActivity getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
}
