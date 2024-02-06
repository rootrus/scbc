package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.AnimatableTextFrame */
public final class AnimatableTextFrame {
    @SerializedName("countryName")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("countryCode")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimatableTextFrame)) {
            return false;
        }
        AnimatableTextFrame animatableTextFrame = (AnimatableTextFrame) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) animatableTextFrame.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) animatableTextFrame.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SourceOfIncomeEntity(countryCode=");
        sb.append(this.write);
        sb.append(", countryName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    private AnimatableTextFrame(String str, String str2) {
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = null;
    }

    public /* synthetic */ AnimatableTextFrame(String str) {
        this(str, (String) null);
    }
}
