package com.scb.phone.view.fragment.easycash;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashSuccessDialogFragment_ViewBinding implements Unbinder {
    private View IconCompatParcelizer;
    private EasycashSuccessDialogFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public EasycashSuccessDialogFragment_ViewBinding(final EasycashSuccessDialogFragment easycashSuccessDialogFragment, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = easycashSuccessDialogFragment;
        easycashSuccessDialogFragment.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title, "field 'title'", TextView.class);
        easycashSuccessDialogFragment.subTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.subtitle, "field 'subTitle'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_done, "field 'buttonDone' and method 'onClick'");
        easycashSuccessDialogFragment.buttonDone = (Button) onStart.write(IconCompatParcelizer2, R.id.button_done, "field 'buttonDone'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashSuccessDialogFragment.this.onClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_purple, "field 'buttonPurple'");
        easycashSuccessDialogFragment.buttonPurple = (Button) onStart.write(IconCompatParcelizer3, R.id.button_purple, "field 'buttonPurple'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashSuccessDialogFragment.this.onPurpleButtonClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.secondary_button, "field 'secondaryButton'");
        easycashSuccessDialogFragment.secondaryButton = (TextView) onStart.write(IconCompatParcelizer4, R.id.secondary_button, "field 'secondaryButton'", TextView.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashSuccessDialogFragment.this.onSecondaryButtonClick();
            }
        });
    }

    public final void read() {
        EasycashSuccessDialogFragment easycashSuccessDialogFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (easycashSuccessDialogFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            easycashSuccessDialogFragment.title = null;
            easycashSuccessDialogFragment.subTitle = null;
            easycashSuccessDialogFragment.buttonDone = null;
            easycashSuccessDialogFragment.buttonPurple = null;
            easycashSuccessDialogFragment.secondaryButton = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
