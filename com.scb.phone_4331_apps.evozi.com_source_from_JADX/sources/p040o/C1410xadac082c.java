package p040o;

/* renamed from: o.performConfigurationChanged$MediaBrowserCompat$CustomActionResultReceiver */
class C1410xadac082c implements Runnable {
    private /* synthetic */ performConfigurationChanged IconCompatParcelizer;
    private final KtaJsonCheck read;

    C1410xadac082c(performConfigurationChanged performconfigurationchanged, KtaJsonCheck ktaJsonCheck) {
        this.IconCompatParcelizer = performconfigurationchanged;
        this.read = ktaJsonCheck;
    }

    public final void run() {
        synchronized (this.read.RatingCompat()) {
            synchronized (this.IconCompatParcelizer) {
                if (this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.write.contains(new performConfigurationChanged$MediaBrowserCompat$ItemReceiver(this.read, AudioAttributesImplBaseParcelizer.MediaBrowserCompat$CustomActionResultReceiver()))) {
                    performConfigurationChanged performconfigurationchanged = this.IconCompatParcelizer;
                    try {
                        this.read.write(performconfigurationchanged.MediaBrowserCompat$MediaItem);
                    } catch (Throwable th) {
                        throw new onOptionsMenuClosed(th);
                    }
                }
                this.IconCompatParcelizer.write();
            }
        }
    }
}
