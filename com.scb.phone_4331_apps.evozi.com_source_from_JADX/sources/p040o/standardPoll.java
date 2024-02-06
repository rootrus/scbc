package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.standardPoll */
public final class standardPoll {
    @SerializedName("editType")
    private final String IconCompatParcelizer;
    @SerializedName("owner")
    private final ForwardingSortedSet MediaBrowserCompat$ItemReceiver;
    @SerializedName("walletList")
    public final List<ForwardingSortedMap> read;
    @SerializedName("merchant")
    private final ForwardingObject write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof standardPoll)) {
            return false;
        }
        standardPoll standardpoll = (standardPoll) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) standardpoll.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) standardpoll.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) standardpoll.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) standardpoll.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        ForwardingObject forwardingObject = this.write;
        int hashCode2 = forwardingObject != null ? forwardingObject.hashCode() : 0;
        ForwardingSortedSet forwardingSortedSet = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = forwardingSortedSet != null ? forwardingSortedSet.hashCode() : 0;
        List<ForwardingSortedMap> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantWalletEditRequest(editType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", merchant=");
        sb.append(this.write);
        sb.append(", owner=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", walletList=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public standardPoll(String str, ForwardingObject forwardingObject, ForwardingSortedSet forwardingSortedSet, List<? extends ForwardingSortedMap> list) {
        this.IconCompatParcelizer = str;
        this.write = forwardingObject;
        this.MediaBrowserCompat$ItemReceiver = forwardingSortedSet;
        this.read = list;
    }
}
