package p040o;

import java.util.List;
import p040o.MapMaker;

/* renamed from: o.privateValueEquivalence */
public final /* synthetic */ class privateValueEquivalence implements dump {
    private final /* synthetic */ keySetImpl IconCompatParcelizer;
    private final /* synthetic */ List write;

    public /* synthetic */ privateValueEquivalence(keySetImpl keysetimpl, List list) {
        this.IconCompatParcelizer = keysetimpl;
        this.write = list;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        isSupportFragmentClass issupportfragmentclass;
        keySetImpl keysetimpl = this.IconCompatParcelizer;
        UncaughtExceptionHandlers uncaughtExceptionHandlers = (UncaughtExceptionHandlers) obj;
        show show = new show(this.write);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new MapMaker.NullComputingConcurrentMap(uncaughtExceptionHandlers)));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        issupportfragmentclass.MediaBrowserCompat$ItemReceiver(new MapMaker.ComputingMapAdapter(keysetimpl, uncaughtExceptionHandlers));
    }
}
