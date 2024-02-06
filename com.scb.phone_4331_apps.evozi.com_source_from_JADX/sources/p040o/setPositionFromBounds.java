package p040o;

/* renamed from: o.setPositionFromBounds */
public final class setPositionFromBounds {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setPositionFromBounds)) {
            return false;
        }
        setPositionFromBounds setpositionfrombounds = (setPositionFromBounds) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setpositionfrombounds.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setpositionfrombounds.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setpositionfrombounds.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GoogleSigninResponse(accessToken=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", idToken=");
        sb.append(this.write);
        sb.append(", refreshToken=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public setPositionFromBounds(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "accessToken");
        onGetStartedClick.write((Object) str2, "idToken");
        onGetStartedClick.write((Object) str3, "refreshToken");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
        this.IconCompatParcelizer = str3;
    }
}
