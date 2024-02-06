package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.rehash */
public final class rehash {
    @SerializedName("accountFrom")
    private final String IconCompatParcelizer;
    @SerializedName("subProductAttribute")
    private final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rehash)) {
            return false;
        }
        rehash rehash = (rehash) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) rehash.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) rehash.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CloseAccountValidationRequest(accountFrom=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", subProductAttribute=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public rehash(String str, String str2) {
        onGetStartedClick.write((Object) str, "accountFrom");
        onGetStartedClick.write((Object) str2, "subProductAttribute");
        this.IconCompatParcelizer = str;
        this.read = str2;
    }
}
