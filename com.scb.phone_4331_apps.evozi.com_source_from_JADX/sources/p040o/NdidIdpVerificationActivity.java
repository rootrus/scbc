package p040o;

import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;

/* renamed from: o.NdidIdpVerificationActivity */
public final class NdidIdpVerificationActivity<E> {
    public final int hashCode() {
        return 0;
    }

    public static final Object MediaBrowserCompat$ItemReceiver(Object obj, E e) {
        if (MwChangeCasaSuccessActivity.write() && !(!(e instanceof List))) {
            throw new AssertionError();
        } else if (obj == null) {
            return e;
        } else {
            if (!(obj instanceof ArrayList)) {
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(e);
                return arrayList;
            } else if (obj != null) {
                ((ArrayList) obj).add(e);
                return obj;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<E> /* = java.util.ArrayList<E> */");
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof NdidIdpVerificationActivity) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) null, (Object) null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InlineList(holder=");
        sb.append((Object) null);
        sb.append(")");
        return sb.toString();
    }
}
