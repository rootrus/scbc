package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.buildRankMap */
public final class buildRankMap extends standardContains {
    @SerializedName("e2eeS")
    private String IconCompatParcelizer;
    @SerializedName("preregistrationTokenId")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("encrypt")
    private String MediaBrowserCompat$ItemReceiver;
    @SerializedName("juristicState")
    private final String read;
    @SerializedName("device")
    private String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buildRankMap)) {
            return false;
        }
        buildRankMap buildrankmap = (buildRankMap) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) buildrankmap.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) buildrankmap.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) buildrankmap.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) buildrankmap.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) buildrankmap.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JuristicPreRegistrationRequest(e2eeS=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", encrypt=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", device=");
        sb.append(this.write);
        sb.append(", juristicState=");
        sb.append(this.read);
        sb.append(", preregistrationTokenId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buildRankMap(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3);
        onGetStartedClick.write((Object) str, "e2eeS");
        onGetStartedClick.write((Object) str2, "encrypt");
        onGetStartedClick.write((Object) str3, "device");
        onGetStartedClick.write((Object) str4, "juristicState");
        onGetStartedClick.write((Object) str5, "preregistrationTokenId");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.write = str3;
        this.read = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
    }
}
