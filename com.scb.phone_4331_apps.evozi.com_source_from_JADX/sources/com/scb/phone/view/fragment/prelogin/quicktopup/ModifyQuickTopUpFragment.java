package com.scb.phone.view.fragment.prelogin.quicktopup;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.prelogin.PreLoginActivity;
import com.scb.phone.view.activity.prelogin.quicktopup.ModifyQuickTopUpReviewActivity;
import com.scb.phone.view.adapter.transferandpay.FavouriteTargetAdapter;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.text.NumberFormat;
import java.util.List;
import java.util.NoSuchElementException;
import p040o.C4456gN;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindDeejungPlansFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getDocumentSkew;
import p040o.getDocumentUploaded;
import p040o.getFragmentManager;
import p040o.getICheckDeserializerRtti;
import p040o.instantiate;
import p040o.parseEventLog;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;
import p040o.showNow;

public class ModifyQuickTopUpFragment extends QuickTopUpFragment implements getDocumentSkew.read {
    private long MediaDescriptionCompat;
    @BindView
    LinearLayout mModifyQuickTopUpLinearLayout;
    @BindView
    SwitchCompat mSwitchCompat;
    @BindView
    RelativeLayout mSwitchRelativeLayout;
    @HmlPinActivity
    public C4456gN modifyQuickTopUpPresenter;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89262131494153, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        C4456gN gNVar = this.modifyQuickTopUpPresenter;
        gNVar.write((getDocumentSkew.read) this);
        getDocumentSkew.write write = this;
        gNVar.MediaBrowserCompat$ItemReceiver(write);
        gNVar.MediaBrowserCompat$ItemReceiver = this;
        gNVar.MediaBrowserCompat$ItemReceiver(write);
        gNVar.MediaBrowserCompat$ItemReceiver = this;
        this.mSwitchRelativeLayout.setVisibility(0);
        this.mReviewSetupButton.setText(getString(R.string.review_changes));
        if (!(getActivity() == null || getActivity().getIntent() == null)) {
            C4456gN gNVar2 = this.modifyQuickTopUpPresenter;
            setUuidFromUtf8Bytes setuuidfromutf8bytes = (setUuidFromUtf8Bytes) getActivity().getIntent().getParcelableExtra("com.scb.phone.EXTRA_REVIEW");
            if (setuuidfromutf8bytes != null) {
                setuuidfromutf8bytes.setPadding = false;
                gNVar2.IconCompatParcelizer = setuuidfromutf8bytes;
            }
        }
        MediaBrowserCompat$SearchResultReceiver();
        super.setTransitioning();
        ParcelableVolumeInfo(getString(R.string.modify_quick_top_up));
        return inflate;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.modifyQuickTopUpPresenter.write();
    }

    public void onDestroy() {
        this.modifyQuickTopUpPresenter.onDestroy();
        super.onDestroy();
    }

    public final void setTransitioning() {
        super.setTransitioning();
        ParcelableVolumeInfo(getString(R.string.modify_quick_top_up));
    }

    public final void read(int i) {
        if (this.MediaMetadataCompat != i) {
            this.MediaMetadataCompat = i;
            super.read(i);
            this.modifyQuickTopUpPresenter.MediaBrowserCompat$ItemReceiver(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void write() {
        this.mReviewSetupButton.setButtonEnabled(!this.mSwitchCompat.isChecked() || (MediaMetadataCompat() && this.MediaBrowserCompat$CustomActionResultReceiver != null && !this.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()));
    }

    public final void read(List<CrashlyticsReport.Session.Builder> list) {
        super.read(list);
        this.modifyQuickTopUpPresenter.IconCompatParcelizer();
        RatingCompat();
    }

    public final void MediaBrowserCompat$ItemReceiver(List<Integer> list) {
        super.MediaBrowserCompat$ItemReceiver(list);
        this.MediaBrowserCompat$MediaItem.write(this.modifyQuickTopUpPresenter.IconCompatParcelizer.f2965x50fd9e4a.MediaBrowserCompat$ItemReceiver);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(parseEventLog parseeventlog) {
        super.MediaBrowserCompat$CustomActionResultReceiver(parseeventlog);
        this.mAmountValueEditText.setText(this.modifyQuickTopUpPresenter.IconCompatParcelizer.f2965x50fd9e4a.MediaBrowserCompat$ItemReceiver);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onSwitchClick() {
        if (SystemClock.elapsedRealtime() - this.MediaDescriptionCompat >= 600) {
            this.MediaDescriptionCompat = SystemClock.elapsedRealtime();
            this.mSwitchCompat.toggle();
            if (this.mSwitchCompat.isChecked()) {
                this.mReviewSetupButton.setText(getString(R.string.review_changes));
                this.mModifyQuickTopUpLinearLayout.setVisibility(0);
                FragmentBuilder_BindDeejungPlansFragment.MediaBrowserCompat$CustomActionResultReceiver(this.mFavouritesScrollView, 600);
                return;
            }
            this.mReviewSetupButton.setText(getString(R.string.confirm));
            this.mModifyQuickTopUpLinearLayout.setVisibility(8);
        }
    }

    public final void read() {
        Intent intent = new Intent(getContext(), PreLoginActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_IS_SUCCESS", true);
        intent.putExtra("com.scb.phone.EXTRA_SHOW_SNACK_BAR", true);
        intent.putExtra("com.scb.phone.EXTRA_MESSAGE", getString(R.string.quick_top_up_turned_off));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        aj_();
    }

    public final void write(String str) {
        instantiate instantiate;
        if (this.RatingCompat != null) {
            FavouriteTargetAdapter favouriteTargetAdapter = this.RatingCompat;
            int i = 0;
            showNow MediaBrowserCompat$ItemReceiver = showNow.MediaBrowserCompat$ItemReceiver(0, favouriteTargetAdapter.read.size());
            showNow shownow = new showNow(MediaBrowserCompat$ItemReceiver.read, new getFragmentManager(MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, new getDocumentUploaded(favouriteTargetAdapter, str)));
            if (shownow.IconCompatParcelizer.hasNext()) {
                instantiate = instantiate.write(shownow.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver());
            } else {
                instantiate = instantiate.write();
            }
            if (instantiate.MediaBrowserCompat$CustomActionResultReceiver) {
                if (instantiate.MediaBrowserCompat$CustomActionResultReceiver) {
                    i = instantiate.write;
                } else {
                    throw new NoSuchElementException("No value present");
                }
            }
            favouriteTargetAdapter.MediaBrowserCompat$ItemReceiver = i;
            favouriteTargetAdapter.IconCompatParcelizer.write();
            this.MediaMetadataCompat = favouriteTargetAdapter.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onContinueButtonClick() {
        if (this.mSwitchCompat.isChecked() && ((this.mAmountValueEditText.getText() == null && this.MediaBrowserCompat$MediaItem.write() == -1) || this.mReferenceTextView.getText() == null || this.MediaBrowserCompat$CustomActionResultReceiver == null)) {
            return;
        }
        if (this.mSwitchCompat.isChecked()) {
            if (this.mAmountValueEditText.getVisibility() != 0 && this.MediaBrowserCompat$MediaItem != null) {
                this.IconCompatParcelizer = this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver().doubleValue();
            } else if (!TextUtils.isEmpty(this.mAmountValueEditText.getText())) {
                this.IconCompatParcelizer = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.mAmountValueEditText.getText().toString()).doubleValue();
            } else {
                this.IconCompatParcelizer = 0.0d;
            }
            this.modifyQuickTopUpPresenter.MediaBrowserCompat$CustomActionResultReceiver();
            return;
        }
        this.modifyQuickTopUpPresenter.read();
    }

    public final void read(setUuidFromUtf8Bytes setuuidfromutf8bytes, boolean z) {
        setuuidfromutf8bytes.setPadding = false;
        setUuidFromUtf8Bytes MediaBrowserCompat$ItemReceiver = setuuidfromutf8bytes.MediaBrowserCompat$ItemReceiver(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, z));
        MediaBrowserCompat$ItemReceiver.ListMenuItemView = this.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$ItemReceiver.setGroupDividerEnabled = getICheckDeserializerRtti.write(getContext(), (int) R.drawable.bankicon_scb);
        MediaBrowserCompat$ItemReceiver.AlertController$RecycleListView = this.mReferenceTextView.getText().toString();
        CrashlyticsReport.Session.Application.read read = new CrashlyticsReport.Session.Application.read();
        read.IconCompatParcelizer = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(NumberFormat.getCurrencyInstance()).format(this.IconCompatParcelizer);
        MediaBrowserCompat$ItemReceiver.f2965x50fd9e4a = new CrashlyticsReport.Session.Application(read, (byte) 0);
        Intent intent = new Intent(getActivity(), ModifyQuickTopUpReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        aj_();
    }
}
