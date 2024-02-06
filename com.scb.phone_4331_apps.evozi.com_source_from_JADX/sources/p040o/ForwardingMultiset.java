package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;

/* renamed from: o.ForwardingMultiset */
public final class ForwardingMultiset {
    @SerializedName("tokenId")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("answerList")
    private final HashMap<String, String> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForwardingMultiset)) {
            return false;
        }
        ForwardingMultiset forwardingMultiset = (ForwardingMultiset) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) forwardingMultiset.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) forwardingMultiset.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        HashMap<String, String> hashMap = this.write;
        if (hashMap != null) {
            i = hashMap.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MutualFundKnowledgeAssessmentDataRequest(tokenId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", answerList=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public ForwardingMultiset(String str, HashMap<String, String> hashMap) {
        onGetStartedClick.write((Object) str, "tokenId");
        onGetStartedClick.write((Object) hashMap, "answerList");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = hashMap;
    }
}
