package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/* renamed from: o.orderValuesBy */
public class orderValuesBy {
    @SerializedName("email")
    private String IconCompatParcelizer;
    @SerializedName("themeFlag")
    public String read;
    @SerializedName("profilePhotoPath")
    public String write;

    public static orderValuesBy read() {
        return new orderValuesBy();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        orderValuesBy ordervaluesby = (orderValuesBy) obj;
        if (!Objects.equals(this.write, ordervaluesby.write) || !Objects.equals(this.read, ordervaluesby.read) || !Objects.equals(this.IconCompatParcelizer, ordervaluesby.IconCompatParcelizer)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.write, this.read, this.IconCompatParcelizer});
    }
}
