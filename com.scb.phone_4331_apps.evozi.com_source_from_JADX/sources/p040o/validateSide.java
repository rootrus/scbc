package p040o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* renamed from: o.validateSide */
public final class validateSide extends validateSYR<CharSequence> {
    private final TextView write;

    public validateSide(TextView textView) {
        this.write = textView;
    }

    public final void MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super CharSequence> bankingAgentTransactionsDeepLinkActivity) {
        read read2 = new read(this.write, bankingAgentTransactionsDeepLinkActivity);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(read2);
        this.write.addTextChangedListener(read2);
    }

    /* renamed from: o.validateSide$read */
    static final class read extends BaseDeepLinkActivity implements TextWatcher {
        private final BankingAgentTransactionsDeepLinkActivity<? super CharSequence> MediaBrowserCompat$CustomActionResultReceiver;
        private final TextView read;

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        read(TextView textView, BankingAgentTransactionsDeepLinkActivity<? super CharSequence> bankingAgentTransactionsDeepLinkActivity) {
            this.read = textView;
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!isDisposed()) {
                this.MediaBrowserCompat$CustomActionResultReceiver.onNext(charSequence);
            }
        }

        public final void write() {
            this.read.removeTextChangedListener(this);
        }
    }

    public final /* synthetic */ Object write() {
        return this.write.getText();
    }
}
