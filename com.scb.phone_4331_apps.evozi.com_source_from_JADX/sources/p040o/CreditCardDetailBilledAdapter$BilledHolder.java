package p040o;

/* renamed from: o.CreditCardDetailBilledAdapter$BilledHolder */
public class CreditCardDetailBilledAdapter$BilledHolder implements CreditCardBilledDetailAdapter$ParentViewHolder {
    public final CreditCardBilledDetailAdapter$ParentViewHolder write;

    public CreditCardDetailBilledAdapter$BilledHolder(CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
        this.write = creditCardBilledDetailAdapter$ParentViewHolder;
    }

    public CreditCardDetailBilledAdapter$BilledHolder() {
        this.write = new RadioButtonGroupAdapter$RadioButtonViewGroup_ViewBinding();
    }

    public final Object MediaBrowserCompat$ItemReceiver(String str) {
        return this.write.MediaBrowserCompat$ItemReceiver(str);
    }

    public final void write(String str, Object obj) {
        this.write.write(str, obj);
    }

    public final PrepaidRequestReviewActivity IconCompatParcelizer() {
        Class<PrepaidRequestReviewActivity> cls = PrepaidRequestReviewActivity.class;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls, "Attribute class");
        Object MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$ItemReceiver("http.connection");
        return MediaBrowserCompat$ItemReceiver == null ? null : cls.cast(MediaBrowserCompat$ItemReceiver);
    }

    public final PrivacyManagementLandingViewHolder write() {
        Class<PrivacyManagementLandingViewHolder> cls = PrivacyManagementLandingViewHolder.class;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls, "Attribute class");
        Object MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$ItemReceiver("http.target_host");
        return MediaBrowserCompat$ItemReceiver == null ? null : cls.cast(MediaBrowserCompat$ItemReceiver);
    }
}
