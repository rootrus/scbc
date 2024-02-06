package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.columnMap */
public class columnMap {
    @SerializedName("email")
    public String read;
    @SerializedName("mobile")
    public String write;

    public static columnMap write() {
        return new columnMap();
    }
}
