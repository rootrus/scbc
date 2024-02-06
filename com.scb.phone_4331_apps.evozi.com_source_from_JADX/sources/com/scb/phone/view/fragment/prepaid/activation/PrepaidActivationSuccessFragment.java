package com.scb.phone.view.fragment.prepaid.activation;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.PurchaseSuccessFragment;
import java.util.Calendar;
import java.util.List;
import p040o.BankingServicesDeepLinkActivity;
import p040o.C4775hm;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingCheckedFuture;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment;
import p040o.FragmentBuilder_BindEBillSelectedFragment;
import p040o.FundActionsSuccessActivity;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.Iterables;
import p040o.OnDeviceIdExtractor;
import p040o.RegularImmutableBiMap;
import p040o.ZTBSV;
import p040o.access$2300;
import p040o.getKernelIDDstAtop;
import p040o.getUserId;
import p040o.hm$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.hm$MediaBrowserCompat$ItemReceiver;
import p040o.logEventNoInterceptor;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.standardStartAndWait;
import p040o.writeUInt64NoTag;

public final class PrepaidActivationSuccessFragment extends PurchaseSuccessFragment implements OnDeviceIdExtractor.write {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);
    private final HmlVerifyEmailActivity MediaBrowserCompat$SearchResultReceiver;
    private standardStartAndWait MediaDescriptionCompat;
    @HmlPinActivity
    public C4775hm successPresenter;
    @BindView
    public TextView tvRemark;

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ void MediaBrowserCompat$MediaItem(String str) {
    }

    public final int MediaSessionCompat$QueueItem() {
        return R.layout.f86282131493855;
    }

    public final class SuccessScreenshotBinder_ViewBinding implements Unbinder {
        private SuccessScreenshotBinder MediaBrowserCompat$CustomActionResultReceiver;

        public SuccessScreenshotBinder_ViewBinding(SuccessScreenshotBinder successScreenshotBinder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = successScreenshotBinder;
            successScreenshotBinder.tvActivationTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvActivationTitle, "field 'tvActivationTitle'", TextView.class);
        }

        public final void read() {
            SuccessScreenshotBinder successScreenshotBinder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (successScreenshotBinder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                successScreenshotBinder.tvActivationTitle = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    static final class read<T> implements DebitCardMarketConductDeepLinkActivity<Uri> {
        private /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ PrepaidActivationSuccessFragment write;

        read(PrepaidActivationSuccessFragment prepaidActivationSuccessFragment, boolean z) {
            this.write = prepaidActivationSuccessFragment;
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.write.IconCompatParcelizer(((Uri) obj).toString(), this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    static final class write<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
        private /* synthetic */ PrepaidActivationSuccessFragment MediaBrowserCompat$CustomActionResultReceiver;

        write(PrepaidActivationSuccessFragment prepaidActivationSuccessFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = prepaidActivationSuccessFragment;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write((Throwable) obj);
        }
    }

    public PrepaidActivationSuccessFragment() {
        FundActionsSuccessActivity fundActionsSuccessActivity = C6123x165ee7b.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$SearchResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final /* synthetic */ void IconCompatParcelizer(ForwardingCheckedFuture.SimpleForwardingCheckedFuture simpleForwardingCheckedFuture, boolean z, boolean z2) {
        standardStartAndWait standardstartandwait = (standardStartAndWait) simpleForwardingCheckedFuture;
        onGetStartedClick.write((Object) standardstartandwait, "display");
        C4775hm hmVar = this.successPresenter;
        if (hmVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
        }
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        writeUInt64NoTag.IconCompatParcelizer write2 = new C4775hm.write(hmVar, z, standardstartandwait, z2);
        if (hmVar.RatingCompat != null) {
            write2.IconCompatParcelizer(hmVar.RatingCompat);
        }
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.read = ButterKnife.IconCompatParcelizer(this, view);
        Bundle arguments = getArguments();
        this.MediaDescriptionCompat = arguments != null ? (standardStartAndWait) arguments.getParcelable("com.scb.phone.view.fragment.prepaid.activation.PrepaidActivationSuccessFragment.KEY_SUCCESS") : null;
        C4775hm hmVar = this.successPresenter;
        if (hmVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
        }
        hmVar.MediaBrowserCompat$ItemReceiver(this);
        standardStartAndWait standardstartandwait = this.MediaDescriptionCompat;
        if (standardstartandwait != null) {
            C4775hm hmVar2 = this.successPresenter;
            if (hmVar2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
            }
            onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
            writeUInt64NoTag.IconCompatParcelizer read2 = new C4775hm.read(standardstartandwait);
            boolean z = true;
            if (hmVar2.RatingCompat != null) {
                read2.IconCompatParcelizer(hmVar2.RatingCompat);
            }
            ForwardingCheckedFuture forwardingCheckedFuture = standardstartandwait.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) forwardingCheckedFuture, "successfulDisplay.errorDisplay");
            CharSequence charSequence = forwardingCheckedFuture.IconCompatParcelizer;
            if (!(charSequence == null || charSequence.length() == 0)) {
                RegularImmutableBiMap regularImmutableBiMap = hmVar2.MediaBrowserCompat$CustomActionResultReceiver;
                ForwardingCheckedFuture forwardingCheckedFuture2 = standardstartandwait.MediaBrowserCompat$CustomActionResultReceiver;
                onGetStartedClick.IconCompatParcelizer((Object) forwardingCheckedFuture2, "successfulDisplay.errorDisplay");
                String str = forwardingCheckedFuture2.IconCompatParcelizer;
                ForwardingCheckedFuture forwardingCheckedFuture3 = standardstartandwait.MediaBrowserCompat$CustomActionResultReceiver;
                onGetStartedClick.IconCompatParcelizer((Object) forwardingCheckedFuture3, "successfulDisplay.errorDisplay");
                hmVar2.MediaBrowserCompat$ItemReceiver(regularImmutableBiMap.read(str, forwardingCheckedFuture3.read, access$2300.write.JUST_DISMISS));
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new C4775hm.IconCompatParcelizer(standardstartandwait);
            if (hmVar2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(hmVar2.RatingCompat);
            }
        }
    }

    public final void read(standardStartAndWait standardstartandwait) {
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        this.presenter.read(standardstartandwait, (List<getUserId>) null);
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        onGetStartedClick.write((Object) str, "remark");
        TextView textView = this.tvRemark;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
        }
        textView.setVisibility(0);
        TextView textView2 = this.tvRemark;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
        }
        textView2.setText(str);
    }

    public final void MediaBrowserCompat$ItemReceiver(standardStartAndWait standardstartandwait, boolean z, boolean z2) {
        onGetStartedClick.write((Object) standardstartandwait, "display");
        C4775hm hmVar = this.successPresenter;
        if (hmVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
        }
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        writeUInt64NoTag.IconCompatParcelizer write2 = new C4775hm.write(hmVar, z, standardstartandwait, z2);
        if (hmVar.RatingCompat != null) {
            write2.IconCompatParcelizer(hmVar.RatingCompat);
        }
    }

    public final void write(boolean z, standardStartAndWait standardstartandwait, boolean z2) {
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        SuccessScreenshotBinder successScreenshotBinder = new SuccessScreenshotBinder();
        String IconCompatParcelizer2 = standardstartandwait.IconCompatParcelizer(String.valueOf(Calendar.getInstance().getTimeInMillis()));
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "getFileNameWithDate(successfulDisplay)");
        Iterables.C352414 r6 = this.componentFactory;
        onGetStartedClick.IconCompatParcelizer((Object) r6, "componentFactory");
        this.IconCompatParcelizer = DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(successScreenshotBinder, new PrepaidActivationSuccessFragment$MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2, standardstartandwait, z, r6, z2), getContext())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new read(this, z), new write(this));
        ZTBSV ztbsv = (getKernelIDDstAtop) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "planetscb_activate_slip_screen");
        }
    }

    @OnClick
    public final void onClickReturnButton() {
        C4775hm hmVar = this.successPresenter;
        if (hmVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
        }
        if (hmVar.RatingCompat != null) {
            hmVar.RatingCompat.AlertController$RecycleListView();
        }
        logEventNoInterceptor logeventnointerceptor = hmVar.write;
        logeventnointerceptor.read(logeventnointerceptor.read(), new hm$MediaBrowserCompat$CustomActionResultReceiver(hmVar), new hm$MediaBrowserCompat$ItemReceiver(hmVar));
    }

    public static final class SuccessScreenshotBinder extends FragmentBuilder_BindEBillSelectedFragment<PurchaseSuccessFragment.PurchaseScreenshotDisplay> {
        @BindView
        public TextView tvActivationTitle;

        public final /* synthetic */ void write(ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, View view) {
            PurchaseSuccessFragment.PurchaseScreenshotDisplay purchaseScreenshotDisplay = (PurchaseSuccessFragment.PurchaseScreenshotDisplay) simpleForwardingListenableFuture;
            onGetStartedClick.write((Object) purchaseScreenshotDisplay, "display");
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            ButterKnife.IconCompatParcelizer(purchaseScreenshotDisplay, view);
            ButterKnife.IconCompatParcelizer(this, view);
            purchaseScreenshotDisplay.read(view);
            TextView textView = this.tvActivationTitle;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvActivationTitle");
            }
            textView.setText(R.string.prepaid_activation_slip_sub_title);
        }
    }

    public final void onDestroyView() {
        C4775hm hmVar = this.successPresenter;
        if (hmVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
        }
        hmVar.onDestroy();
        super.onDestroyView();
    }

    public final void IconCompatParcelizer() {
        ZTBSV ztbsv = (getKernelIDDstAtop) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "planetscb_return_summary_activate");
        }
        super.IconCompatParcelizer();
    }

    public final void MediaDescriptionCompat() {
        ZTBSV ztbsv = (getKernelIDDstAtop) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "planetscb_return_summary_activate");
        }
        mo15340x50fd9e4a(false);
    }
}
