package p040o;

import okhttp3.internal.cache.DiskLruCache;
import p040o.setSearchDirection;
import p040o.writeUInt64NoTag;

/* renamed from: o.setSearchDirection$MediaBrowserCompat$ItemReceiver */
public final class setSearchDirection$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<newCheckParameters> {
    private /* synthetic */ setSearchDirection MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ String write;

    public setSearchDirection$MediaBrowserCompat$ItemReceiver(setSearchDirection setsearchdirection, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setsearchdirection;
        this.write = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        newCheckParameters newcheckparameters = (newCheckParameters) obj;
        String str = this.write;
        int hashCode = str.hashCode();
        boolean z = true;
        if (hashCode != 49) {
            if (hashCode == 50 && str.equals("2")) {
                setSearchDirection setsearchdirection = this.MediaBrowserCompat$CustomActionResultReceiver;
                onGetStartedClick.write((Object) "2", "conditionFlag");
                setsearchdirection.MediaBrowserCompat$ItemReceiver = "2";
                writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new setSearchDirection.MediaMetadataCompat("2");
                if (setsearchdirection.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    mediaMetadataCompat.IconCompatParcelizer(setsearchdirection.RatingCompat);
                }
                newcheckparameters.MediaBrowserCompat$ItemReceiver();
                return;
            }
        } else if (str.equals(DiskLruCache.VERSION_1)) {
            setSearchDirection setsearchdirection2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) DiskLruCache.VERSION_1, "conditionFlag");
            setsearchdirection2.MediaBrowserCompat$ItemReceiver = DiskLruCache.VERSION_1;
            writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat2 = new setSearchDirection.MediaMetadataCompat(DiskLruCache.VERSION_1);
            if (setsearchdirection2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                mediaMetadataCompat2.IconCompatParcelizer(setsearchdirection2.RatingCompat);
            }
            newcheckparameters.IconCompatParcelizer();
            return;
        }
        setSearchDirection setsearchdirection3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) DiskLruCache.VERSION_1, "conditionFlag");
        setsearchdirection3.MediaBrowserCompat$ItemReceiver = DiskLruCache.VERSION_1;
        writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat3 = new setSearchDirection.MediaMetadataCompat(DiskLruCache.VERSION_1);
        if (setsearchdirection3.RatingCompat == null) {
            z = false;
        }
        if (z) {
            mediaMetadataCompat3.IconCompatParcelizer(setsearchdirection3.RatingCompat);
        }
        newcheckparameters.read();
    }
}
