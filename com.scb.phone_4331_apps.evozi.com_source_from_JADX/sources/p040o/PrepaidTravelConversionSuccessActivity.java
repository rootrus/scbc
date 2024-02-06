package p040o;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/* renamed from: o.PrepaidTravelConversionSuccessActivity */
public abstract class PrepaidTravelConversionSuccessActivity<L, R> implements Map.Entry<L, R>, Comparable<PrepaidTravelConversionSuccessActivity<L, R>>, Serializable {
    public abstract R IconCompatParcelizer();

    public abstract L write();

    public final L getKey() {
        return write();
    }

    public R getValue() {
        return IconCompatParcelizer();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!Objects.equals(getKey(), entry.getKey()) || !Objects.equals(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = getKey() == null ? 0 : getKey().hashCode();
        if (getValue() != null) {
            i = getValue().hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(write());
        sb.append(',');
        sb.append(IconCompatParcelizer());
        sb.append(')');
        return sb.toString();
    }
}
