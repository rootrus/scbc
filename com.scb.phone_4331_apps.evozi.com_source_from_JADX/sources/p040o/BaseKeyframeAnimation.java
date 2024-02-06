package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.BaseKeyframeAnimation */
public final class BaseKeyframeAnimation {
    @SerializedName("laserCode")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("number")
    public final String read;
    @SerializedName("issueDate")
    public final String write;

    /* renamed from: o.BaseKeyframeAnimation$AnimationListener */
    public final class AnimationListener {
        @SerializedName("isicCode")
        public final String IconCompatParcelizer;
        @SerializedName("isicDesc")
        public final String MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimationListener)) {
                return false;
            }
            AnimationListener animationListener = (AnimationListener) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) animationListener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) animationListener.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlBusinessIndustryEntity(isicCode=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", isicDesc=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseKeyframeAnimation)) {
            return false;
        }
        BaseKeyframeAnimation baseKeyframeAnimation = (BaseKeyframeAnimation) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) baseKeyframeAnimation.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) baseKeyframeAnimation.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) baseKeyframeAnimation.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExtendedCitizenIdEntity(number=");
        sb.append(this.read);
        sb.append(", laserCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", issueDate=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
