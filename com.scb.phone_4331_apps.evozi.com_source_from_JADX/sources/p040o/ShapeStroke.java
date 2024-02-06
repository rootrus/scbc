package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p040o.MergePaths;

/* renamed from: o.ShapeStroke */
public class ShapeStroke extends setCurrentItemInternal {
    @SerializedName("data")
    private getColor read;

    /* renamed from: o.ShapeStroke$LineCapType */
    public final class LineCapType {
        @SerializedName("clientList")
        public final List<getMaskPath> IconCompatParcelizer;
        @SerializedName("isBoughtFund")
        public final Boolean MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("riskProfile")
        public final MergePaths.MergePathsMode MediaBrowserCompat$ItemReceiver;
        @SerializedName("isClient")
        public final Boolean read;
        @SerializedName("fundList")
        public final List<getParentId> write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LineCapType)) {
                return false;
            }
            LineCapType lineCapType = (LineCapType) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) lineCapType.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) lineCapType.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) lineCapType.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) lineCapType.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) lineCapType.write);
        }

        public final int hashCode() {
            Boolean bool = this.read;
            int i = 0;
            int hashCode = bool != null ? bool.hashCode() : 0;
            Boolean bool2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = bool2 != null ? bool2.hashCode() : 0;
            MergePaths.MergePathsMode mergePathsMode = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = mergePathsMode != null ? mergePathsMode.hashCode() : 0;
            List<getMaskPath> list = this.IconCompatParcelizer;
            int hashCode4 = list != null ? list.hashCode() : 0;
            List<getParentId> list2 = this.write;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("InvestmentNowEntity(isClient=");
            sb.append(this.read);
            sb.append(", isBoughtFund=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", riskProfile=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", clientList=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", fundList=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.ShapeStroke$LineJoinType */
    public final class LineJoinType {
        @SerializedName("requirePeriod")
        final Boolean IconCompatParcelizer;
        @SerializedName("id")
        final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("longDescription")
        final String read;
        @SerializedName("description")
        final String write;

        public LineJoinType() {
            this((byte) 0);
        }

        private LineJoinType(String str, String str2, String str3, Boolean bool) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write = null;
            this.read = null;
            this.IconCompatParcelizer = bool;
        }

        private /* synthetic */ LineJoinType(byte b) {
            this((String) null, (String) null, (String) null, Boolean.FALSE);
        }
    }
}
