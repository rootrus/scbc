package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ImmutableClassToInstanceMap */
public final class ImmutableClassToInstanceMap {
    @SerializedName("tilesVersion")
    public String MediaBrowserCompat$ItemReceiver;

    public ImmutableClassToInstanceMap() {
        this((byte) 0);
    }

    /* renamed from: o.ImmutableClassToInstanceMap$1 */
    public final class C34971 {
        @SerializedName("tilesVersion")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("transactionToken")
        private final String write;

        private C34971(String str, String str2) {
            onGetStartedClick.write((Object) str, "tilesVersion");
            onGetStartedClick.write((Object) str2, "transactionToken");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.write = str2;
        }

        public /* synthetic */ C34971(String str) {
            this("", str);
        }
    }

    /* renamed from: o.ImmutableClassToInstanceMap$Builder */
    public final class Builder {
        @SerializedName("encryptedPIN")
        private final String IconCompatParcelizer;
        @SerializedName("e2eeSid")
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("serverRandom")
        private final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("transactionToken")
        private final String RatingCompat;
        @SerializedName("cardNumber")
        private final String read;
        @SerializedName("pubKeyIndex")
        private final String write;

        public Builder(String str, String str2, String str3, String str4, String str5, String str6) {
            onGetStartedClick.write((Object) str, "transactionToken");
            onGetStartedClick.write((Object) str2, "cardNumber");
            onGetStartedClick.write((Object) str3, "encryptedPIN");
            onGetStartedClick.write((Object) str4, "e2eeSid");
            onGetStartedClick.write((Object) str5, "serverRandom");
            onGetStartedClick.write((Object) str6, "pubKeyIndex");
            this.RatingCompat = str;
            this.read = str2;
            this.IconCompatParcelizer = str3;
            this.MediaBrowserCompat$CustomActionResultReceiver = str4;
            this.MediaBrowserCompat$ItemReceiver = str5;
            this.write = str6;
        }
    }

    public /* synthetic */ ImmutableClassToInstanceMap(byte b) {
        this("");
    }

    private ImmutableClassToInstanceMap(String str) {
        onGetStartedClick.write((Object) str, "tilesVersion");
        this.MediaBrowserCompat$ItemReceiver = str;
    }
}
