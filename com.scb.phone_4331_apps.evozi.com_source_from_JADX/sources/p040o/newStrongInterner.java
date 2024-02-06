package p040o;

import com.google.gson.annotations.SerializedName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: o.newStrongInterner */
public class newStrongInterner {
    @SerializedName("barcode")
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("tilesVersion")
    public String MediaBrowserCompat$ItemReceiver;

    public static newStrongInterner IconCompatParcelizer() {
        return new newStrongInterner();
    }

    private newStrongInterner() {
    }

    public final newStrongInterner MediaBrowserCompat$ItemReceiver(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        try {
            this.MediaBrowserCompat$CustomActionResultReceiver = URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            onCheckBoxClick.write((Throwable) e);
        }
        return this;
    }
}
