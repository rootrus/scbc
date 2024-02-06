package p040o;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* renamed from: o.AmountDetailsSuccessAdapter$DetailViewHolder_ViewBinding */
public class AmountDetailsSuccessAdapter$DetailViewHolder_ViewBinding extends AmountDetailsSuccessAdapter$SuccessRow implements Serializable, Cloneable {
    private final Map<String, Object> MediaBrowserCompat$CustomActionResultReceiver = new ConcurrentHashMap();

    public Object IconCompatParcelizer(String str) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.get(str);
    }

    public AmountDetailsSuccessAdapter$SuccessRow_ViewBinding MediaBrowserCompat$ItemReceiver(String str, Object obj) {
        if (str == null) {
            return this;
        }
        if (obj != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.put(str, obj);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.remove(str);
        }
        return this;
    }

    public Object clone() throws CloneNotSupportedException {
        AmountDetailsSuccessAdapter$DetailViewHolder_ViewBinding amountDetailsSuccessAdapter$DetailViewHolder_ViewBinding = (AmountDetailsSuccessAdapter$DetailViewHolder_ViewBinding) super.clone();
        for (Map.Entry next : this.MediaBrowserCompat$CustomActionResultReceiver.entrySet()) {
            amountDetailsSuccessAdapter$DetailViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver((String) next.getKey(), next.getValue());
        }
        return amountDetailsSuccessAdapter$DetailViewHolder_ViewBinding;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[parameters=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("]");
        return sb.toString();
    }
}
