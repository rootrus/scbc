package p040o;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* renamed from: o.ILocationSourceDelegate */
public class ILocationSourceDelegate implements Serializable {
    @SerializedName("error")
    public zza write;

    /* renamed from: o.ILocationSourceDelegate$zza */
    public class zza {
        @SerializedName("code")
        public String IconCompatParcelizer;
        @SerializedName("return")
        private String MediaBrowserCompat$ItemReceiver;
        @SerializedName("message")
        public String read;
        @SerializedName("header")
        public String write;

        public static zza MediaBrowserCompat$ItemReceiver() {
            return new zza();
        }
    }

    public static ILocationSourceDelegate write() {
        return new ILocationSourceDelegate();
    }
}
