package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.MerchantWalletViewPagerAdapter$ItemViewHolder */
public class MerchantWalletViewPagerAdapter$ItemViewHolder implements ThirdPartyConsentFragment, GiftingStatusBaseActivity_ViewBinding, Cloneable, Serializable {
    Map<String, String> IconCompatParcelizer = new HashMap();
    String MediaBrowserCompat$CustomActionResultReceiver;
    String MediaBrowserCompat$ItemReceiver;
    private final String MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private boolean RatingCompat;
    private Date read;
    int write;

    public int[] read() {
        return null;
    }

    public MerchantWalletViewPagerAdapter$ItemViewHolder(String str, String str2) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, KtaJsonExactionHelper.NAME);
        this.MediaDescriptionCompat = str;
        this.MediaMetadataCompat = str2;
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final String MediaDescriptionCompat() {
        return this.MediaMetadataCompat;
    }

    public final Date write() {
        return this.read;
    }

    public final void write(Date date) {
        this.read = date;
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        if (str != null) {
            this.MediaBrowserCompat$ItemReceiver = str.toLowerCase(Locale.ROOT);
        } else {
            this.MediaBrowserCompat$ItemReceiver = null;
        }
    }

    public final String IconCompatParcelizer() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void write(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final boolean MediaMetadataCompat() {
        return this.RatingCompat;
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        this.RatingCompat = true;
    }

    public final int RatingCompat() {
        return this.write;
    }

    public final void write(int i) {
        this.write = i;
    }

    public boolean MediaBrowserCompat$ItemReceiver(Date date) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(date, "Date");
        Date date2 = this.read;
        return date2 != null && date2.getTime() <= date.getTime();
    }

    public final String IconCompatParcelizer(String str) {
        return this.IconCompatParcelizer.get(str);
    }

    public final boolean read(String str) {
        return this.IconCompatParcelizer.containsKey(str);
    }

    public Object clone() throws CloneNotSupportedException {
        MerchantWalletViewPagerAdapter$ItemViewHolder merchantWalletViewPagerAdapter$ItemViewHolder = (MerchantWalletViewPagerAdapter$ItemViewHolder) super.clone();
        merchantWalletViewPagerAdapter$ItemViewHolder.IconCompatParcelizer = new HashMap(this.IconCompatParcelizer);
        return merchantWalletViewPagerAdapter$ItemViewHolder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[version: ");
        sb.append(Integer.toString(this.write));
        sb.append("]");
        sb.append("[name: ");
        sb.append(this.MediaDescriptionCompat);
        sb.append("]");
        sb.append("[value: ");
        sb.append(this.MediaMetadataCompat);
        sb.append("]");
        sb.append("[domain: ");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append("]");
        sb.append("[path: ");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("]");
        sb.append("[expiry: ");
        sb.append(this.read);
        sb.append("]");
        return sb.toString();
    }
}
