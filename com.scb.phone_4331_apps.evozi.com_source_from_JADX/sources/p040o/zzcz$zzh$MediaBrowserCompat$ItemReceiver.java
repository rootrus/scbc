package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.zzcz;

/* renamed from: o.zzcz$zzh$MediaBrowserCompat$ItemReceiver */
public final class zzcz$zzh$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<zzcz.zzh> {
    private zzcz$zzh$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ zzcz$zzh$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new zzcz.zzh(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzcz.zzh[i];
    }
}
