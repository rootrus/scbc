package p040o;

import p040o.Api;

/* renamed from: o.BiConsumer */
public final /* synthetic */ class BiConsumer implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindDirectDebitInputMainFragment IconCompatParcelizer;

    public /* synthetic */ BiConsumer(FragmentBuilder_BindDirectDebitInputMainFragment fragmentBuilder_BindDirectDebitInputMainFragment) {
        this.IconCompatParcelizer = fragmentBuilder_BindDirectDebitInputMainFragment;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(Api.ApiOptions.NoOptions.MediaBrowserCompat$ItemReceiver((JsonUtf8Reader) obj));
    }
}
