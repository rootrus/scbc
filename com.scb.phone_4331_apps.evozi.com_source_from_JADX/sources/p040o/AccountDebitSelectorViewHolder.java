package p040o;

import java.util.Vector;

/* renamed from: o.AccountDebitSelectorViewHolder */
public class AccountDebitSelectorViewHolder implements AccountEStatementViewHolder {
    Vector MediaBrowserCompat$ItemReceiver = new Vector();

    public final void MediaBrowserCompat$ItemReceiver(int i, AccountDebitSelectorViewHolder_ViewBinding accountDebitSelectorViewHolder_ViewBinding) {
        AccountDebitSelectorViewHolder_ViewBinding accountDebitSelectorViewHolder_ViewBinding2 = (AccountDebitSelectorViewHolder_ViewBinding) this.MediaBrowserCompat$ItemReceiver.elementAt(i);
        accountDebitSelectorViewHolder_ViewBinding.f5805x50fd9e4a = accountDebitSelectorViewHolder_ViewBinding2.f5805x50fd9e4a;
        accountDebitSelectorViewHolder_ViewBinding.MediaSessionCompat$ResultReceiverWrapper = accountDebitSelectorViewHolder_ViewBinding2.MediaSessionCompat$ResultReceiverWrapper;
        accountDebitSelectorViewHolder_ViewBinding.MediaBrowserCompat$MediaItem = accountDebitSelectorViewHolder_ViewBinding2.MediaBrowserCompat$MediaItem;
        accountDebitSelectorViewHolder_ViewBinding.MediaSessionCompat$QueueItem = accountDebitSelectorViewHolder_ViewBinding2.MediaSessionCompat$QueueItem;
        accountDebitSelectorViewHolder_ViewBinding.RatingCompat = accountDebitSelectorViewHolder_ViewBinding2.RatingCompat;
        accountDebitSelectorViewHolder_ViewBinding.MediaSessionCompat$Token = accountDebitSelectorViewHolder_ViewBinding2.MediaBrowserCompat$ItemReceiver();
    }

    private Integer MediaBrowserCompat$CustomActionResultReceiver(String str) {
        for (int i = 0; i < this.MediaBrowserCompat$ItemReceiver.size(); i++) {
            if (str.equals(((AccountDebitSelectorViewHolder_ViewBinding) this.MediaBrowserCompat$ItemReceiver.elementAt(i)).f5805x50fd9e4a)) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final void read(AccountDebitSelectorViewHolder_ViewBinding accountDebitSelectorViewHolder_ViewBinding) {
        this.MediaBrowserCompat$ItemReceiver.addElement(accountDebitSelectorViewHolder_ViewBinding);
    }

    public final void write(String str, Object obj) {
        AccountDebitSelectorViewHolder_ViewBinding accountDebitSelectorViewHolder_ViewBinding = new AccountDebitSelectorViewHolder_ViewBinding();
        accountDebitSelectorViewHolder_ViewBinding.f5805x50fd9e4a = str;
        accountDebitSelectorViewHolder_ViewBinding.MediaSessionCompat$ResultReceiverWrapper = null;
        accountDebitSelectorViewHolder_ViewBinding.MediaSessionCompat$QueueItem = obj == null ? AccountRemarkViewHolder.MediaBrowserCompat$ItemReceiver : obj.getClass();
        accountDebitSelectorViewHolder_ViewBinding.MediaSessionCompat$Token = obj;
        this.MediaBrowserCompat$ItemReceiver.addElement(accountDebitSelectorViewHolder_ViewBinding);
    }

    /* access modifiers changed from: protected */
    public final boolean IconCompatParcelizer(AccountDebitSelectorViewHolder accountDebitSelectorViewHolder) {
        Object obj;
        int size = this.MediaBrowserCompat$ItemReceiver.size();
        if (size != accountDebitSelectorViewHolder.MediaBrowserCompat$ItemReceiver.size()) {
            return false;
        }
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= size) {
                return true;
            }
            AccountDebitSelectorViewHolder_ViewBinding accountDebitSelectorViewHolder_ViewBinding = (AccountDebitSelectorViewHolder_ViewBinding) this.MediaBrowserCompat$ItemReceiver.elementAt(i);
            Object MediaBrowserCompat$ItemReceiver2 = accountDebitSelectorViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver();
            if (accountDebitSelectorViewHolder.MediaBrowserCompat$CustomActionResultReceiver(accountDebitSelectorViewHolder_ViewBinding.f5805x50fd9e4a) == null) {
                z = false;
            }
            if (!z) {
                return false;
            }
            Integer MediaBrowserCompat$CustomActionResultReceiver = accountDebitSelectorViewHolder.MediaBrowserCompat$CustomActionResultReceiver(accountDebitSelectorViewHolder_ViewBinding.f5805x50fd9e4a);
            if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                obj = ((AccountDebitSelectorViewHolder_ViewBinding) accountDebitSelectorViewHolder.MediaBrowserCompat$ItemReceiver.elementAt(MediaBrowserCompat$CustomActionResultReceiver.intValue())).MediaBrowserCompat$ItemReceiver();
            } else {
                obj = null;
            }
            if (!MediaBrowserCompat$ItemReceiver2.equals(obj)) {
                return false;
            }
            i++;
        }
    }
}
