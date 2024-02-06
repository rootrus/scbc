package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.InvalidFormatException */
public final class InvalidFormatException {
    @SerializedName("productType")
    public final PINBlockException IconCompatParcelizer;
    @SerializedName("accountStatus")
    private final PINBlockException MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("branch")
    public final PINBlockException MediaBrowserCompat$ItemReceiver;
    @SerializedName("sortSequence")
    public final int read;
    @SerializedName("accountNo")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvalidFormatException)) {
            return false;
        }
        InvalidFormatException invalidFormatException = (InvalidFormatException) obj;
        return this.read == invalidFormatException.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) invalidFormatException.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) invalidFormatException.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) invalidFormatException.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) invalidFormatException.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        int i = this.read;
        String str = this.write;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        PINBlockException pINBlockException = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = pINBlockException != null ? pINBlockException.hashCode() : 0;
        PINBlockException pINBlockException2 = this.IconCompatParcelizer;
        int hashCode3 = pINBlockException2 != null ? pINBlockException2.hashCode() : 0;
        PINBlockException pINBlockException3 = this.MediaBrowserCompat$ItemReceiver;
        if (pINBlockException3 != null) {
            i2 = pINBlockException3.hashCode();
        }
        return (((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnregisteredDepositEntity(sortSequence=");
        sb.append(this.read);
        sb.append(", accountNo=");
        sb.append(this.write);
        sb.append(", accountStatus=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", productType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", branch=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
