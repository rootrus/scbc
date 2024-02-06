package p040o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o.onShareButtonClick */
public final class onShareButtonClick<T> extends BaseNtbInstructionActivity_ViewBinding<T> {
    public static final AtomicIntegerFieldUpdater MediaBrowserCompat$CustomActionResultReceiver = AtomicIntegerFieldUpdater.newUpdater(onShareButtonClick.class, "_decision");
    public volatile int _decision = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public onShareButtonClick(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity) {
        super(hmlPromptPayVerificationActivity, hmlNTBPromptPayNotFoundActivity);
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "uCont");
    }

    public final void IconCompatParcelizer(Object obj) {
        if (!ParcelableVolumeInfo()) {
            onCreateQRCodeButtonClick.read(HmlDocumentSubmissionActivity.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat), AlertController$RecycleListView.write(obj, this.MediaDescriptionCompat));
        }
    }

    private final boolean ParcelableVolumeInfo() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(this, 0, 2));
        return true;
    }

    public final void read(Object obj) {
        if (!ParcelableVolumeInfo()) {
            onCreateQRCodeButtonClick.read(HmlDocumentSubmissionActivity.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat), AlertController$RecycleListView.write(obj, this.MediaDescriptionCompat));
        }
    }
}
