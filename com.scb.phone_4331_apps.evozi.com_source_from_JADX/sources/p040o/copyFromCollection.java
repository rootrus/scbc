package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.copyFromCollection */
public final class copyFromCollection {
    @SerializedName("consentType")
    public final String read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof copyFromCollection) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((copyFromCollection) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.read;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrivacyConsentRequest(consentType=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public copyFromCollection(String str) {
        onGetStartedClick.write((Object) str, "consentType");
        this.read = str;
    }
}
