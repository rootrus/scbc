package com.scb.phone.view.fragment.juristic;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class JuristicResetPinLandingFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private JuristicResetPinLandingFragment write;

    public JuristicResetPinLandingFragment_ViewBinding(final JuristicResetPinLandingFragment juristicResetPinLandingFragment, View view) {
        super(juristicResetPinLandingFragment, view);
        this.write = juristicResetPinLandingFragment;
        juristicResetPinLandingFragment.ivgJuristicNumber = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_juristic_number, "field 'ivgJuristicNumber'", CommonInputViewGroup.class);
        juristicResetPinLandingFragment.ivgJuristicAccount = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_juristic_account, "field 'ivgJuristicAccount'", CommonInputViewGroup.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_next, "field 'btnNext' and method 'navigateTo'");
        juristicResetPinLandingFragment.btnNext = (Button) onStart.write(IconCompatParcelizer, R.id.btn_next, "field 'btnNext'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                JuristicResetPinLandingFragment.this.navigateTo();
            }
        });
    }

    public final void read() {
        JuristicResetPinLandingFragment juristicResetPinLandingFragment = this.write;
        if (juristicResetPinLandingFragment != null) {
            this.write = null;
            juristicResetPinLandingFragment.ivgJuristicNumber = null;
            juristicResetPinLandingFragment.ivgJuristicAccount = null;
            juristicResetPinLandingFragment.btnNext = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
