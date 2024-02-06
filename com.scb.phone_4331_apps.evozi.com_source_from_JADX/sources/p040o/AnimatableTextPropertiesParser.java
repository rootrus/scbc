package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.AnimatableTextPropertiesParser */
public final class AnimatableTextPropertiesParser {
    @SerializedName("preregistrationTokenId")
    public final String read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AnimatableTextPropertiesParser) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((AnimatableTextPropertiesParser) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.read;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JuristicVerifyOtpResponseEntity(preregistrationTokenId=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
