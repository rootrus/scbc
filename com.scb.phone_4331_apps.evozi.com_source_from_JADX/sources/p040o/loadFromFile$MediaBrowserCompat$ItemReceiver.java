package p040o;

import p040o.CheckCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.loadFromFile$MediaBrowserCompat$ItemReceiver */
final class loadFromFile$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckCaptureModule.C6375a.IconCompatParcelizer> {
    private /* synthetic */ loadFromFile MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ String read;

    loadFromFile$MediaBrowserCompat$ItemReceiver(String str, loadFromFile loadfromfile) {
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = loadfromfile;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        CheckCaptureModule.C6375a.IconCompatParcelizer iconCompatParcelizer = (CheckCaptureModule.C6375a.IconCompatParcelizer) obj;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.read(this.MediaBrowserCompat$ItemReceiver.read.mo26549c_(this.read));
        }
    }
}
