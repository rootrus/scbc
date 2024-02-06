package com.scb.phone.view.custom.transferandpay;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class CustomFavoriteHeaderSection_ViewBinding implements Unbinder {
    private CustomFavoriteHeaderSection IconCompatParcelizer;
    private View write;

    public CustomFavoriteHeaderSection_ViewBinding(final CustomFavoriteHeaderSection customFavoriteHeaderSection, View view) {
        this.IconCompatParcelizer = customFavoriteHeaderSection;
        customFavoriteHeaderSection.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_edit, "field 'mImageButton' and method 'onEditButtonClick'");
        customFavoriteHeaderSection.mImageButton = (ImageView) onStart.write(IconCompatParcelizer2, R.id.button_edit, "field 'mImageButton'", ImageView.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomFavoriteHeaderSection.this.onEditButtonClick(view);
            }
        });
    }

    public final void read() {
        CustomFavoriteHeaderSection customFavoriteHeaderSection = this.IconCompatParcelizer;
        if (customFavoriteHeaderSection != null) {
            this.IconCompatParcelizer = null;
            customFavoriteHeaderSection.textTitle = null;
            customFavoriteHeaderSection.mImageButton = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
