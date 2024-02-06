package p040o;

import java.util.List;

/* renamed from: o.getPlaceId */
public final class getPlaceId {
    public final List<IconCompatParcelizer> IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof getPlaceId) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((getPlaceId) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        List<IconCompatParcelizer> list = this.IconCompatParcelizer;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentObjectives(objectives=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public getPlaceId(List<IconCompatParcelizer> list) {
        onGetStartedClick.write((Object) list, "objectives");
        this.IconCompatParcelizer = list;
    }

    /* renamed from: o.getPlaceId$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public final String MediaBrowserCompat$ItemReceiver;
        private final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) iconCompatParcelizer.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Objective(sortSequence=");
            sb.append(this.write);
            sb.append(", label=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public IconCompatParcelizer(String str, String str2) {
            onGetStartedClick.write((Object) str, "sortSequence");
            onGetStartedClick.write((Object) str2, "label");
            this.write = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
        }
    }
}
