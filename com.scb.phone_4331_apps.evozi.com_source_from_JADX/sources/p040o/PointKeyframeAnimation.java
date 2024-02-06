package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.PointKeyframeAnimation */
public final class PointKeyframeAnimation {
    @SerializedName("resubmitReasonDesc")
    public final String IconCompatParcelizer;
    @SerializedName("instructionFlag")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("minQuantity")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("uploads")
    public final List<C3732xbdd16f33> MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("uploadMethod")
    public final write MediaDescriptionCompat;
    @SerializedName("totalUploadedQuantity")
    public final String MediaMetadataCompat;
    @SerializedName("maxQuantity")
    public final String read;
    @SerializedName("cameraType")
    public final String write;

    /* renamed from: o.PointKeyframeAnimation$write */
    public static final class write {
        @SerializedName("gallery")
        public final String IconCompatParcelizer;
        @SerializedName("camera")
        public final String read;
        @SerializedName("fileStorage")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write write2 = (write) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) write2.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) write2.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) write2.write);
        }

        public final int hashCode() {
            String str = this.read;
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
            sb.append("UploadMethodEntity(camera=");
            sb.append(this.read);
            sb.append(", gallery=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", fileStorage=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointKeyframeAnimation)) {
            return false;
        }
        PointKeyframeAnimation pointKeyframeAnimation = (PointKeyframeAnimation) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) pointKeyframeAnimation.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) pointKeyframeAnimation.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) pointKeyframeAnimation.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) pointKeyframeAnimation.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) pointKeyframeAnimation.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) pointKeyframeAnimation.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) pointKeyframeAnimation.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) pointKeyframeAnimation.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaMetadataCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        List<C3732xbdd16f33> list = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = list != null ? list.hashCode() : 0;
        String str5 = this.write;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        write write2 = this.MediaDescriptionCompat;
        int hashCode7 = write2 != null ? write2.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlDocumentsTypeEntity(resubmitReasonDesc=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", minQuantity=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", maxQuantity=");
        sb.append(this.read);
        sb.append(", totalUploadedQuantity=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", uploads=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", cameraType=");
        sb.append(this.write);
        sb.append(", uploadMethod=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", instructionFlag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
