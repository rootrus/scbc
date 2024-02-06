package p040o;

import java.util.List;

/* renamed from: o.Geofence */
public final class Geofence {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final List<ActivityTransitionRequest> read;
    public final boolean write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Geofence)) {
            return false;
        }
        Geofence geofence = (Geofence) obj;
        return this.write == geofence.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) geofence.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) geofence.read);
    }

    public final int hashCode() {
        boolean z = this.write;
        if (z) {
            z = true;
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<ActivityTransitionRequest> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return ((((z ? 1 : 0) * true) + hashCode) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlPromotion(promoFlag=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", interestRate=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public Geofence(boolean z, String str, List<ActivityTransitionRequest> list) {
        this.write = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = list;
    }

    /* renamed from: o.Geofence$Builder */
    public final class Builder {
        public final String read;
        public final List<ActivityTransitionRequest> write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) builder.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) builder.write);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            List<ActivityTransitionRequest> list = this.write;
            if (list != null) {
                i = list.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlPromotionOption(principal=");
            sb.append(this.read);
            sb.append(", interestRate=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public Builder(String str, List<ActivityTransitionRequest> list) {
            onGetStartedClick.write((Object) str, "principal");
            onGetStartedClick.write((Object) list, "interestRate");
            this.read = str;
            this.write = list;
        }
    }
}
