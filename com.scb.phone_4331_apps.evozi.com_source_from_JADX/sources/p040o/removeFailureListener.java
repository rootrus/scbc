package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.removeFailureListener */
public final class removeFailureListener {
    @SerializedName("transactionDateTime")
    public final String IconCompatParcelizer;
    @SerializedName("receivingAccount")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountName")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("transactionId")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("remainingBalance")
    public final String read;
    @SerializedName("ncbTransactionId")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeFailureListener)) {
            return false;
        }
        removeFailureListener removefailurelistener = (removeFailureListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) removefailurelistener.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) removefailurelistener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) removefailurelistener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) removefailurelistener.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) removefailurelistener.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) removefailurelistener.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashCommonConfirmEntity(transactionId=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", transactionDateTime=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", remainingBalance=");
        sb.append(this.read);
        sb.append(", ncbTransactionId=");
        sb.append(this.write);
        sb.append(", receivingAccount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
