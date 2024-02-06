package p040o;

import java.io.Serializable;

/* renamed from: o.NTBPinLoginActivity */
public final class NTBPinLoginActivity<A, B, C> implements Serializable {
    public final B IconCompatParcelizer;
    public final C read;
    public final A write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NTBPinLoginActivity)) {
            return false;
        }
        NTBPinLoginActivity nTBPinLoginActivity = (NTBPinLoginActivity) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) nTBPinLoginActivity.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) nTBPinLoginActivity.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) nTBPinLoginActivity.read);
    }

    public final int hashCode() {
        A a = this.write;
        int i = 0;
        int hashCode = a != null ? a.hashCode() : 0;
        B b = this.IconCompatParcelizer;
        int hashCode2 = b != null ? b.hashCode() : 0;
        C c = this.read;
        if (c != null) {
            i = c.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public NTBPinLoginActivity(A a, B b, C c) {
        this.write = a;
        this.IconCompatParcelizer = b;
        this.read = c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.write);
        sb.append(", ");
        sb.append(this.IconCompatParcelizer);
        sb.append(", ");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
