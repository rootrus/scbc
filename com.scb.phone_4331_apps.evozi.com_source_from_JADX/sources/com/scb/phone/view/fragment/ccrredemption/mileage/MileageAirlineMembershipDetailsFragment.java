package com.scb.phone.view.fragment.ccrredemption.mileage;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import butterknife.OnTextChanged;
import com.scb.phone.R;
import com.scb.phone.view.activity.ccrredemption.mileage.MileageReviewRedemptionActivity;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C10896fieldNamingStrategy;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.atomicLongAdapter;
import p040o.getDelegateAdapter;
import p040o.getGender;
import p040o.htmlSafe;
import p040o.lambda$of$1;
import p040o.longAdapter;
import p040o.newJsonReader;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;

public class MileageAirlineMembershipDetailsFragment extends BaseFragment implements getGender {
    private String IconCompatParcelizer = "";
    private String MediaBrowserCompat$CustomActionResultReceiver = "";
    private lambda$of$1 MediaBrowserCompat$MediaItem;
    @BindView
    DefaultButton btnReview;
    @BindView
    EditText edtLastName;
    @BindView
    EditText edtMembershipId;
    @HmlPinActivity
    public newJsonReader presenter;
    @BindView
    TextView txvLastNameError;
    @BindView
    TextView txvMembershipIdError;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85652131493792, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.btnReview.setButtonEnabled(false);
        this.edtLastName.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(5)});
        this.edtLastName.setInputType(524432);
        this.edtMembershipId.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(40)});
        this.edtMembershipId.setInputType(524432);
        lambda$of$1 lambda_of_1 = (lambda$of$1) getActivity().getIntent().getParcelableExtra("MileageAirlineMembershipDetailsActivity.MILEAGE_REDEMPTION_DTO_EXTRA");
        this.MediaBrowserCompat$MediaItem = lambda_of_1;
        if (lambda_of_1.MediaBrowserCompat$ItemReceiver) {
            this.btnReview.setText(getResources().getString(R.string.redeem));
        }
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onReviewClick() {
        newJsonReader newjsonreader = this.presenter;
        longAdapter longadapter = longAdapter.MediaBrowserCompat$ItemReceiver;
        if (newjsonreader.RatingCompat != null) {
            longadapter.IconCompatParcelizer(newjsonreader.RatingCompat);
        }
    }

    /* access modifiers changed from: protected */
    @OnTextChanged
    public void membershipIdTextChange(Editable editable) {
        String obj = editable.toString();
        this.IconCompatParcelizer = obj;
        newJsonReader newjsonreader = this.presenter;
        boolean z = true;
        if (obj.isEmpty() || newJsonReader.read(obj)) {
            C10896fieldNamingStrategy fieldnamingstrategy = C10896fieldNamingStrategy.write;
            if (newjsonreader.RatingCompat == null) {
                z = false;
            }
            if (z) {
                fieldnamingstrategy.IconCompatParcelizer(newjsonreader.RatingCompat);
            }
        } else {
            getDelegateAdapter getdelegateadapter = getDelegateAdapter.read;
            if (newjsonreader.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getdelegateadapter.IconCompatParcelizer(newjsonreader.RatingCompat);
            }
        }
        this.btnReview.setButtonEnabled(this.presenter.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    /* access modifiers changed from: protected */
    @OnTextChanged
    public void lastNameTextChange(Editable editable) {
        String obj = editable.toString();
        this.MediaBrowserCompat$CustomActionResultReceiver = obj;
        newJsonReader newjsonreader = this.presenter;
        boolean z = true;
        if (obj.isEmpty() || newjsonreader.IconCompatParcelizer(obj)) {
            htmlSafe htmlsafe = htmlSafe.IconCompatParcelizer;
            if (newjsonreader.RatingCompat == null) {
                z = false;
            }
            if (z) {
                htmlsafe.IconCompatParcelizer(newjsonreader.RatingCompat);
            }
        } else {
            atomicLongAdapter atomiclongadapter = atomicLongAdapter.MediaBrowserCompat$CustomActionResultReceiver;
            if (newjsonreader.RatingCompat == null) {
                z = false;
            }
            if (z) {
                atomiclongadapter.IconCompatParcelizer(newjsonreader.RatingCompat);
            }
        }
        this.btnReview.setButtonEnabled(this.presenter.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    public final void IconCompatParcelizer() {
        this.txvMembershipIdError.setVisibility(0);
        this.edtMembershipId.setBackground(setLastBaselineToBottomHeight.write(getActivity(), R.drawable.shape_red_reounded_reactangle_border));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.txvLastNameError.setVisibility(0);
        this.edtLastName.setBackground(setLastBaselineToBottomHeight.write(getActivity(), R.drawable.shape_red_reounded_reactangle_border));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        lambda$of$1 lambda_of_1 = this.MediaBrowserCompat$MediaItem;
        lambda_of_1.MediaBrowserCompat$MediaItem = this.IconCompatParcelizer;
        lambda_of_1.write = this.MediaBrowserCompat$CustomActionResultReceiver;
        Intent MediaBrowserCompat$ItemReceiver = MileageReviewRedemptionActivity.MediaBrowserCompat$ItemReceiver(getActivity(), this.MediaBrowserCompat$MediaItem);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaBrowserCompat$ItemReceiver, 105);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write() {
        this.txvMembershipIdError.setVisibility(8);
        this.edtMembershipId.setBackground(setLastBaselineToBottomHeight.write(getActivity(), R.drawable.bg_button_fake_white_with_purple_border_rounded));
    }

    public final void read() {
        this.txvLastNameError.setVisibility(8);
        this.edtLastName.setBackground(setLastBaselineToBottomHeight.write(getActivity(), R.drawable.bg_button_fake_white_with_purple_border_rounded));
    }

    /* access modifiers changed from: protected */
    @OnFocusChange
    public void onMembershipIdFocusChange() {
        if (this.edtMembershipId.hasFocus()) {
            if (this.IconCompatParcelizer.isEmpty() || newJsonReader.read(this.IconCompatParcelizer)) {
                this.edtMembershipId.setBackground(setLastBaselineToBottomHeight.write(getActivity(), R.drawable.bg_button_fake_white_with_purple_border_rounded));
            }
        } else if (this.IconCompatParcelizer.isEmpty() || newJsonReader.read(this.IconCompatParcelizer)) {
            this.edtMembershipId.setBackground(setLastBaselineToBottomHeight.write(getActivity(), R.drawable.shape_gray_rounded_rectangle));
        }
    }

    /* access modifiers changed from: protected */
    @OnFocusChange
    public void onLastNameFocusChange() {
        if (this.edtLastName.hasFocus()) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.isEmpty() || this.presenter.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver)) {
                this.edtLastName.setBackground(setLastBaselineToBottomHeight.write(getActivity(), R.drawable.bg_button_fake_white_with_purple_border_rounded));
            }
        } else if (this.MediaBrowserCompat$CustomActionResultReceiver.isEmpty() || this.presenter.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver)) {
            this.edtLastName.setBackground(setLastBaselineToBottomHeight.write(getActivity(), R.drawable.shape_gray_rounded_rectangle));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 105 && intent != null) {
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
        super.onActivityResult(i, i2, intent);
    }
}
