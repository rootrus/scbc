package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setDescription */
public final class setDescription {
    @SerializedName("sortSequence")
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountNo")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("loanType")
    public final PINBlockException read;
    @SerializedName("accountStatus")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDescription)) {
            return false;
        }
        setDescription setdescription = (setDescription) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver == setdescription.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setdescription.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setdescription.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setdescription.write);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        PINBlockException pINBlockException = this.read;
        int hashCode2 = pINBlockException != null ? pINBlockException.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return (((((i * 31) + hashCode) * 31) + hashCode2) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnregisteredLoanEntity(sortSequence=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", accountNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", loanType=");
        sb.append(this.read);
        sb.append(", accountStatus=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
