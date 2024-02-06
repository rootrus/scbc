package p040o;

/* renamed from: o.getUserDataFileForSession */
public final class getUserDataFileForSession {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final float write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getUserDataFileForSession)) {
            return false;
        }
        getUserDataFileForSession getuserdatafileforsession = (getUserDataFileForSession) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getuserdatafileforsession.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getuserdatafileforsession.IconCompatParcelizer) && Float.compare(this.write, getuserdatafileforsession.write) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getuserdatafileforsession.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int floatToIntBits = Float.floatToIntBits(this.write);
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + floatToIntBits) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScbsPieSectorDisplay(label=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", color=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", percentage=");
        sb.append(this.write);
        sb.append(", formattedPercentage=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getUserDataFileForSession(String str, String str2, float f, String str3) {
        onGetStartedClick.write((Object) str3, "formattedPercentage");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
        this.write = f;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
    }
}
