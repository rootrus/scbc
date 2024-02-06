package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.constrainedSet */
public class constrainedSet extends constrainedSortedSet {
    @SerializedName("accountHolderFullName")
    public String read;

    public constrainedSet(String str, String str2, String str3) {
        super(str, str3);
        this.read = str2;
    }
}
