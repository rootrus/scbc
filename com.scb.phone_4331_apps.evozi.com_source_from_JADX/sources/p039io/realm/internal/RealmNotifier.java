package p039io.realm.internal;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import p040o.onButtonClicked;

/* renamed from: io.realm.internal.RealmNotifier */
public abstract class RealmNotifier implements Closeable {
    private List<Runnable> IconCompatParcelizer;
    private List<Runnable> MediaBrowserCompat$ItemReceiver;
    private onButtonClicked<Object> read = new onButtonClicked<>();

    public RealmNotifier(OsSharedRealm osSharedRealm) {
        new ArrayList();
        this.IconCompatParcelizer = new ArrayList();
        this.MediaBrowserCompat$ItemReceiver = new ArrayList();
    }

    public void close() {
        onButtonClicked<Object> onbuttonclicked = this.read;
        onbuttonclicked.read = true;
        onbuttonclicked.MediaBrowserCompat$ItemReceiver.clear();
        this.IconCompatParcelizer.clear();
        this.MediaBrowserCompat$ItemReceiver.clear();
    }
}
