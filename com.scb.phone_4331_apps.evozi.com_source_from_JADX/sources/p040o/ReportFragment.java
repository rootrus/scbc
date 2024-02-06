package p040o;

/* renamed from: o.ReportFragment */
public final class ReportFragment<Z> implements ReflectiveGenericLifecycleObserver<Z, Z> {
    private static final ReportFragment<?> MediaBrowserCompat$CustomActionResultReceiver = new ReportFragment<>();

    public final performOptionsMenuClosed<Z> MediaBrowserCompat$ItemReceiver(performOptionsMenuClosed<Z> performoptionsmenuclosed, onActivityResult onactivityresult) {
        return performoptionsmenuclosed;
    }

    public static <Z> ReflectiveGenericLifecycleObserver<Z, Z> read() {
        return MediaBrowserCompat$CustomActionResultReceiver;
    }
}
