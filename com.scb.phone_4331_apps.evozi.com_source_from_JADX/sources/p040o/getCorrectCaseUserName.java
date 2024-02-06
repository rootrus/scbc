package p040o;

/* renamed from: o.getCorrectCaseUserName */
public final class getCorrectCaseUserName extends writeUInt64NoTag<PassportCaptureModule_GetLookAndFeelParametersFactory> {
    public final ScrimInsetsFrameLayout read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getCorrectCaseUserName(RegularImmutableBiMap regularImmutableBiMap, ScrimInsetsFrameLayout scrimInsetsFrameLayout) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) scrimInsetsFrameLayout, "pinDisabledCase");
        this.read = scrimInsetsFrameLayout;
    }

    public final void onDestroy() {
        ScrimInsetsFrameLayout scrimInsetsFrameLayout = this.read;
        if (!scrimInsetsFrameLayout.MediaBrowserCompat$MediaItem.isDisposed()) {
            scrimInsetsFrameLayout.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getCorrectCaseUserName getcorrectcaseusername) {
        if (getcorrectcaseusername.RatingCompat != null) {
            getcorrectcaseusername.RatingCompat.aj_();
        }
    }
}
