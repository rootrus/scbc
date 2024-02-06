package p040o;

import p040o.withKeyValueSeparator;

/* renamed from: o.gd */
public final /* synthetic */ class C4471gd implements findFragmentByWho {
    private final /* synthetic */ C4746he MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ C4471gd(C4746he heVar, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = heVar;
        this.write = th;
    }

    public final Object IconCompatParcelizer(Object obj) {
        C4746he heVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        Throwable th = this.write;
        isSimulator issimulator = (isSimulator) obj;
        String str = issimulator.RatingCompat;
        withKeyValueSeparator.IconCompatParcelizer iconCompatParcelizer = new withKeyValueSeparator.IconCompatParcelizer();
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = str;
        iconCompatParcelizer.IconCompatParcelizer = th;
        return heVar.MediaBrowserCompat$CustomActionResultReceiver(issimulator, iconCompatParcelizer);
    }
}
