package com.scb.phone.view.activity.additionaldocument;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ReviewDocumentActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$SearchResultReceiver;
    private ReviewDocumentActivity write;

    public ReviewDocumentActivity_ViewBinding(final ReviewDocumentActivity reviewDocumentActivity, View view) {
        super(reviewDocumentActivity, view);
        this.write = reviewDocumentActivity;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.iv_review, "field 'imageReview' and method 'onImageClicked'");
        reviewDocumentActivity.imageReview = (ImageView) onStart.write(IconCompatParcelizer2, R.id.iv_review, "field 'imageReview'", ImageView.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ReviewDocumentActivity.this.onImageClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.tv_done, "field 'confirmTextView' and method 'onDoneClicked'");
        reviewDocumentActivity.confirmTextView = (TextView) onStart.write(IconCompatParcelizer3, R.id.tv_done, "field 'confirmTextView'", TextView.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ReviewDocumentActivity.this.onDoneClicked();
            }
        });
        reviewDocumentActivity.tapText = onStart.IconCompatParcelizer(view, R.id.tv_tap, "field 'tapText'");
        reviewDocumentActivity.tapIcon = onStart.IconCompatParcelizer(view, R.id.iv_tap_icon, "field 'tapIcon'");
        reviewDocumentActivity.infoText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_info, "field 'infoText'", TextView.class);
        reviewDocumentActivity.layout = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root, "field 'layout'", ConstraintLayout.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.tv_retake, "method 'onRetakeClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ReviewDocumentActivity.this.onRetakeClicked();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.tv_rotate, "method 'onRotateClicked'");
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ReviewDocumentActivity.this.onRotateClicked();
            }
        });
    }

    public final void read() {
        ReviewDocumentActivity reviewDocumentActivity = this.write;
        if (reviewDocumentActivity != null) {
            this.write = null;
            reviewDocumentActivity.imageReview = null;
            reviewDocumentActivity.confirmTextView = null;
            reviewDocumentActivity.tapText = null;
            reviewDocumentActivity.tapIcon = null;
            reviewDocumentActivity.infoText = null;
            reviewDocumentActivity.layout = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$SearchResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$SearchResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
