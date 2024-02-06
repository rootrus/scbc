package p040o;

/* renamed from: o.setRotateGesturesEnabled */
public final class setRotateGesturesEnabled {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String write;

    public setRotateGesturesEnabled() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setRotateGesturesEnabled)) {
            return false;
        }
        setRotateGesturesEnabled setrotategesturesenabled = (setRotateGesturesEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setrotategesturesenabled.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setrotategesturesenabled.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setrotategesturesenabled.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account(accountNumber=");
        sb.append(this.write);
        sb.append(", accountName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", bankCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setRotateGesturesEnabled(String str, String str2, String str3) {
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
    }

    private /* synthetic */ setRotateGesturesEnabled(byte b) {
        this((String) null, (String) null, (String) null);
    }
}
