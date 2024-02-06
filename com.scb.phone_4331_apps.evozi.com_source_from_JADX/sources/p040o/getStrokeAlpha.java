package p040o;

import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.getStrokeAlpha */
public final class getStrokeAlpha implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindSetupScheduleMonthlyFragment> {
    private final DataModule write;

    private getStrokeAlpha(DataModule dataModule) {
        this.write = dataModule;
    }

    public static getStrokeAlpha MediaBrowserCompat$ItemReceiver(DataModule dataModule) {
        return new getStrokeAlpha(dataModule);
    }

    public final /* synthetic */ Object get() {
        FragmentBuilder_BindSetupScheduleMonthlyFragment ParcelableVolumeInfo = this.write.ParcelableVolumeInfo();
        if (ParcelableVolumeInfo != null) {
            return ParcelableVolumeInfo;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
