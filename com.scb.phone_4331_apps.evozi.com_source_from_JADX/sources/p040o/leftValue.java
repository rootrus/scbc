package p040o;

/* renamed from: o.leftValue */
public final /* synthetic */ class leftValue implements findFragmentByWho {
    private final /* synthetic */ MapMaker MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ leftValue(MapMaker mapMaker, String str) {
        this.MediaBrowserCompat$ItemReceiver = mapMaker;
        this.read = str;
    }

    public final Object IconCompatParcelizer(Object obj) {
        T t;
        String str = this.read;
        zzwh zzwh = (zzwh) obj;
        MoreExecutors moreExecutors = new MoreExecutors();
        moreExecutors.MediaBrowserCompat$ItemReceiver = zzwh.read;
        zzui<String> zzui = zzwh.IconCompatParcelizer;
        if ("th".equalsIgnoreCase(str)) {
            t = zzui.write;
        } else {
            t = zzui.read;
        }
        moreExecutors.IconCompatParcelizer = (String) t;
        return moreExecutors;
    }
}
