package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.orderKeysBy */
public class orderKeysBy {
    @SerializedName("nickname")
    private String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ orderKeysBy(write write2, byte b) {
        this(write2);
    }

    private orderKeysBy(write write2) {
        this.MediaBrowserCompat$ItemReceiver = write2.IconCompatParcelizer;
    }

    public static write read() {
        return new write((byte) 0);
    }

    /* renamed from: o.orderKeysBy$write */
    public static final class write {
        public String IconCompatParcelizer;

        /* synthetic */ write(byte b) {
            this();
        }

        private write() {
        }
    }
}
