package com.scb.phone.view.fragment.transferandpay.billpayment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentReviewActivity;
import com.scb.phone.view.adapter.chubb.PaymentInfoAdapter;
import com.scb.phone.view.custom.transferandpay.CustomPhotoLeftDetails;
import com.scb.phone.view.fragment.transferandpay.BaseReviewFragment;
import p040o.C7420ru;
import p040o.C7489sy;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.getTopLeftCornerWidth;
import p040o.setUuidFromUtf8Bytes;

public class BillPaymentReviewFragment extends BaseReviewFragment implements getTopLeftCornerWidth.MediaDescriptionCompat {
    @BindView
    TextView banner;
    @HmlPinActivity
    public C7489sy billPaymentPresenter;
    @BindView
    Button btnContinue;
    @BindView
    CustomPhotoLeftDetails movieDetails;
    @BindView
    protected LinearLayout paymentLayout;
    @BindView
    RecyclerView recyclerView;
    @BindView
    View reviewLayout;
    @BindView
    View unexpectedDivider;

    public static BillPaymentReviewFragment write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        BillPaymentReviewFragment billPaymentReviewFragment = new BillPaymentReviewFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        billPaymentReviewFragment.setArguments(bundle);
        return billPaymentReviewFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f85762131493803, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.billPaymentPresenter.MediaBrowserCompat$ItemReceiver(this);
        if (getArguments() != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (setUuidFromUtf8Bytes) getArguments().getParcelable("com.scb.phone.EXTRA_REVIEW");
            C7489sy syVar = this.billPaymentPresenter;
            C7420ru ruVar = new C7420ru(this.MediaBrowserCompat$CustomActionResultReceiver);
            if (syVar.RatingCompat != null) {
                z = true;
            }
            if (z) {
                ruVar.IconCompatParcelizer(syVar.RatingCompat);
            }
            super.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, inflate, getContext());
        }
        return inflate;
    }

    public final void read(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.customFees.mDividerView.setVisibility(0);
        this.userNote.divider.setVisibility(0);
        this.fullDivider.setVisibility(8);
        CrashlyticsReport.Session.Event.Device device = setuuidfromutf8bytes.setShortcut;
        this.banner.setVisibility(0);
        this.banner.setText(device.MediaMetadataCompat);
        this.movieDetails.setVisibility(0);
        this.movieDetails.setImageView(device.RatingCompat);
        this.movieDetails.setTitle(device.MediaSessionCompat$ResultReceiverWrapper);
        this.movieDetails.setSecondText(device.write);
        this.movieDetails.setThirdText(device.MediaBrowserCompat$ItemReceiver);
        this.movieDetails.setFourth(device.read);
    }

    public final void IconCompatParcelizer(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.paymentLayout.setVisibility(0);
        PaymentInfoAdapter paymentInfoAdapter = new PaymentInfoAdapter(getContext());
        RecyclerView recyclerView2 = this.recyclerView;
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        this.recyclerView.setAdapter(paymentInfoAdapter);
        View view = this.reviewLayout;
        getResources();
        view.setBackgroundColor(-1);
        RecyclerView recyclerView3 = this.recyclerView;
        getResources();
        recyclerView3.setBackgroundColor(-1);
        this.unexpectedDivider.setVisibility(8);
        paymentInfoAdapter.write = setuuidfromutf8bytes.setPrimaryBackground;
        paymentInfoAdapter.IconCompatParcelizer.write();
    }

    @OnClick
    public void onClickConfirm() {
        if (getActivity() instanceof BillPaymentReviewActivity) {
            ((BillPaymentReviewActivity) getActivity()).write(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }
}
