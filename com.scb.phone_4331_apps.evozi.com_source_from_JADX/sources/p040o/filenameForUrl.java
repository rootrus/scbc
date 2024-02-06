package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p040o.TextLayer;

/* renamed from: o.filenameForUrl */
public final class filenameForUrl {
    @SerializedName("questionNumber")
    public final String IconCompatParcelizer;
    @SerializedName("section")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("question")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("answers")
    public final List<TextLayer.C38593> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof filenameForUrl)) {
            return false;
        }
        filenameForUrl filenameforurl = (filenameForUrl) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) filenameforurl.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) filenameforurl.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) filenameforurl.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) filenameforurl.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        List<TextLayer.C38593> list = this.write;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("QuestionEntity(section=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", questionNumber=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", question=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", answers=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
