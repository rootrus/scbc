package p040o;

import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.SensitiveCSentActivity */
public final class SensitiveCSentActivity {
    private final Map<Class, DebitTransactionAdapter$ChildViewHolder_ViewBinding> IconCompatParcelizer = new HashMap();
    private final Map<Class, CreditCardDetailActivity> MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
    private final Map<Class, Enum> MediaBrowserCompat$ItemReceiver;
    private final List<Class> write = new ArrayList();

    public SensitiveCSentActivity() {
        new ArrayList();
        new DebitCardConfirmPinActivity();
        new lambda$onCreate$0$DebitCardCoachMarkActivity();
        this.MediaBrowserCompat$ItemReceiver = new HashMap();
        TimeZone.getDefault();
    }

    public final GsonBuilder MediaBrowserCompat$CustomActionResultReceiver() {
        Collections.newSetFromMap(new ConcurrentHashMap());
        GsonBuilder gsonBuilder = new GsonBuilder();
        for (Class cls : this.write) {
            gsonBuilder.registerTypeAdapterFactory(new DebitCardDetailActivity_ViewBinding(this.MediaBrowserCompat$CustomActionResultReceiver.get(cls)));
        }
        for (Map.Entry next : this.MediaBrowserCompat$ItemReceiver.entrySet()) {
            gsonBuilder.registerTypeAdapterFactory(new DebitCardDetailActivity((Class) next.getKey(), (Enum) next.getValue()));
        }
        gsonBuilder.registerTypeAdapterFactory(new DebitTransactionAdapter$ParentViewHolder());
        gsonBuilder.registerTypeAdapterFactory(new DebitTransactionAdapter$ChildViewHolder(this.IconCompatParcelizer));
        return gsonBuilder;
    }
}
