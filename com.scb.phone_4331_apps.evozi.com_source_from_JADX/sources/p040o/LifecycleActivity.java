package p040o;

/* renamed from: o.LifecycleActivity */
public final class LifecycleActivity extends FragmentBuilder_BindSummaryFragment {
    public final IStatusCallback MediaBrowserCompat$ItemReceiver;

    @HmlPinActivity
    public LifecycleActivity(IStatusCallback iStatusCallback) {
        onGetStartedClick.write((Object) iStatusCallback, "questionEntityMapper");
        this.MediaBrowserCompat$ItemReceiver = iStatusCallback;
    }
}
