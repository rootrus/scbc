package p040o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.apache.http.auth.MalformedChallengeException;

/* renamed from: o.CardlessATMSuccessfulRequestActivity */
abstract class CardlessATMSuccessfulRequestActivity implements RegistrationNoDataActivity {
    private static final List<String> IconCompatParcelizer = Collections.unmodifiableList(Arrays.asList(new String[]{"Negotiate", "Kerberos", "NTLM", "CredSSP", "Digest", "Basic"}));
    private final PrepaidTravelCoachMarkActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver = PrepaidOtpActivity.write((Class) getClass());
    private final int MediaBrowserCompat$ItemReceiver;
    private final String read;

    /* access modifiers changed from: package-private */
    public abstract Collection<String> MediaBrowserCompat$ItemReceiver(gotoFindUs gotofindus);

    CardlessATMSuccessfulRequestActivity(int i, String str) {
        this.MediaBrowserCompat$ItemReceiver = i;
        this.read = str;
    }

    public boolean IconCompatParcelizer(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, ScbPrivacyPolicyActivity scbPrivacyPolicyActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(scbPrivacyPolicyActivity, "HTTP response");
        return scbPrivacyPolicyActivity.IconCompatParcelizer().MediaBrowserCompat$CustomActionResultReceiver() == this.MediaBrowserCompat$ItemReceiver;
    }

    public Map<String, PrepaidRequestMarketConductActivity> write(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, ScbPrivacyPolicyActivity scbPrivacyPolicyActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws MalformedChallengeException {
        DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding;
        int i;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(scbPrivacyPolicyActivity, "HTTP response");
        PrepaidRequestMarketConductActivity[] MediaBrowserCompat$ItemReceiver2 = scbPrivacyPolicyActivity.MediaBrowserCompat$ItemReceiver(this.read);
        HashMap hashMap = new HashMap(MediaBrowserCompat$ItemReceiver2.length);
        for (PrepaidRequestMarketConductActivity prepaidRequestMarketConductActivity : MediaBrowserCompat$ItemReceiver2) {
            if (prepaidRequestMarketConductActivity instanceof PrepaidRequestLandingActivity) {
                PrepaidRequestLandingActivity prepaidRequestLandingActivity = (PrepaidRequestLandingActivity) prepaidRequestMarketConductActivity;
                depositTransactionAdapter$ChildViewHolder_ViewBinding = prepaidRequestLandingActivity.read();
                i = prepaidRequestLandingActivity.write();
            } else {
                String MediaBrowserCompat$ItemReceiver3 = prepaidRequestMarketConductActivity.MediaBrowserCompat$ItemReceiver();
                if (MediaBrowserCompat$ItemReceiver3 != null) {
                    depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(MediaBrowserCompat$ItemReceiver3.length());
                    depositTransactionAdapter$ChildViewHolder_ViewBinding.read(MediaBrowserCompat$ItemReceiver3);
                    i = 0;
                } else {
                    throw new MalformedChallengeException("Header value is null");
                }
            }
            while (i < depositTransactionAdapter$ChildViewHolder_ViewBinding.length() && CreditCardBilledDetailAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(i))) {
                i++;
            }
            int i2 = i;
            while (i2 < depositTransactionAdapter$ChildViewHolder_ViewBinding.length() && !CreditCardBilledDetailAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(i2))) {
                i2++;
            }
            hashMap.put(depositTransactionAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(i, i2).toLowerCase(Locale.ROOT), prepaidRequestMarketConductActivity);
        }
        return hashMap;
    }

    public Queue<VerifyIdentityTipsActivity> read(Map<String, PrepaidRequestMarketConductActivity> map, PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, ScbPrivacyPolicyActivity scbPrivacyPolicyActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws MalformedChallengeException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(map, "Map of auth challenges");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingViewHolder, "Host");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(scbPrivacyPolicyActivity, "HTTP response");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(creditCardBilledDetailAdapter$ParentViewHolder, "HTTP context");
        RemittanceAddFavouriteRecipientDetailActivity remittanceAddFavouriteRecipientDetailActivity = creditCardBilledDetailAdapter$ParentViewHolder instanceof RemittanceAddFavouriteRecipientDetailActivity ? (RemittanceAddFavouriteRecipientDetailActivity) creditCardBilledDetailAdapter$ParentViewHolder : new RemittanceAddFavouriteRecipientDetailActivity(creditCardBilledDetailAdapter$ParentViewHolder);
        LinkedList linkedList = new LinkedList();
        Class<PromptPayQRActivity> cls = PromptPayQRActivity.class;
        Class<RequestToPayActivity> cls2 = RequestToPayActivity.class;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls2, "Attribute class");
        Object MediaBrowserCompat$ItemReceiver2 = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.authscheme-registry");
        gotoFindUs gotofindus = null;
        RequestToPayActivity cast = MediaBrowserCompat$ItemReceiver2 == null ? null : cls2.cast(MediaBrowserCompat$ItemReceiver2);
        if (cast == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write("Auth scheme registry not set in the context");
            return linkedList;
        }
        Class<RegistrationDeadCardActivity> cls3 = RegistrationDeadCardActivity.class;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls3, "Attribute class");
        Object MediaBrowserCompat$ItemReceiver3 = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.auth.credentials-provider");
        RegistrationDeadCardActivity cast2 = MediaBrowserCompat$ItemReceiver3 == null ? null : cls3.cast(MediaBrowserCompat$ItemReceiver3);
        if (cast2 == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write("Credentials provider not set in the context");
            return linkedList;
        }
        Class<gotoFindUs> cls4 = gotoFindUs.class;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls4, "Attribute class");
        Object MediaBrowserCompat$ItemReceiver4 = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.request-config");
        if (MediaBrowserCompat$ItemReceiver4 != null) {
            gotofindus = cls4.cast(MediaBrowserCompat$ItemReceiver4);
        }
        gotoFindUs gotofindus2 = gotofindus;
        if (gotofindus2 == null) {
            gotofindus2 = gotoFindUs.IconCompatParcelizer;
        }
        Collection<String> MediaBrowserCompat$ItemReceiver5 = MediaBrowserCompat$ItemReceiver(gotofindus2);
        if (MediaBrowserCompat$ItemReceiver5 == null) {
            MediaBrowserCompat$ItemReceiver5 = IconCompatParcelizer;
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer()) {
            PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append("Authentication schemes in the order of preference: ");
            sb.append(MediaBrowserCompat$ItemReceiver5);
            prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
        }
        for (String str : MediaBrowserCompat$ItemReceiver5) {
            PrepaidRequestMarketConductActivity prepaidRequestMarketConductActivity = map.get(str.toLowerCase(Locale.ROOT));
            if (prepaidRequestMarketConductActivity != null) {
                ManagePromptpayLandingActivity write = ((PromptPayQRActivity) cast.read(str)).write(creditCardBilledDetailAdapter$ParentViewHolder);
                write.MediaBrowserCompat$CustomActionResultReceiver(prepaidRequestMarketConductActivity);
                PurchaseReviewActivity IconCompatParcelizer2 = cast2.IconCompatParcelizer(new PromptPayTermsAndConditionsActivity(privacyManagementLandingViewHolder, write.IconCompatParcelizer(), write.read()));
                if (IconCompatParcelizer2 != null) {
                    linkedList.add(new VerifyIdentityTipsActivity(write, IconCompatParcelizer2));
                }
            } else if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer()) {
                PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Challenge for ");
                sb2.append(str);
                sb2.append(" authentication scheme not available");
                prepaidTravelCoachMarkActivity_ViewBinding2.write(sb2.toString());
            }
        }
        return linkedList;
    }

    public void IconCompatParcelizer(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, ManagePromptpayLandingActivity managePromptpayLandingActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
        boolean z;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingViewHolder, "Host");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(managePromptpayLandingActivity, "Auth scheme");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(creditCardBilledDetailAdapter$ParentViewHolder, "HTTP context");
        RemittanceAddFavouriteRecipientDetailActivity remittanceAddFavouriteRecipientDetailActivity = creditCardBilledDetailAdapter$ParentViewHolder instanceof RemittanceAddFavouriteRecipientDetailActivity ? (RemittanceAddFavouriteRecipientDetailActivity) creditCardBilledDetailAdapter$ParentViewHolder : new RemittanceAddFavouriteRecipientDetailActivity(creditCardBilledDetailAdapter$ParentViewHolder);
        if (managePromptpayLandingActivity == null || !managePromptpayLandingActivity.MediaBrowserCompat$CustomActionResultReceiver()) {
            z = false;
        } else {
            z = managePromptpayLandingActivity.read().equalsIgnoreCase("Basic");
        }
        if (z) {
            Class<RegistrationCountrySearchActivity_ViewBinding> cls = RegistrationCountrySearchActivity_ViewBinding.class;
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls, "Attribute class");
            Object MediaBrowserCompat$ItemReceiver2 = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.auth.auth-cache");
            RegistrationCountrySearchActivity_ViewBinding cast = MediaBrowserCompat$ItemReceiver2 == null ? null : cls.cast(MediaBrowserCompat$ItemReceiver2);
            if (cast == null) {
                cast = new CardlessAtmInfoActivity();
                remittanceAddFavouriteRecipientDetailActivity.write.write("http.auth.auth-cache", cast);
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer()) {
                PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder();
                sb.append("Caching '");
                sb.append(managePromptpayLandingActivity.read());
                sb.append("' auth scheme for ");
                sb.append(privacyManagementLandingViewHolder);
                prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
            }
            cast.IconCompatParcelizer(privacyManagementLandingViewHolder, managePromptpayLandingActivity);
        }
    }

    public void write(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, ManagePromptpayLandingActivity managePromptpayLandingActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingViewHolder, "Host");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(creditCardBilledDetailAdapter$ParentViewHolder, "HTTP context");
        RemittanceAddFavouriteRecipientDetailActivity remittanceAddFavouriteRecipientDetailActivity = creditCardBilledDetailAdapter$ParentViewHolder instanceof RemittanceAddFavouriteRecipientDetailActivity ? (RemittanceAddFavouriteRecipientDetailActivity) creditCardBilledDetailAdapter$ParentViewHolder : new RemittanceAddFavouriteRecipientDetailActivity(creditCardBilledDetailAdapter$ParentViewHolder);
        Class<RegistrationCountrySearchActivity_ViewBinding> cls = RegistrationCountrySearchActivity_ViewBinding.class;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls, "Attribute class");
        Object MediaBrowserCompat$ItemReceiver2 = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.auth.auth-cache");
        RegistrationCountrySearchActivity_ViewBinding cast = MediaBrowserCompat$ItemReceiver2 == null ? null : cls.cast(MediaBrowserCompat$ItemReceiver2);
        if (cast != null) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer()) {
                PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder();
                sb.append("Clearing cached auth scheme for ");
                sb.append(privacyManagementLandingViewHolder);
                prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
            }
            cast.IconCompatParcelizer(privacyManagementLandingViewHolder);
        }
    }
}
