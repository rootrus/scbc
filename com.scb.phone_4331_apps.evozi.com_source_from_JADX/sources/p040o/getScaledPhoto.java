package p040o;

/* renamed from: o.getScaledPhoto */
public final class getScaledPhoto {
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getScaledPhoto)) {
            return false;
        }
        getScaledPhoto getscaledphoto = (getScaledPhoto) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getscaledphoto.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getscaledphoto.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SalaryRange(salaryRangeCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", salaryRangeDescription=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public getScaledPhoto(String str, String str2) {
        onGetStartedClick.write((Object) str, "salaryRangeCode");
        onGetStartedClick.write((Object) str2, "salaryRangeDescription");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = str2;
    }
}
