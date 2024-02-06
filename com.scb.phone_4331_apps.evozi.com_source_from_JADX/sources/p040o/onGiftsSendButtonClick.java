package p040o;

import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* renamed from: o.onGiftsSendButtonClick */
public final class onGiftsSendButtonClick {
    public final ConcurrentHashMap<String, GiftPreviewActivity_ViewBinding> IconCompatParcelizer = new ConcurrentHashMap<>();

    public final GiftPreviewActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver(String str) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, "Scheme name");
        GiftPreviewActivity_ViewBinding giftPreviewActivity_ViewBinding = this.IconCompatParcelizer.get(str);
        if (giftPreviewActivity_ViewBinding != null) {
            return giftPreviewActivity_ViewBinding;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Scheme '");
        sb.append(str);
        sb.append("' not registered.");
        throw new IllegalStateException(sb.toString());
    }
}
