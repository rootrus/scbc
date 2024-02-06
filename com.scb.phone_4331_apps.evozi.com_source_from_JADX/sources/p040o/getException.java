package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getException */
public class getException extends getBitmap {
    @SerializedName("offers")
    public List<getWidth> RatingCompat;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        List<getWidth> list = this.RatingCompat;
        List<getWidth> list2 = ((getException) obj).RatingCompat;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = super.hashCode();
        List<getWidth> list = this.RatingCompat;
        return (hashCode * 31) + (list != null ? list.hashCode() : 0);
    }
}
