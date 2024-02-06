package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getLikelihood */
public class getLikelihood {
    @SerializedName("imageUrl")
    public String IconCompatParcelizer;
    @SerializedName("functionId")
    String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getLikelihood() {
    }

    public getLikelihood(String str, String str2) {
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getLikelihood getlikelihood = (getLikelihood) obj;
        String str = this.IconCompatParcelizer;
        if (str == null ? getlikelihood.IconCompatParcelizer != null : !str.equals(getlikelihood.IconCompatParcelizer)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        String str3 = getlikelihood.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }
}
