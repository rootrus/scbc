package p040o;

import java.util.List;

/* renamed from: o.ServiceAtBankingAgentActivity */
public final /* synthetic */ class ServiceAtBankingAgentActivity implements Runnable {
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ServiceAtBankingAgentActivity(List list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void run() {
        for (FragmentBuilder_BindIpoTabFragment MediaBrowserCompat$ItemReceiver2 : this.MediaBrowserCompat$ItemReceiver) {
            MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver();
        }
    }
}
