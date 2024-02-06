package p040o;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.accountsummary.AccountSummaryFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;

/* renamed from: o.getAllDemoTiles */
public final /* synthetic */ class getAllDemoTiles implements View.OnClickListener {
    private final /* synthetic */ AccountSummaryFragment write;

    public /* synthetic */ getAllDemoTiles(AccountSummaryFragment accountSummaryFragment) {
        this.write = accountSummaryFragment;
    }

    public final void onClick(View view) {
        AccountSummaryFragment accountSummaryFragment = this.write;
        if (!accountSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver) {
            accountSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver = true;
            ZSYR2K[] zsyr2kArr = new ZSYR2K[2];
            zsyr2kArr[0] = new ZSYR2K("source", "account_summary");
            zsyr2kArr[1] = new ZSYR2K("new_insight", accountSummaryFragment.IconCompatParcelizer ? "yes" : "no");
            if (accountSummaryFragment.getActivity() != null) {
                ((BaseActivity) accountSummaryFragment.getActivity()).scbAnalytics.write("justforyou_landing", zsyr2kArr);
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("scbeasy://justforyou/entrypoint?source=account_summary"));
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            AccountSummaryFragment.IconCompatParcelizer(accountSummaryFragment, intent);
        }
    }
}
