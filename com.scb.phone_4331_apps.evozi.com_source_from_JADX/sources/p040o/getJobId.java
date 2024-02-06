package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getJobId */
public final class getJobId {
    @SerializedName("postDate")
    public final String IconCompatParcelizer;
    @SerializedName("merchName")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("cycleNumber")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("transactionDate")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("transactionAmt")
    public final Double MediaDescriptionCompat;
    @SerializedName("refNo")
    public final String read;
    @SerializedName("sequenceNo")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getJobId)) {
            return false;
        }
        getJobId getjobid = (getJobId) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getjobid.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) getjobid.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getjobid.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getjobid.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getjobid.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getjobid.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getjobid.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        Double d = this.MediaDescriptionCompat;
        int hashCode3 = d != null ? d.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CardTransaction(merchantName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", transactionDate=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", transactionAmt=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", postDate=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", refNo=");
        sb.append(this.read);
        sb.append(", cycleNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", sequenceNo=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public getJobId(String str, String str2, Double d, String str3, String str4, String str5, String str6) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$SearchResultReceiver = str2;
        this.MediaDescriptionCompat = d;
        this.IconCompatParcelizer = str3;
        this.read = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
        this.write = str6;
    }
}
