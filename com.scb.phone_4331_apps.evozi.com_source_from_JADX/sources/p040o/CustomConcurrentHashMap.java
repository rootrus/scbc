package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p040o.zzcb;
import p040o.zzfe;

/* renamed from: o.CustomConcurrentHashMap */
public enum CustomConcurrentHashMap {
    POINT,
    POINTWITHMONEY;

    /* renamed from: o.CustomConcurrentHashMap$KeyIterator */
    public class KeyIterator {
        @SerializedName("repaymentAccountNo")
        private String IconCompatParcelizer;
        @SerializedName("productType")
        private String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("productSubCode")
        private String MediaBrowserCompat$ItemReceiver;
        @SerializedName("repaymentPlan")
        private String MediaDescriptionCompat;
        @SerializedName("sourceCode")
        private String MediaMetadataCompat;
        @SerializedName("repaymentMethod")
        private String RatingCompat;
        @SerializedName("amount")
        private String read;
        @SerializedName("productCode")
        private String write;
    }

    /* renamed from: o.CustomConcurrentHashMap$StrongExpirableEvictableEntry */
    public enum StrongExpirableEvictableEntry {
        DEFAULT,
        HML
    }

    /* renamed from: o.CustomConcurrentHashMap$ValueReference */
    public class ValueReference {
        @SerializedName("type")
        public String IconCompatParcelizer;
        @SerializedName("id")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("countryCode")
        public String write;
    }

    /* renamed from: o.CustomConcurrentHashMap$WeakEvictableEntry */
    public class WeakEvictableEntry {
        @SerializedName("middleName")
        public String IconCompatParcelizer;
        @SerializedName("cardInfo")
        public ValueReference MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("firstName")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("lastName")
        public String read;
        @SerializedName("title")
        public String write;
    }

    /* renamed from: o.CustomConcurrentHashMap$WeakExpirableEntry */
    public class WeakExpirableEntry {
        @SerializedName("spouseInfo")
        public WeakEvictableEntry MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("disclosureFlag")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("maritalStatusCode")
        public String write;
    }

    /* renamed from: o.CustomConcurrentHashMap$WriteThroughEntry */
    public class WriteThroughEntry {
        @SerializedName("fundSource")
        public isGpsUsable IconCompatParcelizer;
        @SerializedName("withHoldingTax")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("accountNo")
        public String read;
        @SerializedName("experience")
        public String write;
    }

    /* renamed from: o.CustomConcurrentHashMap$EntryFactory */
    public class EntryFactory {
        @SerializedName("tokenType")
        public String IconCompatParcelizer;
        @SerializedName("deviceId")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("deviceToken")
        public String write;

        /* renamed from: o.CustomConcurrentHashMap$EntryFactory$1 */
        public final class C32861 {
            @SerializedName("provinceEN")
            public String IconCompatParcelizer;
            @SerializedName("provinceTH")
            public String MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("number")
            public String MediaBrowserCompat$ItemReceiver;

            public C32861() {
                this((byte) 0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C32861)) {
                    return false;
                }
                C32861 r3 = (C32861) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer);
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
                sb.append("CarRegistration(number=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", provinceTH=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", provinceEN=");
                sb.append(this.IconCompatParcelizer);
                sb.append(")");
                return sb.toString();
            }

            public C32861(String str, String str2, String str3) {
                onGetStartedClick.write((Object) str, "number");
                onGetStartedClick.write((Object) str2, "provinceTH");
                onGetStartedClick.write((Object) str3, "provinceEN");
                this.MediaBrowserCompat$ItemReceiver = str;
                this.MediaBrowserCompat$CustomActionResultReceiver = str2;
                this.IconCompatParcelizer = str3;
            }

            public /* synthetic */ C32861(byte b) {
                this("", "", "");
            }
        }

        /* renamed from: o.CustomConcurrentHashMap$EntryFactory$9 */
        public final class C32959 {
            @SerializedName("applicationId")
            private final String MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("productType")
            public final String MediaBrowserCompat$ItemReceiver;
            @SerializedName("tilesVersion")
            public String read;
            @SerializedName("consentFlags")
            private final C32902 write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C32959)) {
                    return false;
                }
                C32959 r3 = (C32959) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read);
            }

            public final int hashCode() {
                String str = this.MediaBrowserCompat$ItemReceiver;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                C32902 r3 = this.write;
                int hashCode3 = r3 != null ? r3.hashCode() : 0;
                String str3 = this.read;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("EasycashCommonConfirmRequest(productType=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", applicationId=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", consentFlags=");
                sb.append(this.write);
                sb.append(", tilesVersion=");
                sb.append(this.read);
                sb.append(")");
                return sb.toString();
            }

            private C32959(String str, String str2, C32902 r4, String str3) {
                onGetStartedClick.write((Object) str, "productType");
                onGetStartedClick.write((Object) str2, "applicationId");
                onGetStartedClick.write((Object) str3, "tilesVersion");
                this.MediaBrowserCompat$ItemReceiver = str;
                this.MediaBrowserCompat$CustomActionResultReceiver = str2;
                this.write = r4;
                this.read = str3;
            }

            public /* synthetic */ C32959(String str, String str2, C32902 r4) {
                this(str, str2, r4, "");
            }
        }

        /* renamed from: o.CustomConcurrentHashMap$EntryFactory$2 */
        public class C32902 {
            @SerializedName("model")
            private String IconCompatParcelizer;
            @SerializedName("crossSell")
            private String MediaBrowserCompat$ItemReceiver;
            @SerializedName("tnc")
            private String read;
            @SerializedName("ncb")
            private String write;

            /* renamed from: o.CustomConcurrentHashMap$EntryFactory$2$write */
            public static final class write {
                public String IconCompatParcelizer;
            }

            public /* synthetic */ C32902(write write2, byte b) {
                this(write2);
            }

            private C32902(write write2) {
                this.read = null;
                this.write = write2.IconCompatParcelizer;
                this.IconCompatParcelizer = null;
                this.MediaBrowserCompat$ItemReceiver = null;
            }
        }

        /* renamed from: o.CustomConcurrentHashMap$EntryFactory$6 */
        public class C32966 {
            @SerializedName("accountNo")
            private String IconCompatParcelizer;
            @SerializedName("applicationId")
            private String read;
            @SerializedName("productType")
            private String write;

            public /* synthetic */ C32966(IconCompatParcelizer iconCompatParcelizer, byte b) {
                this(iconCompatParcelizer);
            }

            private C32966(IconCompatParcelizer iconCompatParcelizer) {
                this.write = iconCompatParcelizer.IconCompatParcelizer;
                this.read = iconCompatParcelizer.read;
                this.IconCompatParcelizer = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            }

            public static IconCompatParcelizer MediaBrowserCompat$ItemReceiver() {
                return new IconCompatParcelizer((byte) 0);
            }

            /* renamed from: o.CustomConcurrentHashMap$EntryFactory$6$IconCompatParcelizer */
            public static final class IconCompatParcelizer {
                public String IconCompatParcelizer;
                public String MediaBrowserCompat$CustomActionResultReceiver;
                public String read;

                /* synthetic */ IconCompatParcelizer(byte b) {
                    this();
                }

                private IconCompatParcelizer() {
                }
            }
        }

        /* renamed from: o.CustomConcurrentHashMap$EntryFactory$7 */
        public final class C32977 {
            @SerializedName("debtBurden")
            private final String IconCompatParcelizer;
            @SerializedName("lastUpdatedDateTime")
            private final String MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("monthlyIncome")
            private final String MediaBrowserCompat$ItemReceiver;
            @SerializedName("status")
            private final String MediaBrowserCompat$MediaItem;
            @SerializedName("requiredGeneratedNCBFlag")
            private final String MediaBrowserCompat$SearchResultReceiver;
            @SerializedName("products")
            private final List<zzcb.zze.zza> MediaDescriptionCompat;
            @SerializedName("repaymentAbility")
            private final String MediaMetadataCompat;
            @SerializedName("totalCreditAmount")
            private final String MediaSessionCompat$QueueItem;
            @SerializedName("transactionId")
            private final String MediaSessionCompat$ResultReceiverWrapper;
            @SerializedName("userId")
            private final String MediaSessionCompat$Token;
            @SerializedName("submissionType")
            private final String RatingCompat;
            @SerializedName("ncbGrade")
            private final String read;
            @SerializedName("consent")
            private final zzcb.zzg write;

            public C32977() {
                this((byte) 0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C32977)) {
                    return false;
                }
                C32977 r3 = (C32977) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) r3.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) r3.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) r3.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) r3.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) r3.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) r3.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) r3.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) r3.RatingCompat);
            }

            public final int hashCode() {
                String str = this.MediaSessionCompat$Token;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaSessionCompat$ResultReceiverWrapper;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.MediaMetadataCompat;
                int hashCode4 = str4 != null ? str4.hashCode() : 0;
                zzcb.zzg zzg = this.write;
                int hashCode5 = zzg != null ? zzg.hashCode() : 0;
                String str5 = this.IconCompatParcelizer;
                int hashCode6 = str5 != null ? str5.hashCode() : 0;
                String str6 = this.read;
                int hashCode7 = str6 != null ? str6.hashCode() : 0;
                List<zzcb.zze.zza> list = this.MediaDescriptionCompat;
                int hashCode8 = list != null ? list.hashCode() : 0;
                String str7 = this.MediaSessionCompat$QueueItem;
                int hashCode9 = str7 != null ? str7.hashCode() : 0;
                String str8 = this.MediaBrowserCompat$MediaItem;
                int hashCode10 = str8 != null ? str8.hashCode() : 0;
                String str9 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode11 = str9 != null ? str9.hashCode() : 0;
                String str10 = this.MediaBrowserCompat$SearchResultReceiver;
                int hashCode12 = str10 != null ? str10.hashCode() : 0;
                String str11 = this.RatingCompat;
                if (str11 != null) {
                    i = str11.hashCode();
                }
                return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("EasycashGetCreditPowerLoanRequest(userId=");
                sb.append(this.MediaSessionCompat$Token);
                sb.append(", transactionId=");
                sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
                sb.append(", monthlyIncome=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", repaymentAbility=");
                sb.append(this.MediaMetadataCompat);
                sb.append(", consent=");
                sb.append(this.write);
                sb.append(", debtBurden=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", ncbGrade=");
                sb.append(this.read);
                sb.append(", products=");
                sb.append(this.MediaDescriptionCompat);
                sb.append(", totalCreditAmount=");
                sb.append(this.MediaSessionCompat$QueueItem);
                sb.append(", status=");
                sb.append(this.MediaBrowserCompat$MediaItem);
                sb.append(", lastUpdatedDateTime=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", requiredGeneratedNCBFlag=");
                sb.append(this.MediaBrowserCompat$SearchResultReceiver);
                sb.append(", submissionType=");
                sb.append(this.RatingCompat);
                sb.append(")");
                return sb.toString();
            }

            private C32977(String str, String str2, String str3, String str4, zzcb.zzg zzg, String str5, String str6, List<zzcb.zze.zza> list, String str7, String str8, String str9, String str10, String str11) {
                this.MediaSessionCompat$Token = null;
                this.MediaSessionCompat$ResultReceiverWrapper = null;
                this.MediaBrowserCompat$ItemReceiver = null;
                this.MediaMetadataCompat = null;
                this.write = null;
                this.IconCompatParcelizer = null;
                this.read = null;
                this.MediaDescriptionCompat = null;
                this.MediaSessionCompat$QueueItem = null;
                this.MediaBrowserCompat$MediaItem = null;
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                this.MediaBrowserCompat$SearchResultReceiver = null;
                this.RatingCompat = null;
            }

            private /* synthetic */ C32977(byte b) {
                this((String) null, (String) null, (String) null, (String) null, (zzcb.zzg) null, (String) null, (String) null, (List<zzcb.zze.zza>) null, (String) null, (String) null, (String) null, (String) null, (String) null);
            }
        }

        public static EntryFactory MediaBrowserCompat$CustomActionResultReceiver() {
            return new EntryFactory();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EntryFactory entryFactory = (EntryFactory) obj;
            String str = this.MediaBrowserCompat$ItemReceiver;
            if (str == null ? entryFactory.MediaBrowserCompat$ItemReceiver != null : !str.equals(entryFactory.MediaBrowserCompat$ItemReceiver)) {
                return false;
            }
            String str2 = this.write;
            if (str2 == null ? entryFactory.write != null : !str2.equals(entryFactory.write)) {
                return false;
            }
            String str3 = this.IconCompatParcelizer;
            String str4 = entryFactory.IconCompatParcelizer;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.IconCompatParcelizer;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$Segment */
    public class Segment {
        @SerializedName("phone")
        public String IconCompatParcelizer;
        @SerializedName("documentType")
        public String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("tileVersion")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("uuid")
        public String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("productType")
        public String read;
        @SerializedName("productProgram")
        public String write;

        /* renamed from: o.CustomConcurrentHashMap$Segment$ExpirationQueue */
        public final class ExpirationQueue {
            @SerializedName("subConsentType")
            private final String MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("value")
            private final String MediaBrowserCompat$ItemReceiver;
            @SerializedName("tilesVersion")
            private final String read;
            @SerializedName("applicationUuid")
            private final String write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExpirationQueue)) {
                    return false;
                }
                ExpirationQueue expirationQueue = (ExpirationQueue) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) expirationQueue.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) expirationQueue.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) expirationQueue.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) expirationQueue.MediaBrowserCompat$CustomActionResultReceiver);
            }

            public final int hashCode() {
                String str = this.write;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.read;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("HmlConsentDocumentRequest(applicationUuid=");
                sb.append(this.write);
                sb.append(", tilesVersion=");
                sb.append(this.read);
                sb.append(", value=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", subConsentType=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(")");
                return sb.toString();
            }

            public ExpirationQueue(String str, String str2, String str3, String str4) {
                onGetStartedClick.write((Object) str, "applicationUuid");
                onGetStartedClick.write((Object) str3, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this.write = str;
                this.read = str2;
                this.MediaBrowserCompat$ItemReceiver = str3;
                this.MediaBrowserCompat$CustomActionResultReceiver = str4;
            }
        }

        public static Segment write() {
            return new Segment();
        }

        /* renamed from: o.CustomConcurrentHashMap$Segment$EvictionQueue */
        public class EvictionQueue {
            @SerializedName("giftId")
            public String IconCompatParcelizer;
            @SerializedName("accountFrom")
            public String MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("accountTo")
            public String MediaBrowserCompat$ItemReceiver;
            @SerializedName("presentDetailEN")
            public String MediaBrowserCompat$MediaItem;
            @SerializedName("presentIconUrl")
            public String MediaBrowserCompat$SearchResultReceiver;
            @SerializedName("referenceNo2")
            public String MediaDescriptionCompat;
            @SerializedName("presentDetailTH")
            public String MediaMetadataCompat;
            @SerializedName("senderMessage")
            public String MediaSessionCompat$QueueItem;
            @SerializedName("referenceNo3")
            public String MediaSessionCompat$ResultReceiverWrapper;
            @SerializedName("referenceNo1")
            public String RatingCompat;
            @SerializedName("amount")
            public String read;
            @SerializedName("mobileNo")
            public String write;

            public static EvictionQueue read() {
                return new EvictionQueue();
            }
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$EntrySet */
    public final class EntrySet {
        @SerializedName("productType")
        private final String IconCompatParcelizer;
        @SerializedName("loanAmount")
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("duration")
        private final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("applicationId")
        private final String read;
        @SerializedName("tilesVersion")
        private final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EntrySet)) {
                return false;
            }
            EntrySet entrySet = (EntrySet) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) entrySet.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) entrySet.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) entrySet.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) entrySet.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) entrySet.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.read;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashMHMCInfoRequest(tilesVersion=");
            sb.append(this.write);
            sb.append(", productType=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", applicationId=");
            sb.append(this.read);
            sb.append(", duration=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", loanAmount=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public EntrySet(String str, String str2, String str3, String str4, String str5) {
            onGetStartedClick.write((Object) str, "tilesVersion");
            onGetStartedClick.write((Object) str2, "productType");
            onGetStartedClick.write((Object) str3, "applicationId");
            onGetStartedClick.write((Object) str4, "duration");
            onGetStartedClick.write((Object) str5, "loanAmount");
            this.write = str;
            this.IconCompatParcelizer = str2;
            this.read = str3;
            this.MediaBrowserCompat$ItemReceiver = str4;
            this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$HashIterator */
    public final class HashIterator {
        @SerializedName("creditLife")
        public String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("fire")
        public String read;

        public HashIterator() {
            this((byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HashIterator)) {
                return false;
            }
            HashIterator hashIterator = (HashIterator) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) hashIterator.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) hashIterator.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Insurance(fire=");
            sb.append(this.read);
            sb.append(", creditLife=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        private HashIterator(String str, String str2) {
            onGetStartedClick.write((Object) str, "fire");
            onGetStartedClick.write((Object) str2, "creditLife");
            this.read = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        }

        public /* synthetic */ HashIterator(byte b) {
            this("", "");
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$NullEntry */
    public final class NullEntry {
        @SerializedName("carBrand")
        public String IconCompatParcelizer;
        @SerializedName("carRegistration")
        public EntryFactory.C32861 MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("productType")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("tilesVersion")
        public String MediaBrowserCompat$MediaItem;
        @SerializedName("yearOfManufacture")
        public String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("yearOfRegistration")
        public String MediaDescriptionCompat;
        @SerializedName("subModel")
        public String RatingCompat;
        @SerializedName("carModel")
        public String read;
        @SerializedName("monthlyIncome")
        public String write;

        public NullEntry() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (EntryFactory.C32861) null, (String) null, (String) null, 511);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NullEntry)) {
                return false;
            }
            NullEntry nullEntry = (NullEntry) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) nullEntry.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) nullEntry.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) nullEntry.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) nullEntry.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) nullEntry.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) nullEntry.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) nullEntry.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) nullEntry.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) nullEntry.MediaBrowserCompat$MediaItem);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.IconCompatParcelizer;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.read;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.RatingCompat;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            EntryFactory.C32861 r7 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode7 = r7 != null ? r7.hashCode() : 0;
            String str7 = this.MediaDescriptionCompat;
            int hashCode8 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.MediaBrowserCompat$MediaItem;
            if (str8 != null) {
                i = str8.hashCode();
            }
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("McmcCollateralRequest(productType=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", monthlyIncome=");
            sb.append(this.write);
            sb.append(", carBrand=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", carModel=");
            sb.append(this.read);
            sb.append(", yearOfManufacture=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", subModel=");
            sb.append(this.RatingCompat);
            sb.append(", carRegistration=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", yearOfRegistration=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", tilesVersion=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(")");
            return sb.toString();
        }

        private NullEntry(String str, String str2, String str3, String str4, String str5, String str6, EntryFactory.C32861 r8, String str7, String str8) {
            onGetStartedClick.write((Object) str, "productType");
            onGetStartedClick.write((Object) str2, "monthlyIncome");
            onGetStartedClick.write((Object) str3, "carBrand");
            onGetStartedClick.write((Object) str4, "carModel");
            onGetStartedClick.write((Object) str5, "yearOfManufacture");
            onGetStartedClick.write((Object) str6, "subModel");
            onGetStartedClick.write((Object) r8, "carRegistration");
            onGetStartedClick.write((Object) str7, "yearOfRegistration");
            onGetStartedClick.write((Object) str8, "tilesVersion");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.write = str2;
            this.IconCompatParcelizer = str3;
            this.read = str4;
            this.MediaBrowserCompat$SearchResultReceiver = str5;
            this.RatingCompat = str6;
            this.MediaBrowserCompat$CustomActionResultReceiver = r8;
            this.MediaDescriptionCompat = str7;
            this.MediaBrowserCompat$MediaItem = str8;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ NullEntry(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, p040o.CustomConcurrentHashMap.EntryFactory.C32861 r17, java.lang.String r18, java.lang.String r19, int r20) {
            /*
                r10 = this;
                r0 = r20
                r1 = r0 & 1
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x000a
                r1 = r2
                goto L_0x000b
            L_0x000a:
                r1 = r11
            L_0x000b:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0011
                r3 = r2
                goto L_0x0012
            L_0x0011:
                r3 = r12
            L_0x0012:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x0018
                r4 = r2
                goto L_0x0019
            L_0x0018:
                r4 = r13
            L_0x0019:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x001f
                r5 = r2
                goto L_0x0020
            L_0x001f:
                r5 = r14
            L_0x0020:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x0026
                r6 = r2
                goto L_0x0027
            L_0x0026:
                r6 = r15
            L_0x0027:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x002d
                r7 = r2
                goto L_0x002f
            L_0x002d:
                r7 = r16
            L_0x002f:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x003a
                o.CustomConcurrentHashMap$EntryFactory$1 r8 = new o.CustomConcurrentHashMap$EntryFactory$1
                r9 = 0
                r8.<init>(r9)
                goto L_0x003c
            L_0x003a:
                r8 = r17
            L_0x003c:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x0042
                r9 = r2
                goto L_0x0044
            L_0x0042:
                r9 = r18
            L_0x0044:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L_0x0049
                goto L_0x004b
            L_0x0049:
                r2 = r19
            L_0x004b:
                r11 = r10
                r12 = r1
                r13 = r3
                r14 = r4
                r15 = r5
                r16 = r6
                r17 = r7
                r18 = r8
                r19 = r9
                r20 = r2
                r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.CustomConcurrentHashMap.NullEntry.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.CustomConcurrentHashMap$EntryFactory$1, java.lang.String, java.lang.String, int):void");
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$QueueHolder */
    public final class QueueHolder {
        @SerializedName("applicationId")
        private final String IconCompatParcelizer;
        @SerializedName("maritalStatus")
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("businessName")
        private final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("productType")
        private final String MediaBrowserCompat$MediaItem;
        @SerializedName("spouseLastName")
        private final String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("spouseNationalId")
        private final String MediaDescriptionCompat;
        @SerializedName("spouseFirstName")
        private final String MediaMetadataCompat;
        @SerializedName("yearInBusiness")
        private final int MediaSessionCompat$QueueItem;
        @SerializedName("spouseTitle")
        private final String MediaSessionCompat$Token;
        @SerializedName("numberOfEmployees")
        private final int RatingCompat;
        @SerializedName("tilesVersion")
        public String read;
        @SerializedName("monthInBusiness")
        private final int write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QueueHolder)) {
                return false;
            }
            QueueHolder queueHolder = (QueueHolder) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) queueHolder.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) queueHolder.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) queueHolder.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) queueHolder.MediaBrowserCompat$ItemReceiver) && this.MediaSessionCompat$QueueItem == queueHolder.MediaSessionCompat$QueueItem && this.write == queueHolder.write && this.RatingCompat == queueHolder.RatingCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) queueHolder.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) queueHolder.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) queueHolder.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) queueHolder.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) queueHolder.MediaBrowserCompat$SearchResultReceiver);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$MediaItem;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.IconCompatParcelizer;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            int i2 = this.MediaSessionCompat$QueueItem;
            int i3 = this.write;
            int i4 = this.RatingCompat;
            String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaDescriptionCompat;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.MediaSessionCompat$Token;
            int hashCode7 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.MediaMetadataCompat;
            int hashCode8 = str8 != null ? str8.hashCode() : 0;
            String str9 = this.MediaBrowserCompat$SearchResultReceiver;
            if (str9 != null) {
                i = str9.hashCode();
            }
            return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashBusinessAndMaritalInfoDocumentRequest(tilesVersion=");
            sb.append(this.read);
            sb.append(", productType=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", applicationId=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", businessName=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", yearInBusiness=");
            sb.append(this.MediaSessionCompat$QueueItem);
            sb.append(", monthInBusiness=");
            sb.append(this.write);
            sb.append(", numberOfEmployees=");
            sb.append(this.RatingCompat);
            sb.append(", maritalStatus=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", spouseNationalId=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", spouseTitle=");
            sb.append(this.MediaSessionCompat$Token);
            sb.append(", spouseFirstName=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", spouseLastName=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        private QueueHolder(String str, String str2, String str3, String str4, int i, int i2, int i3, String str5, String str6, String str7, String str8, String str9) {
            onGetStartedClick.write((Object) str2, "productType");
            onGetStartedClick.write((Object) str3, "applicationId");
            onGetStartedClick.write((Object) str4, "businessName");
            onGetStartedClick.write((Object) str5, "maritalStatus");
            this.read = str;
            this.MediaBrowserCompat$MediaItem = str2;
            this.IconCompatParcelizer = str3;
            this.MediaBrowserCompat$ItemReceiver = str4;
            this.MediaSessionCompat$QueueItem = i;
            this.write = i2;
            this.RatingCompat = i3;
            this.MediaBrowserCompat$CustomActionResultReceiver = str5;
            this.MediaDescriptionCompat = str6;
            this.MediaSessionCompat$Token = str7;
            this.MediaMetadataCompat = str8;
            this.MediaBrowserCompat$SearchResultReceiver = str9;
        }

        public /* synthetic */ QueueHolder(String str, String str2, String str3, int i, int i2, int i3, String str4, String str5, String str6, String str7, String str8) {
            this("", str, str2, str3, i, i2, i3, str4, str5, str6, str7, str8);
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$ReferenceEntry */
    public final class ReferenceEntry {
        @SerializedName("productType")
        private String write;

        /* renamed from: o.CustomConcurrentHashMap$ReferenceEntry$read */
        public static final class read {
            public String IconCompatParcelizer;
        }

        private ReferenceEntry(read read2) {
            this.write = read2.IconCompatParcelizer;
        }

        public /* synthetic */ ReferenceEntry(read read2, byte b) {
            this(read2);
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$SerializationProxy */
    public final class SerializationProxy {
        @SerializedName("businessRegistrationNo")
        private final String IconCompatParcelizer;
        @SerializedName("businessUrl")
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("marketplaceUrl")
        private final unsetValue MediaBrowserCompat$ItemReceiver;
        @SerializedName("applicationUuid")
        private final String read;
        @SerializedName("businessOnLease")
        private final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SerializationProxy)) {
                return false;
            }
            SerializationProxy serializationProxy = (SerializationProxy) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) serializationProxy.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) serializationProxy.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) serializationProxy.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) serializationProxy.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) serializationProxy.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.write;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            unsetValue unsetvalue = this.MediaBrowserCompat$ItemReceiver;
            if (unsetvalue != null) {
                i = unsetvalue.hashCode();
            }
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlBusinessInfoStoreDetailsRequest(applicationUuid=");
            sb.append(this.read);
            sb.append(", businessRegistrationNo=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", businessOnLease=");
            sb.append(this.write);
            sb.append(", businessUrl=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", marketplaceUrl=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public SerializationProxy(String str, String str2, String str3, String str4, unsetValue unsetvalue) {
            onGetStartedClick.write((Object) str, "applicationUuid");
            this.read = str;
            this.IconCompatParcelizer = str2;
            this.write = str3;
            this.MediaBrowserCompat$CustomActionResultReceiver = str4;
            this.MediaBrowserCompat$ItemReceiver = unsetvalue;
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$SoftEvictableEntry */
    public final class SoftEvictableEntry {
        @SerializedName("campaignIntent")
        private final String IconCompatParcelizer;
        @SerializedName("leadType")
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("mboxAAMB")
        private final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("mboxMCGVID")
        private final String MediaBrowserCompat$MediaItem;
        @SerializedName("mboxMCGLH")
        private final String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("promoCode")
        private final String MediaDescriptionCompat;
        @SerializedName("sessionId")
        private final String MediaMetadataCompat;
        @SerializedName("productType")
        private final String RatingCompat;
        @SerializedName("advertisingId")
        private final String read;
        @SerializedName("crmId")
        private final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SoftEvictableEntry)) {
                return false;
            }
            SoftEvictableEntry softEvictableEntry = (SoftEvictableEntry) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) softEvictableEntry.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) softEvictableEntry.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) softEvictableEntry.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) softEvictableEntry.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) softEvictableEntry.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) softEvictableEntry.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) softEvictableEntry.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) softEvictableEntry.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) softEvictableEntry.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) softEvictableEntry.MediaDescriptionCompat);
        }

        public final int hashCode() {
            String str = this.RatingCompat;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaMetadataCompat;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$MediaItem;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.read;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.write;
            int hashCode7 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.IconCompatParcelizer;
            int hashCode8 = str8 != null ? str8.hashCode() : 0;
            String str9 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode9 = str9 != null ? str9.hashCode() : 0;
            String str10 = this.MediaDescriptionCompat;
            if (str10 != null) {
                i = str10.hashCode();
            }
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlLandingRequest(productType=");
            sb.append(this.RatingCompat);
            sb.append(", sessionId=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", mboxMCGVID=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", mboxAAMB=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", mboxMCGLH=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", advertisingId=");
            sb.append(this.read);
            sb.append(", crmId=");
            sb.append(this.write);
            sb.append(", campaignIntent=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", leadType=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", promoCode=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(")");
            return sb.toString();
        }

        public SoftEvictableEntry(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            onGetStartedClick.write((Object) str, "productType");
            onGetStartedClick.write((Object) str4, "advertisingId");
            this.RatingCompat = str;
            this.MediaMetadataCompat = null;
            this.MediaBrowserCompat$MediaItem = str3;
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.read = str4;
            this.write = str5;
            this.IconCompatParcelizer = str6;
            this.MediaBrowserCompat$CustomActionResultReceiver = str7;
            this.MediaDescriptionCompat = str8;
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$SoftValueReference */
    public final class SoftValueReference {
        @SerializedName("amount")
        private final String IconCompatParcelizer;
        @SerializedName("frequency")
        private final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SoftValueReference)) {
                return false;
            }
            SoftValueReference softValueReference = (SoftValueReference) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) softValueReference.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) softValueReference.write);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlInstallment(amount=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", frequency=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public SoftValueReference(String str, String str2) {
            onGetStartedClick.write((Object) str2, "frequency");
            this.IconCompatParcelizer = str;
            this.write = str2;
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$Strength */
    public final class Strength {
        @SerializedName("ncbFlag")
        private final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("applicationUuid")
        private final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Strength)) {
                return false;
            }
            Strength strength = (Strength) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) strength.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) strength.MediaBrowserCompat$ItemReceiver);
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
            sb.append("HmlNCBAcceptanceRequest(applicationUuid=");
            sb.append(this.write);
            sb.append(", ncbFlag=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public Strength(String str, String str2) {
            onGetStartedClick.write((Object) str, "applicationUuid");
            onGetStartedClick.write((Object) str2, "ncbFlag");
            this.write = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$StrongExpirableEntry */
    public final class StrongExpirableEntry {
        @SerializedName("hasSCBAsMOA")
        private final String IconCompatParcelizer;
        @SerializedName("mainOperatingAccountNo")
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("applicationUuid")
        private final String MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StrongExpirableEntry)) {
                return false;
            }
            StrongExpirableEntry strongExpirableEntry = (StrongExpirableEntry) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) strongExpirableEntry.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) strongExpirableEntry.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) strongExpirableEntry.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlSendOperatingAccountRequest(applicationUuid=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", hasSCBAsMOA=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", mainOperatingAccountNo=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public StrongExpirableEntry(String str, String str2, String str3) {
            onGetStartedClick.write((Object) str, "applicationUuid");
            onGetStartedClick.write((Object) str2, "hasSCBAsMOA");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$Values */
    public final class Values {
        @SerializedName("payType")
        private final String IconCompatParcelizer;
        @SerializedName("insAcctId")
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("transactionToken")
        private final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("dataSource")
        private final String read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Values)) {
                return false;
            }
            Values values = (Values) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) values.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) values.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) values.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) values.IconCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.read;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.IconCompatParcelizer;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("InsurancePaymentConfirmRequest(transactionToken=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", insAcctId=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", dataSource=");
            sb.append(this.read);
            sb.append(", payType=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public Values(String str, String str2, String str3, String str4) {
            onGetStartedClick.write((Object) str, "transactionToken");
            onGetStartedClick.write((Object) str2, "insAcctId");
            onGetStartedClick.write((Object) str3, "dataSource");
            onGetStartedClick.write((Object) str4, "payType");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.read = str3;
            this.IconCompatParcelizer = str4;
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$WeakEntry */
    public final class WeakEntry {
        @SerializedName("dataSource")
        private final String IconCompatParcelizer;
        @SerializedName("insAcctId")
        private final String read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WeakEntry)) {
                return false;
            }
            WeakEntry weakEntry = (WeakEntry) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) weakEntry.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) weakEntry.IconCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("InitiatePaymentRequest(insAcctId=");
            sb.append(this.read);
            sb.append(", dataSource=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public WeakEntry(String str, String str2) {
            onGetStartedClick.write((Object) str, "insAcctId");
            onGetStartedClick.write((Object) str2, "dataSource");
            this.read = str;
            this.IconCompatParcelizer = str2;
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$SoftExpirableEntry */
    public final class SoftExpirableEntry {
        @SerializedName("duration")
        private final String IconCompatParcelizer;
        @SerializedName("installment")
        private final Strength.C33053 MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("gracePeriod")
        private final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("productType")
        private final String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("repaymentDate")
        private final String MediaDescriptionCompat;
        @SerializedName("promoCode")
        private final String MediaMetadataCompat;
        @SerializedName("repaymentStartDate")
        private final String RatingCompat;
        @SerializedName("principal")
        private final String read;
        @SerializedName("annualInterest")
        private final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SoftExpirableEntry)) {
                return false;
            }
            SoftExpirableEntry softExpirableEntry = (SoftExpirableEntry) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) softExpirableEntry.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) softExpirableEntry.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) softExpirableEntry.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) softExpirableEntry.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) softExpirableEntry.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) softExpirableEntry.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) softExpirableEntry.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) softExpirableEntry.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) softExpirableEntry.MediaMetadataCompat);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$SearchResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.IconCompatParcelizer;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            Strength.C33053 r4 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode4 = r4 != null ? r4.hashCode() : 0;
            String str4 = this.MediaDescriptionCompat;
            int hashCode5 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.RatingCompat;
            int hashCode6 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.write;
            int hashCode7 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode8 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.MediaMetadataCompat;
            if (str8 != null) {
                i = str8.hashCode();
            }
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlInitiateRequest(productType=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", principal=");
            sb.append(this.read);
            sb.append(", duration=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", installment=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", repaymentDate=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", repaymentStartDate=");
            sb.append(this.RatingCompat);
            sb.append(", annualInterest=");
            sb.append(this.write);
            sb.append(", gracePeriod=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", promoCode=");
            sb.append(this.MediaMetadataCompat);
            sb.append(")");
            return sb.toString();
        }

        public SoftExpirableEntry(String str, String str2, String str3, Strength.C33053 r5, String str4, String str5, String str6, String str7, String str8) {
            onGetStartedClick.write((Object) str, "productType");
            onGetStartedClick.write((Object) str2, "principal");
            onGetStartedClick.write((Object) str3, "duration");
            onGetStartedClick.write((Object) r5, "installment");
            onGetStartedClick.write((Object) str4, "repaymentDate");
            onGetStartedClick.write((Object) str5, "repaymentStartDate");
            onGetStartedClick.write((Object) str6, "annualInterest");
            onGetStartedClick.write((Object) str7, "gracePeriod");
            this.MediaBrowserCompat$SearchResultReceiver = str;
            this.read = str2;
            this.IconCompatParcelizer = str3;
            this.MediaBrowserCompat$CustomActionResultReceiver = r5;
            this.MediaDescriptionCompat = str4;
            this.RatingCompat = str5;
            this.write = str6;
            this.MediaBrowserCompat$ItemReceiver = str7;
            this.MediaMetadataCompat = str8;
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$StrongEvictableEntry */
    public final class StrongEvictableEntry {
        @SerializedName("e2eeSid")
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("encryptedPin")
        private final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StrongEvictableEntry)) {
                return false;
            }
            StrongEvictableEntry strongEvictableEntry = (StrongEvictableEntry) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) strongEvictableEntry.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) strongEvictableEntry.write);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SetupNTBPinRequest(e2eeSid=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", encryptedPin=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public StrongEvictableEntry(String str, String str2) {
            onGetStartedClick.write((Object) str, "e2eeSid");
            onGetStartedClick.write((Object) str2, "encryptedPin");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.write = str2;
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$WeakValueReference */
    public final class WeakValueReference {
        @SerializedName("laserId")
        private String IconCompatParcelizer;

        public WeakValueReference(String str) {
            onGetStartedClick.write((Object) str, "laserId");
            this.IconCompatParcelizer = str;
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$SoftEntry */
    public final class SoftEntry {
        @SerializedName("model")
        public final Boolean IconCompatParcelizer;
        @SerializedName("otp")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("crossSell")
        public final Boolean MediaBrowserCompat$ItemReceiver;
        @SerializedName("tokenUuid")
        public final String MediaDescriptionCompat;
        @SerializedName("tnc")
        public final Boolean read;
        @SerializedName("device")
        public final zzfe.zzd write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SoftEntry)) {
                return false;
            }
            SoftEntry softEntry = (SoftEntry) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) softEntry.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) softEntry.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) softEntry.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) softEntry.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) softEntry.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) softEntry.write);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaDescriptionCompat;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            Boolean bool = this.read;
            int hashCode3 = bool != null ? bool.hashCode() : 0;
            Boolean bool2 = this.IconCompatParcelizer;
            int hashCode4 = bool2 != null ? bool2.hashCode() : 0;
            Boolean bool3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode5 = bool3 != null ? bool3.hashCode() : 0;
            zzfe.zzd zzd = this.write;
            if (zzd != null) {
                i = zzd.hashCode();
            }
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlEtbOtpSubmissionRequest(otp=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", tokenUuid=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", tnc=");
            sb.append(this.read);
            sb.append(", model=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", crossSell=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", device=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public SoftEntry(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, zzfe.zzd zzd) {
            onGetStartedClick.write((Object) str, "otp");
            onGetStartedClick.write((Object) str2, "tokenUuid");
            onGetStartedClick.write((Object) zzd, "device");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.MediaDescriptionCompat = str2;
            this.read = bool;
            this.IconCompatParcelizer = bool2;
            this.MediaBrowserCompat$ItemReceiver = bool3;
            this.write = zzd;
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$SoftExpirableEvictableEntry */
    public final class SoftExpirableEvictableEntry {
        @SerializedName("issuer")
        private final C4739h_ MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("applicationUuid")
        private final String read;

        public SoftExpirableEvictableEntry(String str, C4739h_ h_Var) {
            onGetStartedClick.write((Object) str, "applicationUuid");
            onGetStartedClick.write((Object) h_Var, "issuer");
            this.read = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = h_Var;
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$StrongEntry */
    public final class StrongEntry {
        @SerializedName("documentFile")
        public final MultipartBody.Part IconCompatParcelizer;
        @SerializedName("applicationUuid")
        public final RequestBody MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StrongEntry)) {
                return false;
            }
            StrongEntry strongEntry = (StrongEntry) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) strongEntry.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) strongEntry.IconCompatParcelizer);
        }

        public final int hashCode() {
            RequestBody requestBody = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = requestBody != null ? requestBody.hashCode() : 0;
            MultipartBody.Part part = this.IconCompatParcelizer;
            if (part != null) {
                i = part.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlUploadCidRequest(applicationUuid=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", documentFile=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public StrongEntry(RequestBody requestBody, MultipartBody.Part part) {
            onGetStartedClick.write((Object) requestBody, "applicationUuid");
            onGetStartedClick.write((Object) part, "documentFile");
            this.MediaBrowserCompat$ItemReceiver = requestBody;
            this.IconCompatParcelizer = part;
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$ValueIterator */
    public class ValueIterator {
        @SerializedName("tokenId")
        private String IconCompatParcelizer;

        public ValueIterator(String str) {
            this.IconCompatParcelizer = str;
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$StrongValueReference */
    public class StrongValueReference {
        @SerializedName("answers")
        public List<String> read;

        public StrongValueReference(List<String> list) {
            this.read = list;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof StrongValueReference)) {
                return super.equals(obj);
            }
            List<String> list = ((StrongValueReference) obj).read;
            if (this.read.size() != list.size()) {
                return false;
            }
            for (int i = 0; i < this.read.size(); i++) {
                if (!this.read.get(i).equals(list.get(i))) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            List<String> list = this.read;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$EntryIterator */
    public class EntryIterator {
        @SerializedName("issuerId")
        private String IconCompatParcelizer;
        @SerializedName("applicationId")
        private String read;

        public EntryIterator(String str, String str2) {
            this.read = str;
            this.IconCompatParcelizer = str2;
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$KeySet */
    public class KeySet {
        @SerializedName("applicationId")
        private String IconCompatParcelizer;
        @SerializedName("issuer")
        private C4739h_ write;

        public KeySet(String str, C4739h_ h_Var) {
            this.IconCompatParcelizer = str;
            this.write = h_Var;
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$WeakExpirableEvictableEntry */
    public class WeakExpirableEvictableEntry {
        @SerializedName("mailingAddress")
        public standardSubSet IconCompatParcelizer;
        @SerializedName("mailingRegisteredSameFlag")
        public String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("mailingHomeSameFlag")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("homeRegisteredSameFlag")
        public String read;
        @SerializedName("homeAddress")
        public standardSubSet write;

        public static WeakExpirableEvictableEntry MediaBrowserCompat$ItemReceiver() {
            return new WeakExpirableEvictableEntry();
        }
    }

    /* renamed from: o.CustomConcurrentHashMap$AbstractSerializationProxy */
    public class AbstractSerializationProxy {
        @SerializedName("endDate")
        private String IconCompatParcelizer;
        @SerializedName("statementType")
        private String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("startDate")
        private String MediaBrowserCompat$ItemReceiver;
        @SerializedName("accountType")
        private String read;
        @SerializedName("accountNo")
        private String write;

        public AbstractSerializationProxy(String str, String str2, String str3, String str4, String str5) {
            this.write = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.IconCompatParcelizer = str3;
            this.read = str4;
            this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        }
    }
}
