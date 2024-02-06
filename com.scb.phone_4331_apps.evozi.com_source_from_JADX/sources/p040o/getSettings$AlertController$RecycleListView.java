package p040o;

import p040o.access$2300;

/* renamed from: o.getSettings$AlertController$RecycleListView */
public final class getSettings$AlertController$RecycleListView extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    private /* synthetic */ getSettings read;
    private /* synthetic */ String write;

    public getSettings$AlertController$RecycleListView(getSettings getsettings, String str) {
        this.read = getsettings;
        this.write = str;
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final /* synthetic */ void onNext(Object obj) {
        getSettings.read(this.read, this.write);
        getSettings.MediaBrowserCompat$CustomActionResultReceiver(this.read);
    }
}
