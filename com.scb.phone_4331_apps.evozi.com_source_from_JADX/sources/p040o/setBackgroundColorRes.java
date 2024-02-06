package p040o;

import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.setBackgroundColorRes */
public final class setBackgroundColorRes implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindRegistrationPushNotificationFragment> {
    private final DataModule MediaBrowserCompat$CustomActionResultReceiver;

    private setBackgroundColorRes(DataModule dataModule) {
        this.MediaBrowserCompat$CustomActionResultReceiver = dataModule;
    }

    public static setBackgroundColorRes MediaBrowserCompat$CustomActionResultReceiver(DataModule dataModule) {
        return new setBackgroundColorRes(dataModule);
    }

    public final /* synthetic */ Object get() {
        FragmentBuilder_BindRegistrationPushNotificationFragment MediaDescriptionCompat = this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat();
        if (MediaDescriptionCompat != null) {
            return MediaDescriptionCompat;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
