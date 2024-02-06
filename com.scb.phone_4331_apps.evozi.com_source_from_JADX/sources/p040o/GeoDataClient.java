package p040o;

import java.util.List;

/* renamed from: o.GeoDataClient */
public final class GeoDataClient {
    public final List<read> IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof GeoDataClient) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((GeoDataClient) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        List<read> list = this.IconCompatParcelizer;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SourceOfFunds(sourceOfFund=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.GeoDataClient$BoundsMode */
    public final class BoundsMode {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BoundsMode)) {
                return false;
            }
            BoundsMode boundsMode = (BoundsMode) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) boundsMode.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) boundsMode.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) boundsMode.IconCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.IconCompatParcelizer;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ScbsSuitabilityInfo(name=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", score=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", investor=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public BoundsMode(String str, String str2, String str3) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) str2, "score");
            onGetStartedClick.write((Object) str3, "investor");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.IconCompatParcelizer = str3;
        }
    }

    public GeoDataClient(List<read> list) {
        onGetStartedClick.write((Object) list, "sourceOfFund");
        this.IconCompatParcelizer = list;
    }

    /* renamed from: o.GeoDataClient$read */
    public static final class read {
        public final String read;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read read2 = (read) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) read2.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) read2.read);
        }

        public final int hashCode() {
            String str = this.write;
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
            sb.append("CodeDescription(code=");
            sb.append(this.write);
            sb.append(", description=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public read(String str, String str2) {
            onGetStartedClick.write((Object) str, "code");
            onGetStartedClick.write((Object) str2, "description");
            this.write = str;
            this.read = str2;
        }
    }
}
