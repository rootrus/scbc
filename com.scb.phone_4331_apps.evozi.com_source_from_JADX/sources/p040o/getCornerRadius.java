package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getCornerRadius */
public final class getCornerRadius {
    @SerializedName("answers")
    public final List<PolystarShape> IconCompatParcelizer;
    @SerializedName("isDisplay")
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("section")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("question")
    public final String read;
    @SerializedName("questionNumber")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCornerRadius)) {
            return false;
        }
        getCornerRadius getcornerradius = (getCornerRadius) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getcornerradius.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getcornerradius.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getcornerradius.read) && this.MediaBrowserCompat$CustomActionResultReceiver == getcornerradius.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getcornerradius.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (z) {
            z = true;
        }
        List<PolystarShape> list = this.IconCompatParcelizer;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (z ? 1 : 0)) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentRiskAssessmentQuestionEntity(section=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", questionNumber=");
        sb.append(this.write);
        sb.append(", question=");
        sb.append(this.read);
        sb.append(", isDisplay=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", answers=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
