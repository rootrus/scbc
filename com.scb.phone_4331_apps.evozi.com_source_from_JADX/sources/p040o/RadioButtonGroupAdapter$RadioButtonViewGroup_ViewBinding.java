package p040o;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.RadioButtonGroupAdapter$RadioButtonViewGroup_ViewBinding */
public final class RadioButtonGroupAdapter$RadioButtonViewGroup_ViewBinding implements CreditCardBilledDetailAdapter$ParentViewHolder {
    private final Map<String, Object> IconCompatParcelizer;
    private final CreditCardBilledDetailAdapter$ParentViewHolder MediaBrowserCompat$CustomActionResultReceiver;

    public RadioButtonGroupAdapter$RadioButtonViewGroup_ViewBinding() {
        this((byte) 0);
    }

    private RadioButtonGroupAdapter$RadioButtonViewGroup_ViewBinding(byte b) {
        this.IconCompatParcelizer = new ConcurrentHashMap();
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
    }

    public final Object MediaBrowserCompat$ItemReceiver(String str) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, "Id");
        return this.IconCompatParcelizer.get(str);
    }

    public final void write(String str, Object obj) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, "Id");
        if (obj != null) {
            this.IconCompatParcelizer.put(str, obj);
        } else {
            this.IconCompatParcelizer.remove(str);
        }
    }

    public final String toString() {
        return this.IconCompatParcelizer.toString();
    }
}
