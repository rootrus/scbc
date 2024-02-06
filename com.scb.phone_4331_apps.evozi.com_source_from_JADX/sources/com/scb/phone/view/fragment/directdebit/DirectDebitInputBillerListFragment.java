package com.scb.phone.view.fragment.directdebit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.directdebit.C5594x294c4ffb;
import com.scb.phone.view.activity.directdebit.DirectDebitBillerSearchActivity;
import com.scb.phone.view.activity.transferandpay.ScanPaymentActivity;
import com.scb.phone.view.adapter.transferandpay.BillerAdapter;
import com.scb.phone.view.fragment.transferandpay.BaseBillersFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import p040o.C7085x54efaba5;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.HmlPinActivity;
import p040o.IdWorkflowActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServerProjectProvider;
import p040o.XVrsPhaseDetector;
import p040o.isRelevant;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class DirectDebitInputBillerListFragment extends BaseBillersFragment implements IdWorkflowActivity.read, FragmentBuilder_BindCcSofBillPaymentOnlyFragment {
    private C7085x54efaba5 MediaBrowserCompat$CustomActionResultReceiver;
    private ServerProjectProvider.C70695.IconCompatParcelizer MediaMetadataCompat;
    @BindView
    public TextView mRecommendedBillersTextView;
    @BindView
    public ImageView mSearchButton;
    @BindView
    public EditText mSearchEditText;
    @BindView
    public View mViewBillerNotFound;
    @HmlPinActivity
    public XVrsPhaseDetector presenter;
    @BindView
    public View searchBarLayout;
    @BindView
    public ImageButton searchEditClear;

    public static final /* synthetic */ C7085x54efaba5 read(DirectDebitInputBillerListFragment directDebitInputBillerListFragment) {
        C7085x54efaba5 serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver = directDebitInputBillerListFragment.MediaBrowserCompat$CustomActionResultReceiver;
        if (serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("billPaymentPageOnScrollListener");
        }
        return serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f88642131494091, viewGroup, false);
        MediaBrowserCompat$CustomActionResultReceiver(this, inflate);
        XVrsPhaseDetector xVrsPhaseDetector = this.presenter;
        if (xVrsPhaseDetector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        xVrsPhaseDetector.MediaBrowserCompat$ItemReceiver(this);
        this.IconCompatParcelizer = new BillerAdapter(getContext(), new ArrayList(), this);
        EditText editText = this.mSearchEditText;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchEditText");
        }
        editText.setHint(getString(R.string.auto_biller_search_input_placeholder));
        EditText editText2 = this.mSearchEditText;
        if (editText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchEditText");
        }
        editText2.setInputType(0);
        EditText editText3 = this.mSearchEditText;
        if (editText3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchEditText");
        }
        editText3.setOnTouchListener(new IconCompatParcelizer(this));
        return inflate;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        XVrsPhaseDetector xVrsPhaseDetector = this.presenter;
        if (xVrsPhaseDetector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        xVrsPhaseDetector.write();
        TextView textView = this.mRecommendedBillersTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mRecommendedBillersTextView");
        }
        textView.setText(R.string.recommended_billers);
    }

    public final void onEmptyLayoutClick() {
        super.onEmptyLayoutClick();
        XVrsPhaseDetector xVrsPhaseDetector = this.presenter;
        if (xVrsPhaseDetector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        xVrsPhaseDetector.write();
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            if (parentFragment instanceof ServerProjectProvider.C70695.IconCompatParcelizer) {
                this.MediaMetadataCompat = (ServerProjectProvider.C70695.IconCompatParcelizer) parentFragment;
            }
            if (parentFragment instanceof C7085x54efaba5) {
                this.MediaBrowserCompat$CustomActionResultReceiver = (C7085x54efaba5) parentFragment;
            }
        }
    }

    public final void IconCompatParcelizer(List<? extends CrashlyticsReport.Session.Builder> list) {
        onGetStartedClick.write((Object) list, "billerDisplayList");
        super.IconCompatParcelizer(list);
        View view = this.searchBarLayout;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchBarLayout");
        }
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        RecyclerView recyclerView = this.mRecyclerView;
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView, "mRecyclerView");
        View view = recyclerView;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(0);
        ImageButton imageButton = this.searchEditClear;
        if (imageButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchEditClear");
        }
        View view2 = imageButton;
        onGetStartedClick.write((Object) view2, "$this$isVisible");
        view2.setVisibility(0);
        View view3 = this.mViewBillerNotFound;
        if (view3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewBillerNotFound");
        }
        onGetStartedClick.write((Object) view3, "$this$isVisible");
        view3.setVisibility(8);
    }

    public final void read(int i) {
        super.read(i);
        CrashlyticsReport.Session.Builder IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer(i);
        if (IconCompatParcelizer2 != null) {
            CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) IconCompatParcelizer2;
            ServerProjectProvider.C70695.IconCompatParcelizer iconCompatParcelizer = this.MediaMetadataCompat;
            if (iconCompatParcelizer == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("billerSelectedListener");
            }
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(execution);
            RecyclerView recyclerView = this.mRecyclerView;
            onGetStartedClick.IconCompatParcelizer((Object) recyclerView, "mRecyclerView");
            if (recyclerView.AppCompatActivity instanceof LinearLayoutManager) {
                new Handler().postDelayed(new C5908x3c8eb3c5(this), 100);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.transferandpay.billpayment.BillPaymentBillerDisplay");
    }

    public final void onDestroyView() {
        XVrsPhaseDetector xVrsPhaseDetector = this.presenter;
        if (xVrsPhaseDetector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        xVrsPhaseDetector.onDestroy();
        super.onDestroyView();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r2 = r4.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r2, int r3, android.content.Intent r4) {
        /*
            r1 = this;
            super.onActivityResult(r2, r3, r4)
            if (r4 == 0) goto L_0x002c
            r0 = 1899(0x76b, float:2.661E-42)
            if (r2 != r0) goto L_0x002c
            r2 = -1
            if (r3 != r2) goto L_0x002c
            com.scb.phone.view.activity.BasePartialSearchActivity$MediaBrowserCompat$ItemReceiver r2 = com.scb.phone.view.activity.BasePartialSearchActivity.MediaBrowserCompat$SearchResultReceiver
            if (r4 == 0) goto L_0x001d
            android.os.Bundle r2 = r4.getExtras()
            if (r2 == 0) goto L_0x001d
            java.lang.String r3 = "EXTRA_PARTIAL_SEARCH_DISPLAY"
            android.os.Parcelable r2 = r2.getParcelable(r3)
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            o.CrashlyticsReport$Session$Event$Application$Execution r2 = (p040o.CrashlyticsReport.Session.Event.Application.Execution) r2
            o.ServerProjectProvider$5$IconCompatParcelizer r3 = r1.MediaMetadataCompat
            if (r3 != 0) goto L_0x0029
            java.lang.String r4 = "billerSelectedListener"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0029:
            r3.MediaBrowserCompat$ItemReceiver(r2)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.directdebit.DirectDebitInputBillerListFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    @OnClick
    public final void searchButtonClicked() {
        Intent IconCompatParcelizer2 = ScanPaymentActivity.IconCompatParcelizer(getContext(), isRelevant.DIRECT_DEBIT);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static final class IconCompatParcelizer implements View.OnTouchListener {
        private /* synthetic */ DirectDebitInputBillerListFragment read;

        IconCompatParcelizer(DirectDebitInputBillerListFragment directDebitInputBillerListFragment) {
            this.read = directDebitInputBillerListFragment;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            onGetStartedClick.IconCompatParcelizer((Object) motionEvent, "event");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            DirectDebitInputBillerListFragment directDebitInputBillerListFragment = this.read;
            C5594x294c4ffb directDebitBillerSearchActivity$MediaBrowserCompat$CustomActionResultReceiver = DirectDebitBillerSearchActivity.MediaBrowserCompat$MediaItem;
            Context requireContext = this.read.requireContext();
            onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
            onGetStartedClick.write((Object) requireContext, "context");
            Intent intent = new Intent(requireContext, DirectDebitBillerSearchActivity.class);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = directDebitInputBillerListFragment.getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                directDebitInputBillerListFragment.startActivityForResult(intent, 1899);
                return false;
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
    }
}
