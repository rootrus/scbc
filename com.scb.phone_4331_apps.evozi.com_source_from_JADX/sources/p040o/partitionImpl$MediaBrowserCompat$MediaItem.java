package p040o;

/* renamed from: o.partitionImpl$MediaBrowserCompat$MediaItem */
public final class partitionImpl$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundFactSheetActivity<isClickable, standardStartAndWait> {
    private /* synthetic */ partitionImpl MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public partitionImpl$MediaBrowserCompat$MediaItem(partitionImpl partitionimpl) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = partitionimpl;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        isClickable isclickable = (isClickable) obj;
        onGetStartedClick.write((Object) isclickable, "it");
        return this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo.write(isclickable);
    }
}
