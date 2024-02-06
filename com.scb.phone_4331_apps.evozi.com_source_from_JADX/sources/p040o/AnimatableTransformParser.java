package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.AnimatableTransformParser */
public class AnimatableTransformParser {
    @SerializedName("imageUrl")
    public String IconCompatParcelizer;
    @SerializedName("functionId")
    public String MediaBrowserCompat$CustomActionResultReceiver;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnimatableTransformParser animatableTransformParser = (AnimatableTransformParser) obj;
        String str = this.IconCompatParcelizer;
        if (str == null ? animatableTransformParser.IconCompatParcelizer != null : !str.equals(animatableTransformParser.IconCompatParcelizer)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = animatableTransformParser.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }
}
