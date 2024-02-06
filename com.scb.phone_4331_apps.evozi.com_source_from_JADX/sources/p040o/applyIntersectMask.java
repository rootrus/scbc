package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.applyIntersectMask */
public class applyIntersectMask extends setCurrentItemInternal {
    @SerializedName("sortSequence")
    public int IconCompatParcelizer;
    @SerializedName("fundClass")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("frontEndFee")
    public double MediaBrowserCompat$ItemReceiver;
    @SerializedName("switchInFundType")
    public String MediaBrowserCompat$MediaItem;
    @SerializedName("switchInFullFundCode")
    public String read;
    @SerializedName("switchInFund")
    public setOnPageChangeListener write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        applyIntersectMask applyintersectmask = (applyIntersectMask) obj;
        if (this.IconCompatParcelizer != applyintersectmask.IconCompatParcelizer || Double.compare(applyintersectmask.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$ItemReceiver) != 0) {
            return false;
        }
        setOnPageChangeListener setonpagechangelistener = this.write;
        if (setonpagechangelistener == null ? applyintersectmask.write != null : !setonpagechangelistener.equals(applyintersectmask.write)) {
            return false;
        }
        String str = this.MediaBrowserCompat$MediaItem;
        if (str == null ? applyintersectmask.MediaBrowserCompat$MediaItem != null : !str.equals(applyintersectmask.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = applyintersectmask.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.IconCompatParcelizer;
        setOnPageChangeListener setonpagechangelistener = this.write;
        int i2 = 0;
        int hashCode = setonpagechangelistener != null ? setonpagechangelistener.hashCode() : 0;
        String str = this.MediaBrowserCompat$MediaItem;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
        int i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return (((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + i3) * 31) + i2;
    }
}
