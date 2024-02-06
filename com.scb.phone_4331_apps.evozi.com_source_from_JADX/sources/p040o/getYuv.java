package p040o;

import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.getYuv */
public final class getYuv implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindPrepaidRequestSuccessFragment> {
    private final DataModule read;

    private getYuv(DataModule dataModule) {
        this.read = dataModule;
    }

    public static getYuv MediaBrowserCompat$ItemReceiver(DataModule dataModule) {
        return new getYuv(dataModule);
    }

    public final /* synthetic */ Object get() {
        FragmentBuilder_BindPrepaidRequestSuccessFragment IconCompatParcelizer = this.read.IconCompatParcelizer();
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
