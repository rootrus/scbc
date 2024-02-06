package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p040o.BaseStrokeContent;

/* renamed from: o.addTrimPath */
public final class addTrimPath {
    @SerializedName("sortSequence")
    private final Integer IconCompatParcelizer;
    @SerializedName("imageURL")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("salesSheetFlag")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("subList")
    private final List<BaseStrokeContent.PathGroup> MediaDescriptionCompat;
    @SerializedName("desc")
    private final String read;
    @SerializedName("name")
    private final String write;

    public addTrimPath() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addTrimPath)) {
            return false;
        }
        addTrimPath addtrimpath = (addTrimPath) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) addtrimpath.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) addtrimpath.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) addtrimpath.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) addtrimpath.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) addtrimpath.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) addtrimpath.MediaDescriptionCompat);
    }

    public final int hashCode() {
        Integer num = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        String str = this.write;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        List<BaseStrokeContent.PathGroup> list = this.MediaDescriptionCompat;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductEntity(sortSequence=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", name=");
        sb.append(this.write);
        sb.append(", desc=");
        sb.append(this.read);
        sb.append(", imageURL=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", salesSheetFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", subList=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(")");
        return sb.toString();
    }

    private addTrimPath(Integer num, String str, String str2, String str3, String str4, List<BaseStrokeContent.PathGroup> list) {
        this.IconCompatParcelizer = num;
        this.write = null;
        this.read = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.MediaBrowserCompat$ItemReceiver = null;
        this.MediaDescriptionCompat = null;
    }

    private /* synthetic */ addTrimPath(byte b) {
        this(0, (String) null, (String) null, (String) null, (String) null, (List<BaseStrokeContent.PathGroup>) null);
    }
}
