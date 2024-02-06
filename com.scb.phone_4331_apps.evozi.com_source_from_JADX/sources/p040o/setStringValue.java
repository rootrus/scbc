package p040o;

import android.content.res.Resources;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.Files;
import p040o.IdCaptureModule_GetIIdDeserializerKtaFactory;

/* renamed from: o.setStringValue */
public final class setStringValue extends writeUInt64NoTag<IdCaptureModule_GetIIdDeserializerKtaFactory.read> implements IdCaptureModule_GetIIdDeserializerKtaFactory.write {
    boolean IconCompatParcelizer;
    String MediaBrowserCompat$ItemReceiver;
    final Files.C33631 MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver = "";
    private int MediaDescriptionCompat;
    private final setReferenceCounted MediaMetadataCompat;
    private final Resources MediaSessionCompat$Token;
    String read = null;
    boolean write;

    public final /* synthetic */ void read(IdCaptureModule_GetIIdDeserializerKtaFactory.read read2) {
        super.MediaBrowserCompat$ItemReceiver(read2);
    }

    @HmlPinActivity
    public setStringValue(Resources resources, RegularImmutableBiMap regularImmutableBiMap, setReferenceCounted setreferencecounted, Files.C33631 r4) {
        super(regularImmutableBiMap);
        this.MediaSessionCompat$Token = resources;
        this.MediaMetadataCompat = setreferencecounted;
        this.MediaBrowserCompat$MediaItem = r4;
    }

    private void write(String str, int i, String str2) {
        if (!this.MediaBrowserCompat$SearchResultReceiver.equalsIgnoreCase(str)) {
            setReferenceCounted setreferencecounted = this.MediaMetadataCompat;
            if (!setreferencecounted.MediaBrowserCompat$MediaItem.isDisposed()) {
                setreferencecounted.MediaBrowserCompat$MediaItem.dispose();
            }
        }
        if (this.RatingCompat != null) {
            this.RatingCompat.Keep();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("0");
        sb.append(i);
        reclaimValue reclaimvalue = new reclaimValue(str, sb.toString(), str2);
        setReferenceCounted setreferencecounted2 = this.MediaMetadataCompat;
        setreferencecounted2.read(setreferencecounted2.IconCompatParcelizer.write(reclaimvalue), new CaptureActivity(this), new setUseTextureView(this, str2));
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        boolean z = false;
        if ("ATM".equalsIgnoreCase(str)) {
            getParameterized getparameterized = getParameterized.IconCompatParcelizer;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getparameterized.IconCompatParcelizer(this.RatingCompat);
            }
            this.MediaBrowserCompat$SearchResultReceiver = str2;
        } else if (!this.MediaBrowserCompat$SearchResultReceiver.equalsIgnoreCase(str2)) {
            nativeSetBoolValue nativesetboolvalue = nativeSetBoolValue.write;
            if (this.RatingCompat != null) {
                nativesetboolvalue.IconCompatParcelizer(this.RatingCompat);
            }
            this.MediaBrowserCompat$SearchResultReceiver = str2;
            this.read = null;
            this.MediaBrowserCompat$ItemReceiver = "0";
            this.MediaDescriptionCompat = 0;
            write(str2, 0, (String) null);
        }
        this.IconCompatParcelizer = true;
    }

    public final void read(String str, int i) {
        this.read = null;
        this.MediaDescriptionCompat = i;
        write(str, i, (String) null);
    }

    public final void read(String str) {
        if (!DiskLruCache.VERSION_1.equalsIgnoreCase(this.MediaBrowserCompat$ItemReceiver)) {
            this.IconCompatParcelizer = false;
            if (!this.write) {
                write(str, this.MediaDescriptionCompat, this.read);
            }
            this.write = true;
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        setReferenceCounted setreferencecounted = this.MediaMetadataCompat;
        if (!setreferencecounted.MediaBrowserCompat$MediaItem.isDisposed()) {
            setreferencecounted.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    public final List<String> MediaBrowserCompat$ItemReceiver() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.MediaSessionCompat$Token.getString(Iterables$3$MediaBrowserCompat$MediaItem.deposit_detail_filter_this_month));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM yyyy");
        Calendar instance = Calendar.getInstance();
        instance.add(2, -1);
        arrayList.add(simpleDateFormat.format(instance.getTime()));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMM yyyy");
        Calendar instance2 = Calendar.getInstance();
        instance2.add(2, -2);
        arrayList.add(simpleDateFormat2.format(instance2.getTime()));
        return arrayList;
    }
}
