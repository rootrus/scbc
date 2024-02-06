package p040o;

import java.util.List;
import java.util.Set;

/* renamed from: o.zzwc */
public final class zzwc {
    public final List<write> MediaBrowserCompat$ItemReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwc)) {
            return false;
        }
        zzwc zzwc = (zzwc) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzwc.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzwc.write);
    }

    public final int hashCode() {
        List<write> list = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.write;
        if (str != null) {
            i = str.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DocumentUploads(documents=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", totalMaxQuantity=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public zzwc(List<write> list, String str) {
        onGetStartedClick.write((Object) list, "documents");
        onGetStartedClick.write((Object) str, "totalMaxQuantity");
        this.MediaBrowserCompat$ItemReceiver = list;
        this.write = str;
    }

    /* renamed from: o.zzwc$write */
    public static final class write {
        public final String IconCompatParcelizer;
        public final zzwf MediaBrowserCompat$CustomActionResultReceiver;
        public final boolean MediaBrowserCompat$ItemReceiver;
        public final int MediaBrowserCompat$MediaItem;
        public final Set<zzwd> MediaBrowserCompat$SearchResultReceiver;
        public final String MediaDescriptionCompat;
        public final List<zzwc$MediaBrowserCompat$CustomActionResultReceiver> MediaMetadataCompat;
        public final Integer RatingCompat;
        public final String read;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write write2 = (write) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) write2.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) write2.IconCompatParcelizer) && this.MediaBrowserCompat$ItemReceiver == write2.MediaBrowserCompat$ItemReceiver && this.MediaBrowserCompat$MediaItem == write2.MediaBrowserCompat$MediaItem && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) write2.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) write2.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) write2.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) write2.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) write2.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) write2.MediaMetadataCompat);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            boolean z = this.MediaBrowserCompat$ItemReceiver;
            if (z) {
                z = true;
            }
            int i2 = this.MediaBrowserCompat$MediaItem;
            Integer num = this.RatingCompat;
            int hashCode3 = num != null ? num.hashCode() : 0;
            String str3 = this.write;
            int hashCode4 = str3 != null ? str3.hashCode() : 0;
            zzwf zzwf = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode5 = zzwf != null ? zzwf.hashCode() : 0;
            String str4 = this.MediaDescriptionCompat;
            int hashCode6 = str4 != null ? str4.hashCode() : 0;
            Set<zzwd> set = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode7 = set != null ? set.hashCode() : 0;
            List<zzwc$MediaBrowserCompat$CustomActionResultReceiver> list = this.MediaMetadataCompat;
            if (list != null) {
                i = list.hashCode();
            }
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + (z ? 1 : 0)) * 31) + i2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Document(documentCode=");
            sb.append(this.read);
            sb.append(", documentDesc=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", mandatoryFlag=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", minQuantity=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", maxQuantity=");
            sb.append(this.RatingCompat);
            sb.append(", maxFileSize=");
            sb.append(this.write);
            sb.append(", cameraType=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", remark=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", uploadMethod=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", uploads=");
            sb.append(this.MediaMetadataCompat);
            sb.append(")");
            return sb.toString();
        }

        public write(String str, String str2, boolean z, int i, Integer num, String str3, zzwf zzwf, String str4, Set<? extends zzwd> set, List<zzwc$MediaBrowserCompat$CustomActionResultReceiver> list) {
            onGetStartedClick.write((Object) str, "documentCode");
            onGetStartedClick.write((Object) str2, "documentDesc");
            onGetStartedClick.write((Object) str3, "maxFileSize");
            onGetStartedClick.write((Object) zzwf, "cameraType");
            onGetStartedClick.write((Object) set, "uploadMethod");
            onGetStartedClick.write((Object) list, "uploads");
            this.read = str;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompat$ItemReceiver = z;
            this.MediaBrowserCompat$MediaItem = i;
            this.RatingCompat = num;
            this.write = str3;
            this.MediaBrowserCompat$CustomActionResultReceiver = zzwf;
            this.MediaDescriptionCompat = str4;
            this.MediaBrowserCompat$SearchResultReceiver = set;
            this.MediaMetadataCompat = list;
        }
    }
}
