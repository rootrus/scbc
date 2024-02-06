package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.FieldAttributes */
public final /* synthetic */ class FieldAttributes implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ readStringList MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;
    private final /* synthetic */ String write;

    public /* synthetic */ FieldAttributes(readStringList readstringlist, int i, String str, String str2) {
        this.MediaBrowserCompat$ItemReceiver = readstringlist;
        this.IconCompatParcelizer = i;
        this.read = str;
        this.write = str2;
    }

    public final void IconCompatParcelizer(Object obj) {
        shouldSkipField.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer, this.read, this.write, (getDateOfBirth) obj);
    }
}
