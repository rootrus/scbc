package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.ComponentDiscovery */
public enum ComponentDiscovery {
    LEFT,
    RIGHT,
    NONE;

    /* renamed from: o.ComponentDiscovery$RegistrarNameRetriever */
    public final class RegistrarNameRetriever implements Parcelable {
        public static final C3189xda75665c CREATOR = null;
        public final String IconCompatParcelizer;
        public final double MediaBrowserCompat$CustomActionResultReceiver;
        public final double MediaBrowserCompat$ItemReceiver;
        public final double MediaBrowserCompat$MediaItem;
        public final double MediaBrowserCompat$SearchResultReceiver;
        public final int RatingCompat;
        public final double read;
        public final int write;

        static {
            CREATOR = new C3189xda75665c((byte) 0);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrarNameRetriever)) {
                return false;
            }
            RegistrarNameRetriever registrarNameRetriever = (RegistrarNameRetriever) obj;
            return this.write == registrarNameRetriever.write && this.RatingCompat == registrarNameRetriever.RatingCompat && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, registrarNameRetriever.MediaBrowserCompat$CustomActionResultReceiver) == 0 && Double.compare(this.read, registrarNameRetriever.read) == 0 && Double.compare(this.MediaBrowserCompat$ItemReceiver, registrarNameRetriever.MediaBrowserCompat$ItemReceiver) == 0 && Double.compare(this.MediaBrowserCompat$MediaItem, registrarNameRetriever.MediaBrowserCompat$MediaItem) == 0 && Double.compare(this.MediaBrowserCompat$SearchResultReceiver, registrarNameRetriever.MediaBrowserCompat$SearchResultReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) registrarNameRetriever.IconCompatParcelizer);
        }

        public final int hashCode() {
            int i = this.write;
            int i2 = this.RatingCompat;
            long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
            int i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
            long doubleToLongBits2 = Double.doubleToLongBits(this.read);
            int i4 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
            long doubleToLongBits3 = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
            int i5 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
            long doubleToLongBits4 = Double.doubleToLongBits(this.MediaBrowserCompat$MediaItem);
            int i6 = (int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32));
            long doubleToLongBits5 = Double.doubleToLongBits(this.MediaBrowserCompat$SearchResultReceiver);
            int i7 = (int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32));
            String str = this.IconCompatParcelizer;
            return (((((((((((((i * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("InstallmentPlansDisplay(ippType=");
            sb.append(this.write);
            sb.append(", tenure=");
            sb.append(this.RatingCompat);
            sb.append(", cardInterestRate=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", cardInterestAmount=");
            sb.append(this.read);
            sb.append(", monthlyInstallmentAmount=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", yearlyCardInterestRate=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", totalAmount=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", productCode=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public RegistrarNameRetriever(int i, int i2, double d, double d2, double d3, double d4, double d5, String str) {
            this.write = i;
            this.RatingCompat = i2;
            this.MediaBrowserCompat$CustomActionResultReceiver = d;
            this.read = d2;
            this.MediaBrowserCompat$ItemReceiver = d3;
            this.MediaBrowserCompat$MediaItem = d4;
            this.MediaBrowserCompat$SearchResultReceiver = d5;
            this.IconCompatParcelizer = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public RegistrarNameRetriever(Parcel parcel) {
            this(parcel.readInt(), parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString());
            onGetStartedClick.write((Object) parcel, "parcel");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeInt(this.write);
            parcel.writeInt(this.RatingCompat);
            parcel.writeDouble(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeDouble(this.read);
            parcel.writeDouble(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeDouble(this.MediaBrowserCompat$MediaItem);
            parcel.writeDouble(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeString(this.IconCompatParcelizer);
        }
    }

    /* renamed from: o.ComponentDiscovery$MetadataRegistrarNameRetriever */
    public final class MetadataRegistrarNameRetriever implements Parcelable {
        public static final C3188x65e9cd2b CREATOR = null;
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final Integer MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        public final List<RegistrarNameRetriever> MediaBrowserCompat$SearchResultReceiver;
        public final Integer RatingCompat;
        public final Double read;
        public final List<RegistrarNameRetriever> write;

        static {
            CREATOR = new C3188x65e9cd2b((byte) 0);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetadataRegistrarNameRetriever)) {
                return false;
            }
            MetadataRegistrarNameRetriever metadataRegistrarNameRetriever = (MetadataRegistrarNameRetriever) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) metadataRegistrarNameRetriever.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) metadataRegistrarNameRetriever.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) metadataRegistrarNameRetriever.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) metadataRegistrarNameRetriever.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) metadataRegistrarNameRetriever.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) metadataRegistrarNameRetriever.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) metadataRegistrarNameRetriever.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) metadataRegistrarNameRetriever.read);
        }

        public final int hashCode() {
            List<RegistrarNameRetriever> list = this.write;
            int i = 0;
            int hashCode = list != null ? list.hashCode() : 0;
            List<RegistrarNameRetriever> list2 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode2 = list2 != null ? list2.hashCode() : 0;
            Integer num = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = num != null ? num.hashCode() : 0;
            Integer num2 = this.RatingCompat;
            int hashCode4 = num2 != null ? num2.hashCode() : 0;
            String str = this.IconCompatParcelizer;
            int hashCode5 = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$MediaItem;
            int hashCode6 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode7 = str3 != null ? str3.hashCode() : 0;
            Double d = this.read;
            if (d != null) {
                i = d.hashCode();
            }
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CreditCardInstallmentDisplay(creditCardInstallmentPlans=");
            sb.append(this.write);
            sb.append(", speedyCashInstallmentPlans=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", creditCardDefaultTenor=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", speedyCashDefaultTenor=");
            sb.append(this.RatingCompat);
            sb.append(", merchantId=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", terminalId=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", orderReference=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", paymentAmount=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public MetadataRegistrarNameRetriever(List<RegistrarNameRetriever> list, List<RegistrarNameRetriever> list2, Integer num, Integer num2, String str, String str2, String str3, Double d) {
            onGetStartedClick.write((Object) list, "creditCardInstallmentPlans");
            onGetStartedClick.write((Object) list2, "speedyCashInstallmentPlans");
            this.write = list;
            this.MediaBrowserCompat$SearchResultReceiver = list2;
            this.MediaBrowserCompat$ItemReceiver = num;
            this.RatingCompat = num2;
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompat$MediaItem = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.read = d;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public MetadataRegistrarNameRetriever(android.os.Parcel r11) {
            /*
                r10 = this;
                java.lang.String r0 = "parcel"
                p040o.onGetStartedClick.write((java.lang.Object) r11, (java.lang.String) r0)
                o.ComponentDiscovery$RegistrarNameRetriever$MediaBrowserCompat$CustomActionResultReceiver r0 = p040o.ComponentDiscovery.RegistrarNameRetriever.CREATOR
                android.os.Parcelable$Creator r0 = (android.os.Parcelable.Creator) r0
                java.util.ArrayList r0 = r11.createTypedArrayList(r0)
                java.util.List r0 = (java.util.List) r0
                if (r0 != 0) goto L_0x0015
                o.HmlNationalIdActivity r0 = p040o.HmlNationalIdActivity.IconCompatParcelizer
                java.util.List r0 = (java.util.List) r0
            L_0x0015:
                r2 = r0
                o.ComponentDiscovery$RegistrarNameRetriever$MediaBrowserCompat$CustomActionResultReceiver r0 = p040o.ComponentDiscovery.RegistrarNameRetriever.CREATOR
                android.os.Parcelable$Creator r0 = (android.os.Parcelable.Creator) r0
                java.util.ArrayList r0 = r11.createTypedArrayList(r0)
                java.util.List r0 = (java.util.List) r0
                if (r0 != 0) goto L_0x0026
                o.HmlNationalIdActivity r0 = p040o.HmlNationalIdActivity.IconCompatParcelizer
                java.util.List r0 = (java.util.List) r0
            L_0x0026:
                r3 = r0
                java.lang.Class r0 = java.lang.Integer.TYPE
                java.lang.ClassLoader r0 = r0.getClassLoader()
                java.lang.Object r0 = r11.readValue(r0)
                boolean r1 = r0 instanceof java.lang.Integer
                r4 = 0
                if (r1 != 0) goto L_0x0037
                r0 = r4
            L_0x0037:
                java.lang.Integer r0 = (java.lang.Integer) r0
                java.lang.Class r1 = java.lang.Integer.TYPE
                java.lang.ClassLoader r1 = r1.getClassLoader()
                java.lang.Object r1 = r11.readValue(r1)
                boolean r5 = r1 instanceof java.lang.Integer
                if (r5 != 0) goto L_0x0048
                r1 = r4
            L_0x0048:
                r5 = r1
                java.lang.Integer r5 = (java.lang.Integer) r5
                java.lang.String r6 = r11.readString()
                java.lang.String r7 = r11.readString()
                java.lang.String r8 = r11.readString()
                java.lang.Class r1 = java.lang.Double.TYPE
                java.lang.ClassLoader r1 = r1.getClassLoader()
                java.lang.Object r11 = r11.readValue(r1)
                boolean r1 = r11 instanceof java.lang.Double
                if (r1 != 0) goto L_0x0066
                goto L_0x0067
            L_0x0066:
                r4 = r11
            L_0x0067:
                r9 = r4
                java.lang.Double r9 = (java.lang.Double) r9
                r1 = r10
                r4 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.ComponentDiscovery.MetadataRegistrarNameRetriever.<init>(android.os.Parcel):void");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeTypedList(this.write);
            parcel.writeTypedList(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeValue(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeValue(this.RatingCompat);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.MediaBrowserCompat$MediaItem);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeValue(this.read);
        }
    }

    /* renamed from: o.ComponentDiscovery$1 */
    public final class C31871 implements Parcelable {
        public static final read CREATOR = null;
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String read;

        static {
            CREATOR = new read((byte) 0);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31871)) {
                return false;
            }
            C31871 r3 = (C31871) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.read;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CcSofReviewSenderDisplay(creditCardImageURL=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", cardHolderName=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", cardRefNo=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", creditCardMask=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public C31871(String str, String str2, String str3, String str4) {
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.read = str4;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C31871(Parcel parcel) {
            this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            onGetStartedClick.write((Object) parcel, "parcel");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.read);
        }

        /* renamed from: o.ComponentDiscovery$1$read */
        public static final class read implements Parcelable.Creator<C31871> {
            private read() {
            }

            public /* synthetic */ read(byte b) {
                this();
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "parcel");
                return new C31871(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C31871[i];
            }
        }
    }
}
