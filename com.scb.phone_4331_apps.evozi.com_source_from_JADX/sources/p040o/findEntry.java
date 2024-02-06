package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.findEntry */
public final class findEntry {
    @SerializedName("ref3Label")
    public final String IconCompatParcelizer;
    @SerializedName("merchantName")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("billerLogo")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("ref1Label")
    public final String read;
    @SerializedName("ref2Label")
    public final String write;

    public findEntry() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof findEntry)) {
            return false;
        }
        findEntry findentry = (findEntry) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) findentry.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) findentry.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) findentry.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) findentry.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) findentry.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BillerEntity(merchantName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", billerLogo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", ref1Label=");
        sb.append(this.read);
        sb.append(", ref2Label=");
        sb.append(this.write);
        sb.append(", ref3Label=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    private findEntry(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str3, "ref1Label");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = str3;
        this.write = str4;
        this.IconCompatParcelizer = str5;
    }

    private /* synthetic */ findEntry(byte b) {
        this("", "", "", "", "");
    }
}
