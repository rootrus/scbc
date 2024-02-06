package p040o;

import android.content.DialogInterface;
import android.view.View;
import com.scb.phone.view.activity.registration.RegistrationCountrySearchActivity;
import com.scb.phone.view.activity.registration.RegistrationLivenessCheckActivity;
import com.scb.phone.view.activity.registration.RegistrationOtpActivity;
import com.scb.phone.view.activity.registration.RegistrationPersonalInformationActivity;
import com.scb.phone.view.activity.registration.RegistrationTermsAndConsActivity;
import com.scb.phone.view.activity.registration.preregistration.PreregistrationOtpActivity;
import java.util.Arrays;

/* renamed from: o.MaterialCalendarView */
public final /* synthetic */ class MaterialCalendarView implements View.OnClickListener {
    private final /* synthetic */ Runnable MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.MaterialCalendarView$LayoutParams */
    public final /* synthetic */ class LayoutParams implements DialogInterface.OnClickListener {
        public static final /* synthetic */ LayoutParams read = new LayoutParams();

        private /* synthetic */ LayoutParams() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public /* synthetic */ MaterialCalendarView(Runnable runnable) {
        this.MediaBrowserCompat$ItemReceiver = runnable;
    }

    public final void onClick(View view) {
        this.MediaBrowserCompat$ItemReceiver.run();
    }

    /* renamed from: o.MaterialCalendarView$SelectionMode */
    public final class SelectionMode {
        private static final String[] read = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

        public static final void write(RegistrationLivenessCheckActivity registrationLivenessCheckActivity) {
            onGetStartedClick.write((Object) registrationLivenessCheckActivity, "$this$preScanWithPermissionCheck");
            String[] strArr = read;
            if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(registrationLivenessCheckActivity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                registrationLivenessCheckActivity.AppCompatDelegateImpl$ListMenuDecorView();
            } else {
                AppCompatRatingBar.write(registrationLivenessCheckActivity, read, 46);
            }
        }
    }

    /* renamed from: o.MaterialCalendarView$3 */
    public final class C69503 implements MileageQuantitySelectionActivity<RegistrationCountrySearchActivity> {
        public static void MediaBrowserCompat$ItemReceiver(RegistrationCountrySearchActivity registrationCountrySearchActivity, IKtaSessionIdProviderFactory iKtaSessionIdProviderFactory) {
            registrationCountrySearchActivity.presenter = iKtaSessionIdProviderFactory;
        }
    }

    /* renamed from: o.MaterialCalendarView$SavedState */
    public final class SavedState implements MileageQuantitySelectionActivity<RegistrationTermsAndConsActivity> {
        public static void IconCompatParcelizer(RegistrationTermsAndConsActivity registrationTermsAndConsActivity, C4949mB mBVar) {
            registrationTermsAndConsActivity.presenter = mBVar;
        }

        /* renamed from: o.MaterialCalendarView$SavedState$1 */
        public final class C69511 implements MileageQuantitySelectionActivity<RegistrationOtpActivity> {
            public static void read(RegistrationOtpActivity registrationOtpActivity, cancelExtraction cancelextraction) {
                registrationOtpActivity.presenter = cancelextraction;
            }
        }
    }

    /* renamed from: o.MaterialCalendarView$ShowOtherDates */
    public final class ShowOtherDates implements MileageQuantitySelectionActivity<RegistrationPersonalInformationActivity> {
        public static void MediaBrowserCompat$ItemReceiver(RegistrationPersonalInformationActivity registrationPersonalInformationActivity, extractData extractdata) {
            registrationPersonalInformationActivity.registrationPersonalInformationPresenter = extractdata;
        }
    }

    /* renamed from: o.MaterialCalendarView$StateBuilder */
    public final class StateBuilder implements MileageQuantitySelectionActivity<PreregistrationOtpActivity> {
        public static void write(PreregistrationOtpActivity preregistrationOtpActivity, C4098bg bgVar) {
            preregistrationOtpActivity.preregistrationOTPPresenter = bgVar;
        }
    }

    /* renamed from: o.MaterialCalendarView$State */
    public final class State implements MileageQuantitySelectionActivity<RegistrationLivenessCheckActivity> {
        public static void read(RegistrationLivenessCheckActivity registrationLivenessCheckActivity, C4982my myVar) {
            registrationLivenessCheckActivity.registrationLivenessCheckPresenter = myVar;
        }
    }
}
