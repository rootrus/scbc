package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getUsername$MediaBrowserCompat$ItemReceiver */
public final class getUsername$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<LookAndFeelParameters> {
    private /* synthetic */ C10841getUsername IconCompatParcelizer;
    private /* synthetic */ String write;

    public getUsername$MediaBrowserCompat$ItemReceiver(C10841getUsername getusername, String str) {
        this.IconCompatParcelizer = getusername;
        this.write = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((LookAndFeelParameters) obj).read(C10841getUsername.read(this.write));
    }
}
