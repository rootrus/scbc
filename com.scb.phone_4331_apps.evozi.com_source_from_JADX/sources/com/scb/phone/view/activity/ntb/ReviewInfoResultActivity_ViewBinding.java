package com.scb.phone.view.activity.ntb;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ReviewInfoResultActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ReviewInfoResultActivity IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public ReviewInfoResultActivity_ViewBinding(final ReviewInfoResultActivity reviewInfoResultActivity, View view) {
        super(reviewInfoResultActivity, view);
        this.IconCompatParcelizer = reviewInfoResultActivity;
        reviewInfoResultActivity.imageInfo = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_info, "field 'imageInfo'", ImageView.class);
        reviewInfoResultActivity.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
        reviewInfoResultActivity.textDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_description, "field 'textDescription'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_find_us, "field 'findUsButton' and method 'navigate'");
        reviewInfoResultActivity.findUsButton = (Button) onStart.write(IconCompatParcelizer2, R.id.button_find_us, "field 'findUsButton'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ReviewInfoResultActivity.this.navigate();
            }
        });
        reviewInfoResultActivity.linearLayoutBackground = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_background, "field 'linearLayoutBackground'", LinearLayout.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_return_home, "method 'returnHome'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ReviewInfoResultActivity.this.returnHome();
            }
        });
    }

    public void read() {
        ReviewInfoResultActivity reviewInfoResultActivity = this.IconCompatParcelizer;
        if (reviewInfoResultActivity != null) {
            this.IconCompatParcelizer = null;
            reviewInfoResultActivity.imageInfo = null;
            reviewInfoResultActivity.textTitle = null;
            reviewInfoResultActivity.textDescription = null;
            reviewInfoResultActivity.findUsButton = null;
            reviewInfoResultActivity.linearLayoutBackground = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
