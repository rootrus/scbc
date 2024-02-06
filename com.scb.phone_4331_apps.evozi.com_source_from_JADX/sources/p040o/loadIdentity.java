package p040o;

import p040o.C10885rotate;

/* renamed from: o.loadIdentity */
final class loadIdentity extends C10885rotate {
    private final Long4 MediaBrowserCompat$CustomActionResultReceiver;
    private final C10885rotate.read read;

    /* synthetic */ loadIdentity(C10885rotate.read read2, Long4 long4) {
        this.read = read2;
        this.MediaBrowserCompat$CustomActionResultReceiver = long4;
    }

    public final Long4 IconCompatParcelizer() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10885rotate)) {
            return false;
        }
        C10885rotate.read read2 = this.read;
        if (read2 != null ? read2.equals(((loadIdentity) obj).read) : ((loadIdentity) obj).read == null) {
            Long4 long4 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (long4 == null) {
                if (((loadIdentity) obj).MediaBrowserCompat$CustomActionResultReceiver == null) {
                    return true;
                }
            } else if (long4.equals(((loadIdentity) obj).MediaBrowserCompat$CustomActionResultReceiver)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        C10885rotate.read read2 = this.read;
        int i = 0;
        int hashCode = read2 == null ? 0 : read2.hashCode();
        Long4 long4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (long4 != null) {
            i = long4.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final C10885rotate.read read() {
        return this.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClientInfo{clientType=");
        sb.append(this.read);
        sb.append(", androidClientInfo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("}");
        return sb.toString();
    }
}
