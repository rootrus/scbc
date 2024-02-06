package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getMatrix */
public final class getMatrix {
    @SerializedName("stage")
    private final String IconCompatParcelizer;
    @SerializedName("transactionId")
    public final String read;
    @SerializedName("liveness")
    public final notifyUpdate write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMatrix)) {
            return false;
        }
        getMatrix getmatrix = (getMatrix) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getmatrix.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getmatrix.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getmatrix.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        notifyUpdate notifyupdate = this.write;
        if (notifyupdate != null) {
            i = notifyupdate.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlIdentifySetupEntity(transactionId=");
        sb.append(this.read);
        sb.append(", stage=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", liveness=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
