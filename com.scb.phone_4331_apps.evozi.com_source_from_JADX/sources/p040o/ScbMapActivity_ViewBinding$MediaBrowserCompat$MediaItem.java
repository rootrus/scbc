package p040o;

/* renamed from: o.ScbMapActivity_ViewBinding$MediaBrowserCompat$MediaItem */
final class ScbMapActivity_ViewBinding$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundActionsSuccessActivity<String> {
    private /* synthetic */ ScbMapActivity_ViewBinding MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScbMapActivity_ViewBinding$MediaBrowserCompat$MediaItem(ScbMapActivity_ViewBinding scbMapActivity_ViewBinding) {
        super(0);
        this.MediaBrowserCompat$ItemReceiver = scbMapActivity_ViewBinding;
    }

    public final /* synthetic */ Object invoke() {
        String ParcelableVolumeInfo = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        if (ParcelableVolumeInfo != null) {
            return ParcelableVolumeInfo;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CancellableEpic-");
        sb.append(this.MediaBrowserCompat$ItemReceiver.hashCode());
        return sb.toString();
    }
}
