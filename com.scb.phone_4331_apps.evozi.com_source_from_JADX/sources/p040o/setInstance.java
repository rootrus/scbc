package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setInstance */
public class setInstance {
    @SerializedName("jobs")
    public List<evaluate> read;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        List<evaluate> list = this.read;
        List<evaluate> list2 = ((setInstance) obj).read;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<evaluate> list = this.read;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }
}
