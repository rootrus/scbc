package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.expires */
public final class expires {
    @SerializedName("consentVersion")
    private final String IconCompatParcelizer;
    @SerializedName("consentType")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("consentSubType")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("scopes")
    private final List<expiresAfterWrite> read;
    @SerializedName("sequence")
    private final int write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof expires)) {
            return false;
        }
        expires expires = (expires) obj;
        return this.write == expires.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) expires.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) expires.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) expires.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) expires.read);
    }

    public final int hashCode() {
        int i = this.write;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        List<expiresAfterWrite> list = this.read;
        if (list != null) {
            i2 = list.hashCode();
        }
        return (((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConsentRequest(sequence=");
        sb.append(this.write);
        sb.append(", consentType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", consentSubType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", consentVersion=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", listScopes=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public expires(int i, String str, String str2, String str3, List<expiresAfterWrite> list) {
        onGetStartedClick.write((Object) str, "consentType");
        onGetStartedClick.write((Object) str2, "consentSubType");
        this.write = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.IconCompatParcelizer = str3;
        this.read = list;
    }

    public /* synthetic */ expires(String str, String str2) {
        this(1, str, str2, (String) null, (List<expiresAfterWrite>) null);
    }
}
