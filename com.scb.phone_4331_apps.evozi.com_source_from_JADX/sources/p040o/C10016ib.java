package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ib */
public final /* synthetic */ class C10016ib implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setUuidFromUtf8Bytes write;

    public /* synthetic */ C10016ib(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.write = setuuidfromutf8bytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckParameters_MembersInjector$MediaBrowserCompat$ItemReceiver) obj).read(this.write);
    }
}
