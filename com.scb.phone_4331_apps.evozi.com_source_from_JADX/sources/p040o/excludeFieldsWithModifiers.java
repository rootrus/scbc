package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.excludeFieldsWithModifiers */
public final /* synthetic */ class excludeFieldsWithModifiers implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getDependencies MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ excludeFieldsWithModifiers(getDependencies getdependencies) {
        this.MediaBrowserCompat$ItemReceiver = getdependencies;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getLastName) obj).read(this.MediaBrowserCompat$ItemReceiver);
    }
}
