package com.scb.phone.view.adapter.merchant.bankaccount;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.CrashlyticsReport;
import p040o.onStart;

public final class BankAccountAdapter extends RecyclerView.IconCompatParcelizer<BankAccountViewHolder> {
    public List<CrashlyticsReport.FilesPayload.File.Builder> MediaBrowserCompat$ItemReceiver;
    public int read = -1;
    public write write;

    public interface write {
        void MediaBrowserCompat$CustomActionResultReceiver();
    }

    public class BankAccountViewHolder_ViewBinding implements Unbinder {
        private BankAccountViewHolder IconCompatParcelizer;

        public BankAccountViewHolder_ViewBinding(BankAccountViewHolder bankAccountViewHolder, View view) {
            this.IconCompatParcelizer = bankAccountViewHolder;
            bankAccountViewHolder.layoutRoot = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_root, "field 'layoutRoot'", LinearLayout.class);
            bankAccountViewHolder.radioButton = (RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radio_mw_check, "field 'radioButton'", RadioButton.class);
            bankAccountViewHolder.accountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mw_account_number, "field 'accountNumber'", TextView.class);
            bankAccountViewHolder.accountNickName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mw_account_nickname, "field 'accountNickName'", TextView.class);
            bankAccountViewHolder.viewLineBorder = onStart.IconCompatParcelizer(view, R.id.line_mw_border, "field 'viewLineBorder'");
        }

        public final void read() {
            BankAccountViewHolder bankAccountViewHolder = this.IconCompatParcelizer;
            if (bankAccountViewHolder != null) {
                this.IconCompatParcelizer = null;
                bankAccountViewHolder.layoutRoot = null;
                bankAccountViewHolder.radioButton = null;
                bankAccountViewHolder.accountNumber = null;
                bankAccountViewHolder.accountNickName = null;
                bankAccountViewHolder.viewLineBorder = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        BankAccountViewHolder.read((BankAccountViewHolder) setcontentview, this.MediaBrowserCompat$ItemReceiver.get(i));
    }

    public class BankAccountViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView accountNickName;
        @BindView
        TextView accountNumber;
        @BindView
        LinearLayout layoutRoot;
        @BindView
        RadioButton radioButton;
        @BindView
        View viewLineBorder;

        public BankAccountViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static /* synthetic */ void read(com.scb.phone.view.adapter.merchant.bankaccount.BankAccountAdapter.BankAccountViewHolder r5, p040o.CrashlyticsReport.FilesPayload.File.Builder r6) {
            /*
                android.widget.TextView r0 = r5.accountNumber
                java.lang.String r1 = r6.MediaSessionCompat$Token
                r0.setText(r1)
                java.lang.String r0 = r6.RatingCompat
                if (r0 == 0) goto L_0x0016
                java.lang.String r0 = r6.RatingCompat
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x0016
                java.lang.String r6 = r6.RatingCompat
                goto L_0x0018
            L_0x0016:
                java.lang.String r6 = r6.ParcelableVolumeInfo
            L_0x0018:
                android.widget.TextView r0 = r5.accountNickName
                r0.setText(r6)
                android.widget.RadioButton r6 = r5.radioButton
                com.scb.phone.view.adapter.merchant.bankaccount.BankAccountAdapter r0 = com.scb.phone.view.adapter.merchant.bankaccount.BankAccountAdapter.this
                int r0 = r0.read
                r1 = 1
                r2 = -1
                r3 = 0
                if (r0 < 0) goto L_0x003e
                com.scb.phone.view.adapter.merchant.bankaccount.BankAccountAdapter r0 = com.scb.phone.view.adapter.merchant.bankaccount.BankAccountAdapter.this
                int r0 = r0.read
                androidx.recyclerview.widget.RecyclerView r4 = r5.MediaMetadataCompat
                if (r4 != 0) goto L_0x0036
                r4 = r2
                goto L_0x003a
            L_0x0036:
                int r4 = r4.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView.setContentView) r5)
            L_0x003a:
                if (r0 != r4) goto L_0x003e
                r0 = r1
                goto L_0x003f
            L_0x003e:
                r0 = r3
            L_0x003f:
                r6.setChecked(r0)
                android.view.View r6 = r5.viewLineBorder
                androidx.recyclerview.widget.RecyclerView r0 = r5.MediaMetadataCompat
                if (r0 != 0) goto L_0x0049
                goto L_0x004d
            L_0x0049:
                int r2 = r0.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView.setContentView) r5)
            L_0x004d:
                com.scb.phone.view.adapter.merchant.bankaccount.BankAccountAdapter r0 = com.scb.phone.view.adapter.merchant.bankaccount.BankAccountAdapter.this
                java.util.List r0 = r0.MediaBrowserCompat$ItemReceiver
                int r0 = r0.size()
                int r0 = r0 - r1
                if (r2 != r0) goto L_0x005c
                r3 = 8
            L_0x005c:
                r6.setVisibility(r3)
                android.widget.LinearLayout r6 = r5.layoutRoot
                o.getLatestLoanOfferStatus r0 = new o.getLatestLoanOfferStatus
                r0.<init>(r5)
                r6.setOnClickListener(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.adapter.merchant.bankaccount.BankAccountAdapter.BankAccountViewHolder.read(com.scb.phone.view.adapter.merchant.bankaccount.BankAccountAdapter$BankAccountViewHolder, o.CrashlyticsReport$FilesPayload$File$Builder):void");
        }
    }

    public final int IconCompatParcelizer() {
        List<CrashlyticsReport.FilesPayload.File.Builder> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new BankAccountViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f80922131493318, viewGroup, false));
    }
}
