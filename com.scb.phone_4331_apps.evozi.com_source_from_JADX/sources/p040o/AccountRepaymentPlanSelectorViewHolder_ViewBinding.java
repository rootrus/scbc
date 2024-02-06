package p040o;

import java.io.IOException;
import org.xmlpull.repackaged.p103v1.XmlPullParserException;

/* renamed from: o.AccountRepaymentPlanSelectorViewHolder_ViewBinding */
final class AccountRepaymentPlanSelectorViewHolder_ViewBinding implements AccountHeaderViewHolder {
    AccountRepaymentPlanSelectorViewHolder_ViewBinding() {
    }

    public final Object readInstance(HistoryAdapter$GroupErrorViewHolder_ViewBinding historyAdapter$GroupErrorViewHolder_ViewBinding, String str, String str2, AccountRemarkViewHolder accountRemarkViewHolder) throws IOException, XmlPullParserException {
        String MediaSessionCompat$ResultReceiverWrapper = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$ResultReceiverWrapper();
        char charAt = str2.charAt(0);
        if (charAt == 'b') {
            return new Boolean(LendingIssuerAdapter$IssuerViewHolder_ViewBinding.IconCompatParcelizer(MediaSessionCompat$ResultReceiverWrapper));
        }
        if (charAt == 'i') {
            return new Integer(Integer.parseInt(MediaSessionCompat$ResultReceiverWrapper));
        }
        if (charAt == 'l') {
            return new Long(Long.parseLong(MediaSessionCompat$ResultReceiverWrapper));
        }
        if (charAt == 's') {
            return MediaSessionCompat$ResultReceiverWrapper;
        }
        throw new RuntimeException();
    }

    public final void writeInstance(HistoryAdapter$GroupItemViewHolder_ViewBinding historyAdapter$GroupItemViewHolder_ViewBinding, Object obj) throws IOException {
        String str;
        String str2;
        int i = 0;
        if (obj instanceof AccountDebitSelectorViewHolder) {
            AccountDebitSelectorViewHolder accountDebitSelectorViewHolder = (AccountDebitSelectorViewHolder) obj;
            int size = accountDebitSelectorViewHolder.MediaBrowserCompat$ItemReceiver.size();
            while (i < size) {
                AccountDebitSelectorViewHolder_ViewBinding accountDebitSelectorViewHolder_ViewBinding = new AccountDebitSelectorViewHolder_ViewBinding();
                accountDebitSelectorViewHolder.MediaBrowserCompat$ItemReceiver(i, accountDebitSelectorViewHolder_ViewBinding);
                if (accountDebitSelectorViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver() != null) {
                    String str3 = accountDebitSelectorViewHolder_ViewBinding.MediaSessionCompat$ResultReceiverWrapper;
                    String str4 = accountDebitSelectorViewHolder_ViewBinding.f5805x50fd9e4a;
                    if (accountDebitSelectorViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver() != null) {
                        str2 = accountDebitSelectorViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver().toString();
                    } else {
                        str2 = "";
                    }
                    historyAdapter$GroupItemViewHolder_ViewBinding.read(str3, str4, str2);
                }
                i++;
            }
        } else if (obj instanceof AccountEStatementViewHolder) {
            AccountEStatementViewHolder accountEStatementViewHolder = (AccountEStatementViewHolder) obj;
            int MediaBrowserCompat$ItemReceiver = accountEStatementViewHolder.MediaBrowserCompat$ItemReceiver();
            while (i < MediaBrowserCompat$ItemReceiver) {
                AccountDebitSelectorViewHolder_ViewBinding accountDebitSelectorViewHolder_ViewBinding2 = new AccountDebitSelectorViewHolder_ViewBinding();
                accountEStatementViewHolder.MediaBrowserCompat$ItemReceiver(i, accountDebitSelectorViewHolder_ViewBinding2);
                if (accountDebitSelectorViewHolder_ViewBinding2.MediaBrowserCompat$ItemReceiver() != null) {
                    String str5 = accountDebitSelectorViewHolder_ViewBinding2.MediaSessionCompat$ResultReceiverWrapper;
                    String str6 = accountDebitSelectorViewHolder_ViewBinding2.f5805x50fd9e4a;
                    if (accountDebitSelectorViewHolder_ViewBinding2.MediaBrowserCompat$ItemReceiver() != null) {
                        str = accountDebitSelectorViewHolder_ViewBinding2.MediaBrowserCompat$ItemReceiver().toString();
                    } else {
                        str = "";
                    }
                    historyAdapter$GroupItemViewHolder_ViewBinding.read(str5, str6, str);
                }
                i++;
            }
        }
        if (!(obj instanceof AccountRepaymentSelectorViewHolder_ViewBinding)) {
            historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$MediaItem(obj.toString());
        }
    }

    public final void register(AccountSelectorViewHolder accountSelectorViewHolder) {
        accountSelectorViewHolder.IconCompatParcelizer(accountSelectorViewHolder.RatingCompat, "int", AccountRemarkViewHolder.read, this);
        accountSelectorViewHolder.IconCompatParcelizer(accountSelectorViewHolder.RatingCompat, "long", AccountRemarkViewHolder.write, this);
        accountSelectorViewHolder.IconCompatParcelizer(accountSelectorViewHolder.RatingCompat, "string", AccountRemarkViewHolder.MediaDescriptionCompat, this);
        accountSelectorViewHolder.IconCompatParcelizer(accountSelectorViewHolder.RatingCompat, "boolean", AccountRemarkViewHolder.MediaBrowserCompat$CustomActionResultReceiver, this);
    }
}
