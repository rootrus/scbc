package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.standardPutAll */
public final class standardPutAll {
    @SerializedName("prepaidCardList")
    public final List<ForwardingListMultimap> IconCompatParcelizer;
    @SerializedName("debitCardList")
    public final List<ForwardingListMultimap> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("loanList")
    public final List<ForwardingListMultimap> MediaBrowserCompat$ItemReceiver;
    @SerializedName("creditCardList")
    public final List<ForwardingListMultimap> read;
    @SerializedName("depositList")
    public final List<ForwardingListMultimap> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof standardPutAll)) {
            return false;
        }
        standardPutAll standardputall = (standardPutAll) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) standardputall.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) standardputall.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) standardputall.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) standardputall.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) standardputall.write);
    }

    public final int hashCode() {
        List<ForwardingListMultimap> list = this.read;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<ForwardingListMultimap> list2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = list2 != null ? list2.hashCode() : 0;
        List<ForwardingListMultimap> list3 = this.IconCompatParcelizer;
        int hashCode3 = list3 != null ? list3.hashCode() : 0;
        List<ForwardingListMultimap> list4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = list4 != null ? list4.hashCode() : 0;
        List<ForwardingListMultimap> list5 = this.write;
        if (list5 != null) {
            i = list5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressProductListRequest(creditCardList=");
        sb.append(this.read);
        sb.append(", loanList=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", prepaidCardList=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", debitCardList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", depositList=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public standardPutAll(List<ForwardingListMultimap> list, List<ForwardingListMultimap> list2, List<ForwardingListMultimap> list3, List<ForwardingListMultimap> list4, List<ForwardingListMultimap> list5) {
        this.read = list;
        this.MediaBrowserCompat$ItemReceiver = list2;
        this.IconCompatParcelizer = list3;
        this.MediaBrowserCompat$CustomActionResultReceiver = list4;
        this.write = list5;
    }
}
