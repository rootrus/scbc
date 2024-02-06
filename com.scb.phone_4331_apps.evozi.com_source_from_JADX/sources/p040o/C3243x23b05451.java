package p040o;

/* renamed from: o.CrashlyticsController$3$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3243x23b05451 {
    public final String IconCompatParcelizer;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3243x23b05451)) {
            return false;
        }
        C3243x23b05451 crashlyticsController$3$MediaBrowserCompat$CustomActionResultReceiver = (C3243x23b05451) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) crashlyticsController$3$MediaBrowserCompat$CustomActionResultReceiver.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) crashlyticsController$3$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DutyStampFee(rate=");
        sb.append(this.read);
        sb.append(", maxAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public C3243x23b05451(String str, String str2) {
        onGetStartedClick.write((Object) str, "rate");
        onGetStartedClick.write((Object) str2, "maxAmount");
        this.read = str;
        this.IconCompatParcelizer = str2;
    }
}
