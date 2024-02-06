package p040o;

import p040o.LottieDrawable;

/* renamed from: o.LottieDrawable$5$MediaBrowserCompat$ItemReceiver */
public final class LottieDrawable$5$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<LottieDrawable.C36224, setDataCollectionEnabled> {
    private /* synthetic */ LottieDrawable.C36235 MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LottieDrawable$5$MediaBrowserCompat$ItemReceiver(LottieDrawable.C36235 r1) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = r1;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        LottieDrawable.C36224 r2 = (LottieDrawable.C36224) obj;
        onGetStartedClick.write((Object) r2, "it");
        setDataCollectionEnabled IconCompatParcelizer = LottieDrawable.C36235.IconCompatParcelizer(r2);
        if (IconCompatParcelizer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        return IconCompatParcelizer;
    }
}
