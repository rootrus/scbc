package p040o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;

/* renamed from: o.BankingServicesDeepLinkActivity */
public final class BankingServicesDeepLinkActivity {
    private static final BankingAgentDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver = AlertController$RecycleListView.IconCompatParcelizer((Callable<BankingAgentDeepLinkActivity>) new Callable<BankingAgentDeepLinkActivity>() {
        public final /* bridge */ /* synthetic */ Object call() throws Exception {
            return IconCompatParcelizer.write;
        }
    });

    /* renamed from: o.BankingServicesDeepLinkActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer {
        static final BankingAgentDeepLinkActivity write = new CardlessDeeplinkActivity(new Handler(Looper.getMainLooper()));
    }

    public static BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver() {
        BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity = MediaBrowserCompat$CustomActionResultReceiver;
        if (bankingAgentDeepLinkActivity != null) {
            return bankingAgentDeepLinkActivity;
        }
        throw new NullPointerException("scheduler == null");
    }
}
