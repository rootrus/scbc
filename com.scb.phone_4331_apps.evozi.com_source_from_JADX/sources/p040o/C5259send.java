package p040o;

/* renamed from: o.send */
public final class C5259send extends FragmentBuilder_BindSummaryFragment {
    public static zzxo MediaBrowserCompat$CustomActionResultReceiver(query query) {
        zzxm zzxm;
        queryParameterName queryparametername = query.MediaBrowserCompat$ItemReceiver;
        if (queryparametername != null) {
            zzxm = new zzxm(queryparametername.IconCompatParcelizer, queryparametername.read);
        } else {
            zzxm = null;
        }
        zzxo zzxo = new zzxo(query.read, query.write, query.IconCompatParcelizer, zzxm);
        zzxo.read(IconCompatParcelizer((setCurrentItemInternal) query));
        return zzxo;
    }
}
