package p040o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* renamed from: o.validateSYR2$MediaBrowserCompat$ItemReceiver */
final class validateSYR2$MediaBrowserCompat$ItemReceiver extends BaseDeepLinkActivity implements TextWatcher {
    private final BankingAgentTransactionsDeepLinkActivity<? super validateSYR2K> read;
    private final TextView write;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    validateSYR2$MediaBrowserCompat$ItemReceiver(TextView textView, BankingAgentTransactionsDeepLinkActivity<? super validateSYR2K> bankingAgentTransactionsDeepLinkActivity) {
        this.write = textView;
        this.read = bankingAgentTransactionsDeepLinkActivity;
    }

    public final void afterTextChanged(Editable editable) {
        this.read.onNext(new validateSYR2K(this.write, editable));
    }

    public final void write() {
        this.write.removeTextChangedListener(this);
    }
}
