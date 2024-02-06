package com.scb.phone.view.fragment.fastpay;

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

public class FastPaySuccessFragment_ViewBinding extends BaseSuccessFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private FastPaySuccessFragment MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private View MediaBrowserCompat$SearchResultReceiver;
    private View MediaDescriptionCompat;
    private View MediaMetadataCompat;
    private View RatingCompat;
    private View write;

    public FastPaySuccessFragment_ViewBinding(final FastPaySuccessFragment fastPaySuccessFragment, View view) {
        super(fastPaySuccessFragment, view);
        this.MediaBrowserCompat$ItemReceiver = fastPaySuccessFragment;
        fastPaySuccessFragment.billPaymentRelativeLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bill_payment_layout, "field 'billPaymentRelativeLayout'", RelativeLayout.class);
        fastPaySuccessFragment.billLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bill_layout, "field 'billLinearLayout'", LinearLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.auto_save_off_save_button, "field 'autoSaveOffSaveButton' and method 'saveSlipButton'");
        fastPaySuccessFragment.autoSaveOffSaveButton = (Button) onStart.write(IconCompatParcelizer2, R.id.auto_save_off_save_button, "field 'autoSaveOffSaveButton'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FastPaySuccessFragment.this.saveSlipButton();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.auto_save_off_donations_save_button, "field 'autoSaveOffDonationsSaveButton' and method 'saveSlipDonationsButton'");
        fastPaySuccessFragment.autoSaveOffDonationsSaveButton = (Button) onStart.write(IconCompatParcelizer3, R.id.auto_save_off_donations_save_button, "field 'autoSaveOffDonationsSaveButton'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FastPaySuccessFragment.this.saveSlipDonationsButton();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.share_moment_button, "field 'shareMomentButton' and method 'setShareMomentButton'");
        fastPaySuccessFragment.shareMomentButton = (Button) onStart.write(IconCompatParcelizer4, R.id.share_moment_button, "field 'shareMomentButton'", Button.class);
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FastPaySuccessFragment.this.setShareMomentButton();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.auto_save_off_share_button, "field 'autoSaveOffShareButton' and method 'shareSlipButton'");
        fastPaySuccessFragment.autoSaveOffShareButton = (Button) onStart.write(IconCompatParcelizer5, R.id.auto_save_off_share_button, "field 'autoSaveOffShareButton'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FastPaySuccessFragment.this.shareSlipButton();
            }
        });
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.share_button, "field 'shareButton'");
        fastPaySuccessFragment.shareButton = (Button) onStart.write(IconCompatParcelizer6, R.id.share_button, "field 'shareButton'", Button.class);
        this.MediaDescriptionCompat = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FastPaySuccessFragment.this.onShareButtonClick();
            }
        });
        fastPaySuccessFragment.lineBlackView = onStart.IconCompatParcelizer(view, R.id.line_black, "field 'lineBlackView'");
        fastPaySuccessFragment.lineView = onStart.IconCompatParcelizer(view, R.id.line_view, "field 'lineView'");
        fastPaySuccessFragment.endSlipImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.end_slip, "field 'endSlipImage'", ImageView.class);
        View IconCompatParcelizer7 = onStart.IconCompatParcelizer(view, R.id.return_button, "field 'returnTextView'");
        fastPaySuccessFragment.returnTextView = (TextView) onStart.write(IconCompatParcelizer7, R.id.return_button, "field 'returnTextView'", TextView.class);
        this.MediaMetadataCompat = IconCompatParcelizer7;
        IconCompatParcelizer7.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FastPaySuccessFragment.this.onReturnHomeClick();
            }
        });
        fastPaySuccessFragment.slipRelativeLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_slip, "field 'slipRelativeLayout'", RelativeLayout.class);
        View IconCompatParcelizer8 = onStart.IconCompatParcelizer(view, R.id.qr_code_layout, "field 'qrCodeLayout' and method 'onClickQRCodeLayout'");
        fastPaySuccessFragment.qrCodeLayout = (LinearLayout) onStart.write(IconCompatParcelizer8, R.id.qr_code_layout, "field 'qrCodeLayout'", LinearLayout.class);
        this.RatingCompat = IconCompatParcelizer8;
        IconCompatParcelizer8.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FastPaySuccessFragment.this.onClickQRCodeLayout();
            }
        });
        fastPaySuccessFragment.qrCodeSectionHeaderTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section_header, "field 'qrCodeSectionHeaderTextView'", TextView.class);
        fastPaySuccessFragment.qrCodeImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_image, "field 'qrCodeImageView'", ImageView.class);
        fastPaySuccessFragment.qrCodeDescriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_description, "field 'qrCodeDescriptionTextView'", TextView.class);
        fastPaySuccessFragment.refIdTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reference_id_text_view, "field 'refIdTextView'", TextView.class);
        fastPaySuccessFragment.qrCodeSectionView = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section, "field 'qrCodeSectionView'", LinearLayout.class);
        fastPaySuccessFragment.expandIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expand_icon_image_view, "field 'expandIcon'", ImageView.class);
        fastPaySuccessFragment.mRootView = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_view_successful, "field 'mRootView'", RelativeLayout.class);
        fastPaySuccessFragment.mQRCodeSectionCoachmarkContainer = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section_relative_layout, "field 'mQRCodeSectionCoachmarkContainer'", RelativeLayout.class);
        View IconCompatParcelizer9 = onStart.IconCompatParcelizer(view, R.id.overlay_qr_code_tutorial_image_view, "field 'mOverlayQRCodeSectionCoachmarkImageView' and method 'closeTutorial'");
        fastPaySuccessFragment.mOverlayQRCodeSectionCoachmarkImageView = (ImageView) onStart.write(IconCompatParcelizer9, R.id.overlay_qr_code_tutorial_image_view, "field 'mOverlayQRCodeSectionCoachmarkImageView'", ImageView.class);
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer9;
        IconCompatParcelizer9.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FastPaySuccessFragment.this.closeTutorial();
            }
        });
        fastPaySuccessFragment.coachmarkQRCodeSectionDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section_coachmark_description, "field 'coachmarkQRCodeSectionDescription'", TextView.class);
        fastPaySuccessFragment.coachmarkQRCodeSectionHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section_coachmark_header, "field 'coachmarkQRCodeSectionHeader'", TextView.class);
        fastPaySuccessFragment.additionalRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.additional_recycler_view, "field 'additionalRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        FastPaySuccessFragment fastPaySuccessFragment = this.MediaBrowserCompat$ItemReceiver;
        if (fastPaySuccessFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            fastPaySuccessFragment.billPaymentRelativeLayout = null;
            fastPaySuccessFragment.billLinearLayout = null;
            fastPaySuccessFragment.autoSaveOffSaveButton = null;
            fastPaySuccessFragment.autoSaveOffDonationsSaveButton = null;
            fastPaySuccessFragment.shareMomentButton = null;
            fastPaySuccessFragment.autoSaveOffShareButton = null;
            fastPaySuccessFragment.shareButton = null;
            fastPaySuccessFragment.lineBlackView = null;
            fastPaySuccessFragment.lineView = null;
            fastPaySuccessFragment.endSlipImage = null;
            fastPaySuccessFragment.returnTextView = null;
            fastPaySuccessFragment.slipRelativeLayout = null;
            fastPaySuccessFragment.qrCodeLayout = null;
            fastPaySuccessFragment.qrCodeSectionHeaderTextView = null;
            fastPaySuccessFragment.qrCodeImageView = null;
            fastPaySuccessFragment.qrCodeDescriptionTextView = null;
            fastPaySuccessFragment.refIdTextView = null;
            fastPaySuccessFragment.qrCodeSectionView = null;
            fastPaySuccessFragment.expandIcon = null;
            fastPaySuccessFragment.mRootView = null;
            fastPaySuccessFragment.mQRCodeSectionCoachmarkContainer = null;
            fastPaySuccessFragment.mOverlayQRCodeSectionCoachmarkImageView = null;
            fastPaySuccessFragment.coachmarkQRCodeSectionDescription = null;
            fastPaySuccessFragment.coachmarkQRCodeSectionHeader = null;
            fastPaySuccessFragment.additionalRecyclerView = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$SearchResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaDescriptionCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaDescriptionCompat = null;
            this.MediaMetadataCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaMetadataCompat = null;
            this.RatingCompat.setOnClickListener((View.OnClickListener) null);
            this.RatingCompat = null;
            this.MediaBrowserCompat$MediaItem.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
