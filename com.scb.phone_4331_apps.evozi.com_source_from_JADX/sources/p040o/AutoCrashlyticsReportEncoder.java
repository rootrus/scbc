package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.AutoCrashlyticsReportEncoder */
public final class AutoCrashlyticsReportEncoder implements Parcelable {
    public static final Parcelable.Creator<AutoCrashlyticsReportEncoder> CREATOR = new AutoCrashlyticsReportEncoder$MediaBrowserCompat$ItemReceiver();
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public boolean MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    private final String MediaSessionCompat$Token;
    public final String RatingCompat;
    public final String read;
    public final String write;

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportCustomAttributeEncoder */
    public final class CrashlyticsReportCustomAttributeEncoder {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCrashlyticsReportEncoder)) {
            return false;
        }
        AutoCrashlyticsReportEncoder autoCrashlyticsReportEncoder = (AutoCrashlyticsReportEncoder) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) autoCrashlyticsReportEncoder.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) autoCrashlyticsReportEncoder.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) autoCrashlyticsReportEncoder.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) autoCrashlyticsReportEncoder.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) autoCrashlyticsReportEncoder.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) autoCrashlyticsReportEncoder.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) autoCrashlyticsReportEncoder.IconCompatParcelizer) && this.MediaDescriptionCompat == autoCrashlyticsReportEncoder.MediaDescriptionCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) autoCrashlyticsReportEncoder.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) autoCrashlyticsReportEncoder.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) autoCrashlyticsReportEncoder.MediaBrowserCompat$SearchResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaSessionCompat$Token;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaMetadataCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.RatingCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.IconCompatParcelizer;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        boolean z = this.MediaDescriptionCompat;
        if (z) {
            z = true;
        }
        String str8 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$MediaItem;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (z ? 1 : 0)) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantWalletTransactionItemDisplay(id=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", channel=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", timestamp=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", amount=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append(this.RatingCompat);
        sb.append(", buyerBank=");
        sb.append(this.read);
        sb.append(", buyerName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", expanded=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", debitCreditFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", transactionType=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", expandFlag=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder */
    public final class C3049x55689506 {
        public final String IconCompatParcelizer;
        public final CrashlyticsReportSessionDeviceEncoder MediaBrowserCompat$CustomActionResultReceiver;
        public final List<getBuildVersion> MediaBrowserCompat$ItemReceiver;
        public final String read;
        public final String write;

        public C3049x55689506(String str, String str2, String str3, List<getBuildVersion> list, String str4, CrashlyticsReportSessionDeviceEncoder crashlyticsReportSessionDeviceEncoder, String str5) {
            onGetStartedClick.write((Object) str, "function");
            onGetStartedClick.write((Object) str4, "accountRemark");
            onGetStartedClick.write((Object) str5, "merchantMinAge");
            this.IconCompatParcelizer = str;
            this.read = str2;
            this.write = str3;
            this.MediaBrowserCompat$ItemReceiver = list;
            this.MediaBrowserCompat$CustomActionResultReceiver = crashlyticsReportSessionDeviceEncoder;
        }
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventLogEncoder */
    public final class CrashlyticsReportSessionEventLogEncoder {
        public final List<CrashlyticsReportFilesPayloadFileEncoder> MediaBrowserCompat$CustomActionResultReceiver;
        public final List<CrashlyticsReportEncoder> read;
        public final List<CrashlyticsReportSessionUserEncoder> write;

        public CrashlyticsReportSessionEventLogEncoder(List<CrashlyticsReportFilesPayloadFileEncoder> list, List<CrashlyticsReportSessionUserEncoder> list2, List<CrashlyticsReportEncoder> list3) {
            onGetStartedClick.write((Object) list, "categories");
            onGetStartedClick.write((Object) list2, "shopTypeList");
            onGetStartedClick.write((Object) list3, "avgRevenueList");
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
            this.write = list2;
            this.read = list3;
        }
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionOperatingSystemEncoder */
    public final class CrashlyticsReportSessionOperatingSystemEncoder {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaMetadataCompat;
        public final String read;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CrashlyticsReportSessionOperatingSystemEncoder)) {
                return false;
            }
            CrashlyticsReportSessionOperatingSystemEncoder crashlyticsReportSessionOperatingSystemEncoder = (CrashlyticsReportSessionOperatingSystemEncoder) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) crashlyticsReportSessionOperatingSystemEncoder.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) crashlyticsReportSessionOperatingSystemEncoder.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) crashlyticsReportSessionOperatingSystemEncoder.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) crashlyticsReportSessionOperatingSystemEncoder.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) crashlyticsReportSessionOperatingSystemEncoder.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) crashlyticsReportSessionOperatingSystemEncoder.read);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaMetadataCompat;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.write;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.IconCompatParcelizer;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.read;
            if (str6 != null) {
                i = str6.hashCode();
            }
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MwSubmitDataDisplay(lineId=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", thaiShopName=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", englishShopName=");
            sb.append(this.write);
            sb.append(", shopPhoneNumber=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", shopEmail=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", referralCode=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public CrashlyticsReportSessionOperatingSystemEncoder(String str, String str2, String str3, String str4, String str5, String str6) {
            onGetStartedClick.write((Object) str, "lineId");
            onGetStartedClick.write((Object) str2, "thaiShopName");
            onGetStartedClick.write((Object) str3, "englishShopName");
            onGetStartedClick.write((Object) str4, "shopPhoneNumber");
            onGetStartedClick.write((Object) str5, "shopEmail");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.MediaMetadataCompat = str2;
            this.write = str3;
            this.MediaBrowserCompat$ItemReceiver = str4;
            this.IconCompatParcelizer = str5;
            this.read = str6;
        }
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder */
    public final class C3048x99c932db {
        public final awaitEvenIfOnMainThread MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C3048x99c932db) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((C3048x99c932db) obj).MediaBrowserCompat$CustomActionResultReceiver);
            }
            return true;
        }

        public final int hashCode() {
            awaitEvenIfOnMainThread awaitevenifonmainthread = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (awaitevenifonmainthread != null) {
                return awaitevenifonmainthread.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MerchantCreateQRDisplay(accountInfo=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public C3048x99c932db(awaitEvenIfOnMainThread awaitevenifonmainthread) {
            onGetStartedClick.write((Object) awaitevenifonmainthread, "accountInfo");
            this.MediaBrowserCompat$CustomActionResultReceiver = awaitevenifonmainthread;
        }
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionEncoder */
    public final class CrashlyticsReportSessionEventApplicationExecutionEncoder implements Parcelable {
        public static final write CREATOR = new write((byte) 0);
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        private final String MediaDescriptionCompat;
        public final String MediaMetadataCompat;
        public final String read;
        public final String write;

        public final int describeContents() {
            return 0;
        }

        public CrashlyticsReportSessionEventApplicationExecutionEncoder(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.IconCompatParcelizer = str;
            this.MediaDescriptionCompat = str2;
            this.MediaBrowserCompat$ItemReceiver = str3;
            this.write = str4;
            this.MediaBrowserCompat$CustomActionResultReceiver = str5;
            this.read = str6;
            this.MediaMetadataCompat = str7;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public CrashlyticsReportSessionEventApplicationExecutionEncoder(Parcel parcel) {
            this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            onGetStartedClick.write((Object) parcel, "parcel");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.MediaDescriptionCompat);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.write);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.read);
            parcel.writeString(this.MediaMetadataCompat);
        }

        /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionEncoder$write */
        public static final class write implements Parcelable.Creator<CrashlyticsReportSessionEventApplicationExecutionEncoder> {
            private write() {
            }

            public /* synthetic */ write(byte b) {
                this();
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "parcel");
                return new CrashlyticsReportSessionEventApplicationExecutionEncoder(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new CrashlyticsReportSessionEventApplicationExecutionEncoder[i];
            }
        }
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionApplicationOrganizationEncoder */
    public final class CrashlyticsReportSessionApplicationOrganizationEncoder {
        public final List<CrashlyticsReportFilesPayloadEncoder> IconCompatParcelizer;

        public CrashlyticsReportSessionApplicationOrganizationEncoder(List<CrashlyticsReportFilesPayloadEncoder> list) {
            onGetStartedClick.write((Object) list, "categories");
            this.IconCompatParcelizer = list;
        }
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionDeviceEncoder */
    public final class CrashlyticsReportSessionDeviceEncoder implements Parcelable {
        public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
        public final String IconCompatParcelizer;
        public final Boolean MediaBrowserCompat$CustomActionResultReceiver;
        public final CrashlyticsReportSessionEncoder MediaBrowserCompat$ItemReceiver;
        public final String read;

        /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionDeviceEncoder$IconCompatParcelizer */
        public static final class IconCompatParcelizer implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "in");
                String readString = parcel.readString();
                Boolean bool = null;
                CrashlyticsReportSessionEncoder crashlyticsReportSessionEncoder = parcel.readInt() != 0 ? (CrashlyticsReportSessionEncoder) CrashlyticsReportSessionEncoder.CREATOR.createFromParcel(parcel) : null;
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new CrashlyticsReportSessionDeviceEncoder(readString, crashlyticsReportSessionEncoder, readString2, bool);
            }

            public final Object[] newArray(int i) {
                return new CrashlyticsReportSessionDeviceEncoder[i];
            }
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.read);
            CrashlyticsReportSessionEncoder crashlyticsReportSessionEncoder = this.MediaBrowserCompat$ItemReceiver;
            if (crashlyticsReportSessionEncoder != null) {
                parcel.writeInt(1);
                crashlyticsReportSessionEncoder.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.IconCompatParcelizer);
            Boolean bool = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (bool != null) {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
                return;
            }
            parcel.writeInt(0);
        }

        public CrashlyticsReportSessionDeviceEncoder(String str, CrashlyticsReportSessionEncoder crashlyticsReportSessionEncoder, String str2, Boolean bool) {
            onGetStartedClick.write((Object) str, "gmbImageURL");
            onGetStartedClick.write((Object) str2, "gmbDeeplinkURL");
            this.read = str;
            this.MediaBrowserCompat$ItemReceiver = crashlyticsReportSessionEncoder;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = bool;
        }
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionThreadEncoder */
    public final class CrashlyticsReportSessionEventApplicationExecutionThreadEncoder implements Parcelable {
        public static final Parcelable.Creator<CrashlyticsReportSessionEventApplicationExecutionThreadEncoder> CREATOR = new read();
        public String IconCompatParcelizer;
        public String read;
        public String write;

        public CrashlyticsReportSessionEventApplicationExecutionThreadEncoder() {
            this((byte) 0);
        }

        public final int describeContents() {
            return 0;
        }

        private CrashlyticsReportSessionEventApplicationExecutionThreadEncoder(String str, String str2, String str3) {
            this.write = str;
            this.read = str2;
            this.IconCompatParcelizer = str3;
        }

        public /* synthetic */ CrashlyticsReportSessionEventApplicationExecutionThreadEncoder(byte b) {
            this("", (String) null, "");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public CrashlyticsReportSessionEventApplicationExecutionThreadEncoder(Parcel parcel) {
            this(parcel.readString(), parcel.readString(), parcel.readString());
            onGetStartedClick.write((Object) parcel, "source");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "dest");
            parcel.writeString(this.write);
            parcel.writeString(this.read);
            parcel.writeString(this.IconCompatParcelizer);
        }

        /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionThreadEncoder$IconCompatParcelizer */
        public static final class IconCompatParcelizer implements newCheckExtractor {
            private final /* synthetic */ List IconCompatParcelizer;
            private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;
            private final /* synthetic */ getRemoteContext MediaBrowserCompat$ItemReceiver;
            private final /* synthetic */ int MediaBrowserCompat$SearchResultReceiver;
            private final /* synthetic */ String read;
            private final /* synthetic */ KeyframeParser write;

            private IconCompatParcelizer() {
            }

            public /* synthetic */ IconCompatParcelizer(getRemoteContext getremotecontext, List list, KeyframeParser keyframeParser, List list2, String str, int i) {
                this.MediaBrowserCompat$ItemReceiver = getremotecontext;
                this.MediaBrowserCompat$CustomActionResultReceiver = list;
                this.write = keyframeParser;
                this.IconCompatParcelizer = list2;
                this.read = str;
                this.MediaBrowserCompat$SearchResultReceiver = i;
            }

            public final void IconCompatParcelizer(int i) {
                getRemoteContext getremotecontext = this.MediaBrowserCompat$ItemReceiver;
                List list = this.MediaBrowserCompat$CustomActionResultReceiver;
                KeyframeParser keyframeParser = this.write;
                List list2 = this.IconCompatParcelizer;
                String str = this.read;
                int i2 = this.MediaBrowserCompat$SearchResultReceiver;
                if (i < list.size() && i < keyframeParser.RatingCompat) {
                    list2.add(getremotecontext.MediaBrowserCompat$ItemReceiver((getOpacityAtPosition) list.get(i), str, i2 + i));
                }
                if (i == list.size() && i != 0 && i < keyframeParser.RatingCompat) {
                    list2.add(PlaceLikelihoodBuffer.read().MediaBrowserCompat$ItemReceiver(0).write(setLocale.LEARN_MORE).IconCompatParcelizer(i2 + i).mo26268x50fd9e4a(3 - (list.size() % 3)));
                }
            }
        }

        /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionThreadEncoder$read */
        public static final class read implements Parcelable.Creator<CrashlyticsReportSessionEventApplicationExecutionThreadEncoder> {
            read() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "source");
                return new CrashlyticsReportSessionEventApplicationExecutionThreadEncoder(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new CrashlyticsReportSessionEventApplicationExecutionThreadEncoder[i];
            }
        }
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder */
    public final class C3050xc3999712 implements Parcelable {
        public static final Parcelable.Creator<C3050xc3999712> CREATOR = new IconCompatParcelizer();
        public final String MediaBrowserCompat$ItemReceiver;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C3050xc3999712) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ((C3050xc3999712) obj).MediaBrowserCompat$ItemReceiver);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MerchantOtpDisplay(updatedTimestamp=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public C3050xc3999712(String str) {
            onGetStartedClick.write((Object) str, "updatedTimestamp");
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C3050xc3999712(android.os.Parcel r2) {
            /*
                r1 = this;
                java.lang.String r0 = "source"
                p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r0)
                java.lang.String r0 = "$this$readStringNonNull"
                p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r0)
                java.lang.String r2 = r2.readString()
                if (r2 != 0) goto L_0x0012
                java.lang.String r2 = ""
            L_0x0012:
                r1.<init>((java.lang.String) r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.AutoCrashlyticsReportEncoder.C3050xc3999712.<init>(android.os.Parcel):void");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "dest");
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        }

        /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder$IconCompatParcelizer */
        public static final class IconCompatParcelizer implements Parcelable.Creator<C3050xc3999712> {
            IconCompatParcelizer() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "source");
                return new C3050xc3999712(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C3050xc3999712[i];
            }
        }
    }

    public AutoCrashlyticsReportEncoder(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10) {
        this.MediaSessionCompat$Token = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.MediaMetadataCompat = str3;
        this.write = str4;
        this.RatingCompat = str5;
        this.read = str6;
        this.IconCompatParcelizer = str7;
        this.MediaDescriptionCompat = z;
        this.MediaBrowserCompat$ItemReceiver = str8;
        this.MediaBrowserCompat$MediaItem = str9;
        this.MediaBrowserCompat$SearchResultReceiver = str10;
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportFilesPayloadFileEncoder */
    public final class CrashlyticsReportFilesPayloadFileEncoder {
        public final List<getNdkPayload> MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String write;

        public CrashlyticsReportFilesPayloadFileEncoder(String str, String str2, String str3, List<getNdkPayload> list) {
            onGetStartedClick.write((Object) str, Name.MARK);
            onGetStartedClick.write((Object) str2, "code");
            onGetStartedClick.write((Object) str3, "description");
            onGetStartedClick.write((Object) list, "subCategory");
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.write = str3;
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
        }
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationEncoder */
    public final class CrashlyticsReportSessionEventApplicationEncoder {
        public final int IconCompatParcelizer;
        public final String read;

        public CrashlyticsReportSessionEventApplicationEncoder(String str, int i) {
            this.read = str;
            this.IconCompatParcelizer = i;
        }
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportFilesPayloadEncoder */
    public final class CrashlyticsReportFilesPayloadEncoder implements Parcelable {
        public static final Parcelable.Creator<CrashlyticsReportFilesPayloadEncoder> CREATOR = new C3051x43ac288b();
        public final String IconCompatParcelizer;
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        private final String MediaBrowserCompat$MediaItem;
        private final String MediaBrowserCompat$SearchResultReceiver;
        private final String MediaDescriptionCompat;
        private final String MediaMetadataCompat;
        private final int ParcelableVolumeInfo;
        private final String RatingCompat;
        public final String read;
        public final String write;

        public final int describeContents() {
            return 0;
        }

        public CrashlyticsReportFilesPayloadEncoder(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            onGetStartedClick.write((Object) str, "schemeId");
            onGetStartedClick.write((Object) str2, "code");
            onGetStartedClick.write((Object) str3, "descriptionTH");
            onGetStartedClick.write((Object) str4, "descriptionEN");
            onGetStartedClick.write((Object) str5, "description");
            onGetStartedClick.write((Object) str6, "remarksTH");
            onGetStartedClick.write((Object) str7, "remarksEN");
            onGetStartedClick.write((Object) str8, "remarks");
            onGetStartedClick.write((Object) str9, "classificationId");
            onGetStartedClick.write((Object) str10, "parentId");
            this.MediaBrowserCompat$SearchResultReceiver = str;
            this.read = str2;
            this.ParcelableVolumeInfo = i;
            this.MediaBrowserCompat$ItemReceiver = str3;
            this.write = str4;
            this.IconCompatParcelizer = str5;
            this.RatingCompat = str6;
            this.MediaMetadataCompat = str7;
            this.MediaDescriptionCompat = str8;
            this.MediaBrowserCompat$CustomActionResultReceiver = str9;
            this.MediaBrowserCompat$MediaItem = str10;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public CrashlyticsReportFilesPayloadEncoder(android.os.Parcel r17) {
            /*
                r16 = this;
                r0 = r17
                java.lang.String r1 = "source"
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r1 = "$this$readStringNonNull"
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r17.readString()
                java.lang.String r3 = ""
                if (r2 != 0) goto L_0x0016
                r5 = r3
                goto L_0x0017
            L_0x0016:
                r5 = r2
            L_0x0017:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r17.readString()
                if (r2 != 0) goto L_0x0022
                r6 = r3
                goto L_0x0023
            L_0x0022:
                r6 = r2
            L_0x0023:
                int r7 = r17.readInt()
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r17.readString()
                if (r2 != 0) goto L_0x0032
                r8 = r3
                goto L_0x0033
            L_0x0032:
                r8 = r2
            L_0x0033:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r17.readString()
                if (r2 != 0) goto L_0x003e
                r9 = r3
                goto L_0x003f
            L_0x003e:
                r9 = r2
            L_0x003f:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r17.readString()
                if (r2 != 0) goto L_0x004a
                r10 = r3
                goto L_0x004b
            L_0x004a:
                r10 = r2
            L_0x004b:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r17.readString()
                if (r2 != 0) goto L_0x0056
                r11 = r3
                goto L_0x0057
            L_0x0056:
                r11 = r2
            L_0x0057:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r17.readString()
                if (r2 != 0) goto L_0x0062
                r12 = r3
                goto L_0x0063
            L_0x0062:
                r12 = r2
            L_0x0063:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r17.readString()
                if (r2 != 0) goto L_0x006e
                r13 = r3
                goto L_0x006f
            L_0x006e:
                r13 = r2
            L_0x006f:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r17.readString()
                if (r2 != 0) goto L_0x007a
                r14 = r3
                goto L_0x007b
            L_0x007a:
                r14 = r2
            L_0x007b:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r0 = r17.readString()
                if (r0 != 0) goto L_0x0086
                r15 = r3
                goto L_0x0087
            L_0x0086:
                r15 = r0
            L_0x0087:
                r4 = r16
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder.<init>(android.os.Parcel):void");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "dest");
            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeString(this.read);
            parcel.writeInt(this.ParcelableVolumeInfo);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.write);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.RatingCompat);
            parcel.writeString(this.MediaMetadataCompat);
            parcel.writeString(this.MediaDescriptionCompat);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.MediaBrowserCompat$MediaItem);
        }

        /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportFilesPayloadEncoder$read */
        public static final class read implements findFragmentByWho {
            private final /* synthetic */ enableUsingApkIndependentContext IconCompatParcelizer;

            private read() {
            }

            public /* synthetic */ read(enableUsingApkIndependentContext enableusingapkindependentcontext) {
                this.IconCompatParcelizer = enableusingapkindependentcontext;
            }

            public final Object IconCompatParcelizer(Object obj) {
                return this.IconCompatParcelizer.write((jsonObjectToPoint) obj);
            }
        }
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEncoder */
    public final class CrashlyticsReportSessionEncoder implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C3052xe83049a9();
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String write;

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.write);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public CrashlyticsReportSessionEncoder(String str, String str2) {
            this.write = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        }
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionSignalEncoder */
    public final class CrashlyticsReportSessionEventApplicationExecutionSignalEncoder extends remainingCapacity implements Parcelable {
        public static final Parcelable.Creator<CrashlyticsReportSessionEventApplicationExecutionSignalEncoder> CREATOR = new C3053xca4dd54e();
        public final String IconCompatParcelizer;
        public final CrashlyticsReportSessionDeviceEncoder MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        private final String MediaBrowserCompat$MediaItem;
        public final CrashlyticsReportSessionEventApplicationExecutionEncoder read;

        public final int describeContents() {
            return 0;
        }

        public CrashlyticsReportSessionEventApplicationExecutionSignalEncoder(String str, String str2, String str3, CrashlyticsReportSessionEventApplicationExecutionEncoder crashlyticsReportSessionEventApplicationExecutionEncoder, CrashlyticsReportSessionDeviceEncoder crashlyticsReportSessionDeviceEncoder) {
            onGetStartedClick.write((Object) str, "merchantId");
            onGetStartedClick.write((Object) str2, "walletId");
            onGetStartedClick.write((Object) str3, "transactionDateTime");
            onGetStartedClick.write((Object) crashlyticsReportSessionEventApplicationExecutionEncoder, "mwReviewDisplay");
            this.MediaBrowserCompat$MediaItem = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.IconCompatParcelizer = str3;
            this.read = crashlyticsReportSessionEventApplicationExecutionEncoder;
            this.MediaBrowserCompat$CustomActionResultReceiver = crashlyticsReportSessionDeviceEncoder;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public CrashlyticsReportSessionEventApplicationExecutionSignalEncoder(android.os.Parcel r10) {
            /*
                r9 = this;
                java.lang.String r0 = "source"
                p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
                java.lang.String r0 = "$this$readStringNonNull"
                p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
                java.lang.String r1 = r10.readString()
                java.lang.String r2 = ""
                if (r1 != 0) goto L_0x0014
                r4 = r2
                goto L_0x0015
            L_0x0014:
                r4 = r1
            L_0x0015:
                p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
                java.lang.String r1 = r10.readString()
                if (r1 != 0) goto L_0x0020
                r5 = r2
                goto L_0x0021
            L_0x0020:
                r5 = r1
            L_0x0021:
                p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
                java.lang.String r0 = r10.readString()
                if (r0 != 0) goto L_0x002c
                r6 = r2
                goto L_0x002d
            L_0x002c:
                r6 = r0
            L_0x002d:
                java.lang.Class<o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionEncoder> r0 = p040o.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r10.readParcelable(r0)
                if (r0 != 0) goto L_0x003c
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
            L_0x003c:
                java.lang.String r1 = "source.readParcelable<Mw…class.java.classLoader)!!"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r1)
                r7 = r0
                o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionEncoder r7 = (p040o.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder) r7
                java.lang.Class<o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionDeviceEncoder> r0 = p040o.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r10 = r10.readParcelable(r0)
                r8 = r10
                o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionDeviceEncoder r8 = (p040o.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder) r8
                r3 = r9
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.<init>(android.os.Parcel):void");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "dest");
            parcel.writeString(this.MediaBrowserCompat$MediaItem);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeParcelable(this.read, 0);
            parcel.writeParcelable(this.MediaBrowserCompat$CustomActionResultReceiver, 0);
        }
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventDeviceEncoder */
    public final class CrashlyticsReportSessionEventDeviceEncoder {
        public final String IconCompatParcelizer;

        public CrashlyticsReportSessionEventDeviceEncoder(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            onGetStartedClick.write((Object) str, "firstName");
            onGetStartedClick.write((Object) str2, "lastName");
            onGetStartedClick.write((Object) str4, "phoneNumber");
            onGetStartedClick.write((Object) str5, "referenceId");
            onGetStartedClick.write((Object) str6, "referenceType");
            onGetStartedClick.write((Object) str7, "tNcType");
            this.IconCompatParcelizer = str3;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutoCrashlyticsReportEncoder(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), 1 == parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        onGetStartedClick.write((Object) parcel, "source");
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportEncoder */
    public final class CrashlyticsReportEncoder {
        public final String MediaBrowserCompat$ItemReceiver;
        public final String write;

        public CrashlyticsReportEncoder(String str, String str2, String str3) {
            onGetStartedClick.write((Object) str, "code");
            onGetStartedClick.write((Object) str2, "description");
            onGetStartedClick.write((Object) str3, Name.MARK);
            this.MediaBrowserCompat$ItemReceiver = str;
            this.write = str2;
        }
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionUserEncoder */
    public final class CrashlyticsReportSessionUserEncoder {
        public final String MediaBrowserCompat$ItemReceiver;
        public final String read;
        public final String write;

        public CrashlyticsReportSessionUserEncoder(String str, String str2, String str3, String str4) {
            onGetStartedClick.write((Object) str, "code");
            onGetStartedClick.write((Object) str2, "description");
            onGetStartedClick.write((Object) str3, Name.MARK);
            onGetStartedClick.write((Object) str4, "remarks");
            this.write = str;
            this.read = str2;
            this.MediaBrowserCompat$ItemReceiver = str4;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.write);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeInt(this.MediaDescriptionCompat ? 1 : 0);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionApplicationEncoder */
    public final class CrashlyticsReportSessionApplicationEncoder {
        public final String IconCompatParcelizer;

        public CrashlyticsReportSessionApplicationEncoder(String str, String str2, String str3, String str4) {
            onGetStartedClick.write((Object) str, "number");
            onGetStartedClick.write((Object) str2, "name");
            onGetStartedClick.write((Object) str3, "bankAccountType");
            onGetStartedClick.write((Object) str4, "bankAccountStatus");
            this.IconCompatParcelizer = str2;
        }
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$write */
    public static final class write implements findFragmentByWho {
        private write() {
        }

        public /* synthetic */ write(isSidewinderDevice issidewinderdevice) {
        }

        public final Object IconCompatParcelizer(Object obj) {
            LayerParser layerParser = (LayerParser) obj;
            PlaceEntity placeEntity = new PlaceEntity();
            placeEntity.read = layerParser.write;
            placeEntity.MediaDescriptionCompat = layerParser.MediaDescriptionCompat;
            placeEntity.RatingCompat = layerParser.MediaBrowserCompat$SearchResultReceiver;
            placeEntity.IconCompatParcelizer = layerParser.MediaBrowserCompat$CustomActionResultReceiver;
            placeEntity.MediaBrowserCompat$ItemReceiver = layerParser.read;
            placeEntity.MediaBrowserCompat$CustomActionResultReceiver = layerParser.MediaBrowserCompat$ItemReceiver;
            placeEntity.write = layerParser.IconCompatParcelizer;
            return placeEntity;
        }
    }

    /* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventEncoder */
    public final class CrashlyticsReportSessionEventEncoder {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String read;
        public final String write;

        public CrashlyticsReportSessionEventEncoder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) str2, "nameTH");
            onGetStartedClick.write((Object) str4, "locationId");
            onGetStartedClick.write((Object) str5, "locationName");
            onGetStartedClick.write((Object) str6, "shopType");
            onGetStartedClick.write((Object) str7, "phoneNumber");
            onGetStartedClick.write((Object) str9, "shopName");
            this.write = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.IconCompatParcelizer = str8;
            this.read = str9;
        }
    }
}
