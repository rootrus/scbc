package com.scb.phone.view.fragment.transferandpay;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.transferandpay.CustomNoteItem;
import com.scb.phone.view.custom.transferandpay.CustomPhotoLeftDetails;
import p040o.onCreateDialog;
import p040o.onStart;

public class ReviewFragment_ViewBinding extends BaseReviewFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private ReviewFragment write;

    public ReviewFragment_ViewBinding(final ReviewFragment reviewFragment, View view) {
        super(reviewFragment, view);
        this.write = reviewFragment;
        reviewFragment.movieDetails = (CustomPhotoLeftDetails) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.movie_details, "field 'movieDetails'", CustomPhotoLeftDetails.class);
        reviewFragment.messageDetails = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.message_note, "field 'messageDetails'", CustomNoteItem.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_confirm, "field 'mConfirmButton' and method 'onButtonClicked'");
        reviewFragment.mConfirmButton = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_confirm, "field 'mConfirmButton'", DefaultButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ReviewFragment.this.onButtonClicked();
            }
        });
        reviewFragment.nextDayReminder = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.next_day_reminder, "field 'nextDayReminder'", TextView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.layout_deposit_view_detail, "field 'layoutDepositDetail' and method 'onDepositListClicked'");
        reviewFragment.layoutDepositDetail = (RelativeLayout) onStart.write(IconCompatParcelizer3, R.id.layout_deposit_view_detail, "field 'layoutDepositDetail'", RelativeLayout.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ReviewFragment.this.onDepositListClicked();
            }
        });
        reviewFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.deposit_list_recycler_view, "field 'recyclerView'", RecyclerView.class);
        reviewFragment.mImageIconExpandMore = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expand_icon_image_view, "field 'mImageIconExpandMore'", ImageView.class);
        reviewFragment.layoutFixedTransferDepositList = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_fixed_transfer_deposit_list, "field 'layoutFixedTransferDepositList'", LinearLayout.class);
    }

    public final void read() {
        ReviewFragment reviewFragment = this.write;
        if (reviewFragment != null) {
            this.write = null;
            reviewFragment.movieDetails = null;
            reviewFragment.messageDetails = null;
            reviewFragment.mConfirmButton = null;
            reviewFragment.nextDayReminder = null;
            reviewFragment.layoutDepositDetail = null;
            reviewFragment.recyclerView = null;
            reviewFragment.mImageIconExpandMore = null;
            reviewFragment.layoutFixedTransferDepositList = null;
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
