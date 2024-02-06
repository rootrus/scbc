package p040o;

import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.getLongFlagValue */
public final /* synthetic */ class getLongFlagValue implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ zzh IconCompatParcelizer;

    public /* synthetic */ getLongFlagValue(zzh zzh) {
        this.IconCompatParcelizer = zzh;
    }

    public final Object write(Object obj) {
        newBuilder newbuilder = (newBuilder) obj;
        if (newbuilder == null) {
            return null;
        }
        isScrollGesturesEnabledDuringRotateOrZoom isscrollgesturesenabledduringrotateorzoom = new isScrollGesturesEnabledDuringRotateOrZoom();
        isscrollgesturesenabledduringrotateorzoom.write = DiskLruCache.VERSION_1.equals(newbuilder.write);
        setMapToolbarEnabled read = setMapToolbarEnabled.read(newbuilder.read);
        onGetStartedClick.write((Object) read, "<set-?>");
        isscrollgesturesenabledduringrotateorzoom.MediaBrowserCompat$CustomActionResultReceiver = read;
        isscrollgesturesenabledduringrotateorzoom.IconCompatParcelizer = zzh.write(newbuilder.MediaBrowserCompat$CustomActionResultReceiver);
        isscrollgesturesenabledduringrotateorzoom.MediaBrowserCompat$ItemReceiver = zzh.write(newbuilder.IconCompatParcelizer);
        isscrollgesturesenabledduringrotateorzoom.read = zzh.write(newbuilder.MediaBrowserCompat$ItemReceiver);
        return isscrollgesturesenabledduringrotateorzoom;
    }
}
