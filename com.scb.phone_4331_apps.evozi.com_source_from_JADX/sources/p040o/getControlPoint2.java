package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import kotlin.TypeCastException;

/* renamed from: o.getControlPoint2 */
public final class getControlPoint2 {
    @SerializedName("applicationUuid")
    private final String IconCompatParcelizer;
    @SerializedName("txn")
    private final String[] MediaBrowserCompat$ItemReceiver;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlPromptpayVerifyCode(applicationUuid=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", txn=");
        sb.append(Arrays.toString(this.MediaBrowserCompat$ItemReceiver));
        sb.append(")");
        return sb.toString();
    }

    public getControlPoint2(String str, String[] strArr) {
        onGetStartedClick.write((Object) str, "applicationUuid");
        onGetStartedClick.write((Object) strArr, "txn");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getClass(), (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            getControlPoint2 getcontrolpoint2 = (getControlPoint2) obj;
            if (!(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getcontrolpoint2.IconCompatParcelizer)) && Arrays.equals(this.MediaBrowserCompat$ItemReceiver, getcontrolpoint2.MediaBrowserCompat$ItemReceiver)) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.data.entity.hml.HmlPromptpayVerifyCode");
    }

    public final int hashCode() {
        return (this.IconCompatParcelizer.hashCode() * 31) + Arrays.hashCode(this.MediaBrowserCompat$ItemReceiver);
    }
}
