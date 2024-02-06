package com.scb.phone.view.fragment.transferandpay;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import p040o.onCreateDialog;
import p040o.onStart;

public class SuccessFragment_ViewBinding extends BaseSuccessFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private SuccessFragment MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private View MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private View f5443x50fd9e4a;
    private View MediaDescriptionCompat;
    private View MediaMetadataCompat;
    private View MediaSessionCompat$ResultReceiverWrapper;
    private View RatingCompat;
    private View write;

    public SuccessFragment_ViewBinding(final SuccessFragment successFragment, View view) {
        super(successFragment, view);
        this.MediaBrowserCompat$ItemReceiver = successFragment;
        successFragment.billPaymentRelativeLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bill_payment_layout, "field 'billPaymentRelativeLayout'", RelativeLayout.class);
        successFragment.billLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bill_layout, "field 'billLinearLayout'", LinearLayout.class);
        successFragment.mRemainingBalanceTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_balance_text_view, "field 'mRemainingBalanceTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.target_favourite_button, "field 'mFavouriteButton'");
        successFragment.mFavouriteButton = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.target_favourite_button, "field 'mFavouriteButton'", DefaultButton.class);
        this.MediaSessionCompat$ResultReceiverWrapper = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SuccessFragment.this.onAddFavoriteClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.auto_save_off_save_button, "field 'autoSaveOffSaveButton' and method 'saveSlipButton'");
        successFragment.autoSaveOffSaveButton = (DefaultButton) onStart.write(IconCompatParcelizer3, R.id.auto_save_off_save_button, "field 'autoSaveOffSaveButton'", DefaultButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SuccessFragment.this.saveSlipButton();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.auto_save_off_donations_save_button, "field 'autoSaveOffDonationsSaveButton' and method 'saveSlipDonationsButton'");
        successFragment.autoSaveOffDonationsSaveButton = (DefaultButton) onStart.write(IconCompatParcelizer4, R.id.auto_save_off_donations_save_button, "field 'autoSaveOffDonationsSaveButton'", DefaultButton.class);
        this.write = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SuccessFragment.this.saveSlipDonationsButton();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.share_moment_button, "field 'shareMomentButton' and method 'setShareMomentButton'");
        successFragment.shareMomentButton = (DefaultButton) onStart.write(IconCompatParcelizer5, R.id.share_moment_button, "field 'shareMomentButton'", DefaultButton.class);
        this.f5443x50fd9e4a = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SuccessFragment.this.setShareMomentButton();
            }
        });
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.auto_save_off_share_button, "field 'autoSaveOffShareButton' and method 'shareSlipButton'");
        successFragment.autoSaveOffShareButton = (DefaultButton) onStart.write(IconCompatParcelizer6, R.id.auto_save_off_share_button, "field 'autoSaveOffShareButton'", DefaultButton.class);
        this.MediaMetadataCompat = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SuccessFragment.this.shareSlipButton();
            }
        });
        View IconCompatParcelizer7 = onStart.IconCompatParcelizer(view, R.id.share_button, "field 'shareButton'");
        successFragment.shareButton = (DefaultButton) onStart.write(IconCompatParcelizer7, R.id.share_button, "field 'shareButton'", DefaultButton.class);
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer7;
        IconCompatParcelizer7.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SuccessFragment.this.onShareButtonClick();
            }
        });
        successFragment.lineBlackView = onStart.IconCompatParcelizer(view, R.id.line_black, "field 'lineBlackView'");
        successFragment.lineView = onStart.IconCompatParcelizer(view, R.id.line_view, "field 'lineView'");
        successFragment.endSlipImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.end_slip, "field 'endSlipImage'", ImageView.class);
        View IconCompatParcelizer8 = onStart.IconCompatParcelizer(view, R.id.another_transfer_button, "field 'anotherTransactionButton'");
        successFragment.anotherTransactionButton = (DefaultButton) onStart.write(IconCompatParcelizer8, R.id.another_transfer_button, "field 'anotherTransactionButton'", DefaultButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer8;
        IconCompatParcelizer8.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SuccessFragment.this.onAnotherTransferClick();
            }
        });
        View IconCompatParcelizer9 = onStart.IconCompatParcelizer(view, R.id.return_button, "field 'returnTextView'");
        successFragment.returnTextView = (TextView) onStart.write(IconCompatParcelizer9, R.id.return_button, "field 'returnTextView'", TextView.class);
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer9;
        IconCompatParcelizer9.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SuccessFragment.this.onReturnHomeClick();
            }
        });
        successFragment.slipRelativeLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_slip, "field 'slipRelativeLayout'", RelativeLayout.class);
        View IconCompatParcelizer10 = onStart.IconCompatParcelizer(view, R.id.qr_code_layout, "field 'qrCodeLayout' and method 'onClickQRCodeLayout'");
        successFragment.qrCodeLayout = (LinearLayout) onStart.write(IconCompatParcelizer10, R.id.qr_code_layout, "field 'qrCodeLayout'", LinearLayout.class);
        this.RatingCompat = IconCompatParcelizer10;
        IconCompatParcelizer10.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SuccessFragment.this.onClickQRCodeLayout();
            }
        });
        successFragment.qrCodeSectionHeaderTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section_header, "field 'qrCodeSectionHeaderTextView'", TextView.class);
        successFragment.qrCodeImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_image, "field 'qrCodeImageView'", ImageView.class);
        successFragment.qrCodeDescriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_description, "field 'qrCodeDescriptionTextView'", TextView.class);
        successFragment.refIdTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reference_id_text_view, "field 'refIdTextView'", TextView.class);
        successFragment.qrCodeSectionView = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section, "field 'qrCodeSectionView'", LinearLayout.class);
        successFragment.expandIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expand_icon_image_view, "field 'expandIcon'", ImageView.class);
        successFragment.mRootView = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_view_successful, "field 'mRootView'", RelativeLayout.class);
        successFragment.mQRCodeSectionCoachmarkContainer = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section_relative_layout, "field 'mQRCodeSectionCoachmarkContainer'", RelativeLayout.class);
        View IconCompatParcelizer11 = onStart.IconCompatParcelizer(view, R.id.overlay_qr_code_tutorial_image_view, "field 'mOverlayQRCodeSectionCoachmarkImageView' and method 'closeTutorial'");
        successFragment.mOverlayQRCodeSectionCoachmarkImageView = (ImageView) onStart.write(IconCompatParcelizer11, R.id.overlay_qr_code_tutorial_image_view, "field 'mOverlayQRCodeSectionCoachmarkImageView'", ImageView.class);
        this.MediaDescriptionCompat = IconCompatParcelizer11;
        IconCompatParcelizer11.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SuccessFragment.this.closeTutorial();
            }
        });
        successFragment.coachmarkQRCodeSectionDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section_coachmark_description, "field 'coachmarkQRCodeSectionDescription'", TextView.class);
        successFragment.coachmarkQRCodeSectionHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section_coachmark_header, "field 'coachmarkQRCodeSectionHeader'", TextView.class);
        successFragment.scheduleNote = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_note, "field 'scheduleNote'", TextView.class);
        successFragment.additionalRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.additional_recycler_view, "field 'additionalRecyclerView'", RecyclerView.class);
    }

    public void read() {
        SuccessFragment successFragment = this.MediaBrowserCompat$ItemReceiver;
        if (successFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            successFragment.billPaymentRelativeLayout = null;
            successFragment.billLinearLayout = null;
            successFragment.mRemainingBalanceTextView = null;
            successFragment.mFavouriteButton = null;
            successFragment.autoSaveOffSaveButton = null;
            successFragment.autoSaveOffDonationsSaveButton = null;
            successFragment.shareMomentButton = null;
            successFragment.autoSaveOffShareButton = null;
            successFragment.shareButton = null;
            successFragment.lineBlackView = null;
            successFragment.lineView = null;
            successFragment.endSlipImage = null;
            successFragment.anotherTransactionButton = null;
            successFragment.returnTextView = null;
            successFragment.slipRelativeLayout = null;
            successFragment.qrCodeLayout = null;
            successFragment.qrCodeSectionHeaderTextView = null;
            successFragment.qrCodeImageView = null;
            successFragment.qrCodeDescriptionTextView = null;
            successFragment.refIdTextView = null;
            successFragment.qrCodeSectionView = null;
            successFragment.expandIcon = null;
            successFragment.mRootView = null;
            successFragment.mQRCodeSectionCoachmarkContainer = null;
            successFragment.mOverlayQRCodeSectionCoachmarkImageView = null;
            successFragment.coachmarkQRCodeSectionDescription = null;
            successFragment.coachmarkQRCodeSectionHeader = null;
            successFragment.scheduleNote = null;
            successFragment.additionalRecyclerView = null;
            this.MediaSessionCompat$ResultReceiverWrapper.setOnClickListener((View.OnClickListener) null);
            this.MediaSessionCompat$ResultReceiverWrapper = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.f5443x50fd9e4a.setOnClickListener((View.OnClickListener) null);
            this.f5443x50fd9e4a = null;
            this.MediaMetadataCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaMetadataCompat = null;
            this.MediaBrowserCompat$SearchResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$MediaItem.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            this.RatingCompat.setOnClickListener((View.OnClickListener) null);
            this.RatingCompat = null;
            this.MediaDescriptionCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaDescriptionCompat = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
