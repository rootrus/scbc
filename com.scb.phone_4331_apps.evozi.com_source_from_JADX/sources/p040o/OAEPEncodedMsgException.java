package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.OAEPEncodedMsgException */
public final class OAEPEncodedMsgException {
    @SerializedName("singleAppFlag")
    public final String read;
    @SerializedName("registeredFlag")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAEPEncodedMsgException)) {
            return false;
        }
        OAEPEncodedMsgException oAEPEncodedMsgException = (OAEPEncodedMsgException) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) oAEPEncodedMsgException.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) oAEPEncodedMsgException.read);
    }

    public final int hashCode() {
        String str = this.write;
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
        sb.append("SecuritiesListEntity(registeredFlag=");
        sb.append(this.write);
        sb.append(", singleAppFlag=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
