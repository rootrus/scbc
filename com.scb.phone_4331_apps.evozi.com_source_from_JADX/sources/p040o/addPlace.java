package p040o;

/* renamed from: o.addPlace */
public final class addPlace {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final int MediaBrowserCompat$ItemReceiver;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addPlace)) {
            return false;
        }
        addPlace addplace = (addPlace) obj;
        return this.MediaBrowserCompat$ItemReceiver == addplace.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) addplace.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) addplace.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        String str = this.read;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return (((i * 31) + hashCode) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SCBSRiskLevelItem(sortSequence=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", code=");
        sb.append(this.read);
        sb.append(", label=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public addPlace(int i, String str, String str2) {
        onGetStartedClick.write((Object) str, "code");
        onGetStartedClick.write((Object) str2, "label");
        this.MediaBrowserCompat$ItemReceiver = i;
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }
}
