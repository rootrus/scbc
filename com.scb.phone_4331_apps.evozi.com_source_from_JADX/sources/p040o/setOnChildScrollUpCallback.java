package p040o;

import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.setOnChildScrollUpCallback */
public final class setOnChildScrollUpCallback implements OPRStatusRewardsLandingActivity_ViewBinding<ScriptIntrinsicConvolve5x5> {
    private final DataModule IconCompatParcelizer;

    private setOnChildScrollUpCallback(DataModule dataModule) {
        this.IconCompatParcelizer = dataModule;
    }

    public static setOnChildScrollUpCallback read(DataModule dataModule) {
        return new setOnChildScrollUpCallback(dataModule);
    }

    public final /* synthetic */ Object get() {
        ScriptIntrinsicConvolve5x5 RatingCompat = this.IconCompatParcelizer.RatingCompat();
        if (RatingCompat != null) {
            return RatingCompat;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
