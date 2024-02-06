package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.nextBoolean */
public final class nextBoolean {
    @SerializedName("creditCardList")
    public final List<endObject> IconCompatParcelizer;
    @SerializedName("loanList")
    public final List<nextInt> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("prepaidCardList")
    public final List<endObject> MediaBrowserCompat$ItemReceiver;
    @SerializedName("depositList")
    public final List<nextInt> read;
    @SerializedName("debitCardList")
    public final List<endArray> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nextBoolean)) {
            return false;
        }
        nextBoolean nextboolean = (nextBoolean) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) nextboolean.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) nextboolean.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) nextboolean.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) nextboolean.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) nextboolean.read);
    }

    public final int hashCode() {
        List<endObject> list = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<nextInt> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = list2 != null ? list2.hashCode() : 0;
        List<endObject> list3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = list3 != null ? list3.hashCode() : 0;
        List<endArray> list4 = this.write;
        int hashCode4 = list4 != null ? list4.hashCode() : 0;
        List<nextInt> list5 = this.read;
        if (list5 != null) {
            i = list5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressLandingResponseEntity(creditCardList=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", loanList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", prepaidCardList=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", debitCardList=");
        sb.append(this.write);
        sb.append(", depositList=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
