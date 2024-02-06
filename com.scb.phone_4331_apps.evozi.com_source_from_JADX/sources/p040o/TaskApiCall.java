package p040o;

import retrofit2.adapter.rxjava2.Result;

/* renamed from: o.TaskApiCall */
public final class TaskApiCall extends FragmentBuilder_BindSummaryFragment {

    /* renamed from: o.TaskApiCall$Builder */
    public final /* synthetic */ class Builder implements DebitCardMarketConductDeepLinkActivity {
        private final /* synthetic */ zabr$MediaBrowserCompat$CustomActionResultReceiver read;

        public /* synthetic */ Builder(zabr$MediaBrowserCompat$CustomActionResultReceiver zabr_mediabrowsercompat_customactionresultreceiver) {
            this.read = zabr_mediabrowsercompat_customactionresultreceiver;
        }

        public final void IconCompatParcelizer(Object obj) {
            zabr$MediaBrowserCompat$CustomActionResultReceiver zabr_mediabrowsercompat_customactionresultreceiver = this.read;
            if (obj instanceof setCurrentItemInternal) {
                zabr.MediaBrowserCompat$ItemReceiver((setCurrentItemInternal) obj);
            } else if (obj instanceof Result) {
                Result result = (Result) obj;
                if (result.isError()) {
                    throw zabr.MediaBrowserCompat$CustomActionResultReceiver(zabr_mediabrowsercompat_customactionresultreceiver.write, result.error());
                }
            }
        }
    }
}
