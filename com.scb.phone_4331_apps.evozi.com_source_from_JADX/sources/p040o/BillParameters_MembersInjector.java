package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.BillParameters_MembersInjector */
public final /* synthetic */ class BillParameters_MembersInjector implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ parseOs IconCompatParcelizer;
    private final /* synthetic */ String write;

    public /* synthetic */ BillParameters_MembersInjector(parseOs parseos, String str) {
        this.IconCompatParcelizer = parseos;
        this.write = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.ExpandedMenuView) obj).MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, this.write);
    }
}
