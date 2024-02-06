package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.extractInBackground */
public final /* synthetic */ class extractInBackground implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String read;

    public /* synthetic */ extractInBackground(String str) {
        this.read = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getBarcodes) obj).read(this.read);
    }
}
