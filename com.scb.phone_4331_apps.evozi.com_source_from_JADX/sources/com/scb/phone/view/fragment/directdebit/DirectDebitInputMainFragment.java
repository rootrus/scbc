package com.scb.phone.view.fragment.directdebit;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.scb.phone.view.fragment.transferandpay.BaseReplaceableFragment;
import java.util.Calendar;
import kotlin.TypeCastException;
import p040o.C7085x54efaba5;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.IdWorkflowActivity;
import p040o.ServerProjectProvider;
import p040o.ServerProjectProvider$5$MediaBrowserCompat$ItemReceiver;
import p040o.ServerProjectProvider$5$MediaBrowserCompat$MediaItem;
import p040o.XVrsAutoCrop;
import p040o.XVrsAutoCrop$MediaBrowserCompat$ItemReceiver;
import p040o.ZTBSV;
import p040o.ZTRSV;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

public final class DirectDebitInputMainFragment extends BaseReplaceableFragment implements IdWorkflowActivity.C69161.write, AccountSourceSelectFragment.write, ServerProjectProvider$5$MediaBrowserCompat$ItemReceiver, ServerProjectProvider.C70695.IconCompatParcelizer, C7085x54efaba5 {
    public static final DirectDebitInputMainFragment$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new DirectDebitInputMainFragment$MediaBrowserCompat$ItemReceiver((byte) 0);
    /* access modifiers changed from: private */
    public long IconCompatParcelizer;
    private DirectDebitInputSelectedFragment RatingCompat;
    @BindView
    public NestedScrollView billPaymentTabNestedScrollView;
    @HmlPinActivity
    public XVrsAutoCrop presenter;

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public final /* synthetic */ void mo13978c_(boolean z) {
    }

    public final ServerProjectProvider$5$MediaBrowserCompat$MediaItem write() {
        return null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86712131493898, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (this.presenter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_account_source_select, AccountSourceSelectFragment.read(XVrsAutoCrop.read())).write();
        XVrsAutoCrop xVrsAutoCrop = this.presenter;
        if (xVrsAutoCrop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        xVrsAutoCrop.MediaBrowserCompat$ItemReceiver(this);
        XVrsAutoCrop xVrsAutoCrop2 = this.presenter;
        if (xVrsAutoCrop2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Bundle arguments = getArguments();
        CrashlyticsReport.Session.Event.Application.Execution execution = arguments != null ? (CrashlyticsReport.Session.Event.Application.Execution) arguments.getParcelable("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY") : null;
        xVrsAutoCrop2.write = execution;
        if (execution != null) {
            writeUInt64NoTag.IconCompatParcelizer write2 = new XVrsAutoCrop.write(execution);
            if (xVrsAutoCrop2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                write2.IconCompatParcelizer(xVrsAutoCrop2.RatingCompat);
            }
        } else {
            XVrsAutoCrop xVrsAutoCrop3 = xVrsAutoCrop2;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = XVrsAutoCrop.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            if (xVrsAutoCrop3.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(xVrsAutoCrop3.RatingCompat);
            }
        }
        NestedScrollView nestedScrollView = this.billPaymentTabNestedScrollView;
        if (nestedScrollView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("billPaymentTabNestedScrollView");
        }
        nestedScrollView.setOnScrollChangeListener(new IconCompatParcelizer(this));
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ZTBSV ztrsv = new ZTRSV();
        if (getActivity() != null) {
            ztrsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "direct_debit_input");
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        read(new DirectDebitInputBillerListFragment(), R.id.fragment_container_bill_info, "BILLER_PAYMENT_SECONDARY_TABS_TAG", true);
    }

    /* renamed from: a_ */
    public final void mo36953a_(CrashlyticsReport.FilesPayload.File.Builder builder) {
        onGetStartedClick.write((Object) builder, "accountSourceDisplay");
        DirectDebitInputSelectedFragment directDebitInputSelectedFragment = this.RatingCompat;
        if (directDebitInputSelectedFragment != null) {
            directDebitInputSelectedFragment.MediaBrowserCompat$CustomActionResultReceiver(builder);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        XVrsAutoCrop xVrsAutoCrop = this.presenter;
        if (xVrsAutoCrop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        xVrsAutoCrop.read = builder;
        boolean z = true;
        if (xVrsAutoCrop.write != null) {
            writeUInt64NoTag.IconCompatParcelizer read = new XVrsAutoCrop.read(xVrsAutoCrop);
            if (xVrsAutoCrop.RatingCompat != null) {
                read.IconCompatParcelizer(xVrsAutoCrop.RatingCompat);
            }
            xVrsAutoCrop.write = null;
        }
        CrashlyticsReport.FilesPayload.File.Builder builder2 = xVrsAutoCrop.read;
        if (builder2 != null) {
            writeUInt64NoTag.IconCompatParcelizer xVrsAutoCrop$MediaBrowserCompat$ItemReceiver = new XVrsAutoCrop$MediaBrowserCompat$ItemReceiver(builder2);
            if (xVrsAutoCrop.RatingCompat == null) {
                z = false;
            }
            if (z) {
                xVrsAutoCrop$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(xVrsAutoCrop.RatingCompat);
            }
        }
    }

    public final void aA_() {
        super.aA_();
        this.RatingCompat = null;
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution execution) {
        IconCompatParcelizer(execution);
    }

    public final void onDestroyView() {
        XVrsAutoCrop xVrsAutoCrop = this.presenter;
        if (xVrsAutoCrop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        xVrsAutoCrop.onDestroy();
        super.onDestroyView();
    }

    static final class write implements Runnable, ValueAnimator.AnimatorUpdateListener {
        private /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ DirectDebitInputMainFragment MediaBrowserCompat$ItemReceiver;

        write(DirectDebitInputMainFragment directDebitInputMainFragment, int i) {
            this.MediaBrowserCompat$ItemReceiver = directDebitInputMainFragment;
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
        }

        public final void run() {
            int[] iArr = new int[2];
            NestedScrollView nestedScrollView = this.MediaBrowserCompat$ItemReceiver.billPaymentTabNestedScrollView;
            if (nestedScrollView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("billPaymentTabNestedScrollView");
            }
            iArr[0] = nestedScrollView.getScrollY();
            iArr[1] = this.MediaBrowserCompat$CustomActionResultReceiver;
            ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
            ofInt.setDuration(400);
            ofInt.addUpdateListener(this);
            ofInt.start();
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            onGetStartedClick.write((Object) valueAnimator, "animation");
            NestedScrollView nestedScrollView = this.MediaBrowserCompat$ItemReceiver.billPaymentTabNestedScrollView;
            if (nestedScrollView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("billPaymentTabNestedScrollView");
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                nestedScrollView.scrollTo(0, ((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    static final class IconCompatParcelizer implements NestedScrollView.IconCompatParcelizer {
        private /* synthetic */ DirectDebitInputMainFragment IconCompatParcelizer;

        IconCompatParcelizer(DirectDebitInputMainFragment directDebitInputMainFragment) {
            this.IconCompatParcelizer = directDebitInputMainFragment;
        }

        public final void write(NestedScrollView nestedScrollView, int i, int i2) {
            onGetStartedClick.write((Object) nestedScrollView, "v");
            if (i > i2 && nestedScrollView.getChildAt(0) != null) {
                View childAt = nestedScrollView.getChildAt(0);
                onGetStartedClick.IconCompatParcelizer((Object) childAt, "child");
                if (i >= childAt.getMeasuredHeight() - nestedScrollView.getMeasuredHeight() && DirectDebitInputMainFragment.IconCompatParcelizer(this.IconCompatParcelizer)) {
                    this.IconCompatParcelizer.aw_();
                    DirectDebitInputMainFragment directDebitInputMainFragment = this.IconCompatParcelizer;
                    Calendar instance = Calendar.getInstance();
                    onGetStartedClick.IconCompatParcelizer((Object) instance, "Calendar.getInstance()");
                    directDebitInputMainFragment.IconCompatParcelizer = instance.getTimeInMillis();
                }
            }
        }
    }

    public static final /* synthetic */ boolean IconCompatParcelizer(DirectDebitInputMainFragment directDebitInputMainFragment) {
        Calendar instance = Calendar.getInstance();
        onGetStartedClick.IconCompatParcelizer((Object) instance, "Calendar.getInstance()");
        return instance.getTimeInMillis() - directDebitInputMainFragment.IconCompatParcelizer > 750;
    }

    public final void IconCompatParcelizer(CrashlyticsReport.Session.Event.Application.Execution execution) {
        super.aA_();
        this.RatingCompat = null;
        C5909xd3cfe85f directDebitInputSelectedFragment$MediaBrowserCompat$CustomActionResultReceiver = DirectDebitInputSelectedFragment.MediaBrowserCompat$CustomActionResultReceiver;
        String AbsActionBarView = AbsActionBarView();
        onGetStartedClick.IconCompatParcelizer((Object) AbsActionBarView, "firebaseSourceParam");
        XVrsAutoCrop xVrsAutoCrop = this.presenter;
        if (xVrsAutoCrop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CrashlyticsReport.FilesPayload.File.Builder builder = xVrsAutoCrop.read;
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("EXTRA_IS_FROM_SCAN") : false;
        onGetStartedClick.write((Object) AbsActionBarView, "fireBaseSourceTag");
        DirectDebitInputSelectedFragment directDebitInputSelectedFragment = new DirectDebitInputSelectedFragment();
        Bundle bundle = new Bundle();
        if (execution != null) {
            bundle.putParcelable("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY", execution);
        }
        if (builder != null) {
            bundle.putParcelable("com.scb.phone.EXTRA_ACCOUNT_SELECTED", builder);
        }
        bundle.putString("source", AbsActionBarView);
        bundle.putBoolean("EXTRA_IS_FROM_SCAN", z);
        directDebitInputSelectedFragment.setArguments(bundle);
        this.RatingCompat = directDebitInputSelectedFragment;
        read(directDebitInputSelectedFragment, R.id.fragment_container_bill_info, "BILLER_PAYMENT_SELECTED_FRAGMENT_TAG", true, true);
    }

    public final void IconCompatParcelizer() {
        super.aA_();
        this.RatingCompat = null;
        read(new DirectDebitInputBillerListFragment(), R.id.fragment_container_bill_info, "BILLER_PAYMENT_SECONDARY_TABS_TAG", true);
    }

    public final void MediaMetadataCompat() {
        NestedScrollView nestedScrollView = this.billPaymentTabNestedScrollView;
        if (nestedScrollView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("billPaymentTabNestedScrollView");
        }
        nestedScrollView.post(new write(this, 0));
    }

    public final void read(int i) {
        NestedScrollView nestedScrollView = this.billPaymentTabNestedScrollView;
        if (nestedScrollView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("billPaymentTabNestedScrollView");
        }
        nestedScrollView.post(new write(this, i));
    }
}
