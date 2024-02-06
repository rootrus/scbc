package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getErrorFromConnection */
public final class getErrorFromConnection {
    @SerializedName("refId")
    public final String IconCompatParcelizer;
    @SerializedName("mobileNo")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getErrorFromConnection)) {
            return false;
        }
        getErrorFromConnection geterrorfromconnection = (getErrorFromConnection) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) geterrorfromconnection.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) geterrorfromconnection.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JuristicSendOtaResponseEntity(mobileNo=");
        sb.append(this.read);
        sb.append(", refId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
