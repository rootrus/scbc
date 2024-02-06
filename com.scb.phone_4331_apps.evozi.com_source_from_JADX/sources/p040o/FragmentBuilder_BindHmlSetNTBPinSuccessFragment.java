package p040o;

/* renamed from: o.FragmentBuilder_BindHmlSetNTBPinSuccessFragment */
public final class FragmentBuilder_BindHmlSetNTBPinSuccessFragment {
    public final double MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FragmentBuilder_BindHmlSetNTBPinSuccessFragment) && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, ((FragmentBuilder_BindHmlSetNTBPinSuccessFragment) obj).MediaBrowserCompat$CustomActionResultReceiver) == 0;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceLongitude(value=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindHmlSetNTBPinSuccessFragment(double d) {
        this.MediaBrowserCompat$CustomActionResultReceiver = d;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}
