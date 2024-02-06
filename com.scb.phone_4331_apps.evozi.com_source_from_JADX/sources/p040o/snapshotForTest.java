package p040o;

import java.io.Serializable;

/* renamed from: o.snapshotForTest */
public final class snapshotForTest implements Serializable {
    public int IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String write;

    public snapshotForTest() {
        this.write = "";
        this.MediaBrowserCompat$ItemReceiver = "";
        this.MediaBrowserCompat$CustomActionResultReceiver = "";
        this.IconCompatParcelizer = 0;
    }

    public snapshotForTest(String str, String str2, String str3, int i) {
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.IconCompatParcelizer = i;
    }
}
