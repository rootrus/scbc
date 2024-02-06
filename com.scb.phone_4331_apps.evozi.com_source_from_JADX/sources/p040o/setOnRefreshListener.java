package p040o;

import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.setOnRefreshListener */
public final class setOnRefreshListener implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindSSFTabFragment> {
    private final DataModule read;

    private setOnRefreshListener(DataModule dataModule) {
        this.read = dataModule;
    }

    public static setOnRefreshListener IconCompatParcelizer(DataModule dataModule) {
        return new setOnRefreshListener(dataModule);
    }

    public final /* synthetic */ Object get() {
        FragmentBuilder_BindSSFTabFragment MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.read.mo13046x50fd9e4a();
        if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver != null) {
            return MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
