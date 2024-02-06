package p040o;

/* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionSignalEncoder$MediaBrowserCompat$ItemReceiver */
public final class C3054x21bfd49d implements findFragmentByWho {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getRemoteContext write;

    private C3054x21bfd49d() {
    }

    public /* synthetic */ C3054x21bfd49d(getRemoteContext getremotecontext, int i, int i2) {
        this.write = getremotecontext;
        this.IconCompatParcelizer = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = i2;
    }

    public final Object IconCompatParcelizer(Object obj) {
        return this.write.write(this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, (PlacePhotoMetadataResult) obj);
    }
}
