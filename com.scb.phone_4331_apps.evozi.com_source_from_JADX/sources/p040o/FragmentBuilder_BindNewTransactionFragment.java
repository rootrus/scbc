package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.thunderhead.android.domain.authentication.ClientCredentials;
import p040o.ScbMapActivity_ViewBinding;

/* renamed from: o.FragmentBuilder_BindNewTransactionFragment */
public class FragmentBuilder_BindNewTransactionFragment {
    public String MediaBrowserCompat$ItemReceiver;
    public boolean read;
    public boolean write;

    public FragmentBuilder_BindNewTransactionFragment() {
    }

    /* renamed from: o.FragmentBuilder_BindNewTransactionFragment$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<ScbMapActivity_ViewBinding<OnBoardingTutorialActivity, HmlVerifyEmailSuccessfulActivity<? extends ClientCredentials, ? extends Boolean>>, HmlVerifyPhoneValidateOtpActivity> {
        public static final write MediaBrowserCompat$CustomActionResultReceiver = new write();

        write() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ScbMapActivity_ViewBinding scbMapActivity_ViewBinding = (ScbMapActivity_ViewBinding) obj;
            onGetStartedClick.write((Object) scbMapActivity_ViewBinding, "$receiver");
            FundFactSheetActivity fundFactSheetActivity = C65885.read;
            onGetStartedClick.write((Object) fundFactSheetActivity, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            scbMapActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = (String) fundFactSheetActivity.invoke(scbMapActivity_ViewBinding);
            ScbMapActivity_ViewBinding.write(scbMapActivity_ViewBinding, new BaseDiscoverDisclaimerActivity<ScbMapActivity_ViewBinding<OnBoardingTutorialActivity, HmlVerifyEmailSuccessfulActivity<? extends ClientCredentials, ? extends Boolean>>.write, CaptureDocumentActivity<OnBoardingTutorialActivity>, HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity>, Object>((HmlNTBPromptPayNotFoundActivity) null) {
                private CaptureDocumentActivity IconCompatParcelizer;
                private ScbMapActivity_ViewBinding.write read;

                public final Object write(Object obj, Object obj2, Object obj3) {
                    ScbMapActivity_ViewBinding.write write = (ScbMapActivity_ViewBinding.write) obj;
                    CaptureDocumentActivity captureDocumentActivity = (CaptureDocumentActivity) obj2;
                    HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity = (HmlNTBPromptPayNotFoundActivity) obj3;
                    onGetStartedClick.write((Object) write, "$this$create");
                    onGetStartedClick.write((Object) captureDocumentActivity, "<name for destructuring parameter 0>");
                    onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "continuation");
                    C65852 r0 = 

                    public FragmentBuilder_BindNewTransactionFragment(boolean z, String str, boolean z2) {
                        this.read = z;
                        this.MediaBrowserCompat$ItemReceiver = str;
                        this.write = z2;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        FragmentBuilder_BindNewTransactionFragment fragmentBuilder_BindNewTransactionFragment = (FragmentBuilder_BindNewTransactionFragment) obj;
                        if (this.read != fragmentBuilder_BindNewTransactionFragment.read || this.write != fragmentBuilder_BindNewTransactionFragment.write) {
                            return false;
                        }
                        String str = this.MediaBrowserCompat$ItemReceiver;
                        String str2 = fragmentBuilder_BindNewTransactionFragment.MediaBrowserCompat$ItemReceiver;
                        if (str != null) {
                            return str.equals(str2);
                        }
                        if (str2 != null) {
                            return false;
                        }
                        return true;
                    }

                    public int hashCode() {
                        boolean z = this.read;
                        String str = this.MediaBrowserCompat$ItemReceiver;
                        return ((((z ? 1 : 0) * true) + (str != null ? str.hashCode() : 0)) * 31) + (this.write ? 1 : 0);
                    }
                }
