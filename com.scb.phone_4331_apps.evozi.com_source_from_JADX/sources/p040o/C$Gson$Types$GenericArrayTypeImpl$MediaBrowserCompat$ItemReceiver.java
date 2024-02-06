package p040o;

import p040o.C$Gson$Types;
import p040o.writeUInt64NoTag;

/* renamed from: o.$Gson$Types$GenericArrayTypeImpl$MediaBrowserCompat$ItemReceiver  reason: invalid class name */
public final class C$Gson$Types$GenericArrayTypeImpl$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getIIdDeserializerKta$MediaBrowserCompat$ItemReceiver> {
    private /* synthetic */ C$Gson$Types.GenericArrayTypeImpl IconCompatParcelizer;

    public C$Gson$Types$GenericArrayTypeImpl$MediaBrowserCompat$ItemReceiver(C$Gson$Types.GenericArrayTypeImpl genericArrayTypeImpl) {
        this.IconCompatParcelizer = genericArrayTypeImpl;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getIIdDeserializerKta$MediaBrowserCompat$ItemReceiver getiiddeserializerkta_mediabrowsercompat_itemreceiver = (getIIdDeserializerKta$MediaBrowserCompat$ItemReceiver) obj;
        getiiddeserializerkta_mediabrowsercompat_itemreceiver.write(false);
        getiiddeserializerkta_mediabrowsercompat_itemreceiver.IconCompatParcelizer(false);
        getiiddeserializerkta_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver(C$Gson$Types.GenericArrayTypeImpl.write(this.IconCompatParcelizer));
        getiiddeserializerkta_mediabrowsercompat_itemreceiver.IconCompatParcelizer(this.IconCompatParcelizer.write, C$Gson$Types.GenericArrayTypeImpl.read(this.IconCompatParcelizer), this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer.read);
    }
}
