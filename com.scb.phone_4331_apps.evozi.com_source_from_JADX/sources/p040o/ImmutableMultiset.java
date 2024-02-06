package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.ImmutableMultiset */
public class ImmutableMultiset {
    @SerializedName("language")
    public String read;

    /* renamed from: o.ImmutableMultiset$EntrySet */
    public class EntrySet {
        @SerializedName("tokenUUID")
        private String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("tilesVersion")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("consentAcceptFlag")
        private String read;
        @SerializedName("otp")
        private String write;

        /* renamed from: o.ImmutableMultiset$EntrySet$1 */
        public final class C35041 {
            @SerializedName("tenure")
            private Integer AlertController$RecycleListView;
            @SerializedName("terminalId")
            private String AppCompatDelegateImpl$ListMenuDecorView;
            @SerializedName("callbackUrl")
            private String IconCompatParcelizer;
            @SerializedName("partnerTransactionId")
            private String Keep;
            @SerializedName("tilesVersion")
            public String MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("amount")
            private double MediaBrowserCompat$ItemReceiver;
            @SerializedName("merchantId")
            private String MediaBrowserCompat$MediaItem;
            @SerializedName("ippType")
            private Integer MediaBrowserCompat$SearchResultReceiver;
            @SerializedName("partnerId")

            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
            private String f2725x50fd9e4a;
            @SerializedName("merchantMetaData")
            private onSnapshotReady MediaDescriptionCompat;
            @SerializedName("monthlyInstallmentAmount")
            private Double MediaMetadataCompat;
            @SerializedName("partnerSubType")
            private String MediaSessionCompat$QueueItem;
            @SerializedName("note")
            private String MediaSessionCompat$ResultReceiverWrapper;
            @SerializedName("partnerName")
            private String MediaSessionCompat$Token;
            @SerializedName("orderReference")
            private String ParcelableVolumeInfo;
            @SerializedName("partnerType")
            private String PlaybackStateCompat;
            @SerializedName("productCode")
            private String PlaybackStateCompat$CustomAction;
            @SerializedName("cardRef")
            private String RatingCompat;
            @SerializedName("cardInterestRate")
            private Double read;
            @SerializedName("yearlyCardInterestRate")
            private Double setBackgroundResource;
            @SerializedName("totalPaymentAmount")
            private Double setContentView;
            @SerializedName("principal")
            private Double setHasDecor;
            @SerializedName("cardInterestAmount")
            private Double write;

            private C35041(String str, String str2, String str3, String str4, String str5, String str6, String str7, double d, String str8, String str9, String str10, Integer num, Integer num2, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, String str11, String str12, onSnapshotReady onsnapshotready, String str13) {
                String str14 = str8;
                String str15 = str10;
                String str16 = str13;
                onGetStartedClick.write((Object) str, "cardRef");
                onGetStartedClick.write((Object) str6, "partnerType");
                onGetStartedClick.write((Object) str7, "partnerSubType");
                onGetStartedClick.write((Object) str14, "merchantId");
                onGetStartedClick.write((Object) str15, "orderReference");
                onGetStartedClick.write((Object) str16, "tilesVersion");
                this.RatingCompat = str;
                this.IconCompatParcelizer = str2;
                this.f2725x50fd9e4a = str3;
                this.MediaSessionCompat$Token = str4;
                this.Keep = str5;
                this.PlaybackStateCompat = str6;
                this.MediaSessionCompat$QueueItem = str7;
                this.MediaBrowserCompat$ItemReceiver = d;
                this.MediaBrowserCompat$MediaItem = str14;
                this.AppCompatDelegateImpl$ListMenuDecorView = str9;
                this.ParcelableVolumeInfo = str15;
                this.MediaBrowserCompat$SearchResultReceiver = num;
                this.AlertController$RecycleListView = num2;
                this.setContentView = d2;
                this.setHasDecor = d3;
                this.read = d4;
                this.write = d5;
                this.MediaMetadataCompat = d6;
                this.setBackgroundResource = d7;
                this.PlaybackStateCompat$CustomAction = str11;
                this.MediaSessionCompat$ResultReceiverWrapper = str12;
                this.MediaDescriptionCompat = onsnapshotready;
                this.MediaBrowserCompat$CustomActionResultReceiver = str16;
            }

            public /* synthetic */ C35041(String str, String str2, String str3, String str4, String str5, String str6, String str7, double d, String str8, String str9, String str10, Integer num, Integer num2, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, String str11, String str12, onSnapshotReady onsnapshotready) {
                this(str, str2, str3, str4, str5, str6, str7, d, str8, str9, str10, num, num2, d2, d3, d4, d5, d6, d7, str11, str12, onsnapshotready, "");
            }
        }

        public EntrySet(String str) {
            this.read = str;
        }
    }

    /* renamed from: o.ImmutableMultiset$Builder */
    public class Builder {
        @SerializedName("debitCardList")
        private List<write> IconCompatParcelizer;
        @SerializedName("cardList")
        private List<IconCompatParcelizer> MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("depositList")
        private List<read> MediaBrowserCompat$ItemReceiver;
        @SerializedName("merchantWalletList")
        private List<C3507xc4d54cd0> MediaBrowserCompat$MediaItem;
        @SerializedName("smeLoanList")
        private List<ImmutableMultiset$Builder$MediaBrowserCompat$MediaItem> MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("prepaidCardList")
        private List<MediaMetadataCompat> MediaDescriptionCompat;
        @SerializedName("clientList")
        private List<ImmutableMultiset$Builder$MediaBrowserCompat$ItemReceiver> read;
        @SerializedName("loanList")
        private List<ImmutableMultiset$Builder$MediaBrowserCompat$MediaItem> write;

        public /* synthetic */ Builder(C3506xb5079cef immutableMultiset$Builder$MediaBrowserCompat$CustomActionResultReceiver, byte b) {
            this(immutableMultiset$Builder$MediaBrowserCompat$CustomActionResultReceiver);
        }

        private Builder(C3506xb5079cef immutableMultiset$Builder$MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$ItemReceiver = immutableMultiset$Builder$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
            this.MediaBrowserCompat$CustomActionResultReceiver = immutableMultiset$Builder$MediaBrowserCompat$CustomActionResultReceiver.read;
            this.write = immutableMultiset$Builder$MediaBrowserCompat$CustomActionResultReceiver.write;
            this.read = immutableMultiset$Builder$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$SearchResultReceiver = immutableMultiset$Builder$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat;
            this.MediaBrowserCompat$MediaItem = immutableMultiset$Builder$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem;
            this.MediaDescriptionCompat = immutableMultiset$Builder$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat;
            this.IconCompatParcelizer = immutableMultiset$Builder$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        }

        public static C3506xb5079cef read() {
            return new C3506xb5079cef((byte) 0);
        }

        /* renamed from: o.ImmutableMultiset$Builder$read */
        public static class read {
            @SerializedName("nickname")
            String MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("quickBalanceFlag")
            String MediaBrowserCompat$ItemReceiver;
            @SerializedName("accountNo")
            String read;

            public /* synthetic */ read(write write2, byte b) {
                this(write2);
            }

            private read(write write2) {
                this.read = write2.write;
                this.MediaBrowserCompat$CustomActionResultReceiver = write2.IconCompatParcelizer;
                this.MediaBrowserCompat$ItemReceiver = null;
            }

            public static write MediaBrowserCompat$CustomActionResultReceiver() {
                return new write((byte) 0);
            }

            /* renamed from: o.ImmutableMultiset$Builder$read$write */
            public static final class write {
                public String IconCompatParcelizer;
                public String write;

                /* synthetic */ write(byte b) {
                    this();
                }

                private write() {
                }
            }
        }

        /* renamed from: o.ImmutableMultiset$Builder$IconCompatParcelizer */
        public static class IconCompatParcelizer {
            @SerializedName("cardRefNo")
            String MediaBrowserCompat$ItemReceiver;
            @SerializedName("nickname")
            String write;

            public /* synthetic */ IconCompatParcelizer(C3505xf953c611 immutableMultiset$Builder$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver, byte b) {
                this(immutableMultiset$Builder$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver);
            }

            private IconCompatParcelizer(C3505xf953c611 immutableMultiset$Builder$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver) {
                this.MediaBrowserCompat$ItemReceiver = immutableMultiset$Builder$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver.write;
                this.write = immutableMultiset$Builder$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
            }

            public static C3505xf953c611 read() {
                return new C3505xf953c611((byte) 0);
            }
        }

        /* renamed from: o.ImmutableMultiset$Builder$MediaMetadataCompat */
        public static class MediaMetadataCompat {
            @SerializedName("cardRefNo")
            String MediaBrowserCompat$ItemReceiver;
            @SerializedName("nickname")
            String write;

            public /* synthetic */ MediaMetadataCompat(read read2, byte b) {
                this(read2);
            }

            private MediaMetadataCompat(read read2) {
                this.MediaBrowserCompat$ItemReceiver = read2.MediaBrowserCompat$CustomActionResultReceiver;
                this.write = read2.MediaBrowserCompat$ItemReceiver;
            }

            public static read MediaBrowserCompat$ItemReceiver() {
                return new read((byte) 0);
            }

            /* renamed from: o.ImmutableMultiset$Builder$MediaMetadataCompat$read */
            public static final class read {
                public String MediaBrowserCompat$CustomActionResultReceiver;
                public String MediaBrowserCompat$ItemReceiver;

                /* synthetic */ read(byte b) {
                    this();
                }

                private read() {
                }
            }
        }

        /* renamed from: o.ImmutableMultiset$Builder$write */
        public static class write {
            @SerializedName("nickname")
            String IconCompatParcelizer;
            @SerializedName("cardRefNo")
            String write;

            public /* synthetic */ write(read read2, byte b) {
                this(read2);
            }

            private write(read read2) {
                this.write = read2.write;
                this.IconCompatParcelizer = read2.MediaBrowserCompat$CustomActionResultReceiver;
            }

            public static read read() {
                return new read((byte) 0);
            }

            /* renamed from: o.ImmutableMultiset$Builder$write$read */
            public static final class read {
                public String MediaBrowserCompat$CustomActionResultReceiver;
                public String write;

                /* synthetic */ read(byte b) {
                    this();
                }

                private read() {
                }
            }
        }
    }

    /* renamed from: o.ImmutableMultiset$1 */
    public class C35031 {
        @SerializedName("accountNo")
        String MediaBrowserCompat$ItemReceiver;
        @SerializedName("tilesVersion")
        public String read;
        @SerializedName("accountType")
        String write;

        public /* synthetic */ C35031(ImmutableMultiset$1$MediaBrowserCompat$ItemReceiver immutableMultiset$1$MediaBrowserCompat$ItemReceiver, byte b) {
            this(immutableMultiset$1$MediaBrowserCompat$ItemReceiver);
        }

        private C35031(ImmutableMultiset$1$MediaBrowserCompat$ItemReceiver immutableMultiset$1$MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$ItemReceiver = immutableMultiset$1$MediaBrowserCompat$ItemReceiver.read;
            this.write = immutableMultiset$1$MediaBrowserCompat$ItemReceiver.write;
        }

        public static ImmutableMultiset$1$MediaBrowserCompat$ItemReceiver IconCompatParcelizer() {
            return new ImmutableMultiset$1$MediaBrowserCompat$ItemReceiver((byte) 0);
        }
    }

    public ImmutableMultiset(String str) {
        this.read = str;
    }

    /* renamed from: o.ImmutableMultiset$FieldSettersHolder */
    public class FieldSettersHolder {
        @SerializedName("proxyId")
        public String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("proxyType")
        public String read;
        @SerializedName("amount")
        public String write;

        public static FieldSettersHolder IconCompatParcelizer() {
            return new FieldSettersHolder();
        }
    }
}
