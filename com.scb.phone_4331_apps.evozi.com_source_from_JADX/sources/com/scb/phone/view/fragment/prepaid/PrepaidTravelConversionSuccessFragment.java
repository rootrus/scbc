package com.scb.phone.view.fragment.prepaid;

import android.content.Context;
import android.content.Intent;
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
import com.scb.phone.view.activity.prepaid.PrepaidDetailsActivity;
import com.scb.phone.view.fragment.PurchaseSuccessFragment;
import com.scb.phone.view.fragment.PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.Calendar;
import java.util.List;
import p040o.BankingServicesDeepLinkActivity;
import p040o.CheckCaptureModule_GetIExtractionServerRttiFactory;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingCheckedFuture;
import p040o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.IIdFieldNameConvention;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZTBSV;
import p040o.getKernelIDDstAtop;
import p040o.getUserId;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.standardStartAndWait;
import p040o.writeUInt64NoTag;

public final class PrepaidTravelConversionSuccessFragment extends PurchaseSuccessFragment implements CheckCaptureModule_GetIExtractionServerRttiFactory {
    public static final C6120xd14b6dd0 MediaBrowserCompat$CustomActionResultReceiver = new C6120xd14b6dd0((byte) 0);
    private getKernelIDDstAtop MediaBrowserCompat$MediaItem;
    private boolean MediaBrowserCompat$SearchResultReceiver;
    private standardStartAndWait RatingCompat;
    @HmlPinActivity
    public IIdFieldNameConvention successPresenter;

    static final class write<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
        private /* synthetic */ PrepaidTravelConversionSuccessFragment MediaBrowserCompat$CustomActionResultReceiver;

        write(PrepaidTravelConversionSuccessFragment prepaidTravelConversionSuccessFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = prepaidTravelConversionSuccessFragment;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write((Throwable) obj);
        }
    }

    public final /* synthetic */ void IconCompatParcelizer(ForwardingCheckedFuture.SimpleForwardingCheckedFuture simpleForwardingCheckedFuture, boolean z, boolean z2) {
        IconCompatParcelizer((standardStartAndWait) simpleForwardingCheckedFuture, z, z2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        IIdFieldNameConvention iIdFieldNameConvention = this.successPresenter;
        if (iIdFieldNameConvention == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
        }
        iIdFieldNameConvention.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$MediaItem = new getKernelIDDstAtop();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.RatingCompat = arguments != null ? (standardStartAndWait) arguments.getParcelable("com.scb.phone.view.fragment.prepaid.request.PrepaidTravelConversionSuccessFragment.KEY_SUCCESS") : null;
        Bundle arguments2 = getArguments();
        boolean z = false;
        this.MediaBrowserCompat$SearchResultReceiver = arguments2 != null ? arguments2.getBoolean("EXTRA_IS_BUY") : false;
        standardStartAndWait standardstartandwait = this.RatingCompat;
        if (standardstartandwait != null) {
            IIdFieldNameConvention iIdFieldNameConvention = this.successPresenter;
            if (iIdFieldNameConvention == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
            }
            onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IIdFieldNameConvention.IconCompatParcelizer(standardstartandwait);
            if (iIdFieldNameConvention.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(iIdFieldNameConvention.RatingCompat);
            }
        }
    }

    public final void read(standardStartAndWait standardstartandwait) {
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        this.presenter.read(standardstartandwait, (List<getUserId>) null);
        String string = getString(R.string.prepaid_conversion_return);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.prepaid_conversion_return)");
        onGetStartedClick.write((Object) string, "returnButton");
        TextView textView = this.buttonReturn;
        onGetStartedClick.IconCompatParcelizer((Object) textView, "buttonReturn");
        textView.setText(string);
    }

    @OnClick
    public final void onClickReturnButton() {
        Context context = getContext();
        if (context != null) {
            String str = this.MediaBrowserCompat$SearchResultReceiver ? "planetscb_buy_return" : "planetscb_sell_return";
            getKernelIDDstAtop getkerneliddstatop = this.MediaBrowserCompat$MediaItem;
            if (getkerneliddstatop == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
            }
            getkerneliddstatop.read("source", str);
            getKernelIDDstAtop getkerneliddstatop2 = this.MediaBrowserCompat$MediaItem;
            if (getkerneliddstatop2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
            }
            ZTBSV ztbsv = getkerneliddstatop2;
            if (getActivity() != null) {
                ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "planetscb_conversion_return");
            }
            Intent MediaBrowserCompat$CustomActionResultReceiver2 = PrepaidDetailsActivity.MediaBrowserCompat$CustomActionResultReceiver(context);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(context, MediaBrowserCompat$CustomActionResultReceiver2).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                context.startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void MediaBrowserCompat$MediaItem(String str) {
        onGetStartedClick.write((Object) str, "returnButton");
        TextView textView = this.buttonReturn;
        onGetStartedClick.IconCompatParcelizer((Object) textView, "buttonReturn");
        textView.setText(str);
    }

    public final void MediaBrowserCompat$ItemReceiver(standardStartAndWait standardstartandwait, boolean z, boolean z2) {
        if (standardstartandwait != null) {
            this.IconCompatParcelizer = DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(new PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver(this.themesSlipPresenter), new PurchaseSuccessFragment.PurchaseScreenshotDisplay(R.layout.f91692131494396, standardstartandwait.IconCompatParcelizer(String.valueOf(Calendar.getInstance().getTimeInMillis())), standardstartandwait, z, this.componentFactory, z2), getContext())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new C6119xf3cfd941(this, z), new write(this));
            if (this.MediaBrowserCompat$SearchResultReceiver) {
                getKernelIDDstAtop getkerneliddstatop = this.MediaBrowserCompat$MediaItem;
                if (getkerneliddstatop == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
                }
                ZTBSV ztbsv = getkerneliddstatop;
                if (getActivity() != null) {
                    ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "planetscb_conversion_buy_slip_screen");
                    return;
                }
                return;
            }
            getKernelIDDstAtop getkerneliddstatop2 = this.MediaBrowserCompat$MediaItem;
            if (getkerneliddstatop2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
            }
            ZTBSV ztbsv2 = getkerneliddstatop2;
            if (getActivity() != null) {
                ztbsv2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "planetscb_conversion_sell_slip_screen");
            }
        }
    }

    public final void onDestroyView() {
        IIdFieldNameConvention iIdFieldNameConvention = this.successPresenter;
        if (iIdFieldNameConvention == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
        }
        iIdFieldNameConvention.onDestroy();
        super.onDestroyView();
    }
}
