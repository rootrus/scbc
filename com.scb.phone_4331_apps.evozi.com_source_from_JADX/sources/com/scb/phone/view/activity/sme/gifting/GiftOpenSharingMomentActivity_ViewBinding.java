package com.scb.phone.view.activity.sme.gifting;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class GiftOpenSharingMomentActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private GiftOpenSharingMomentActivity write;

    public GiftOpenSharingMomentActivity_ViewBinding(final GiftOpenSharingMomentActivity giftOpenSharingMomentActivity, View view) {
        super(giftOpenSharingMomentActivity, view);
        this.write = giftOpenSharingMomentActivity;
        giftOpenSharingMomentActivity.gridColorsRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_note_colors_list, "field 'gridColorsRecyclerView'", RecyclerView.class);
        giftOpenSharingMomentActivity.backgroundImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_note_img, "field 'backgroundImage'", ImageView.class);
        giftOpenSharingMomentActivity.backgroundMsg = (TextInputEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_note_input_txt, "field 'backgroundMsg'", TextInputEditText.class);
        giftOpenSharingMomentActivity.shareMomentArea = onStart.IconCompatParcelizer(view, R.id.share_moment_area, "field 'shareMomentArea'");
        giftOpenSharingMomentActivity.buttonsArea = onStart.IconCompatParcelizer(view, R.id.buttons_area, "field 'buttonsArea'");
        giftOpenSharingMomentActivity.fragmentContainer = onStart.IconCompatParcelizer(view, R.id.container, "field 'fragmentContainer'");
        giftOpenSharingMomentActivity.giftTapToEditHint = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_text_tap_hint, "field 'giftTapToEditHint'", TextView.class);
        giftOpenSharingMomentActivity.toolbar = onStart.IconCompatParcelizer(view, R.id.toolbar, "field 'toolbar'");
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.gift_sharing_moment_preview_button, "method 'previewButton'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                GiftOpenSharingMomentActivity.this.previewButton();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.gift_sharing_moment_share_button, "method 'shareGiftMoment'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                GiftOpenSharingMomentActivity.this.shareGiftMoment();
            }
        });
    }

    public final void read() {
        GiftOpenSharingMomentActivity giftOpenSharingMomentActivity = this.write;
        if (giftOpenSharingMomentActivity != null) {
            this.write = null;
            giftOpenSharingMomentActivity.gridColorsRecyclerView = null;
            giftOpenSharingMomentActivity.backgroundImage = null;
            giftOpenSharingMomentActivity.backgroundMsg = null;
            giftOpenSharingMomentActivity.shareMomentArea = null;
            giftOpenSharingMomentActivity.buttonsArea = null;
            giftOpenSharingMomentActivity.fragmentContainer = null;
            giftOpenSharingMomentActivity.giftTapToEditHint = null;
            giftOpenSharingMomentActivity.toolbar = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
