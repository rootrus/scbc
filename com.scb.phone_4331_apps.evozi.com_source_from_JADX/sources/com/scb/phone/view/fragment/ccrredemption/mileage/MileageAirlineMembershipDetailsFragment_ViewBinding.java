package com.scb.phone.view.fragment.ccrredemption.mileage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class MileageAirlineMembershipDetailsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private TextWatcher IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private MileageAirlineMembershipDetailsFragment MediaBrowserCompat$ItemReceiver;
    private TextWatcher MediaBrowserCompat$MediaItem;
    private View MediaMetadataCompat;
    private View write;

    public MileageAirlineMembershipDetailsFragment_ViewBinding(final MileageAirlineMembershipDetailsFragment mileageAirlineMembershipDetailsFragment, View view) {
        super(mileageAirlineMembershipDetailsFragment, view);
        this.MediaBrowserCompat$ItemReceiver = mileageAirlineMembershipDetailsFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.edt_membership_id, "field 'edtMembershipId', method 'onMembershipIdFocusChange', and method 'membershipIdTextChange'");
        mileageAirlineMembershipDetailsFragment.edtMembershipId = (EditText) onStart.write(IconCompatParcelizer2, R.id.edt_membership_id, "field 'edtMembershipId'", EditText.class);
        this.MediaMetadataCompat = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                MileageAirlineMembershipDetailsFragment.this.onMembershipIdFocusChange();
            }
        });
        C90434 r0 = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                MileageAirlineMembershipDetailsFragment.this.membershipIdTextChange((Editable) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) charSequence, "onTextChanged", "membershipIdTextChange", Editable.class));
            }
        };
        this.MediaBrowserCompat$MediaItem = r0;
        ((TextView) IconCompatParcelizer2).addTextChangedListener(r0);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.edt_last_name, "field 'edtLastName', method 'onLastNameFocusChange', and method 'lastNameTextChange'");
        mileageAirlineMembershipDetailsFragment.edtLastName = (EditText) onStart.write(IconCompatParcelizer3, R.id.edt_last_name, "field 'edtLastName'", EditText.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                MileageAirlineMembershipDetailsFragment.this.onLastNameFocusChange();
            }
        });
        C90445 r02 = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                MileageAirlineMembershipDetailsFragment.this.lastNameTextChange((Editable) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) charSequence, "onTextChanged", "lastNameTextChange", Editable.class));
            }
        };
        this.IconCompatParcelizer = r02;
        ((TextView) IconCompatParcelizer3).addTextChangedListener(r02);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.btn_review, "field 'btnReview' and method 'onReviewClick'");
        mileageAirlineMembershipDetailsFragment.btnReview = (DefaultButton) onStart.write(IconCompatParcelizer4, R.id.btn_review, "field 'btnReview'", DefaultButton.class);
        this.write = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MileageAirlineMembershipDetailsFragment.this.onReviewClick();
            }
        });
        mileageAirlineMembershipDetailsFragment.txvMembershipIdError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_error_membership_id, "field 'txvMembershipIdError'", TextView.class);
        mileageAirlineMembershipDetailsFragment.txvLastNameError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_error_last_name, "field 'txvLastNameError'", TextView.class);
    }

    public final void read() {
        MileageAirlineMembershipDetailsFragment mileageAirlineMembershipDetailsFragment = this.MediaBrowserCompat$ItemReceiver;
        if (mileageAirlineMembershipDetailsFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            mileageAirlineMembershipDetailsFragment.edtMembershipId = null;
            mileageAirlineMembershipDetailsFragment.edtLastName = null;
            mileageAirlineMembershipDetailsFragment.btnReview = null;
            mileageAirlineMembershipDetailsFragment.txvMembershipIdError = null;
            mileageAirlineMembershipDetailsFragment.txvLastNameError = null;
            this.MediaMetadataCompat.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            ((TextView) this.MediaMetadataCompat).removeTextChangedListener(this.MediaBrowserCompat$MediaItem);
            this.MediaBrowserCompat$MediaItem = null;
            this.MediaMetadataCompat = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            ((TextView) this.MediaBrowserCompat$CustomActionResultReceiver).removeTextChangedListener(this.IconCompatParcelizer);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
