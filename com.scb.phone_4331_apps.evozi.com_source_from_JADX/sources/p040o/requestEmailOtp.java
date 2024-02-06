package p040o;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.bankingactions.BankingActionFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;

/* renamed from: o.requestEmailOtp */
public final /* synthetic */ class requestEmailOtp implements View.OnClickListener {
    private final /* synthetic */ BankingActionFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ requestEmailOtp(BankingActionFragment bankingActionFragment) {
        this.MediaBrowserCompat$ItemReceiver = bankingActionFragment;
    }

    public final void onClick(View view) {
        BankingActionFragment bankingActionFragment = this.MediaBrowserCompat$ItemReceiver;
        if (!bankingActionFragment.MediaBrowserCompat$CustomActionResultReceiver) {
            bankingActionFragment.MediaBrowserCompat$CustomActionResultReceiver = true;
            ZSYR2K[] zsyr2kArr = new ZSYR2K[2];
            zsyr2kArr[0] = new ZSYR2K("source", "banking_services");
            zsyr2kArr[1] = new ZSYR2K("new_insight", bankingActionFragment.IconCompatParcelizer ? "yes" : "no");
            if (bankingActionFragment.getActivity() != null) {
                ((BaseActivity) bankingActionFragment.getActivity()).scbAnalytics.write("justforyou_landing", zsyr2kArr);
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("scbeasy://justforyou/entrypoint?source=banking_services"));
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            BankingActionFragment.write(bankingActionFragment, intent);
        }
    }
}
