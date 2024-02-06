package p040o;

/* renamed from: o.removeAndGet */
public final /* synthetic */ class removeAndGet implements findFragmentByWho {
    private final /* synthetic */ isEvenLevel read;

    public /* synthetic */ removeAndGet(isEvenLevel isevenlevel) {
        this.read = isevenlevel;
    }

    public final Object IconCompatParcelizer(Object obj) {
        String str;
        isEvenLevel isevenlevel = this.read;
        onLocationChanged onlocationchanged = (onLocationChanged) obj;
        if (onlocationchanged.write == null) {
            str = "";
        } else {
            str = isevenlevel.IconCompatParcelizer("dd MMM yyyy", onlocationchanged.write);
        }
        CycleDetector cycleDetector = new CycleDetector();
        cycleDetector.IconCompatParcelizer = onlocationchanged.MediaBrowserCompat$CustomActionResultReceiver;
        cycleDetector.read = str;
        return cycleDetector;
    }
}
