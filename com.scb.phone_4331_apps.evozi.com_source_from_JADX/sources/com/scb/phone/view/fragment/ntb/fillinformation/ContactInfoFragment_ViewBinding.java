package com.scb.phone.view.fragment.ntb.fillinformation;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ContactInfoFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private ContactInfoFragment write;

    public ContactInfoFragment_ViewBinding(final ContactInfoFragment contactInfoFragment, View view) {
        super(contactInfoFragment, view);
        this.write = contactInfoFragment;
        contactInfoFragment.customEmail = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.email_edit_text, "field 'customEmail'", CommonInputViewGroup.class);
        contactInfoFragment.customMobile = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.mobile, "field 'customMobile'", CommonInputViewGroup.class);
        contactInfoFragment.textHomeAddress = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_home_address, "field 'textHomeAddress'", TextView.class);
        contactInfoFragment.textCurrentAddress = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_current_address, "field 'textCurrentAddress'", TextView.class);
        contactInfoFragment.layoutCurrentAddress = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_current_address, "field 'layoutCurrentAddress'", RelativeLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.layout_home_address, "field 'layoutHomeAddress' and method 'onHomeAddressClick'");
        contactInfoFragment.layoutHomeAddress = (RelativeLayout) onStart.write(IconCompatParcelizer2, R.id.layout_home_address, "field 'layoutHomeAddress'", RelativeLayout.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ContactInfoFragment.this.onHomeAddressClick();
            }
        });
        contactInfoFragment.imageArrowCurrent = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_arrow, "field 'imageArrowCurrent'", ImageView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.checkbox_same_address, "field 'checkBoxSameAddress' and method 'onSameAddressCheckedChanged'");
        contactInfoFragment.checkBoxSameAddress = (CheckBox) onStart.write(IconCompatParcelizer3, R.id.checkbox_same_address, "field 'checkBoxSameAddress'", CheckBox.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        ((CompoundButton) IconCompatParcelizer3).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ContactInfoFragment.this.onSameAddressCheckedChanged(compoundButton, z);
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'buttonNext' and method 'onNextButtonClick'");
        contactInfoFragment.buttonNext = (Button) onStart.write(IconCompatParcelizer4, R.id.button_next, "field 'buttonNext'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ContactInfoFragment.this.onNextButtonClick();
            }
        });
    }

    public final void read() {
        ContactInfoFragment contactInfoFragment = this.write;
        if (contactInfoFragment != null) {
            this.write = null;
            contactInfoFragment.customEmail = null;
            contactInfoFragment.customMobile = null;
            contactInfoFragment.textHomeAddress = null;
            contactInfoFragment.textCurrentAddress = null;
            contactInfoFragment.layoutCurrentAddress = null;
            contactInfoFragment.layoutHomeAddress = null;
            contactInfoFragment.imageArrowCurrent = null;
            contactInfoFragment.checkBoxSameAddress = null;
            contactInfoFragment.buttonNext = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            ((CompoundButton) this.MediaBrowserCompat$ItemReceiver).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
