package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ImmutableEnumSet */
public final class ImmutableEnumSet {
    @SerializedName("tilesVersion")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("cardRefNo")
    private String read;

    /* renamed from: o.ImmutableEnumSet$EnumSerializedForm */
    public final class EnumSerializedForm {
        @SerializedName("foreignCurrency")
        private final String IconCompatParcelizer;
        @SerializedName("conversionTypelocalCurrency")
        private final String MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnumSerializedForm)) {
                return false;
            }
            EnumSerializedForm enumSerializedForm = (EnumSerializedForm) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) enumSerializedForm.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) enumSerializedForm.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
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
            sb.append("PrepaidTravelWalletDisplayRateRequest(foreignCurrency=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", conversionTypelocalCurrency=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public EnumSerializedForm(String str, String str2) {
            onGetStartedClick.write((Object) str, "foreignCurrency");
            onGetStartedClick.write((Object) str2, "conversionTypelocalCurrency");
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
        }
    }

    private ImmutableEnumSet(String str, String str2) {
        onGetStartedClick.write((Object) str, "cardRefNo");
        onGetStartedClick.write((Object) str2, "tilesVersion");
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }

    public /* synthetic */ ImmutableEnumSet(String str) {
        this(str, "");
    }
}
