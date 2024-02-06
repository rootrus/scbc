package com.scb.phone.view.fragment.chubb;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.BaseSuccessFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ChubbPaySuccessFragment_ViewBinding extends BaseSuccessFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private ChubbPaySuccessFragment MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private View MediaBrowserCompat$SearchResultReceiver;
    private View MediaMetadataCompat;
    private View RatingCompat;
    private View write;

    public ChubbPaySuccessFragment_ViewBinding(final ChubbPaySuccessFragment chubbPaySuccessFragment, View view) {
        super(chubbPaySuccessFragment, view);
        this.MediaBrowserCompat$ItemReceiver = chubbPaySuccessFragment;
        chubbPaySuccessFragment.billPaymentRelativeLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bill_payment_layout, "field 'billPaymentRelativeLayout'", RelativeLayout.class);
        chubbPaySuccessFragment.billLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bill_layout, "field 'billLinearLayout'", LinearLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.auto_save_off_save_button, "field 'autoSaveOffSaveButton' and method 'saveSlipButton'");
        chubbPaySuccessFragment.autoSaveOffSaveButton = (Button) onStart.write(IconCompatParcelizer2, R.id.auto_save_off_save_button, "field 'autoSaveOffSaveButton'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ChubbPaySuccessFragment.this.saveSlipButton();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.auto_save_off_donations_save_button, "field 'autoSaveOffDonationsSaveButton' and method 'saveSlipDonationsButton'");
        chubbPaySuccessFragment.autoSaveOffDonationsSaveButton = (Button) onStart.write(IconCompatParcelizer3, R.id.auto_save_off_donations_save_button, "field 'autoSaveOffDonationsSaveButton'", Button.class);
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ChubbPaySuccessFragment.this.saveSlipDonationsButton();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.share_moment_button, "field 'shareMomentButton' and method 'setShareMomentButton'");
        chubbPaySuccessFragment.shareMomentButton = (Button) onStart.write(IconCompatParcelizer4, R.id.share_moment_button, "field 'shareMomentButton'", Button.class);
        this.RatingCompat = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ChubbPaySuccessFragment.this.setShareMomentButton();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.auto_save_off_share_button, "field 'autoSaveOffShareButton' and method 'shareSlipButton'");
        chubbPaySuccessFragment.autoSaveOffShareButton = (Button) onStart.write(IconCompatParcelizer5, R.id.auto_save_off_share_button, "field 'autoSaveOffShareButton'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ChubbPaySuccessFragment.this.shareSlipButton();
            }
        });
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.share_button, "field 'shareButton'");
        chubbPaySuccessFragment.shareButton = (Button) onStart.write(IconCompatParcelizer6, R.id.share_button, "field 'shareButton'", Button.class);
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ChubbPaySuccessFragment.this.onShareButtonClick();
            }
        });
        chubbPaySuccessFragment.lineBlackView = onStart.IconCompatParcelizer(view, R.id.line_black, "field 'lineBlackView'");
        chubbPaySuccessFragment.lineView = onStart.IconCompatParcelizer(view, R.id.line_view, "field 'lineView'");
        chubbPaySuccessFragment.endSlipImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.end_slip, "field 'endSlipImage'", ImageView.class);
        View IconCompatParcelizer7 = onStart.IconCompatParcelizer(view, R.id.return_button, "field 'returnTextView'");
        chubbPaySuccessFragment.returnTextView = (TextView) onStart.write(IconCompatParcelizer7, R.id.return_button, "field 'returnTextView'", TextView.class);
        this.MediaMetadataCompat = IconCompatParcelizer7;
        IconCompatParcelizer7.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ChubbPaySuccessFragment.this.onReturnHomeClick();
            }
        });
        chubbPaySuccessFragment.slipRelativeLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_slip, "field 'slipRelativeLayout'", RelativeLayout.class);
        chubbPaySuccessFragment.qrCodeLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_layout, "field 'qrCodeLayout'", LinearLayout.class);
        chubbPaySuccessFragment.qrCodeSectionHeaderTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section_header, "field 'qrCodeSectionHeaderTextView'", TextView.class);
        chubbPaySuccessFragment.qrCodeImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_image, "field 'qrCodeImageView'", ImageView.class);
        chubbPaySuccessFragment.qrCodeDescriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_description, "field 'qrCodeDescriptionTextView'", TextView.class);
        chubbPaySuccessFragment.refIdTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reference_id_text_view, "field 'refIdTextView'", TextView.class);
        chubbPaySuccessFragment.qrCodeSectionView = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section, "field 'qrCodeSectionView'", LinearLayout.class);
        chubbPaySuccessFragment.expandIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expand_icon_image_view, "field 'expandIcon'", ImageView.class);
        chubbPaySuccessFragment.mRootView = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_view_successful, "field 'mRootView'", RelativeLayout.class);
        chubbPaySuccessFragment.mQRCodeSectionCoachmarkContainer = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section_relative_layout, "field 'mQRCodeSectionCoachmarkContainer'", RelativeLayout.class);
        View IconCompatParcelizer8 = onStart.IconCompatParcelizer(view, R.id.overlay_qr_code_tutorial_image_view, "field 'mOverlayQRCodeSectionCoachmarkImageView' and method 'closeTutorial'");
        chubbPaySuccessFragment.mOverlayQRCodeSectionCoachmarkImageView = (ImageView) onStart.write(IconCompatParcelizer8, R.id.overlay_qr_code_tutorial_image_view, "field 'mOverlayQRCodeSectionCoachmarkImageView'", ImageView.class);
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer8;
        IconCompatParcelizer8.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ChubbPaySuccessFragment.this.closeTutorial();
            }
        });
        chubbPaySuccessFragment.coachmarkQRCodeSectionDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section_coachmark_description, "field 'coachmarkQRCodeSectionDescription'", TextView.class);
        chubbPaySuccessFragment.coachmarkQRCodeSectionHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section_coachmark_header, "field 'coachmarkQRCodeSectionHeader'", TextView.class);
        chubbPaySuccessFragment.recyclerViewChubb = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_chubb, "field 'recyclerViewChubb'", RecyclerView.class);
        chubbPaySuccessFragment.mRemainingBalanceTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_balance_text_view, "field 'mRemainingBalanceTextView'", TextView.class);
        chubbPaySuccessFragment.deeplinkCallbackButtonLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.deepLink_callback_button_layout, "field 'deeplinkCallbackButtonLayout'", LinearLayout.class);
    }

    public final void read() {
        ChubbPaySuccessFragment chubbPaySuccessFragment = this.MediaBrowserCompat$ItemReceiver;
        if (chubbPaySuccessFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            chubbPaySuccessFragment.billPaymentRelativeLayout = null;
            chubbPaySuccessFragment.billLinearLayout = null;
            chubbPaySuccessFragment.autoSaveOffSaveButton = null;
            chubbPaySuccessFragment.autoSaveOffDonationsSaveButton = null;
            chubbPaySuccessFragment.shareMomentButton = null;
            chubbPaySuccessFragment.autoSaveOffShareButton = null;
            chubbPaySuccessFragment.shareButton = null;
            chubbPaySuccessFragment.lineBlackView = null;
            chubbPaySuccessFragment.lineView = null;
            chubbPaySuccessFragment.endSlipImage = null;
            chubbPaySuccessFragment.returnTextView = null;
            chubbPaySuccessFragment.slipRelativeLayout = null;
            chubbPaySuccessFragment.qrCodeLayout = null;
            chubbPaySuccessFragment.qrCodeSectionHeaderTextView = null;
            chubbPaySuccessFragment.qrCodeImageView = null;
            chubbPaySuccessFragment.qrCodeDescriptionTextView = null;
            chubbPaySuccessFragment.refIdTextView = null;
            chubbPaySuccessFragment.qrCodeSectionView = null;
            chubbPaySuccessFragment.expandIcon = null;
            chubbPaySuccessFragment.mRootView = null;
            chubbPaySuccessFragment.mQRCodeSectionCoachmarkContainer = null;
            chubbPaySuccessFragment.mOverlayQRCodeSectionCoachmarkImageView = null;
            chubbPaySuccessFragment.coachmarkQRCodeSectionDescription = null;
            chubbPaySuccessFragment.coachmarkQRCodeSectionHeader = null;
            chubbPaySuccessFragment.recyclerViewChubb = null;
            chubbPaySuccessFragment.mRemainingBalanceTextView = null;
            chubbPaySuccessFragment.deeplinkCallbackButtonLayout = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.RatingCompat.setOnClickListener((View.OnClickListener) null);
            this.RatingCompat = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$SearchResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.MediaMetadataCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaMetadataCompat = null;
            this.MediaBrowserCompat$MediaItem.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
