package p040o;

import java.util.ArrayList;
import p040o.DeepLinkUri;
import p040o.setTransactionSuccessful;

/* renamed from: o.setAppName */
public final class setAppName extends FragmentBuilder_BindSummaryFragment {
    public static setTransactionSuccessful MediaBrowserCompat$ItemReceiver(DeepLinkUri.Builder builder) {
        ArrayList arrayList = new ArrayList();
        for (DeepLinkUri.Builder.IconCompatParcelizer iconCompatParcelizer : builder.read) {
            arrayList.add(new setTransactionSuccessful.write(iconCompatParcelizer.write));
        }
        setTransactionSuccessful settransactionsuccessful = new setTransactionSuccessful(arrayList);
        settransactionsuccessful.read(IconCompatParcelizer((setCurrentItemInternal) builder));
        return settransactionsuccessful;
    }
}
