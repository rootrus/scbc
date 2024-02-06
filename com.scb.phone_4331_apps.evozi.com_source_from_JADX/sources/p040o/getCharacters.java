package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getCharacters */
public class getCharacters {
    @SerializedName("stage")
    public String IconCompatParcelizer;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.IconCompatParcelizer;
        String str2 = ((getCharacters) obj).IconCompatParcelizer;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.IconCompatParcelizer;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
