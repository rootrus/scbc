package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.sortEntries */
public class sortEntries {
    @SerializedName("transactionToken")
    public String write;

    public static sortEntries read() {
        return new sortEntries();
    }
}
