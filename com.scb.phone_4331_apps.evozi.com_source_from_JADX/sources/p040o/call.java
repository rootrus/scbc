package p040o;

import com.google.gson.annotations.SerializedName;
import p040o.LottieCompositionFactory;
import p040o.LottieDrawable;

/* renamed from: o.call */
public class call extends LottieCompositionFactory.C360311 {
    @SerializedName("tiles")
    public LottieDrawable.C36131 write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LottieDrawable.C36131 r2 = this.write;
        LottieDrawable.C36131 r5 = ((call) obj).write;
        if (r2 != null) {
            return r2.equals(r5);
        }
        if (r5 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        LottieDrawable.C36131 r0 = this.write;
        if (r0 != null) {
            return r0.hashCode();
        }
        return 0;
    }
}
