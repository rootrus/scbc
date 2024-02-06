package p040o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.ChequeDetailListAdapter$ChequeItemHolder */
public abstract class ChequeDetailListAdapter$ChequeItemHolder implements PrivacyManagementLandingActivity {
    public AccountTargetAdapter$AccountViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;
    @Deprecated
    public AmountDetailsSuccessAdapter$SuccessRow_ViewBinding MediaBrowserCompat$MediaItem;

    @Deprecated
    private ChequeDetailListAdapter$ChequeItemHolder(byte b) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new AccountTargetAdapter$AccountViewHolder_ViewBinding();
        this.MediaBrowserCompat$MediaItem = null;
    }

    public ChequeDetailListAdapter$ChequeItemHolder() {
        this((byte) 0);
    }

    public final boolean read(String str) {
        AccountTargetAdapter$AccountViewHolder_ViewBinding accountTargetAdapter$AccountViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
        for (int i = 0; i < accountTargetAdapter$AccountViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.size(); i++) {
            if (accountTargetAdapter$AccountViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.get(i).IconCompatParcelizer().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public final PrepaidRequestMarketConductActivity[] MediaBrowserCompat$ItemReceiver(String str) {
        AccountTargetAdapter$AccountViewHolder_ViewBinding accountTargetAdapter$AccountViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
        ArrayList arrayList = null;
        for (int i = 0; i < accountTargetAdapter$AccountViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.size(); i++) {
            PrepaidRequestMarketConductActivity prepaidRequestMarketConductActivity = accountTargetAdapter$AccountViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.get(i);
            if (prepaidRequestMarketConductActivity.IconCompatParcelizer().equalsIgnoreCase(str)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(prepaidRequestMarketConductActivity);
            }
        }
        return arrayList != null ? (PrepaidRequestMarketConductActivity[]) arrayList.toArray(new PrepaidRequestMarketConductActivity[arrayList.size()]) : AccountTargetAdapter$AccountViewHolder_ViewBinding.IconCompatParcelizer;
    }

    public final PrepaidRequestMarketConductActivity MediaBrowserCompat$CustomActionResultReceiver(String str) {
        AccountTargetAdapter$AccountViewHolder_ViewBinding accountTargetAdapter$AccountViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
        for (int i = 0; i < accountTargetAdapter$AccountViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.size(); i++) {
            PrepaidRequestMarketConductActivity prepaidRequestMarketConductActivity = accountTargetAdapter$AccountViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.get(i);
            if (prepaidRequestMarketConductActivity.IconCompatParcelizer().equalsIgnoreCase(str)) {
                return prepaidRequestMarketConductActivity;
            }
        }
        return null;
    }

    public final PrepaidRequestMarketConductActivity[] aV_() {
        List<PrepaidRequestMarketConductActivity> list = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        return (PrepaidRequestMarketConductActivity[]) list.toArray(new PrepaidRequestMarketConductActivity[list.size()]);
    }

    public final void MediaBrowserCompat$ItemReceiver(PrepaidRequestMarketConductActivity prepaidRequestMarketConductActivity) {
        AccountTargetAdapter$AccountViewHolder_ViewBinding accountTargetAdapter$AccountViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (prepaidRequestMarketConductActivity != null) {
            accountTargetAdapter$AccountViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.add(prepaidRequestMarketConductActivity);
        }
    }

    public final void IconCompatParcelizer(String str, String str2) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, "Header name");
        AccountTargetAdapter$AccountViewHolder_ViewBinding accountTargetAdapter$AccountViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
        accountTargetAdapter$AccountViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.add(new ManageChequeAdapter$ManageChequeHolder_ViewBinding(str, str2));
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, "Header name");
        AccountTargetAdapter$AccountViewHolder_ViewBinding accountTargetAdapter$AccountViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
        ManageChequeAdapter$ManageChequeHolder_ViewBinding manageChequeAdapter$ManageChequeHolder_ViewBinding = new ManageChequeAdapter$ManageChequeHolder_ViewBinding(str, str2);
        for (int i = 0; i < accountTargetAdapter$AccountViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.size(); i++) {
            if (accountTargetAdapter$AccountViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.get(i).IconCompatParcelizer().equalsIgnoreCase(manageChequeAdapter$ManageChequeHolder_ViewBinding.IconCompatParcelizer())) {
                accountTargetAdapter$AccountViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.set(i, manageChequeAdapter$ManageChequeHolder_ViewBinding);
                return;
            }
        }
        accountTargetAdapter$AccountViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.add(manageChequeAdapter$ManageChequeHolder_ViewBinding);
    }

    public final void IconCompatParcelizer(PrepaidRequestMarketConductActivity[] prepaidRequestMarketConductActivityArr) {
        AccountTargetAdapter$AccountViewHolder_ViewBinding accountTargetAdapter$AccountViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
        accountTargetAdapter$AccountViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.clear();
        if (prepaidRequestMarketConductActivityArr != null) {
            Collections.addAll(accountTargetAdapter$AccountViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver, prepaidRequestMarketConductActivityArr);
        }
    }

    public final PrepaidResetPinSuccessActivity RatingCompat() {
        return new PaymentInfoAdapter$ViewTypeTextHolder_ViewBinding(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, (String) null);
    }

    public final PrepaidResetPinSuccessActivity write(String str) {
        return new PaymentInfoAdapter$ViewTypeTextHolder_ViewBinding(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, str);
    }

    @Deprecated
    public final AmountDetailsSuccessAdapter$SuccessRow_ViewBinding write() {
        if (this.MediaBrowserCompat$MediaItem == null) {
            this.MediaBrowserCompat$MediaItem = new AmountDetailsSuccessAdapter$DetailViewHolder_ViewBinding();
        }
        return this.MediaBrowserCompat$MediaItem;
    }

    @Deprecated
    public final void IconCompatParcelizer(AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) {
        this.MediaBrowserCompat$MediaItem = (AmountDetailsSuccessAdapter$SuccessRow_ViewBinding) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "HTTP parameters");
    }
}
