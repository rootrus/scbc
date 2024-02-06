package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ImmutableMap */
public abstract class ImmutableMap {
    @SerializedName("nickname")
    protected String IconCompatParcelizer;

    /* renamed from: o.ImmutableMap$Builder */
    public class Builder extends ImmutableMap {
        @SerializedName("cardRefNo")
        private String MediaBrowserCompat$ItemReceiver;

        public Builder(String str, String str2) {
            this.MediaBrowserCompat$ItemReceiver = str;
            this.IconCompatParcelizer = str2;
        }
    }

    /* renamed from: o.ImmutableMap$SerializedForm */
    public class SerializedForm extends ImmutableMap {
        @SerializedName("clientNo")
        private String MediaBrowserCompat$ItemReceiver;

        public SerializedForm(String str, String str2) {
            this.MediaBrowserCompat$ItemReceiver = str;
            this.IconCompatParcelizer = str2;
        }
    }
}
