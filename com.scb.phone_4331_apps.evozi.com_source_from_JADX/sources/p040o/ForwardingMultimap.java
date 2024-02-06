package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.ForwardingMultimap */
public class ForwardingMultimap {
    @SerializedName("parameters")
    private List<String> read;

    public ForwardingMultimap(List<String> list) {
        this.read = list;
    }
}
