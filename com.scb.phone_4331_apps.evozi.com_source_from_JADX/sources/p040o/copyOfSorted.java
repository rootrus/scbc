package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.copyOfSorted */
public final class copyOfSorted {
    @SerializedName("deviceId")
    private final String IconCompatParcelizer;
    @SerializedName("jailbreak")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("model")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("os")
    private final String RatingCompat;
    @SerializedName("brand")
    private final String read;
    @SerializedName("mobileNo")
    public String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof copyOfSorted)) {
            return false;
        }
        copyOfSorted copyofsorted = (copyOfSorted) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) copyofsorted.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) copyofsorted.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) copyofsorted.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) copyofsorted.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) copyofsorted.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) copyofsorted.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.RatingCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PreActivationDevice(deviceId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", mobileNo=");
        sb.append(this.write);
        sb.append(", brand=");
        sb.append(this.read);
        sb.append(", model=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", os=");
        sb.append(this.RatingCompat);
        sb.append(", jailbreak=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public copyOfSorted(String str, String str2, String str3, String str4, String str5, String str6) {
        onGetStartedClick.write((Object) str, "deviceId");
        onGetStartedClick.write((Object) str3, "brand");
        onGetStartedClick.write((Object) str4, "model");
        onGetStartedClick.write((Object) str5, "os");
        onGetStartedClick.write((Object) str6, "jailbreak");
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.read = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.RatingCompat = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = str6;
    }
}
