package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.onPolylineClick */
public final class onPolylineClick {
    @SerializedName("header")
    public final String IconCompatParcelizer;
    @SerializedName("title")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("type")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("imageURL")
    public final String read;
    @SerializedName("description")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onPolylineClick)) {
            return false;
        }
        onPolylineClick onpolylineclick = (onPolylineClick) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onpolylineclick.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onpolylineclick.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onpolylineclick.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onpolylineclick.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onpolylineclick.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentInfo(type=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", title=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", header=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", description=");
        sb.append(this.write);
        sb.append(", imageURL=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public onPolylineClick(String str, String str2, String str3, String str4, String str5) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.IconCompatParcelizer = str3;
        this.write = str4;
        this.read = str5;
    }
}
