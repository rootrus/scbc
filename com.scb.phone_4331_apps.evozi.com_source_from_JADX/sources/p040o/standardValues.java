package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.standardValues */
public class standardValues {
    @SerializedName("imageContent")
    public String read;

    public static standardValues IconCompatParcelizer() {
        return new standardValues();
    }
}
