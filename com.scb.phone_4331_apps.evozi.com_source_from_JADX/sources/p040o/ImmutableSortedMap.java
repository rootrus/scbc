package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.ImmutableSortedMap */
public final class ImmutableSortedMap {
    @SerializedName("productType")
    private final emptyMap MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountNo")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("optStatus")
    private final String write;

    /* renamed from: o.ImmutableSortedMap$EntrySet */
    public final class EntrySet {
        @SerializedName("tcAccept")
        private final EntrySetSerializedForm IconCompatParcelizer;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof EntrySet) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((EntrySet) obj).IconCompatParcelizer);
            }
            return true;
        }

        public final int hashCode() {
            EntrySetSerializedForm entrySetSerializedForm = this.IconCompatParcelizer;
            if (entrySetSerializedForm != null) {
                return entrySetSerializedForm.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AcceptTermsAndConditionsRequest(tcAccept=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.ImmutableSortedMap$EntrySetSerializedForm */
    public final class EntrySetSerializedForm {
        @SerializedName("version")
        private final int read;
        @SerializedName("type")
        private final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EntrySetSerializedForm)) {
                return false;
            }
            EntrySetSerializedForm entrySetSerializedForm = (EntrySetSerializedForm) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) entrySetSerializedForm.write) && this.read == entrySetSerializedForm.read;
        }

        public final int hashCode() {
            String str = this.write;
            return ((str != null ? str.hashCode() : 0) * 31) + this.read;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TcAccept(type=");
            sb.append(this.write);
            sb.append(", version=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImmutableSortedMap)) {
            return false;
        }
        ImmutableSortedMap immutableSortedMap = (ImmutableSortedMap) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) immutableSortedMap.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) immutableSortedMap.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) immutableSortedMap.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        emptyMap emptymap = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = emptymap != null ? emptymap.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account(accountNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", productType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", optStatus=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.ImmutableSortedMap$ValuesSerializedForm */
    public final class ValuesSerializedForm {
        @SerializedName("productType")
        private final String IconCompatParcelizer;
        @SerializedName("subModel")
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("keyResult")
        private final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("tilesVersion")
        private String MediaBrowserCompat$MediaItem;
        @SerializedName("yearOfManufacture")
        private final String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("brand")
        private final String read;
        @SerializedName("model")
        private final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValuesSerializedForm)) {
                return false;
            }
            ValuesSerializedForm valuesSerializedForm = (ValuesSerializedForm) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) valuesSerializedForm.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) valuesSerializedForm.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) valuesSerializedForm.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) valuesSerializedForm.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) valuesSerializedForm.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) valuesSerializedForm.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) valuesSerializedForm.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$MediaItem;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.read;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.write;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str7 != null) {
                i = str7.hashCode();
            }
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SequentialCarInquiryRequest(tilesVersion=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", productType=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", keyResult=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", brand=");
            sb.append(this.read);
            sb.append(", model=");
            sb.append(this.write);
            sb.append(", yearOfManufacture=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", subModel=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public ValuesSerializedForm(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            onGetStartedClick.write((Object) str2, "productType");
            onGetStartedClick.write((Object) str3, "keyResult");
            this.MediaBrowserCompat$MediaItem = str;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompat$ItemReceiver = str3;
            this.read = str4;
            this.write = str5;
            this.MediaBrowserCompat$SearchResultReceiver = str6;
            this.MediaBrowserCompat$CustomActionResultReceiver = str7;
        }
    }

    public ImmutableSortedMap(String str, emptyMap emptymap, String str2) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = emptymap;
        this.write = str2;
    }

    /* renamed from: o.ImmutableSortedMap$Builder */
    public class Builder {
        @SerializedName("proxyType")
        public String IconCompatParcelizer;
        @SerializedName("proxyId")
        private String MediaBrowserCompat$ItemReceiver;

        public Builder(String str, String str2) {
            this.MediaBrowserCompat$ItemReceiver = str;
            this.IconCompatParcelizer = str2;
        }

        public String toString() {
            return this.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.ImmutableSortedMap$Values */
    public class Values {
        @SerializedName("scheduleDetailId")
        private String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("scheduleMainId")
        private String write;

        public Values(String str, String str2) {
            this.write = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        }
    }

    /* renamed from: o.ImmutableSortedMap$SerializedForm */
    public class SerializedForm {
        @SerializedName("numberOfDays")
        public String IconCompatParcelizer;
        @SerializedName("proxyId")
        private String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("pageSize")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("proxyType")
        private String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("proxy")
        public List<Builder> read;
        @SerializedName("pageNumber")
        public String write;

        public static SerializedForm IconCompatParcelizer() {
            return new SerializedForm();
        }
    }
}
