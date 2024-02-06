package com.scb.phone.view.fragment.transferandpay;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.transferandpay.EditFavouriteAdapter;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.ActivityBuilder_ContributeSubdistrictSearchActivity;
import p040o.ActivityBuilder_ContributeSummaryActivity;
import p040o.ActivityBuilder_ContributeThirdPartyConsentActivity;
import p040o.ActivityBuilder_ContributeTouchPointFatcaActivity;
import p040o.C5171qQ;
import p040o.C5208rZ;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindBaseInvestmentSuccessReviewFragment;
import p040o.HmlPinActivity;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.access$2200;
import p040o.getRegistrationsAddresses;
import p040o.getTopLeftCornerWidth;
import p040o.setGuidanceAlpha;

public class EditFavouriteFragment extends BaseFragment implements getTopLeftCornerWidth.Keep, FragmentBuilder_BindBaseInvestmentSuccessReviewFragment {
    public CustomInputDialog IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public C5171qQ editFavouritePresenter;
    @BindView
    protected ImageView favouriteAddIcon;
    @BindView
    protected TextView favouriteEmptySuggestion;
    @BindView
    protected TextView favouriteEmptySuggestionTitle;
    @BindView
    protected TextView favouriteEmptySuggestionWithImage;
    @BindView
    View mError;
    @BindView
    protected LinearLayout mFavouriteEmpty;
    @BindView
    RecyclerView mRecyclerView;

    public static EditFavouriteFragment write(String str) {
        Bundle bundle = new Bundle();
        EditFavouriteFragment editFavouriteFragment = new EditFavouriteFragment();
        bundle.putString("com.scb.phone.EXTRA_EDIT_FAVOURITE_TAG", str);
        editFavouriteFragment.setArguments(bundle);
        return editFavouriteFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87252131493952, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.editFavouritePresenter.MediaBrowserCompat$ItemReceiver(this);
        String string = getArguments().getString("com.scb.phone.EXTRA_EDIT_FAVOURITE_TAG");
        this.MediaBrowserCompat$CustomActionResultReceiver = string;
        TextView textView = this.favouriteEmptySuggestionTitle;
        if ("TRANSFER".equals(string)) {
            i = Iterables$3$MediaBrowserCompat$MediaItem.favorite_suggestion_title_transfer;
        } else if ("BILLPAYMENT".equals(string)) {
            i = Iterables$3$MediaBrowserCompat$MediaItem.favorite_is_empty;
        } else if ("TOPUP".equals(string)) {
            i = Iterables$3$MediaBrowserCompat$MediaItem.favorite_is_empty;
        } else if ("REMITTANCE".equals(string)) {
            i = Iterables$3$MediaBrowserCompat$MediaItem.favorite_is_empty;
        } else {
            i = 0;
        }
        textView.setText(i);
        C5171qQ qQVar = this.editFavouritePresenter;
        setGuidanceAlpha setguidancealpha = new setGuidanceAlpha(this.MediaBrowserCompat$CustomActionResultReceiver);
        if (qQVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            setguidancealpha.IconCompatParcelizer(qQVar.RatingCompat);
        }
        return inflate;
    }

    public void onResume() {
        super.onResume();
        this.editFavouritePresenter.write(this.MediaBrowserCompat$CustomActionResultReceiver);
        MediaDescriptionCompat();
    }

    public void onDestroy() {
        this.editFavouritePresenter.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(List<? extends CrashlyticsReport.Session.Builder> list) {
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.mRecyclerView.setAdapter(new EditFavouriteAdapter(getContext(), this, list));
        this.mRecyclerView.setVisibility(0);
        this.mFavouriteEmpty.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.mRecyclerView.setVisibility(8);
        this.mError.setVisibility(0);
    }

    public final void read() {
        this.mRecyclerView.setVisibility(8);
        this.mFavouriteEmpty.setVisibility(0);
    }

    @OnClick
    public void onErrorViewClicked() {
        this.mError.setVisibility(8);
        this.editFavouritePresenter.write(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void IconCompatParcelizer(int i) {
        C5171qQ qQVar = this.editFavouritePresenter;
        C5208rZ rZVar = new C5208rZ(this.MediaBrowserCompat$CustomActionResultReceiver, i);
        if (qQVar.RatingCompat != null) {
            rZVar.IconCompatParcelizer(qQVar.RatingCompat);
        }
    }

    public final void read(int i, String str) {
        CustomInputDialog MediaBrowserCompat$ItemReceiver = CustomInputDialog.MediaBrowserCompat$ItemReceiver(getContext());
        this.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$ItemReceiver.mEditTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        CustomInputDialog customInputDialog = this.IconCompatParcelizer;
        customInputDialog.mEditTextView.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                EditFavouriteFragment.this.IconCompatParcelizer.mErrorTextView.setVisibility(8);
            }
        });
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        CustomInputDialog customInputDialog2 = this.IconCompatParcelizer;
        String string = getString(R.string.edit_favourite_name);
        if (string != null) {
            customInputDialog2.mTitleTextView.setVisibility(0);
            customInputDialog2.mTitleTextView.setText(string);
        }
        this.IconCompatParcelizer.setCanceledOnTouchOutside(false);
        this.IconCompatParcelizer.read(str);
        CustomInputDialog customInputDialog3 = this.IconCompatParcelizer;
        customInputDialog3.write(customInputDialog3.MediaBrowserCompat$ItemReceiver.getString(R.string.cancel), ActivityBuilder_ContributeSummaryActivity.write);
        CustomInputDialog customInputDialog4 = this.IconCompatParcelizer;
        String string2 = getString(R.string.edit_favourite);
        ActivityBuilder_ContributeThirdPartyConsentActivity activityBuilder_ContributeThirdPartyConsentActivity = new ActivityBuilder_ContributeThirdPartyConsentActivity(this, i);
        if (string2 != null) {
            customInputDialog4.mPositiveButton.setText(string2);
            customInputDialog4.mPositiveButton.setOnClickListener(new getRegistrationsAddresses(customInputDialog4, activityBuilder_ContributeThirdPartyConsentActivity, false));
        }
        customInputDialog4.show();
    }

    private void MediaBrowserCompat$ItemReceiver(String str, String str2, int i) {
        CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(str).MediaBrowserCompat$ItemReceiver(str2).IconCompatParcelizer(getString(R.string.fav_del_positive), new ActivityBuilder_ContributeTouchPointFatcaActivity(this, i)).MediaBrowserCompat$ItemReceiver(getString(R.string.fav_del_negative), ActivityBuilder_ContributeSubdistrictSearchActivity.read).show();
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        MediaBrowserCompat$ItemReceiver(getString(R.string.confirm_delete_favorite_top_up), getString(R.string.confirm_delete_top_up_description), i);
    }

    public final void read(int i) {
        MediaBrowserCompat$ItemReceiver(getString(R.string.confirm_delete_favorite_transfer), getString(R.string.confirm_delete_transfer_description), i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        MediaBrowserCompat$ItemReceiver(getString(R.string.confirm_delete_favorite_payment), getString(R.string.confirm_delete_bill_payment_description), i);
    }

    public final void write() {
        CustomInputDialog customInputDialog = this.IconCompatParcelizer;
        if (customInputDialog != null) {
            customInputDialog.dismiss();
            this.editFavouritePresenter.write(this.MediaBrowserCompat$CustomActionResultReceiver);
            MediaDescriptionCompat();
        }
    }

    public final void IconCompatParcelizer() {
        this.mRecyclerView.setVisibility(8);
        this.editFavouritePresenter.write(this.MediaBrowserCompat$CustomActionResultReceiver);
        MediaDescriptionCompat();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(access$2200 access_2200) {
        String str;
        CustomInputDialog customInputDialog = this.IconCompatParcelizer;
        if (customInputDialog != null) {
            if (access_2200.IconCompatParcelizer.length() > 0) {
                str = access_2200.IconCompatParcelizer;
            } else {
                str = access_2200.MediaBrowserCompat$ItemReceiver;
            }
            customInputDialog.mErrorTextView.setVisibility(0);
            customInputDialog.mErrorTextView.setText(str);
        }
    }

    public final void write(int i) {
        this.favouriteEmptySuggestionWithImage.setVisibility(8);
        this.favouriteAddIcon.setVisibility(8);
        this.favouriteEmptySuggestion.setText(i);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.favouriteEmptySuggestionWithImage.setVisibility(0);
        this.favouriteAddIcon.setVisibility(0);
        this.favouriteEmptySuggestion.setText(R.string.favorite_add_suggestion_transfer_start);
        this.favouriteEmptySuggestionWithImage.setText(R.string.favorite_add_suggestion_transfer_end);
    }

    private void MediaDescriptionCompat() {
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_EDIT_FAVORITE_REFRESH");
        intent.putExtra("com.scb.phone.EXTRA_EDIT_FAVOURITE_TITLE", this.MediaBrowserCompat$CustomActionResultReceiver);
        getContext().sendBroadcast(intent);
        Intent intent2 = new Intent();
        intent2.setAction("com.scb.phone/BROADCAST_ADD_TILE_TO_ROOT");
        getContext().sendBroadcast(intent2);
    }
}
