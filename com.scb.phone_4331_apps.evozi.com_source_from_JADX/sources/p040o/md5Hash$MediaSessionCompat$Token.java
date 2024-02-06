package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.md5Hash$MediaSessionCompat$Token */
public final class md5Hash$MediaSessionCompat$Token<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
    private /* synthetic */ String IconCompatParcelizer;

    public md5Hash$MediaSessionCompat$Token(String str) {
        this.IconCompatParcelizer = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((ProcessingParameters_Factory) obj).read(this.IconCompatParcelizer);
    }
}
