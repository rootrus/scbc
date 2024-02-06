package p040o;

import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeConfigureFromString */
public final /* synthetic */ class nativeConfigureFromString implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Category write;

    public /* synthetic */ nativeConfigureFromString(Category category) {
        this.write = category;
    }

    public final void IconCompatParcelizer(Object obj) {
        Category category = this.write;
        ((KtaJsonCheck.C69271.IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver(category.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(category.write, category.f2686x50fd9e4a.MediaBrowserCompat$ItemReceiver));
    }
}
