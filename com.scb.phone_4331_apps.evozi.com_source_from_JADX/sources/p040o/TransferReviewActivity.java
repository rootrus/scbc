package p040o;

@Deprecated
/* renamed from: o.TransferReviewActivity */
public class TransferReviewActivity extends CardlessAtmInfoActivity_ViewBinding {
    public TransferReviewActivity() {
        super((InputDetailsActivity) null, (AmountDetailsSuccessAdapter$SuccessRow_ViewBinding) null);
    }

    /* access modifiers changed from: protected */
    public final AmountDetailsSuccessAdapter$SuccessRow_ViewBinding read() {
        String str;
        CoachMarkViewPagerAdapter$TutorialItemHolder_ViewBinding coachMarkViewPagerAdapter$TutorialItemHolder_ViewBinding = new CoachMarkViewPagerAdapter$TutorialItemHolder_ViewBinding();
        ManageAccountInboundActivity manageAccountInboundActivity = ManageAccountInboundActivity.IconCompatParcelizer;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(coachMarkViewPagerAdapter$TutorialItemHolder_ViewBinding, "HTTP parameters");
        coachMarkViewPagerAdapter$TutorialItemHolder_ViewBinding.MediaBrowserCompat$ItemReceiver("http.protocol.version", (Object) manageAccountInboundActivity);
        String name = CreditCardBilledDetailAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.name();
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(coachMarkViewPagerAdapter$TutorialItemHolder_ViewBinding, "HTTP parameters");
        coachMarkViewPagerAdapter$TutorialItemHolder_ViewBinding.MediaBrowserCompat$ItemReceiver("http.protocol.content-charset", (Object) name);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(coachMarkViewPagerAdapter$TutorialItemHolder_ViewBinding, "HTTP parameters");
        coachMarkViewPagerAdapter$TutorialItemHolder_ViewBinding.read("http.tcp.nodelay", true);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(coachMarkViewPagerAdapter$TutorialItemHolder_ViewBinding, "HTTP parameters");
        coachMarkViewPagerAdapter$TutorialItemHolder_ViewBinding.write("http.socket.buffer-size", 8192);
        FatcaQuestionnaireAdapter$ViewHolder_ViewBinding IconCompatParcelizer = FatcaQuestionnaireAdapter$ViewHolder_ViewBinding.IconCompatParcelizer("org.apache.http.client", TransferReviewActivity.class.getClassLoader());
        if (IconCompatParcelizer != null) {
            str = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        } else {
            str = "UNAVAILABLE";
        }
        String format = String.format("%s/%s (Java/%s)", new Object[]{"Apache-HttpClient", str, System.getProperty("java.version")});
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(coachMarkViewPagerAdapter$TutorialItemHolder_ViewBinding, "HTTP parameters");
        coachMarkViewPagerAdapter$TutorialItemHolder_ViewBinding.MediaBrowserCompat$ItemReceiver("http.useragent", (Object) format);
        return coachMarkViewPagerAdapter$TutorialItemHolder_ViewBinding;
    }

    /* access modifiers changed from: protected */
    public final CreditCardBilledDetailAdapter$ChildViewHolder MediaBrowserCompat$CustomActionResultReceiver() {
        CreditCardBilledDetailAdapter$ChildViewHolder creditCardBilledDetailAdapter$ChildViewHolder = new CreditCardBilledDetailAdapter$ChildViewHolder();
        creditCardBilledDetailAdapter$ChildViewHolder.IconCompatParcelizer.add(new RemittanceFaqActivity());
        creditCardBilledDetailAdapter$ChildViewHolder.IconCompatParcelizer.add(new CreditCardBilledDetailAdapter$ParentViewHolder_ViewBinding());
        creditCardBilledDetailAdapter$ChildViewHolder.IconCompatParcelizer.add(new CreditCardDetailUnbilledAdapter$HeaderViewHolder_ViewBinding());
        creditCardBilledDetailAdapter$ChildViewHolder.IconCompatParcelizer.add(new RemittanceOtpActivity());
        creditCardBilledDetailAdapter$ChildViewHolder.IconCompatParcelizer.add(new CreditCardDetailUnbilledAdapter$HeaderViewHolder());
        creditCardBilledDetailAdapter$ChildViewHolder.IconCompatParcelizer.add(new CreditCardDetailUnbilledAdapter$ChildViewHolder());
        creditCardBilledDetailAdapter$ChildViewHolder.IconCompatParcelizer.add(new RemittanceAddFavouriteInputActivity());
        creditCardBilledDetailAdapter$ChildViewHolder.MediaBrowserCompat$ItemReceiver.add(new RemittanceReviewActivity());
        creditCardBilledDetailAdapter$ChildViewHolder.IconCompatParcelizer.add(new RemittanceAddressSearchActivity());
        creditCardBilledDetailAdapter$ChildViewHolder.IconCompatParcelizer.add(new RemittanceLandingActivity());
        creditCardBilledDetailAdapter$ChildViewHolder.IconCompatParcelizer.add(new RemittanceInputActivity());
        return creditCardBilledDetailAdapter$ChildViewHolder;
    }
}
