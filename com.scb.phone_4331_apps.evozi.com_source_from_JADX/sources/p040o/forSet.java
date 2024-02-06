package p040o;

import p040o.submit;

/* renamed from: o.forSet */
public final /* synthetic */ class forSet implements findFragmentByWho {
    private final /* synthetic */ Ordering MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ forSet(Ordering ordering) {
        this.MediaBrowserCompat$ItemReceiver = ordering;
    }

    public final Object IconCompatParcelizer(Object obj) {
        setDefaultEventParameters setdefaulteventparameters = (setDefaultEventParameters) obj;
        submit.IconCompatParcelizer iconCompatParcelizer = new submit.IconCompatParcelizer();
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = setdefaulteventparameters.MediaBrowserCompat$CustomActionResultReceiver;
        iconCompatParcelizer.IconCompatParcelizer = setdefaulteventparameters.MediaBrowserCompat$ItemReceiver;
        return new submit(iconCompatParcelizer, (byte) 0);
    }
}
