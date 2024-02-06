package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.subList */
public final /* synthetic */ class subList implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ subList IconCompatParcelizer = new subList();

    private /* synthetic */ subList() {
    }

    public final Object write(Object obj) {
        String str;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        if (singleDataEntity.getData() == null) {
            return new onMarkerDragEnd(true, "", Boolean.TRUE, false, "3004");
        }
        setCenterTextTypeface setcentertexttypeface = (setCenterTextTypeface) singleDataEntity.getData();
        setOnPageChangeListener status = singleDataEntity.getStatus();
        boolean MediaBrowserCompat$ItemReceiver = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) setcentertexttypeface.MediaBrowserCompat$ItemReceiver, (Object) DiskLruCache.VERSION_1);
        String str2 = setcentertexttypeface.MediaBrowserCompat$CustomActionResultReceiver;
        Boolean bool = setcentertexttypeface.read;
        if (bool == null) {
            bool = Boolean.TRUE;
        }
        Boolean bool2 = bool;
        boolean z = setcentertexttypeface.write;
        if (status != null) {
            str = status.write();
        } else {
            str = null;
        }
        return new onMarkerDragEnd(MediaBrowserCompat$ItemReceiver, str2, bool2, z, str);
    }
}
