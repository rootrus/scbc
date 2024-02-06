package p040o;

import p040o.LocalProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.dx$MediaSessionCompat$Token */
final class dx$MediaSessionCompat$Token<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write> {
    public static final dx$MediaSessionCompat$Token write = new dx$MediaSessionCompat$Token();

    dx$MediaSessionCompat$Token() {
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((LocalProjectProvider.write) obj).write();
    }
}
