package p040o;

import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.setBackgroundColor */
public final class setBackgroundColor implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindRegistrationNewPinFragment> {
    private final DataModule IconCompatParcelizer;

    private setBackgroundColor(DataModule dataModule) {
        this.IconCompatParcelizer = dataModule;
    }

    public static setBackgroundColor MediaBrowserCompat$ItemReceiver(DataModule dataModule) {
        return new setBackgroundColor(dataModule);
    }

    public final /* synthetic */ Object get() {
        FragmentBuilder_BindRegistrationNewPinFragment MediaMetadataCompat = this.IconCompatParcelizer.MediaMetadataCompat();
        if (MediaMetadataCompat != null) {
            return MediaMetadataCompat;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
