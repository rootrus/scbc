package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getFillType */
public final class getFillType {
    @SerializedName("interestRate")
    public final List<getGradientColor> read;
    @SerializedName("principal")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getFillType)) {
            return false;
        }
        getFillType getfilltype = (getFillType) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getfilltype.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getfilltype.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<getGradientColor> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlPromotionOptionEntity(principal=");
        sb.append(this.write);
        sb.append(", interestRate=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
