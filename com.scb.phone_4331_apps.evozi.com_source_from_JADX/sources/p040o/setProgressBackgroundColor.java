package p040o;

import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.setProgressBackgroundColor */
public final class setProgressBackgroundColor implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindScbsMaritalStatusFragment> {
    private final DataModule MediaBrowserCompat$ItemReceiver;

    private setProgressBackgroundColor(DataModule dataModule) {
        this.MediaBrowserCompat$ItemReceiver = dataModule;
    }

    public static setProgressBackgroundColor IconCompatParcelizer(DataModule dataModule) {
        return new setProgressBackgroundColor(dataModule);
    }

    public final /* synthetic */ Object get() {
        FragmentBuilder_BindScbsMaritalStatusFragment MediaSessionCompat$QueueItem = this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem();
        if (MediaSessionCompat$QueueItem != null) {
            return MediaSessionCompat$QueueItem;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
