package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.OnClick */
public class OnClick {
    @SerializedName("creditCardCategories")
    public final String write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.write;
        String str2 = ((OnClick) obj).write;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.write;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
