package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.removeUpdateListener */
public final class removeUpdateListener {
    @SerializedName("txnDateTime")
    public String IconCompatParcelizer;
    @SerializedName("txnTitle")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("refId")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("txnNote")
    public String read;
    @SerializedName("txnType")
    public String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeUpdateListener)) {
            return false;
        }
        removeUpdateListener removeupdatelistener = (removeUpdateListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) removeupdatelistener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) removeupdatelistener.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) removeupdatelistener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) removeupdatelistener.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) removeupdatelistener.write);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThirdPartyHeaderEntity(txnDateTime=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", txnNote=");
        sb.append(this.read);
        sb.append(", txnRefId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", txnTitle=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", txnType=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
