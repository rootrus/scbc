package com.scb.phone.view.fragment.transferandpay;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.fixedtransfer.DepositDetailRecyclerViewAdapter;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.transferandpay.CustomNoteItem;
import com.scb.phone.view.custom.transferandpay.CustomPhotoLeftDetails;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindDeejungPlansFragment;
import p040o.setJailbroken;
import p040o.setUuidFromUtf8Bytes;

public class ReviewFragment extends BaseReviewFragment {
    public read IconCompatParcelizer;
    private DepositDetailRecyclerViewAdapter MediaBrowserCompat$SearchResultReceiver;
    @BindView
    RelativeLayout layoutDepositDetail;
    @BindView
    LinearLayout layoutFixedTransferDepositList;
    @BindView
    public DefaultButton mConfirmButton;
    @BindView
    ImageView mImageIconExpandMore;
    @BindView
    CustomNoteItem messageDetails;
    @BindView
    CustomPhotoLeftDetails movieDetails;
    @BindView
    TextView nextDayReminder;
    @BindView
    RecyclerView recyclerView;

    @FunctionalInterface
    public interface read {
        void MediaBrowserCompat$CustomActionResultReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes);
    }

    public static ReviewFragment MediaBrowserCompat$CustomActionResultReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        ReviewFragment reviewFragment = new ReviewFragment();
        reviewFragment.setArguments(bundle);
        return reviewFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f90172131494244, viewGroup, false);
        this.MediaBrowserCompat$CustomActionResultReceiver = (setUuidFromUtf8Bytes) getArguments().getParcelable("com.scb.phone.EXTRA_REVIEW");
        MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, inflate, getContext());
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            String MediaDescriptionCompat = this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat();
            char c = 65535;
            int hashCode = MediaDescriptionCompat.hashCode();
            if (hashCode != -1895997217) {
                if (hashCode != -1717988130) {
                    if (hashCode == -1677521967 && MediaDescriptionCompat.equals("rtp.detail")) {
                        c = 2;
                    }
                } else if (MediaDescriptionCompat.equals("QTOPUPSETUP")) {
                    c = 1;
                }
            } else if (MediaDescriptionCompat.equals("QTOPUP")) {
                c = 0;
            }
            if (c == 0 || c == 1) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat("TOPUP");
                this.mConfirmButton.setText(getString(R.string.confirm));
            } else if (c != 2) {
                this.mConfirmButton.setText(getString(R.string.confirm));
            } else {
                FragmentActivity activity = getActivity();
                if (activity == null || getActivity().getIntent() == null) {
                    this.mConfirmButton.setVisibility(8);
                } else if (activity.getIntent().getBooleanExtra("request_to_pay.SummaryDetailActivity.button.paynow", false)) {
                    this.mConfirmButton.setText(getString(R.string.request_to_pay_detail_paynow));
                } else {
                    this.mConfirmButton.setVisibility(8);
                }
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver.setMenu != null) {
                this.mConfirmButton.setText(getString(R.string.schedule_details_012));
            }
        }
        return inflate;
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes, View view, Context context) {
        String str;
        super.MediaBrowserCompat$ItemReceiver(setuuidfromutf8bytes, view, context);
        if (setuuidfromutf8bytes.setChecked != null) {
            this.customFees.mDividerView.setVisibility(0);
            this.userNote.divider.setVisibility(0);
            this.fullDivider.setVisibility(8);
            setJailbroken setjailbroken = setuuidfromutf8bytes.setChecked;
            this.movieDetails.setVisibility(0);
            this.movieDetails.setHeader(setjailbroken.MediaSessionCompat$ResultReceiverWrapper);
            CustomPhotoLeftDetails customPhotoLeftDetails = this.movieDetails;
            if (setjailbroken.read != null) {
                str = setjailbroken.read;
            } else {
                str = setjailbroken.IconCompatParcelizer;
            }
            customPhotoLeftDetails.setImageView(str);
            if (!TextUtils.isEmpty(setjailbroken.MediaBrowserCompat$MediaItem)) {
                this.movieDetails.setTitle(setjailbroken.MediaBrowserCompat$MediaItem);
                if (!TextUtils.isEmpty(setjailbroken.MediaBrowserCompat$ItemReceiver)) {
                    this.movieDetails.setSecondText(setjailbroken.MediaBrowserCompat$ItemReceiver);
                }
            } else if (!TextUtils.isEmpty(setjailbroken.MediaBrowserCompat$ItemReceiver)) {
                this.movieDetails.setTitle(setjailbroken.MediaBrowserCompat$ItemReceiver);
            }
            if (!TextUtils.isEmpty(setjailbroken.MediaBrowserCompat$SearchResultReceiver)) {
                this.movieDetails.setThirdText(setjailbroken.MediaBrowserCompat$SearchResultReceiver);
            }
            if (!TextUtils.isEmpty(setjailbroken.MediaDescriptionCompat)) {
                this.movieDetails.setFourth(setjailbroken.MediaDescriptionCompat);
            }
            if (setjailbroken.write == null || setjailbroken.write.isEmpty()) {
                CustomPhotoLeftDetails customPhotoLeftDetails2 = this.movieDetails;
                customPhotoLeftDetails2.dividirView.setVisibility(8);
                customPhotoLeftDetails2.dividirFullView.setVisibility(8);
                return;
            }
            CustomPhotoLeftDetails customPhotoLeftDetails3 = this.movieDetails;
            customPhotoLeftDetails3.dividirView.setVisibility(0);
            customPhotoLeftDetails3.dividirFullView.setVisibility(8);
            this.messageDetails.setVisibility(0);
            this.messageDetails.setTitle(setjailbroken.MediaMetadataCompat);
            this.messageDetails.setText(setjailbroken.write);
            this.messageDetails.divider.setVisibility(8);
        } else if ("LOANPAYMENT".equals(this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat())) {
            this.customFees.setVisibility(8);
            this.customAmount.setText(getContext().getString(R.string.total_amount));
            this.customAmount.mBottomSpace.setVisibility(this.MediaBrowserCompat$CustomActionResultReceiver.f2965x50fd9e4a == null ? 0 : 8);
            CustomTransferAndPayItem customTransferAndPayItem = this.customAmount;
            CrashlyticsReport.Session.Application application = this.MediaBrowserCompat$CustomActionResultReceiver.f2965x50fd9e4a;
            customTransferAndPayItem.amountInfo.setVisibility(0);
            customTransferAndPayItem.amountInfo.setValuesAligned(application, false);
            if (TextUtils.isEmpty(this.MediaBrowserCompat$CustomActionResultReceiver.setOverlayMode)) {
                this.nextDayReminder.setVisibility(8);
                return;
            }
            this.nextDayReminder.setText(this.MediaBrowserCompat$CustomActionResultReceiver.setOverlayMode);
            this.nextDayReminder.setVisibility(0);
        } else if ("PURCHASE_TRANSFER_FUNCTION".equals(this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat()) || "PURCHASE_TOPUP_FUNCTION".equals(this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat()) || "PURCHASE_BILL_PAYMENT_FUNCTION".equals(this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat()) || "PURCHASE_CREDIT_CARD_FUNCTION".equals(this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat())) {
            this.customAmount.amountInfo.setVisibility(8);
            this.customAmount.mBottomSpace.setVisibility(0);
            if (this.MediaBrowserCompat$CustomActionResultReceiver.AppCompatActivity != null) {
                this.customTarget.setShopAvatar(this.MediaBrowserCompat$CustomActionResultReceiver.AppCompatActivity.toString());
            }
        } else if (!"FIXED_TRANSFER".equals(setuuidfromutf8bytes.MediaDescriptionCompat())) {
        } else {
            if (setuuidfromutf8bytes.ActionMenuPresenter$OverflowMenuButton == null || setuuidfromutf8bytes.ActionMenuPresenter$OverflowMenuButton.isEmpty()) {
                this.layoutFixedTransferDepositList.setVisibility(8);
            } else {
                this.layoutFixedTransferDepositList.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onButtonClicked() {
        if (this.IconCompatParcelizer != null) {
            this.mConfirmButton.setButtonEnabled(false);
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onDepositListClicked() {
        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            RecyclerView recyclerView2 = this.recyclerView;
            getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
            this.recyclerView.setNestedScrollingEnabled(false);
            DepositDetailRecyclerViewAdapter depositDetailRecyclerViewAdapter = new DepositDetailRecyclerViewAdapter(this.MediaBrowserCompat$CustomActionResultReceiver.ActionMenuPresenter$OverflowMenuButton);
            this.MediaBrowserCompat$SearchResultReceiver = depositDetailRecyclerViewAdapter;
            this.recyclerView.setAdapter(depositDetailRecyclerViewAdapter);
        }
        FragmentBuilder_BindDeejungPlansFragment.read(this.mImageIconExpandMore);
        if (this.recyclerView.getVisibility() == 8) {
            this.recyclerView.setVisibility(0);
        } else {
            this.recyclerView.setVisibility(8);
        }
    }
}
