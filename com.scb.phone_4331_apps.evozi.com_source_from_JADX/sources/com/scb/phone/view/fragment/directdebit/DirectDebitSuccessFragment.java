package com.scb.phone.view.fragment.directdebit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.fragment.PurchaseSuccessFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.Calendar;
import java.util.List;
import p040o.BankingServicesDeepLinkActivity;
import p040o.CheckCaptureModule_GetIExtractionServerRttiFactory;
import p040o.CheckEligibilityActivity;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment;
import p040o.FundActionsSuccessActivity;
import p040o.HmlETBLandingActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.Iterables;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZTBSV;
import p040o.ZTRSV;
import p040o.getUserId;
import p040o.onGetStartedClick;
import p040o.setExitButtonEnabled;
import p040o.setTapText;
import p040o.standardStartAndWait;

public final class DirectDebitSuccessFragment extends PurchaseSuccessFragment implements CheckCaptureModule_GetIExtractionServerRttiFactory {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);
    private final HmlVerifyEmailActivity RatingCompat;

    public final void read(standardStartAndWait standardstartandwait) {
    }

    static final class MediaMetadataCompat<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
        private /* synthetic */ DirectDebitSuccessFragment MediaBrowserCompat$ItemReceiver;

        MediaMetadataCompat(DirectDebitSuccessFragment directDebitSuccessFragment) {
            this.MediaBrowserCompat$ItemReceiver = directDebitSuccessFragment;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.MediaBrowserCompat$ItemReceiver.write((Throwable) obj);
        }
    }

    static final class write<T> implements DebitCardMarketConductDeepLinkActivity<Uri> {
        private /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ DirectDebitSuccessFragment read;

        write(DirectDebitSuccessFragment directDebitSuccessFragment, boolean z) {
            this.read = directDebitSuccessFragment;
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.read.IconCompatParcelizer(((Uri) obj).toString(), this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public DirectDebitSuccessFragment() {
        FundActionsSuccessActivity read2 = new read(this);
        onGetStartedClick.write((Object) read2, "initializer");
        this.RatingCompat = new HmlVerifyPhoneTermsConditionsActivity(read2);
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        LayoutInflater.from(getContext()).inflate(R.layout.f91742131494401, this.extraContainer, true);
        return onCreateView;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.read((standardStartAndWait) this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(), (List<getUserId>) null);
        TextView textView = this.buttonReturn;
        onGetStartedClick.IconCompatParcelizer((Object) textView, "buttonReturn");
        textView.setText(getString(R.string.auto_direct_debit_return));
        ZTBSV ztrsv = new ZTRSV();
        if (getActivity() != null) {
            ztrsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "direct_debit_success");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: IconCompatParcelizer */
    public void write(standardStartAndWait standardstartandwait, boolean z, boolean z2) {
        if (standardstartandwait != null) {
            setExitButtonEnabled setexitbuttonenabled = this.themesSlipPresenter;
            onGetStartedClick.IconCompatParcelizer((Object) setexitbuttonenabled, "themesSlipPresenter");
            C5910x3b9d131d directDebitSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver = new C5910x3b9d131d(setexitbuttonenabled);
            PurchaseSuccessFragment.PurchaseScreenshotDisplay read2 = read(standardstartandwait, z, z2);
            read2.IconCompatParcelizer = true;
            this.IconCompatParcelizer = DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(directDebitSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver, read2, getContext())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new write(this, z), new MediaMetadataCompat(this));
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(standardStartAndWait standardstartandwait, boolean z, boolean z2) {
        write(standardstartandwait, z, z2);
    }

    public final void IconCompatParcelizer() {
        super.IconCompatParcelizer();
    }

    public final void onDestroyView() {
        this.presenter.onDestroy();
        super.onDestroyView();
    }

    @OnClick
    public final void onClickReturnButton() {
        Intent read2 = HomeActivity.read(requireContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read2 = setTapText.write(activity, read2).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<standardStartAndWait> {
        private /* synthetic */ DirectDebitSuccessFragment write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(DirectDebitSuccessFragment directDebitSuccessFragment) {
            super(0);
            this.write = directDebitSuccessFragment;
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.write.getArguments();
            if (arguments != null) {
                return (standardStartAndWait) arguments.getParcelable("EXTRA_DIRECT_DEBIT_SUCCESS_DISPLAY");
            }
            return null;
        }
    }

    private final PurchaseSuccessFragment.PurchaseScreenshotDisplay read(standardStartAndWait standardstartandwait, boolean z, boolean z2) {
        String IconCompatParcelizer2 = standardstartandwait.IconCompatParcelizer(String.valueOf(Calendar.getInstance().getTimeInMillis()));
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "getFileNameWithDate(display)");
        Iterables.C352414 r5 = this.componentFactory;
        onGetStartedClick.IconCompatParcelizer((Object) r5, "componentFactory");
        DirectDebitSuccessFragment$MediaBrowserCompat$ItemReceiver directDebitSuccessFragment$MediaBrowserCompat$ItemReceiver = new DirectDebitSuccessFragment$MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2, standardstartandwait, z, r5, z2);
        directDebitSuccessFragment$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = true;
        return directDebitSuccessFragment$MediaBrowserCompat$ItemReceiver;
    }
}
