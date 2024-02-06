package p040o;

import java.util.List;

/* renamed from: o.beforeName */
public final /* synthetic */ class beforeName implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ getPtr write;

    public /* synthetic */ beforeName(getPtr getptr, List list) {
        this.write = getptr;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPtr getptr = this.write;
        List list = this.MediaBrowserCompat$ItemReceiver;
        List<setZIndex> list2 = (List) obj;
        getptr.read = list2;
        getptr.IconCompatParcelizer(list, list2);
        getSerializeNulls getserializenulls = new getSerializeNulls(list);
        if (getptr.RatingCompat != null) {
            getserializenulls.IconCompatParcelizer(getptr.RatingCompat);
        }
    }
}
