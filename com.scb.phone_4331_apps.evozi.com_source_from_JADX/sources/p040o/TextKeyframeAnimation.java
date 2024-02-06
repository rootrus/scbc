package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.TextKeyframeAnimation */
public final class TextKeyframeAnimation {
    @SerializedName("documentHeader")
    public final String IconCompatParcelizer;
    @SerializedName("instruction")
    public final C3856xec713b6 MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("tips")
    public final List<write> write;

    /* renamed from: o.TextKeyframeAnimation$write */
    public static final class write {
        @SerializedName("primaryIconPath")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("description")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("secondaryIconPath")
        public final String read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write write = (write) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) write.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) write.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) write.read);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.read;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Tip(primaryIconPath=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", description=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", secondaryIconPath=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextKeyframeAnimation)) {
            return false;
        }
        TextKeyframeAnimation textKeyframeAnimation = (TextKeyframeAnimation) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) textKeyframeAnimation.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) textKeyframeAnimation.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) textKeyframeAnimation.IconCompatParcelizer);
    }

    public final int hashCode() {
        C3856xec713b6 textKeyframeAnimation$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = textKeyframeAnimation$MediaBrowserCompat$CustomActionResultReceiver != null ? textKeyframeAnimation$MediaBrowserCompat$CustomActionResultReceiver.hashCode() : 0;
        List<write> list = this.write;
        int hashCode2 = list != null ? list.hashCode() : 0;
        String str = this.IconCompatParcelizer;
        if (str != null) {
            i = str.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlDocumentInstructionsEntity(instruction=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", tips=");
        sb.append(this.write);
        sb.append(", header=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
