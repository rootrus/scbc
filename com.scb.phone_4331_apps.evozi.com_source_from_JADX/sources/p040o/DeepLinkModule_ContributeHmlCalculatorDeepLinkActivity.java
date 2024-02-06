package p040o;

import android.os.SystemClock;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.presentation.presenter.emailverification.EmailOtpPresenter;
import com.scb.phone.presentation.presenter.emailverification.EmailOtpPresenter$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.emailverification.ManageEmailVerificationFragment;
import p040o.ScriptIntrinsicBLAS;

/* renamed from: o.DeepLinkModule_ContributeHmlCalculatorDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_ContributeHmlCalculatorDeepLinkActivity implements ZHPR2$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ ManageEmailVerificationFragment IconCompatParcelizer;

    public /* synthetic */ DeepLinkModule_ContributeHmlCalculatorDeepLinkActivity(ManageEmailVerificationFragment manageEmailVerificationFragment) {
        this.IconCompatParcelizer = manageEmailVerificationFragment;
    }

    public final void read() {
        ManageEmailVerificationFragment manageEmailVerificationFragment = this.IconCompatParcelizer;
        ScriptIntrinsicBLAS.Uplo uplo = manageEmailVerificationFragment.IconCompatParcelizer;
        if (manageEmailVerificationFragment.getActivity() != null) {
            uplo.MediaBrowserCompat$ItemReceiver(((BaseActivity) manageEmailVerificationFragment.getActivity()).scbAnalytics, "emailverification_resend_otp");
        }
        EmailOtpPresenter emailOtpPresenter = manageEmailVerificationFragment.emailOtpPresenter;
        FragmentActivity activity = manageEmailVerificationFragment.getActivity();
        boolean z = true;
        if (SystemClock.elapsedRealtime() - emailOtpPresenter.MediaBrowserCompat$MediaItem < 60000) {
            setMetadata setmetadata = new setMetadata(emailOtpPresenter, activity);
            if (emailOtpPresenter.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setmetadata.IconCompatParcelizer(emailOtpPresenter.RatingCompat);
                return;
            }
            return;
        }
        emailOtpPresenter.MediaBrowserCompat$MediaItem = SystemClock.elapsedRealtime();
        emailOtpPresenter.MediaBrowserCompat$MediaItem = SystemClock.elapsedRealtime();
        if (emailOtpPresenter.RatingCompat == null) {
            z = false;
        }
        if (z) {
            emailOtpPresenter.RatingCompat.AlertController$RecycleListView();
        }
        if (emailOtpPresenter.MediaMetadataCompat.booleanValue()) {
            emailOtpPresenter.write.IconCompatParcelizer();
            emailOtpPresenter.write.IconCompatParcelizer(new EmailOtpPresenter$MediaBrowserCompat$ItemReceiver(emailOtpPresenter, (byte) 0));
            return;
        }
        emailOtpPresenter.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        emailOtpPresenter.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new EmailOtpPresenter.read(emailOtpPresenter, (byte) 0));
    }
}
