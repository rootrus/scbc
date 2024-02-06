package p040o;

import java.util.Locale;

@Deprecated
/* renamed from: o.GiftPreviewActivity_ViewBinding */
public final class GiftPreviewActivity_ViewBinding {
    public final String IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    public final int MediaBrowserCompat$ItemReceiver;
    public final GiftingActivity read;
    public final boolean write;

    public GiftPreviewActivity_ViewBinding(String str, int i, GiftingActivity giftingActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, "Scheme name");
        if (i > 0 && i <= 65535) {
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(giftingActivity, "Socket factory");
            this.IconCompatParcelizer = str.toLowerCase(Locale.ENGLISH);
            this.MediaBrowserCompat$ItemReceiver = i;
            if (giftingActivity instanceof GiftRecipientActivity) {
                this.write = true;
                this.read = giftingActivity;
            } else if (giftingActivity instanceof GiftPreviewActivity) {
                this.write = true;
                this.read = new lambda$setTutorial$0$GiftSelectionActivity((GiftPreviewActivity) giftingActivity);
            } else {
                this.write = false;
                this.read = giftingActivity;
            }
        } else {
            throw new IllegalArgumentException("Port is invalid");
        }
    }

    public final String toString() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.IconCompatParcelizer);
            sb.append(':');
            sb.append(Integer.toString(this.MediaBrowserCompat$ItemReceiver));
            this.MediaBrowserCompat$CustomActionResultReceiver = sb.toString();
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftPreviewActivity_ViewBinding)) {
            return false;
        }
        GiftPreviewActivity_ViewBinding giftPreviewActivity_ViewBinding = (GiftPreviewActivity_ViewBinding) obj;
        if (this.IconCompatParcelizer.equals(giftPreviewActivity_ViewBinding.IconCompatParcelizer) && this.MediaBrowserCompat$ItemReceiver == giftPreviewActivity_ViewBinding.MediaBrowserCompat$ItemReceiver && this.write == giftPreviewActivity_ViewBinding.write) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = this.MediaBrowserCompat$ItemReceiver + 629;
        String str = this.IconCompatParcelizer;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (((i2 * 37) + i) * 37) + (this.write ? 1 : 0);
    }
}
