package com.scb.phone.view.custom.investment.onboarding;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class CustomSpinnerWithTitle_ViewBinding implements Unbinder {
    private View IconCompatParcelizer;
    private CustomSpinnerWithTitle MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public CustomSpinnerWithTitle_ViewBinding(final CustomSpinnerWithTitle customSpinnerWithTitle, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customSpinnerWithTitle;
        customSpinnerWithTitle.labelTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'labelTitle'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.spinner_container, "field 'containerSpinner' and method 'onClickSpinnerContainer'");
        customSpinnerWithTitle.containerSpinner = (RelativeLayout) onStart.write(IconCompatParcelizer2, R.id.spinner_container, "field 'containerSpinner'", RelativeLayout.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomSpinnerWithTitle.this.onClickSpinnerContainer();
            }
        });
        customSpinnerWithTitle.textViewDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_view_description, "field 'textViewDescription'", TextView.class);
        customSpinnerWithTitle.spinner = (CustomDropdownAwareSpinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spinner, "field 'spinner'", CustomDropdownAwareSpinner.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.image_spinner_arrow, "field 'imageSpinnerArrow' and method 'onClickArrow'");
        customSpinnerWithTitle.imageSpinnerArrow = (ImageView) onStart.write(IconCompatParcelizer3, R.id.image_spinner_arrow, "field 'imageSpinnerArrow'", ImageView.class);
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomSpinnerWithTitle.this.onClickArrow();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.iv_icon, "field 'iconImage' and method 'onIconClick'");
        customSpinnerWithTitle.iconImage = (ImageView) onStart.write(IconCompatParcelizer4, R.id.iv_icon, "field 'iconImage'", ImageView.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomSpinnerWithTitle.this.onIconClick(view);
            }
        });
    }

    public final void read() {
        CustomSpinnerWithTitle customSpinnerWithTitle = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customSpinnerWithTitle != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customSpinnerWithTitle.labelTitle = null;
            customSpinnerWithTitle.containerSpinner = null;
            customSpinnerWithTitle.textViewDescription = null;
            customSpinnerWithTitle.spinner = null;
            customSpinnerWithTitle.imageSpinnerArrow = null;
            customSpinnerWithTitle.iconImage = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
