package com.scb.phone.view.fragment.profilemanagement.accounts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.profilemanagement.accounts.VerifyIdentityTipsActivity;
import com.scb.phone.view.custom.common.CustomATMInput;
import com.scb.phone.view.custom.common.CustomCardInformationInput;
import com.scb.phone.view.custom.common.CustomCardInformationInput$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.ActivityBuilder_ContributeIntroductionActivity;
import p040o.ActivityBuilder_ContributeJuristicOtpActivity;
import p040o.ActivityBuilder_ContributeJuristicRequestFormActivity;
import p040o.ActivityBuilder_ContributeJuristicResetPinOtpActivity;
import p040o.C4866jf;
import p040o.C4867jg;
import p040o.HmlPinActivity;
import p040o.QuickExtractor;
import p040o.removeIfFromRandomAccessList;

public class VerifyIdentityFragment extends BaseFragment implements QuickExtractor.C70173 {
    private TextView.OnEditorActionListener IconCompatParcelizer = new ActivityBuilder_ContributeIntroductionActivity(this);
    private TextView.OnEditorActionListener MediaBrowserCompat$CustomActionResultReceiver = new ActivityBuilder_ContributeJuristicResetPinOtpActivity(this);
    @BindView
    public CustomCardInformationInput cardNoInput;
    @BindView
    Button confirmButton;
    @BindView
    CustomATMInput pinInput;
    @HmlPinActivity
    public C4867jg presenter;

    public static VerifyIdentityFragment MediaSessionCompat$QueueItem() {
        Bundle bundle = new Bundle();
        VerifyIdentityFragment verifyIdentityFragment = new VerifyIdentityFragment();
        verifyIdentityFragment.setArguments(bundle);
        return verifyIdentityFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.f90332131494260, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.confirmButton.setEnabled(false);
        this.cardNoInput.setCardInputListener(new CustomCardInformationInput$MediaBrowserCompat$ItemReceiver() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
                VerifyIdentityFragment.this.cardNoInput.setIcon(z ? R.drawable.ic_sample_card_grey : R.drawable.ic_sample_card);
                VerifyIdentityFragment.this.pinInput.setHint(VerifyIdentityFragment.this.getString(R.string.unknown_pin_hint));
                VerifyIdentityFragment.this.cardNoInput.setErrorValidationVisibility(8);
            }

            public final void read(String str) {
                VerifyIdentityFragment.this.presenter.write(str, false);
            }

            public final void write(String str) {
                VerifyIdentityFragment.this.presenter.write(str, true);
            }

            public final void write() {
                VerifyIdentityFragment.this.confirmButton.setEnabled(false);
            }

            public final void read(boolean z) {
                VerifyIdentityFragment.this.presenter.MediaBrowserCompat$ItemReceiver(z);
            }

            public final String MediaBrowserCompat$ItemReceiver(String str) {
                return removeIfFromRandomAccessList.read(str, "[^0-9]", "XXXX XXXX XXXX XXXX");
            }
        });
        this.cardNoInput.setCardNoEditorActionListener(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.cardNoInput.setCardNumber("");
        this.cardNoInput.setIcon((int) R.drawable.ic_sample_card_grey);
        this.cardNoInput.setRegularText();
        this.cardNoInput.setOnFocusLostListener(new ActivityBuilder_ContributeJuristicOtpActivity(this));
        this.pinInput.setCardInputListener(new CustomATMInput.write() {
            public final void MediaBrowserCompat$ItemReceiver(boolean z) {
                VerifyIdentityFragment.this.presenter.MediaBrowserCompat$CustomActionResultReceiver(z);
            }

            public final void MediaBrowserCompat$ItemReceiver(String str) {
                VerifyIdentityFragment.this.presenter.MediaBrowserCompat$CustomActionResultReceiver(str);
            }
        });
        this.pinInput.setOnEditorActionListener(this.IconCompatParcelizer);
        this.pinInput.setATMNumber("");
        this.pinInput.setHint(getString(R.string.unknown_pin_hint));
        this.cardNoInput.setHeaderVisibility(8);
        this.confirmButton.setOnClickListener(new ActivityBuilder_ContributeJuristicRequestFormActivity(this));
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.cardNoInput.setIcon((int) R.drawable.ic_sample_card_grey);
        this.pinInput.setHint(getString(R.string.unknown_pin_hint));
    }

    public final void read() {
        this.cardNoInput.setIcon((int) R.drawable.ic_atm_card);
        this.pinInput.setHint(getString(R.string.atm_pin_hint));
    }

    public final void write() {
        this.cardNoInput.setIcon((int) R.drawable.ic_credit_card);
        this.pinInput.setHint(getString(R.string.cc_pin_hint));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.cardNoInput.setIcon((int) R.drawable.ic_sample_card);
        this.pinInput.setHint(getString(R.string.unknown_pin_hint));
    }

    public final void IconCompatParcelizer() {
        this.cardNoInput.setErrorValidationVisibility(0);
    }

    public final void RatingCompat() {
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver();
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver(this.pinInput.IconCompatParcelizer());
        this.cardNoInput.setErrorValidationVisibility(8);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        this.presenter.MediaBrowserCompat$ItemReceiver();
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver(this.pinInput.IconCompatParcelizer());
        this.cardNoInput.setErrorValidationVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.confirmButton.setEnabled(z);
    }

    public final void MediaBrowserCompat$MediaItem() {
        if (getActivity() != null) {
            getActivity().setResult(-1);
            getActivity().onBackPressed();
        }
    }

    public final void MediaMetadataCompat() {
        this.pinInput.atmPin.requestFocus();
    }

    public final void read(String str) {
        mo13677k_(str);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo39241x50fd9e4a() {
        this.cardNoInput.setErrorValidationVisibility(0);
    }

    public final void MediaDescriptionCompat() {
        this.pinInput.atmPin.requestFocus();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_action_bulk_transfer_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        C4867jg jgVar = this.presenter;
        C4866jf jfVar = C4866jf.MediaBrowserCompat$CustomActionResultReceiver;
        if (jgVar.RatingCompat != null) {
            jfVar.IconCompatParcelizer(jgVar.RatingCompat);
        }
        return true;
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        if (getContext() != null) {
            VerifyIdentityTipsActivity.write(getContext());
        }
    }
}
