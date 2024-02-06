package p040o;

import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.CircleImageView */
public final class CircleImageView implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindRegistrationEmailSetupFragment> {
    private final DataModule MediaBrowserCompat$ItemReceiver;

    private CircleImageView(DataModule dataModule) {
        this.MediaBrowserCompat$ItemReceiver = dataModule;
    }

    public static CircleImageView IconCompatParcelizer(DataModule dataModule) {
        return new CircleImageView(dataModule);
    }

    public final /* synthetic */ Object get() {
        FragmentBuilder_BindRegistrationEmailSetupFragment MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver();
        if (MediaBrowserCompat$SearchResultReceiver != null) {
            return MediaBrowserCompat$SearchResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
