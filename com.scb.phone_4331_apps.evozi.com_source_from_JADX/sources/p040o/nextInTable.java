package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.nextInTable */
public final class nextInTable {
    @SerializedName("tilesVersion")
    private final String IconCompatParcelizer;
    @SerializedName("duration")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("productType")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("loanAmount")
    private final String read;
    @SerializedName("isDefaultStage")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nextInTable)) {
            return false;
        }
        nextInTable nextintable = (nextInTable) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) nextintable.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) nextintable.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) nextintable.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) nextintable.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) nextintable.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MHMCCalculationRequest(isDefaultStage=");
        sb.append(this.write);
        sb.append(", loanAmount=");
        sb.append(this.read);
        sb.append(", duration=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", tilesVersion=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", productType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public nextInTable(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "isDefaultStage");
        onGetStartedClick.write((Object) str2, "loanAmount");
        onGetStartedClick.write((Object) str3, "duration");
        onGetStartedClick.write((Object) str4, "tilesVersion");
        onGetStartedClick.write((Object) str5, "productType");
        this.write = str;
        this.read = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.IconCompatParcelizer = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
    }
}
