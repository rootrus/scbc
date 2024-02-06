package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.SplitDimensionPathKeyframeAnimation */
public final class SplitDimensionPathKeyframeAnimation {
    @SerializedName("imageName")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("documentDesc")
    private final String read;
    @SerializedName("documentId")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitDimensionPathKeyframeAnimation)) {
            return false;
        }
        SplitDimensionPathKeyframeAnimation splitDimensionPathKeyframeAnimation = (SplitDimensionPathKeyframeAnimation) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) splitDimensionPathKeyframeAnimation.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) splitDimensionPathKeyframeAnimation.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) splitDimensionPathKeyframeAnimation.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlDocumentInfoEntity(documentId=");
        sb.append(this.write);
        sb.append(", imageName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", documentDesc=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
