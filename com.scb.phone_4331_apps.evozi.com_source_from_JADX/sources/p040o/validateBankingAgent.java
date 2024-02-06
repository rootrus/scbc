package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.dji.DeejungInstallmentTransactionFragment;

/* renamed from: o.validateBankingAgent */
public final class validateBankingAgent extends setCardElevation {
    private final Context IconCompatParcelizer;
    private final DeejungInstallmentTransactionFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final int[] read = {R.string.unbilled, R.string.billed};
    private final DeejungInstallmentTransactionFragment write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public validateBankingAgent(setTitleMarginStart settitlemarginstart, Context context, DeejungInstallmentTransactionFragment deejungInstallmentTransactionFragment, DeejungInstallmentTransactionFragment deejungInstallmentTransactionFragment2) {
        super(settitlemarginstart);
        onGetStartedClick.write((Object) settitlemarginstart, "fm");
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) deejungInstallmentTransactionFragment, "billedFragment");
        onGetStartedClick.write((Object) deejungInstallmentTransactionFragment2, "unBilledFragment");
        this.IconCompatParcelizer = context;
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungInstallmentTransactionFragment;
        this.write = deejungInstallmentTransactionFragment2;
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return this.write;
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int getCount() {
        return this.read.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.IconCompatParcelizer.getString(this.read[i]);
    }
}
