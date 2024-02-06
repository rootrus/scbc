package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getUsername$MediaBrowserCompat$CustomActionResultReceiver */
public final class getUsername$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<LookAndFeelParameters> {
    private /* synthetic */ C10841getUsername MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ String read;

    public getUsername$MediaBrowserCompat$CustomActionResultReceiver(C10841getUsername getusername, String str) {
        this.MediaBrowserCompat$ItemReceiver = getusername;
        this.read = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((LookAndFeelParameters) obj).IconCompatParcelizer(C10841getUsername.read(this.read));
    }
}
