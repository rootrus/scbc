package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import kotlin.TypeCastException;

/* renamed from: o.nextDouble */
public final class nextDouble {
    @SerializedName("formattedCurrentAddress")
    public final String[] IconCompatParcelizer;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressFormattedCurrentAddressResponseEntity(formattedCurrentAddress=");
        sb.append(Arrays.toString(this.IconCompatParcelizer));
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getClass(), (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            nextDouble nextdouble = (nextDouble) obj;
            String[] strArr = this.IconCompatParcelizer;
            if (strArr != null) {
                String[] strArr2 = nextdouble.IconCompatParcelizer;
                if (strArr2 != null && Arrays.equals(strArr, strArr2)) {
                    return true;
                }
                return false;
            } else if (nextdouble.IconCompatParcelizer != null) {
                return false;
            }
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.data.entity.mailingaddress.MailingAddressFormattedCurrentAddressResponseEntity");
    }

    public final int hashCode() {
        String[] strArr = this.IconCompatParcelizer;
        if (strArr != null) {
            return Arrays.hashCode(strArr);
        }
        return 0;
    }
}
