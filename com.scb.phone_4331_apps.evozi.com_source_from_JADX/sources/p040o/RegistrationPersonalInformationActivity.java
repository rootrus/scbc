package p040o;

import java.io.IOException;
import org.apache.http.HttpException;

@Deprecated
/* renamed from: o.RegistrationPersonalInformationActivity */
public interface RegistrationPersonalInformationActivity {
    ScbPrivacyPolicyActivity write(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws HttpException, IOException;
}
