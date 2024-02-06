package com.scb.phone.view.fragment.directdebit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.directdebit.DirectDebitOtpActivity;
import com.scb.phone.view.activity.directdebit.DirectDebitOtpActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.CheckEligibilityActivity;
import p040o.ForwardingFuture;
import p040o.FundActionsSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.Iterables;
import p040o.KtaIdExtractor;
import p040o.MissingNativeComponent;
import p040o.MyECouponActivity_ViewBinding;
import p040o.XVrsMultiDetector;
import p040o.ZTBSV;
import p040o.ZTRSV;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class DirectDebitReviewFragment extends BaseFragment implements KtaIdExtractor {
    public static final write MediaBrowserCompat$CustomActionResultReceiver = new write((byte) 0);
    private final HmlVerifyEmailActivity IconCompatParcelizer;
    @HmlPinActivity
    public Iterables.C352414 componentFactory;
    @BindView
    public LinearLayout itemContainer;
    @HmlPinActivity
    public XVrsMultiDetector presenter;

    public DirectDebitReviewFragment() {
        FundActionsSuccessActivity iconCompatParcelizer = new IconCompatParcelizer(this);
        onGetStartedClick.write((Object) iconCompatParcelizer, "initializer");
        this.IconCompatParcelizer = new HmlVerifyPhoneTermsConditionsActivity(iconCompatParcelizer);
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f86732131493900, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        XVrsMultiDetector xVrsMultiDetector = this.presenter;
        if (xVrsMultiDetector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        xVrsMultiDetector.MediaBrowserCompat$ItemReceiver(this);
        XVrsMultiDetector xVrsMultiDetector2 = this.presenter;
        if (xVrsMultiDetector2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        MissingNativeComponent.MissingNativeSessionFileProvider missingNativeSessionFileProvider = (MissingNativeComponent.MissingNativeSessionFileProvider) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        if (missingNativeSessionFileProvider != null) {
            writeUInt64NoTag.IconCompatParcelizer write2 = new XVrsMultiDetector.write(missingNativeSessionFileProvider, xVrsMultiDetector2);
            if (xVrsMultiDetector2.RatingCompat != null) {
                write2.IconCompatParcelizer(xVrsMultiDetector2.RatingCompat);
            }
        }
        ZTBSV ztrsv = new ZTRSV();
        if (getActivity() != null) {
            ztrsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "direct_debit_review");
        }
    }

    public final void write(List<? extends ForwardingFuture> list) {
        onGetStartedClick.write((Object) list, "displays");
        for (ForwardingFuture forwardingFuture : list) {
            Iterables.C352414 r1 = this.componentFactory;
            if (r1 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("componentFactory");
            }
            ItemCustom MediaBrowserCompat$CustomActionResultReceiver2 = r1.MediaBrowserCompat$CustomActionResultReceiver(requireContext(), forwardingFuture);
            MediaBrowserCompat$CustomActionResultReceiver2.setUpWithDisplay(forwardingFuture);
            LinearLayout linearLayout = this.itemContainer;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("itemContainer");
            }
            linearLayout.addView(MediaBrowserCompat$CustomActionResultReceiver2);
        }
    }

    public final void onDestroyView() {
        XVrsMultiDetector xVrsMultiDetector = this.presenter;
        if (xVrsMultiDetector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        xVrsMultiDetector.onDestroy();
        super.onDestroyView();
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<MissingNativeComponent.MissingNativeSessionFileProvider> {
        private /* synthetic */ DirectDebitReviewFragment IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(DirectDebitReviewFragment directDebitReviewFragment) {
            super(0);
            this.IconCompatParcelizer = directDebitReviewFragment;
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.IconCompatParcelizer.getArguments();
            if (arguments != null) {
                return (MissingNativeComponent.MissingNativeSessionFileProvider) arguments.getParcelable("EXTRA_DIRECT_DEBIT_INPUT_DISPLAY");
            }
            return null;
        }
    }

    @OnClick
    public final void onClickNext() {
        MissingNativeComponent.MissingNativeSessionFileProvider missingNativeSessionFileProvider = (MissingNativeComponent.MissingNativeSessionFileProvider) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        if (missingNativeSessionFileProvider != null) {
            DirectDebitOtpActivity$MediaBrowserCompat$ItemReceiver directDebitOtpActivity$MediaBrowserCompat$ItemReceiver = DirectDebitOtpActivity.MediaMetadataCompat;
            Context requireContext = requireContext();
            onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
            onGetStartedClick.IconCompatParcelizer((Object) missingNativeSessionFileProvider, "it");
            onGetStartedClick.write((Object) requireContext, "context");
            onGetStartedClick.write((Object) missingNativeSessionFileProvider, "display");
            Intent intent = new Intent(requireContext, DirectDebitOtpActivity.class);
            intent.putExtra("EXTRA_DIRECT_DEBIT_INPUT_DISPLAY", missingNativeSessionFileProvider);
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
    }
}
