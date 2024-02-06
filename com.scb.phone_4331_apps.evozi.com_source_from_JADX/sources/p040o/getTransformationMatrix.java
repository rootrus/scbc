package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getTransformationMatrix */
public final class getTransformationMatrix extends setCurrentItemInternal {
    @SerializedName("imagePath")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("termsandconditionsURL")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("sharedText")
    public final String read;
    @SerializedName("referCode")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTransformationMatrix)) {
            return false;
        }
        getTransformationMatrix gettransformationmatrix = (getTransformationMatrix) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) gettransformationmatrix.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) gettransformationmatrix.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) gettransformationmatrix.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) gettransformationmatrix.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FriendsLandingEntity(imagePath=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", referCode=");
        sb.append(this.write);
        sb.append(", termsandconditionsURL=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", sharedText=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
