package p040o;

import com.google.gson.annotations.SerializedName;
import p040o.getTextLines;

/* renamed from: o.fromFileSync */
public final class fromFileSync {
    @SerializedName("accountNickname")
    public final String IconCompatParcelizer;
    @SerializedName("accountNo")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountStatus")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("allowFlag")
    public final String read;
    @SerializedName("accountType")
    public final getTextLines.IconCompatParcelizer write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fromFileSync)) {
            return false;
        }
        fromFileSync fromfilesync = (fromFileSync) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fromfilesync.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fromfilesync.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fromfilesync.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fromfilesync.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fromfilesync.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        getTextLines.IconCompatParcelizer iconCompatParcelizer = this.write;
        int hashCode3 = iconCompatParcelizer != null ? iconCompatParcelizer.hashCode() : 0;
        String str3 = this.read;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FixedTransferDetailsAccountEntity(accountNo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", accountNickname=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountType=");
        sb.append(this.write);
        sb.append(", allowFlag=");
        sb.append(this.read);
        sb.append(", accountStatus=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
