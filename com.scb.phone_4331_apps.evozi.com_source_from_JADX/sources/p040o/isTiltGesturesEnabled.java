package p040o;

/* renamed from: o.isTiltGesturesEnabled */
public final class isTiltGesturesEnabled {
    public final String IconCompatParcelizer;
    public final double read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isTiltGesturesEnabled)) {
            return false;
        }
        isTiltGesturesEnabled istiltgesturesenabled = (isTiltGesturesEnabled) obj;
        return Double.compare(this.read, istiltgesturesenabled.read) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) istiltgesturesenabled.IconCompatParcelizer);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.read);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str = this.IconCompatParcelizer;
        return (i * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CardlessATMVerificationProduct(amount=");
        sb.append(this.read);
        sb.append(", label=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public isTiltGesturesEnabled(double d, String str) {
        onGetStartedClick.write((Object) str, "label");
        this.read = d;
        this.IconCompatParcelizer = str;
    }
}
