package com.kofax.kmc.klo.logistics.webservice.ksoap;

import java.io.IOException;
import org.xmlpull.repackaged.p103v1.XmlPullParserException;
import p040o.AccountHeaderViewHolder;
import p040o.AccountRemarkViewHolder;
import p040o.AccountSelectorViewHolder;
import p040o.HistoryAdapter$GroupErrorViewHolder_ViewBinding;
import p040o.HistoryAdapter$GroupItemViewHolder_ViewBinding;

public class MarshalShort implements AccountHeaderViewHolder {
    public Object readInstance(HistoryAdapter$GroupErrorViewHolder_ViewBinding historyAdapter$GroupErrorViewHolder_ViewBinding, String str, String str2, AccountRemarkViewHolder accountRemarkViewHolder) throws IOException, XmlPullParserException {
        return Short.valueOf(Short.parseShort(historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$ResultReceiverWrapper()));
    }

    public void register(AccountSelectorViewHolder accountSelectorViewHolder) {
        accountSelectorViewHolder.IconCompatParcelizer(accountSelectorViewHolder.RatingCompat, "short", Short.class, this);
    }

    public void writeInstance(HistoryAdapter$GroupItemViewHolder_ViewBinding historyAdapter$GroupItemViewHolder_ViewBinding, Object obj) throws IOException {
        historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$MediaItem(obj.toString());
    }
}
