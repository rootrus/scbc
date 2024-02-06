package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.hasSameComparator */
public final class hasSameComparator {
    @SerializedName("citizenId")
    private final String IconCompatParcelizer;
    @SerializedName("e2eeSid")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("mobileNumber")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("encryptedPin")
    private final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hasSameComparator)) {
            return false;
        }
        hasSameComparator hassamecomparator = (hasSameComparator) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) hassamecomparator.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) hassamecomparator.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) hassamecomparator.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) hassamecomparator.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TouchPointIdentityValidationRequest(citizenId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", mobileNumber=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", encryptedPin=");
        sb.append(this.read);
        sb.append(", e2eeSid=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public hasSameComparator(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "citizenId");
        onGetStartedClick.write((Object) str2, "mobileNumber");
        onGetStartedClick.write((Object) str3, "encryptedPin");
        onGetStartedClick.write((Object) str4, "e2eeSid");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
    }
}
