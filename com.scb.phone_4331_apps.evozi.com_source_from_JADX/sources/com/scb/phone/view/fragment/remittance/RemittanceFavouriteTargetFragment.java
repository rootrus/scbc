package com.scb.phone.view.fragment.remittance;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.EditFavouriteActivity;
import com.scb.phone.view.fragment.transferandpay.FavouriteTargetFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.C5173qS;
import p040o.CheckSCBSEligibilityActivity;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.FundFactSheetActivity;
import p040o.FundOnboardingLandingActivity_ViewBinding;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.InvestmentFundDetailsActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class RemittanceFavouriteTargetFragment extends FavouriteTargetFragment implements FragmentBuilder_BindCcSofBillPaymentOnlyFragment, View.OnClickListener {
    @HmlPinActivity
    public C5173qS presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    static final /* synthetic */ class IconCompatParcelizer extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(1);
        }

        public final String getName() {
            return "w";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(onCheckBoxClick.class);
        }

        public final String getSignature() {
            return "w(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onCheckBoxClick.write((Throwable) obj);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final /* synthetic */ class read extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Intent, HmlVerifyPhoneValidateOtpActivity> {
        read(RemittanceFavouriteTargetFragment remittanceFavouriteTargetFragment) {
            super(1, remittanceFavouriteTargetFragment);
        }

        public final String getName() {
            return "refresh";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(RemittanceFavouriteTargetFragment.class);
        }

        public final String getSignature() {
            return "refresh(Landroid/content/Intent;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onGetStartedClick.write((Object) (Intent) obj, "p1");
            RemittanceFavouriteTargetFragment.read((RemittanceFavouriteTargetFragment) this.receiver);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final /* synthetic */ class write extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        public static final write MediaBrowserCompat$CustomActionResultReceiver = new write();

        write() {
            super(1);
        }

        public final String getName() {
            return "w";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(onCheckBoxClick.class);
        }

        public final String getSignature() {
            return "w(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onCheckBoxClick.write((Throwable) obj);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f87432131493970, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [o.ActivityBuilder_ContributePrepaidActivationActivity] */
    /* JADX WARNING: type inference failed for: r3v0, types: [o.ActivityBuilder_ContributePrepaidActivationActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            super.onViewCreated(r5, r6)
            o.qS r5 = r4.presenter
            java.lang.String r6 = "presenter"
            if (r5 != 0) goto L_0x0011
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x0011:
            r0 = r4
            o.CheckCaptureModule_GetICheckDeserializerRttiFactory r0 = (p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory) r0
            r5.MediaBrowserCompat$ItemReceiver(r0)
            android.content.IntentFilter r5 = new android.content.IntentFilter
            java.lang.String r0 = "com.scb.phone/BROADCAST_HOME_ACTIVITY_REFRESH"
            r5.<init>(r0)
            android.content.Context r0 = r4.getContext()
            o.DebitCardResetOtpActivity r5 = p040o.setChildDrawingOrderCallback.IconCompatParcelizer(r0, r5)
            r0 = r4
            com.scb.phone.view.fragment.remittance.RemittanceFavouriteTargetFragment r0 = (com.scb.phone.view.fragment.remittance.RemittanceFavouriteTargetFragment) r0
            o.ActivityBuilder_ContributePrepaidActivationActivity r1 = new o.ActivityBuilder_ContributePrepaidActivationActivity
            com.scb.phone.view.fragment.remittance.RemittanceFavouriteTargetFragment$read r2 = new com.scb.phone.view.fragment.remittance.RemittanceFavouriteTargetFragment$read
            r2.<init>(r0)
            o.FundFactSheetActivity r2 = (p040o.FundFactSheetActivity) r2
            r1.<init>(r2)
            o.DebitCardMarketConductDeepLinkActivity r1 = (p040o.DebitCardMarketConductDeepLinkActivity) r1
            com.scb.phone.view.fragment.remittance.RemittanceFavouriteTargetFragment$IconCompatParcelizer r2 = com.scb.phone.view.fragment.remittance.RemittanceFavouriteTargetFragment.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver
            o.FundFactSheetActivity r2 = (p040o.FundFactSheetActivity) r2
            if (r2 == 0) goto L_0x0043
            o.ActivityBuilder_ContributePrepaidActivationActivity r3 = new o.ActivityBuilder_ContributePrepaidActivationActivity
            r3.<init>(r2)
            r2 = r3
        L_0x0043:
            o.DebitCardMarketConductDeepLinkActivity r2 = (p040o.DebitCardMarketConductDeepLinkActivity) r2
            o.BulkTransferDeepLinkActivity r5 = r5.subscribe(r1, r2)
            r4.MediaBrowserCompat$ItemReceiver = r5
            android.content.IntentFilter r5 = new android.content.IntentFilter
            java.lang.String r1 = "com.scb.phone/BROADCAST_EDIT_FAVORITE_REFRESH"
            r5.<init>(r1)
            android.content.Context r1 = r4.getContext()
            o.DebitCardResetOtpActivity r5 = p040o.setChildDrawingOrderCallback.IconCompatParcelizer(r1, r5)
            o.ActivityBuilder_ContributePrepaidActivationActivity r1 = new o.ActivityBuilder_ContributePrepaidActivationActivity
            com.scb.phone.view.fragment.remittance.RemittanceFavouriteTargetFragment$MediaBrowserCompat$CustomActionResultReceiver r2 = new com.scb.phone.view.fragment.remittance.RemittanceFavouriteTargetFragment$MediaBrowserCompat$CustomActionResultReceiver
            r2.<init>(r0)
            o.FundFactSheetActivity r2 = (p040o.FundFactSheetActivity) r2
            r1.<init>(r2)
            o.DebitCardMarketConductDeepLinkActivity r1 = (p040o.DebitCardMarketConductDeepLinkActivity) r1
            com.scb.phone.view.fragment.remittance.RemittanceFavouriteTargetFragment$write r0 = com.scb.phone.view.fragment.remittance.RemittanceFavouriteTargetFragment.write.MediaBrowserCompat$CustomActionResultReceiver
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            if (r0 == 0) goto L_0x0074
            o.ActivityBuilder_ContributePrepaidActivationActivity r2 = new o.ActivityBuilder_ContributePrepaidActivationActivity
            r2.<init>(r0)
            r0 = r2
        L_0x0074:
            o.DebitCardMarketConductDeepLinkActivity r0 = (p040o.DebitCardMarketConductDeepLinkActivity) r0
            o.BulkTransferDeepLinkActivity r5 = r5.subscribe(r1, r0)
            r4.MediaBrowserCompat$SearchResultReceiver = r5
            r5 = r4
            o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment r5 = (p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment) r5
            r4.MediaBrowserCompat$CustomActionResultReceiver = r5
            r5 = r4
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r4.IconCompatParcelizer = r5
            o.qS r5 = r4.presenter
            if (r5 != 0) goto L_0x008d
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x008d:
            r5.IconCompatParcelizer()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.remittance.RemittanceFavouriteTargetFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void onDestroy() {
        C5173qS qSVar = this.presenter;
        if (qSVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        qSVar.onDestroy();
        super.onDestroy();
    }

    public final void read(int i) {
        C5173qS qSVar = this.presenter;
        if (qSVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        qSVar.IconCompatParcelizer("REMITTANCE", i);
        write();
    }

    public final void MediaBrowserCompat$ItemReceiver(List<? extends CrashlyticsReport.Session.Builder> list) {
        super.MediaBrowserCompat$ItemReceiver(list);
        Object[] objArr = new Object[1];
        objArr[0] = list != null ? Integer.valueOf(list.size()) : 0;
        ParcelableVolumeInfo(getString(R.string.favorite, objArr));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        MediaBrowserCompat$ItemReceiver();
    }

    public final void onClick(View view) {
        Intent intent = new Intent(getContext(), EditFavouriteActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_EDIT_FAVOURITE_TITLE", getString(R.string.favorite_remittance_title));
        intent.putExtra("com.scb.phone.EXTRA_EDIT_FAVOURITE_TAG", "REMITTANCE");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(RemittanceFavouriteTargetFragment remittanceFavouriteTargetFragment, Intent intent) {
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "REMITTANCE", (Object) intent.getStringExtra("com.scb.phone.EXTRA_EDIT_FAVOURITE_TITLE"))) {
            C5173qS qSVar = remittanceFavouriteTargetFragment.presenter;
            if (qSVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            qSVar.IconCompatParcelizer();
        }
    }

    public static final /* synthetic */ void read(RemittanceFavouriteTargetFragment remittanceFavouriteTargetFragment) {
        C5173qS qSVar = remittanceFavouriteTargetFragment.presenter;
        if (qSVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        qSVar.IconCompatParcelizer();
    }
}
