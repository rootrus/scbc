package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getInstance */
public final class getInstance {
    @SerializedName("confirmationStatus")
    private final String IconCompatParcelizer;
    @SerializedName("confirmDateTime")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("refId")
    private final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getInstance)) {
            return false;
        }
        getInstance getinstance = (getInstance) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getinstance.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getinstance.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getinstance.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoanConfirmationEntity(confirmDateTime=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", refId=");
        sb.append(this.read);
        sb.append(", confirmationStatus=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
