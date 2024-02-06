package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ImmutableCollection */
public final class ImmutableCollection {
    @SerializedName("tilesVersion")
    public String IconCompatParcelizer;
    @SerializedName("cardNo")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("selectedCardRefNo")
    public String write;

    public ImmutableCollection() {
        this((byte) 0);
    }

    /* renamed from: o.ImmutableCollection$ArrayImmutableCollection */
    public final class ArrayImmutableCollection {
        @SerializedName("tilesVersion")
        public String read;

        public ArrayImmutableCollection() {
            this((byte) 0);
        }

        public /* synthetic */ ArrayImmutableCollection(byte b) {
            this("");
        }

        private ArrayImmutableCollection(String str) {
            onGetStartedClick.write((Object) str, "tilesVersion");
            this.read = str;
        }
    }

    /* renamed from: o.ImmutableCollection$Builder */
    public final class Builder {
        @SerializedName("cardRefNo")
        private String IconCompatParcelizer;
        @SerializedName("amount")
        private double MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("accountTo")
        private String MediaBrowserCompat$ItemReceiver;
        @SerializedName("walletFrom")
        private String MediaMetadataCompat;
        @SerializedName("annotation")
        private String read;
        @SerializedName("tilesVersion")
        public String write;

        private Builder(String str, String str2, double d, String str3, String str4, String str5) {
            onGetStartedClick.write((Object) str, "cardRefNo");
            onGetStartedClick.write((Object) str2, "walletFrom");
            onGetStartedClick.write((Object) str3, "accountTo");
            onGetStartedClick.write((Object) str4, "annotation");
            onGetStartedClick.write((Object) str5, "tilesVersion");
            this.IconCompatParcelizer = str;
            this.MediaMetadataCompat = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = d;
            this.MediaBrowserCompat$ItemReceiver = str3;
            this.read = str4;
            this.write = str5;
        }

        public /* synthetic */ Builder(String str, String str2, double d, String str3, String str4) {
            this(str, str2, d, str3, str4, "");
        }
    }

    /* renamed from: o.ImmutableCollection$SerializedForm */
    public final class SerializedForm {
        @SerializedName("transactionToken")
        private final String MediaBrowserCompat$ItemReceiver;

        public SerializedForm(String str) {
            onGetStartedClick.write((Object) str, "transactionToken");
            this.MediaBrowserCompat$ItemReceiver = str;
        }
    }

    /* renamed from: o.ImmutableCollection$EmptyImmutableCollection */
    public final class EmptyImmutableCollection {
        @SerializedName("productType")
        private String IconCompatParcelizer;
        @SerializedName("tilesVersion")
        public String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("mailingAddress")
        private setOnMyLocationClickListener MediaBrowserCompat$ItemReceiver;
        @SerializedName("accountNo")
        private String read;

        private EmptyImmutableCollection(String str, String str2, String str3, setOnMyLocationClickListener setonmylocationclicklistener) {
            onGetStartedClick.write((Object) str, "accountNo");
            onGetStartedClick.write((Object) str2, "productType");
            onGetStartedClick.write((Object) str3, "tilesVersion");
            onGetStartedClick.write((Object) setonmylocationclicklistener, "mailingAddress");
            this.read = str;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.MediaBrowserCompat$ItemReceiver = setonmylocationclicklistener;
        }

        public /* synthetic */ EmptyImmutableCollection(String str, String str2, setOnMyLocationClickListener setonmylocationclicklistener) {
            this(str, str2, "", setonmylocationclicklistener);
        }
    }

    private ImmutableCollection(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "tilesVersion");
        onGetStartedClick.write((Object) str2, "cardNo");
        onGetStartedClick.write((Object) str3, "selectedCardRefNo");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.write = str3;
    }

    public /* synthetic */ ImmutableCollection(byte b) {
        this("", "", "");
    }
}
