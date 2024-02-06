package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.copyEntry */
public class copyEntry {
    @SerializedName("transactionToken")
    public String write;

    public static copyEntry IconCompatParcelizer() {
        return new copyEntry();
    }
}
