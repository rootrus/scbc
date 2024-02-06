package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p040o.MergePaths;

/* renamed from: o.ShapeData */
public final class ShapeData extends setCurrentItemInternal {
    @SerializedName("profile")
    private final MergePaths.MergePathsMode IconCompatParcelizer;
    @SerializedName("clientList")
    private final List<getMaskPath> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("depositList")
    private final List<Mask> MediaBrowserCompat$ItemReceiver;
    @SerializedName("cardList")
    private final List<GradientType> read;
    @SerializedName("funds")
    private final List<ShapePath> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShapeData)) {
            return false;
        }
        ShapeData shapeData = (ShapeData) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) shapeData.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) shapeData.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) shapeData.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) shapeData.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) shapeData.IconCompatParcelizer);
    }

    public final int hashCode() {
        List<ShapePath> list = this.write;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<getMaskPath> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = list2 != null ? list2.hashCode() : 0;
        List<Mask> list3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = list3 != null ? list3.hashCode() : 0;
        List<GradientType> list4 = this.read;
        int hashCode4 = list4 != null ? list4.hashCode() : 0;
        MergePaths.MergePathsMode mergePathsMode = this.IconCompatParcelizer;
        if (mergePathsMode != null) {
            i = mergePathsMode.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiscoverDeepLinkEntity(funds=");
        sb.append(this.write);
        sb.append(", clientList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", depositList=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", cardList=");
        sb.append(this.read);
        sb.append(", profile=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
