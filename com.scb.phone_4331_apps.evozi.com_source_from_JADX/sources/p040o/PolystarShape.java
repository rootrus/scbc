package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.PolystarShape */
public final class PolystarShape {
    @SerializedName("choice")
    public final String IconCompatParcelizer;
    @SerializedName("selected")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("score")
    public final String write;

    /* renamed from: o.PolystarShape$Type */
    public class Type {
        @SerializedName("riskScore")
        public String IconCompatParcelizer;
        @SerializedName("baa")
        public List<PolystarShape$Type$MediaBrowserCompat$CustomActionResultReceiver> MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("riskMessage")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("tokenId")
        public String read;
        @SerializedName("disclaimer")
        public List<String> write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolystarShape)) {
            return false;
        }
        PolystarShape polystarShape = (PolystarShape) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) polystarShape.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) polystarShape.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) polystarShape.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentRiskAssessmentAnswerEntity(selected=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", choice=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", score=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
