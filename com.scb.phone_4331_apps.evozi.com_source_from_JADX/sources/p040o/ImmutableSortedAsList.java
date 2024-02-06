package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ImmutableSortedAsList */
public final class ImmutableSortedAsList {
    @SerializedName("e2eeSid")
    private final String IconCompatParcelizer;
    @SerializedName("encryptPin")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("mobileNo")
    private final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImmutableSortedAsList)) {
            return false;
        }
        ImmutableSortedAsList immutableSortedAsList = (ImmutableSortedAsList) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) immutableSortedAsList.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) immutableSortedAsList.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) immutableSortedAsList.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PreValidationRequest(mobileNo=");
        sb.append(this.read);
        sb.append(", e2eeSid=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", encryptPin=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public ImmutableSortedAsList(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "mobileNo");
        onGetStartedClick.write((Object) str2, "e2eeSid");
        onGetStartedClick.write((Object) str3, "encryptPin");
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
    }
}
