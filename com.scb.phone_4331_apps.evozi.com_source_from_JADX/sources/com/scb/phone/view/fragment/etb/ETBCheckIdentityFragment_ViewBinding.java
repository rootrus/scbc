package com.scb.phone.view.fragment.etb;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ETBCheckIdentityFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private ETBCheckIdentityFragment write;

    public ETBCheckIdentityFragment_ViewBinding(final ETBCheckIdentityFragment eTBCheckIdentityFragment, View view) {
        super(eTBCheckIdentityFragment, view);
        this.write = eTBCheckIdentityFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'nextButton' and method 'onNextButtonClick'");
        eTBCheckIdentityFragment.nextButton = (Button) onStart.write(IconCompatParcelizer, R.id.button_next, "field 'nextButton'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ETBCheckIdentityFragment.this.onNextButtonClick();
            }
        });
        eTBCheckIdentityFragment.laserIdFirst = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.laser_id_first, "field 'laserIdFirst'", EditText.class);
        eTBCheckIdentityFragment.laserIdSecond = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.laser_id_second, "field 'laserIdSecond'", EditText.class);
        eTBCheckIdentityFragment.laserIdThird = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.laser_id_third, "field 'laserIdThird'", EditText.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.help_button, "method 'onHelpButtonClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ETBCheckIdentityFragment.this.onHelpButtonClick();
            }
        });
    }

    public final void read() {
        ETBCheckIdentityFragment eTBCheckIdentityFragment = this.write;
        if (eTBCheckIdentityFragment != null) {
            this.write = null;
            eTBCheckIdentityFragment.nextButton = null;
            eTBCheckIdentityFragment.laserIdFirst = null;
            eTBCheckIdentityFragment.laserIdSecond = null;
            eTBCheckIdentityFragment.laserIdThird = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
