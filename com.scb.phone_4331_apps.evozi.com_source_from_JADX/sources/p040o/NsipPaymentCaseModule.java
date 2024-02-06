package p040o;

/* renamed from: o.NsipPaymentCaseModule */
public final class NsipPaymentCaseModule extends PrepaidRequestCaseModule {
    public final PrepaidResetCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final E2EEEncryptionException MediaBrowserCompat$ItemReceiver;

    public final PrepaidResetCaseModule read() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final E2EEEncryptionException write() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public NsipPaymentCaseModule(PrepaidResetCaseModule prepaidResetCaseModule, E2EEEncryptionException e2EEEncryptionException) {
        this.MediaBrowserCompat$CustomActionResultReceiver = prepaidResetCaseModule;
        this.MediaBrowserCompat$ItemReceiver = e2EEEncryptionException;
    }
}
