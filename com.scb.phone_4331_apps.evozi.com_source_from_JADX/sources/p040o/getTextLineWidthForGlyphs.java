package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getTextLineWidthForGlyphs */
public final class getTextLineWidthForGlyphs {
    @SerializedName("label")
    public final String IconCompatParcelizer;
    @SerializedName("code")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("sortSequence")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTextLineWidthForGlyphs)) {
            return false;
        }
        getTextLineWidthForGlyphs gettextlinewidthforglyphs = (getTextLineWidthForGlyphs) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) gettextlinewidthforglyphs.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) gettextlinewidthforglyphs.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) gettextlinewidthforglyphs.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SCBSRiskLevelItemEntity(sortSequence=");
        sb.append(this.read);
        sb.append(", code=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", label=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
