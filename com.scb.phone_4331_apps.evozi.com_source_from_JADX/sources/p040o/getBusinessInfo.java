package p040o;

import android.view.Menu;

/* renamed from: o.getBusinessInfo */
public final /* synthetic */ class getBusinessInfo implements dump {
    private final /* synthetic */ Menu read;

    public /* synthetic */ getBusinessInfo(Menu menu) {
        this.read = menu;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        this.read.add(0, 0, this.read.size(), (String) obj);
    }
}
