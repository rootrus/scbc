package p040o;

import android.widget.TextView;

/* renamed from: o.validateSYR2 */
public final class validateSYR2 extends validateSYR<validateSYR2K> {
    private final TextView write;

    public validateSYR2(TextView textView) {
        this.write = textView;
    }

    public final void MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super validateSYR2K> bankingAgentTransactionsDeepLinkActivity) {
        validateSYR2$MediaBrowserCompat$ItemReceiver validatesyr2_mediabrowsercompat_itemreceiver = new validateSYR2$MediaBrowserCompat$ItemReceiver(this.write, bankingAgentTransactionsDeepLinkActivity);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(validatesyr2_mediabrowsercompat_itemreceiver);
        this.write.addTextChangedListener(validatesyr2_mediabrowsercompat_itemreceiver);
    }

    public final /* synthetic */ Object write() {
        TextView textView = this.write;
        return new validateSYR2K(textView, textView.getEditableText());
    }
}
