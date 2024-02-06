package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getOuterRadius */
public final class getOuterRadius {
    @SerializedName("qsummary")
    public final List<RectangleShape> IconCompatParcelizer;
    @SerializedName("preselect")
    public final int read;
    @SerializedName("assessment")
    public final List<getCornerRadius> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getOuterRadius)) {
            return false;
        }
        getOuterRadius getouterradius = (getOuterRadius) obj;
        return this.read == getouterradius.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getouterradius.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getouterradius.IconCompatParcelizer);
    }

    public final int hashCode() {
        int i = this.read;
        List<getCornerRadius> list = this.write;
        int i2 = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<RectangleShape> list2 = this.IconCompatParcelizer;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return (((i * 31) + hashCode) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentRiskAssessmentEntity(preselect=");
        sb.append(this.read);
        sb.append(", assessments=");
        sb.append(this.write);
        sb.append(", summaries=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
