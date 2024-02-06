package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setRepeatMode */
public final class setRepeatMode {
    @SerializedName("replaceFlag")
    public final Integer IconCompatParcelizer;
    @SerializedName("cardList")
    public final List<updateBitmap> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("numberOfDebitCard")
    public final Integer MediaBrowserCompat$ItemReceiver;
    @SerializedName("accountNo")
    public final String read;
    @SerializedName("newFlag")
    public final Integer write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setRepeatMode)) {
            return false;
        }
        setRepeatMode setrepeatmode = (setRepeatMode) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setrepeatmode.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setrepeatmode.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setrepeatmode.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setrepeatmode.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setrepeatmode.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<updateBitmap> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = list != null ? list.hashCode() : 0;
        Integer num = this.write;
        int hashCode3 = num != null ? num.hashCode() : 0;
        Integer num2 = this.IconCompatParcelizer;
        int hashCode4 = num2 != null ? num2.hashCode() : 0;
        Integer num3 = this.MediaBrowserCompat$ItemReceiver;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardDepositAccountEntity(accountNo=");
        sb.append(this.read);
        sb.append(", cardList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", newFlag=");
        sb.append(this.write);
        sb.append(", replaceFlag=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", numberOfDebitCard=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
