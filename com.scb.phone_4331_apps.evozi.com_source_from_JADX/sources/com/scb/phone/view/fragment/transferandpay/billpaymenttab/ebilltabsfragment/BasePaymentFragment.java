package com.scb.phone.view.fragment.transferandpay.billpaymenttab.ebilltabsfragment;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnEditorAction;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.ScanPaymentActivity;
import com.scb.phone.view.adapter.transferandpay.BillerAdapter;
import com.scb.phone.view.fragment.transferandpay.BaseBillersFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.ActivityBuilder_HmlBusinessOwnerSubmissionReviewStep2Activity;
import p040o.ActivityBuilder_OffshoreCurrencyActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C7421rw;
import p040o.C7425sA;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServerProjectProvider;
import p040o.StreetViewPanoramaFragment;
import p040o.getRotationMatrixFromVector;
import p040o.getTopLeftCornerWidth;
import p040o.setChildDrawingOrderCallback;
import p040o.setTapText;

public abstract class BasePaymentFragment extends BaseBillersFragment implements getTopLeftCornerWidth.MediaMetadataCompat {
    private ServerProjectProvider.C70695.MediaMetadataCompat MediaBrowserCompat$CustomActionResultReceiver;
    private BulkTransferDeepLinkActivity MediaBrowserCompat$MediaItem;
    @HmlPinActivity
    public C7425sA billPaymentPresenter;
    @BindView
    public TextView mRecommendedBillersTextView;
    @BindView
    protected ImageView mSearchButton;
    @BindView
    public EditText mSearchEditText;
    @BindView
    public View mViewBillerNotFound;
    @BindView
    protected View searchBarLayout;
    @BindView
    protected ImageButton searchEditClear;

    /* access modifiers changed from: protected */
    public abstract void MediaDescriptionCompat();

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88642131494091, viewGroup, false);
        MediaBrowserCompat$CustomActionResultReceiver(this, inflate);
        this.billPaymentPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.IconCompatParcelizer = new BillerAdapter(getContext(), new ArrayList(), this);
        MediaDescriptionCompat();
        RatingCompat();
        MediaBrowserCompat$MediaItem();
        this.mSearchEditText.setFilters(new InputFilter[]{new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment("^[0-9a-zA-Z\\u0E00-\\u0E7F _*'\"#&()@.,/:-]+$")});
        return inflate;
    }

    public final void IconCompatParcelizer(List<CrashlyticsReport.Session.Builder> list) {
        super.IconCompatParcelizer(list);
        this.searchBarLayout.setVisibility(0);
    }

    public void MediaBrowserCompat$MediaItem() {
        this.mSearchEditText.setHint(getString(R.string.search_biller));
    }

    public void onStart() {
        super.onStart();
        this.MediaBrowserCompat$MediaItem = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("FAVORITE")).subscribe(new ActivityBuilder_HmlBusinessOwnerSubmissionReviewStep2Activity(this), ActivityBuilder_OffshoreCurrencyActivity.IconCompatParcelizer);
    }

    public void onStop() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$MediaItem;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onStop();
    }

    public void onDestroy() {
        this.billPaymentPresenter.onDestroy();
        super.onDestroy();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof ServerProjectProvider.C70695.MediaMetadataCompat) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (ServerProjectProvider.C70695.MediaMetadataCompat) parentFragment;
        }
    }

    /* access modifiers changed from: protected */
    public void RatingCompat() {
        this.mSearchEditText.addTextChangedListener(new IconCompatParcelizer(this, (byte) 0));
    }

    public final void IconCompatParcelizer() {
        super.IconCompatParcelizer();
        this.mRecommendedBillersTextView.setVisibility(0);
        this.mRecyclerView.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.Session.Event.Application.Execution execution) {
        ServerProjectProvider.C70695.MediaMetadataCompat mediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (mediaMetadataCompat != null) {
            mediaMetadataCompat.IconCompatParcelizer(execution);
        }
    }

    public final void write() {
        this.mRecommendedBillersTextView.setVisibility(0);
        this.mRecyclerView.setVisibility(0);
    }

    class IconCompatParcelizer implements TextWatcher {
        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        private IconCompatParcelizer(BasePaymentFragment basePaymentFragment) {
        }

        /* synthetic */ IconCompatParcelizer(BasePaymentFragment basePaymentFragment, byte b) {
            this(basePaymentFragment);
        }
    }

    public final void read() {
        this.billPaymentPresenter.write((int) R.string.biller_not_found);
    }

    @OnEditorAction
    public boolean onSearchAction(int i) {
        if (i != 3 || this.mSearchEditText.getText().toString().length() < 3) {
            return false;
        }
        searchButtonClicked();
        PlaybackStateCompat$CustomAction();
        return true;
    }

    @OnClick
    public void searchButtonClicked() {
        Intent IconCompatParcelizer2 = ScanPaymentActivity.IconCompatParcelizer(getContext());
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

    public final String MediaBrowserCompat$SearchResultReceiver() {
        String obj = this.mSearchEditText.getText().toString();
        return TextUtils.isEmpty(obj) ? "" : obj;
    }

    @OnClick
    public void onClickClear() {
        this.mSearchEditText.setText("");
    }

    public static /* synthetic */ void write(BasePaymentFragment basePaymentFragment) {
        C7425sA sAVar = basePaymentFragment.billPaymentPresenter;
        StreetViewPanoramaFragment.zza zza = sAVar.MediaBrowserCompat$ItemReceiver;
        if (zza != null) {
            CrashlyticsReport.Session.Event.Application.Execution write = sAVar.write.write(zza.write, sAVar.read.MediaBrowserCompat$ItemReceiver.write(), sAVar.read.IconCompatParcelizer.setCheckable());
            boolean z = true;
            if (write != null) {
                C7421rw rwVar = new C7421rw(write);
                if (sAVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    rwVar.IconCompatParcelizer(sAVar.RatingCompat);
                    return;
                }
                return;
            }
            getRotationMatrixFromVector getrotationmatrixfromvector = getRotationMatrixFromVector.MediaBrowserCompat$ItemReceiver;
            if (sAVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getrotationmatrixfromvector.IconCompatParcelizer(sAVar.RatingCompat);
            }
        }
    }
}
