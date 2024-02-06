package com.scb.phone.view.fragment.debitatm;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DebitCardServiceTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DebitCardServiceTabFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public DebitCardServiceTabFragment_ViewBinding(final DebitCardServiceTabFragment debitCardServiceTabFragment, View view) {
        super(debitCardServiceTabFragment, view);
        this.IconCompatParcelizer = debitCardServiceTabFragment;
        debitCardServiceTabFragment.layoutCardStatus = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_card_status, "field 'layoutCardStatus'", RelativeLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.card_lock_toggle, "field 'switchCardStatus' and method 'onCardLockToggleChanged'");
        debitCardServiceTabFragment.switchCardStatus = (SwitchCompat) onStart.write(IconCompatParcelizer2, R.id.card_lock_toggle, "field 'switchCardStatus'", SwitchCompat.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        ((CompoundButton) IconCompatParcelizer2).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                DebitCardServiceTabFragment.this.onCardLockToggleChanged(compoundButton, z);
            }
        });
        debitCardServiceTabFragment.cardLockTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_lock_instruction_text, "field 'cardLockTextView'", TextView.class);
        debitCardServiceTabFragment.cardLockTextNoAllowTag = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_lock_no_allow_tag, "field 'cardLockTextNoAllowTag'", TextView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.layout_limit, "method 'onClickManageLimit'");
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DebitCardServiceTabFragment.this.onClickManageLimit();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.layout_reset_card_pin, "method 'onClickResetPin'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DebitCardServiceTabFragment.this.onClickResetPin();
            }
        });
    }

    public final void read() {
        DebitCardServiceTabFragment debitCardServiceTabFragment = this.IconCompatParcelizer;
        if (debitCardServiceTabFragment != null) {
            this.IconCompatParcelizer = null;
            debitCardServiceTabFragment.layoutCardStatus = null;
            debitCardServiceTabFragment.switchCardStatus = null;
            debitCardServiceTabFragment.cardLockTextView = null;
            debitCardServiceTabFragment.cardLockTextNoAllowTag = null;
            ((CompoundButton) this.MediaBrowserCompat$ItemReceiver).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
