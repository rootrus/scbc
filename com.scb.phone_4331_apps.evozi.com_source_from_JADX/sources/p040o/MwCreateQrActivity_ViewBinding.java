package p040o;

/* renamed from: o.MwCreateQrActivity_ViewBinding */
public abstract class MwCreateQrActivity_ViewBinding extends MwBusinessDetailsActivity {
    public long IconCompatParcelizer;
    public boolean MediaBrowserCompat$ItemReceiver;
    public BaseLivenessCheckActivity_ViewBinding<onReturnHomeClick<?>> read;

    public static long read(boolean z) {
        return 4294967296L;
    }

    /* access modifiers changed from: protected */
    public void MediaDescriptionCompat() {
    }

    /* access modifiers changed from: protected */
    public long IconCompatParcelizer() {
        BaseLivenessCheckActivity_ViewBinding<onReturnHomeClick<?>> baseLivenessCheckActivity_ViewBinding = this.read;
        if (baseLivenessCheckActivity_ViewBinding == null) {
            return Long.MAX_VALUE;
        }
        return baseLivenessCheckActivity_ViewBinding.IconCompatParcelizer == baseLivenessCheckActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver ? Long.MAX_VALUE : 0;
    }

    public final boolean RatingCompat() {
        onReturnHomeClick IconCompatParcelizer2;
        BaseLivenessCheckActivity_ViewBinding<onReturnHomeClick<?>> baseLivenessCheckActivity_ViewBinding = this.read;
        if (baseLivenessCheckActivity_ViewBinding == null || (IconCompatParcelizer2 = baseLivenessCheckActivity_ViewBinding.IconCompatParcelizer()) == null) {
            return false;
        }
        IconCompatParcelizer2.run();
        return true;
    }

    public final void write(onReturnHomeClick<?> onreturnhomeclick) {
        onGetStartedClick.write((Object) onreturnhomeclick, "task");
        BaseLivenessCheckActivity_ViewBinding<onReturnHomeClick<?>> baseLivenessCheckActivity_ViewBinding = this.read;
        if (baseLivenessCheckActivity_ViewBinding == null) {
            baseLivenessCheckActivity_ViewBinding = new BaseLivenessCheckActivity_ViewBinding<>();
            this.read = baseLivenessCheckActivity_ViewBinding;
        }
        baseLivenessCheckActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(onreturnhomeclick);
    }

    public final void read() {
        long j = this.IconCompatParcelizer - 4294967296L;
        this.IconCompatParcelizer = j;
        if (j <= 0) {
            if (MwChangeCasaSuccessActivity.write()) {
                if (!(this.IconCompatParcelizer == 0)) {
                    throw new AssertionError();
                }
            }
            if (this.MediaBrowserCompat$ItemReceiver) {
                MediaDescriptionCompat();
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean MediaBrowserCompat$CustomActionResultReceiver() {
        BaseLivenessCheckActivity_ViewBinding<onReturnHomeClick<?>> baseLivenessCheckActivity_ViewBinding = this.read;
        return baseLivenessCheckActivity_ViewBinding == null || baseLivenessCheckActivity_ViewBinding.IconCompatParcelizer == baseLivenessCheckActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public long MediaMetadataCompat() {
        boolean z;
        onReturnHomeClick IconCompatParcelizer2;
        BaseLivenessCheckActivity_ViewBinding<onReturnHomeClick<?>> baseLivenessCheckActivity_ViewBinding = this.read;
        if (baseLivenessCheckActivity_ViewBinding == null || (IconCompatParcelizer2 = baseLivenessCheckActivity_ViewBinding.IconCompatParcelizer()) == null) {
            z = false;
        } else {
            IconCompatParcelizer2.run();
            z = true;
        }
        if (!z) {
            return Long.MAX_VALUE;
        }
        return IconCompatParcelizer();
    }
}
