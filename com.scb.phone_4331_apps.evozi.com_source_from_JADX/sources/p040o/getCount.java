package p040o;

import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.getCount */
public final class getCount implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindPrepaidCashOutSuccessFragment> {
    private final DataModule read;

    private getCount(DataModule dataModule) {
        this.read = dataModule;
    }

    public static getCount MediaBrowserCompat$CustomActionResultReceiver(DataModule dataModule) {
        return new getCount(dataModule);
    }

    public final /* synthetic */ Object get() {
        FragmentBuilder_BindPrepaidCashOutSuccessFragment MediaBrowserCompat$CustomActionResultReceiver = this.read.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
