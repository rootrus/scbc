package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.zzwe */
public final class zzwe {
    public final OffsetDateTime MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean MediaBrowserCompat$ItemReceiver;
    public final read read;
    public final List<write> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwe)) {
            return false;
        }
        zzwe zzwe = (zzwe) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzwe.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzwe.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzwe.read) && this.MediaBrowserCompat$ItemReceiver == zzwe.MediaBrowserCompat$ItemReceiver;
    }

    public final int hashCode() {
        List<write> list = this.write;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        OffsetDateTime offsetDateTime = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        read read2 = this.read;
        if (read2 != null) {
            i = read2.hashCode();
        }
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        if (z) {
            z = true;
        }
        return (((((hashCode * 31) + hashCode2) * 31) + i) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HMLDocumentUploads(documents=");
        sb.append(this.write);
        sb.append(", applicationExpiryDate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", documentValidation=");
        sb.append(this.read);
        sb.append(", requireIssuer=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public zzwe(List<write> list, OffsetDateTime offsetDateTime, read read2, boolean z) {
        onGetStartedClick.write((Object) list, "documents");
        onGetStartedClick.write((Object) offsetDateTime, "applicationExpiryDate");
        onGetStartedClick.write((Object) read2, "documentValidation");
        this.write = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = offsetDateTime;
        this.read = read2;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    /* renamed from: o.zzwe$write */
    public static final class write {
        public final List<IconCompatParcelizer> MediaBrowserCompat$CustomActionResultReceiver;
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
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) write2.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) write2.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) write2.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            List<IconCompatParcelizer> list = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (list != null) {
                i = list.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HMLDocument(groupConditionCode=");
            sb.append(this.write);
            sb.append(", groupConditionDesc=");
            sb.append(this.read);
            sb.append(", types=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public write(String str, String str2, List<IconCompatParcelizer> list) {
            onGetStartedClick.write((Object) str, "groupConditionCode");
            onGetStartedClick.write((Object) str2, "groupConditionDesc");
            onGetStartedClick.write((Object) list, "types");
            this.write = str;
            this.read = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
        }
    }

    /* renamed from: o.zzwe$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        private final Integer MediaBrowserCompat$MediaItem;
        public final int MediaBrowserCompat$SearchResultReceiver;
        private final String MediaDescriptionCompat;
        public final int MediaMetadataCompat;
        public final Integer RatingCompat;
        public final String read;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return this.MediaBrowserCompat$SearchResultReceiver == iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) iconCompatParcelizer.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) iconCompatParcelizer.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) iconCompatParcelizer.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) iconCompatParcelizer.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) iconCompatParcelizer.MediaBrowserCompat$MediaItem) && this.MediaMetadataCompat == iconCompatParcelizer.MediaMetadataCompat;
        }

        public final int hashCode() {
            int i = this.MediaBrowserCompat$SearchResultReceiver;
            String str = this.write;
            int i2 = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.read;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaDescriptionCompat;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.IconCompatParcelizer;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            Integer num = this.RatingCompat;
            int hashCode7 = num != null ? num.hashCode() : 0;
            Integer num2 = this.MediaBrowserCompat$MediaItem;
            if (num2 != null) {
                i2 = num2.hashCode();
            }
            return (((((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i2) * 31) + this.MediaMetadataCompat;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HMLDocumentTypes(sortSequence=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", documentCode=");
            sb.append(this.write);
            sb.append(", documentDesc=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", documentDetail=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", documentStatus=");
            sb.append(this.read);
            sb.append(", resubmitReasonDesc=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", iconPath=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", minQuantity=");
            sb.append(this.RatingCompat);
            sb.append(", maxQuantity=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", uploadedQuantity=");
            sb.append(this.MediaMetadataCompat);
            sb.append(")");
            return sb.toString();
        }

        public IconCompatParcelizer(int i, String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, int i2) {
            onGetStartedClick.write((Object) str, "documentCode");
            onGetStartedClick.write((Object) str2, "documentDesc");
            onGetStartedClick.write((Object) str4, "documentStatus");
            onGetStartedClick.write((Object) str6, "iconPath");
            this.MediaBrowserCompat$SearchResultReceiver = i;
            this.write = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.MediaBrowserCompat$ItemReceiver = str3;
            this.read = str4;
            this.MediaDescriptionCompat = str5;
            this.IconCompatParcelizer = str6;
            this.RatingCompat = num;
            this.MediaBrowserCompat$MediaItem = num2;
            this.MediaMetadataCompat = i2;
        }
    }

    /* renamed from: o.zzwe$read */
    public static final class read implements Parcelable {
        public static final C10778read CREATOR = new C10778read((byte) 0);
        private final int read;
        public final int write;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read read2 = (read) obj;
            return this.read == read2.read && this.write == read2.write;
        }

        public final int hashCode() {
            return (this.read * 31) + this.write;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HMLDocumentValidation(maxSize=");
            sb.append(this.read);
            sb.append(", maxAmount=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public read(int i, int i2) {
            this.read = i;
            this.write = i2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public read(Parcel parcel) {
            this(parcel.readInt(), parcel.readInt());
            onGetStartedClick.write((Object) parcel, "parcel");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeInt(this.read);
            parcel.writeInt(this.write);
        }

        /* renamed from: o.zzwe$read$read  reason: collision with other inner class name */
        public static final class C10778read implements Parcelable.Creator<read> {
            private C10778read() {
            }

            public /* synthetic */ C10778read(byte b) {
                this();
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "parcel");
                return new read(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new read[i];
            }
        }
    }
}
