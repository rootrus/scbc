package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.Collections2 */
public class Collections2 {
    @SerializedName("referenceNo2")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("payBy")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("referenceNo1")
    public String read;
    @SerializedName("accountTo")
    public String write;

    /* renamed from: o.Collections2$FilteredCollection */
    public class FilteredCollection {
        @SerializedName("cardRefNo")
        public String write;

        public static FilteredCollection MediaBrowserCompat$CustomActionResultReceiver() {
            return new FilteredCollection();
        }
    }

    /* renamed from: o.Collections2$TransformedCollection */
    public class TransformedCollection {
        @SerializedName("cardRefNo")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("stmtCycleNo")
        public Integer read;

        public static TransformedCollection write() {
            return new TransformedCollection();
        }
    }

    public static Collections2 MediaBrowserCompat$CustomActionResultReceiver() {
        return new Collections2();
    }
}
