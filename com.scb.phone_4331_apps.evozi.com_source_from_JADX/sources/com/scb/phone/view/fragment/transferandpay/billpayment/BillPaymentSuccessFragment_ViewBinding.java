package com.scb.phone.view.fragment.transferandpay.billpayment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.accountsummary.ImageAdBannerView;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.transferandpay.CustomMovieTicket;
import com.scb.phone.view.fragment.transferandpay.BaseSuccessFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BillPaymentSuccessFragment_ViewBinding extends BaseSuccessFragment_ViewBinding {
    private View IconCompatParcelizer;
    private BillPaymentSuccessFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private View MediaBrowserCompat$SearchResultReceiver;
    private View MediaDescriptionCompat;
    private View MediaMetadataCompat;
    private View MediaSessionCompat$Token;
    private View RatingCompat;
    private View write;

    public BillPaymentSuccessFragment_ViewBinding(final BillPaymentSuccessFragment billPaymentSuccessFragment, View view) {
        super(billPaymentSuccessFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = billPaymentSuccessFragment;
        billPaymentSuccessFragment.billPaymentRelativeLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bill_payment_layout, "field 'billPaymentRelativeLayout'", RelativeLayout.class);
        billPaymentSuccessFragment.billLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bill_layout, "field 'billLinearLayout'", LinearLayout.class);
        billPaymentSuccessFragment.mRemainingBalanceTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_balance_text_view, "field 'mRemainingBalanceTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.auto_save_off_save_button, "field 'autoSaveOffSaveButton' and method 'saveSlipButton'");
        billPaymentSuccessFragment.autoSaveOffSaveButton = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.auto_save_off_save_button, "field 'autoSaveOffSaveButton'", DefaultButton.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BillPaymentSuccessFragment.this.saveSlipButton();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.auto_save_off_donations_save_button, "field 'autoSaveOffDonationsSaveButton' and method 'saveSlipDonationsButton'");
        billPaymentSuccessFragment.autoSaveOffDonationsSaveButton = (DefaultButton) onStart.write(IconCompatParcelizer3, R.id.auto_save_off_donations_save_button, "field 'autoSaveOffDonationsSaveButton'", DefaultButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BillPaymentSuccessFragment.this.saveSlipDonationsButton();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.share_moment_button, "field 'shareMomentButton' and method 'setShareMomentButton'");
        billPaymentSuccessFragment.shareMomentButton = (DefaultButton) onStart.write(IconCompatParcelizer4, R.id.share_moment_button, "field 'shareMomentButton'", DefaultButton.class);
        this.MediaDescriptionCompat = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BillPaymentSuccessFragment.this.setShareMomentButton();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.auto_save_off_share_button, "field 'autoSaveOffShareButton' and method 'shareSlipButton'");
        billPaymentSuccessFragment.autoSaveOffShareButton = (DefaultButton) onStart.write(IconCompatParcelizer5, R.id.auto_save_off_share_button, "field 'autoSaveOffShareButton'", DefaultButton.class);
        this.write = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BillPaymentSuccessFragment.this.shareSlipButton();
            }
        });
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.share_button, "field 'shareButton'");
        billPaymentSuccessFragment.shareButton = (DefaultButton) onStart.write(IconCompatParcelizer6, R.id.share_button, "field 'shareButton'", DefaultButton.class);
        this.MediaMetadataCompat = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BillPaymentSuccessFragment.this.onShareButtonClick();
            }
        });
        billPaymentSuccessFragment.lineBlackView = onStart.IconCompatParcelizer(view, R.id.line_black, "field 'lineBlackView'");
        billPaymentSuccessFragment.lineView = onStart.IconCompatParcelizer(view, R.id.line_view, "field 'lineView'");
        billPaymentSuccessFragment.endSlipImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.end_slip, "field 'endSlipImage'", ImageView.class);
        View IconCompatParcelizer7 = onStart.IconCompatParcelizer(view, R.id.return_button, "field 'returnTextView'");
        billPaymentSuccessFragment.returnTextView = (TextView) onStart.write(IconCompatParcelizer7, R.id.return_button, "field 'returnTextView'", TextView.class);
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer7;
        IconCompatParcelizer7.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BillPaymentSuccessFragment.this.onReturnHomeClick();
            }
        });
        billPaymentSuccessFragment.slipRelativeLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_slip, "field 'slipRelativeLayout'", RelativeLayout.class);
        View IconCompatParcelizer8 = onStart.IconCompatParcelizer(view, R.id.qr_code_layout, "field 'qrCodeLayout' and method 'onClickQRCodeLayout'");
        billPaymentSuccessFragment.qrCodeLayout = (LinearLayout) onStart.write(IconCompatParcelizer8, R.id.qr_code_layout, "field 'qrCodeLayout'", LinearLayout.class);
        this.RatingCompat = IconCompatParcelizer8;
        IconCompatParcelizer8.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BillPaymentSuccessFragment.this.onClickQRCodeLayout();
            }
        });
        billPaymentSuccessFragment.qrCodeSectionHeaderTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section_header, "field 'qrCodeSectionHeaderTextView'", TextView.class);
        billPaymentSuccessFragment.qrCodeImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_image, "field 'qrCodeImageView'", ImageView.class);
        billPaymentSuccessFragment.qrCodeDescriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_description, "field 'qrCodeDescriptionTextView'", TextView.class);
        billPaymentSuccessFragment.refIdTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reference_id_text_view, "field 'refIdTextView'", TextView.class);
        billPaymentSuccessFragment.qrCodeSectionView = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section, "field 'qrCodeSectionView'", LinearLayout.class);
        billPaymentSuccessFragment.expandIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expand_icon_image_view, "field 'expandIcon'", ImageView.class);
        billPaymentSuccessFragment.mRootView = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_view_successful, "field 'mRootView'", RelativeLayout.class);
        billPaymentSuccessFragment.mQRCodeSectionCoachmarkContainer = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section_relative_layout, "field 'mQRCodeSectionCoachmarkContainer'", RelativeLayout.class);
        View IconCompatParcelizer9 = onStart.IconCompatParcelizer(view, R.id.overlay_qr_code_tutorial_image_view, "field 'mOverlayQRCodeSectionCoachmarkImageView' and method 'closeTutorial'");
        billPaymentSuccessFragment.mOverlayQRCodeSectionCoachmarkImageView = (ImageView) onStart.write(IconCompatParcelizer9, R.id.overlay_qr_code_tutorial_image_view, "field 'mOverlayQRCodeSectionCoachmarkImageView'", ImageView.class);
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer9;
        IconCompatParcelizer9.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BillPaymentSuccessFragment.this.closeTutorial();
            }
        });
        billPaymentSuccessFragment.coachmarkQRCodeSectionDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section_coachmark_description, "field 'coachmarkQRCodeSectionDescription'", TextView.class);
        billPaymentSuccessFragment.coachmarkQRCodeSectionHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_section_coachmark_header, "field 'coachmarkQRCodeSectionHeader'", TextView.class);
        billPaymentSuccessFragment.scheduleNote = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_note, "field 'scheduleNote'", TextView.class);
        billPaymentSuccessFragment.additionalRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.additional_recycler_view, "field 'additionalRecyclerView'", RecyclerView.class);
        billPaymentSuccessFragment.movieTicket = (CustomMovieTicket) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.movie_ticket, "field 'movieTicket'", CustomMovieTicket.class);
        billPaymentSuccessFragment.ticketDivider = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ticket_divider, "field 'ticketDivider'", ViewGroup.class);
        billPaymentSuccessFragment.imageAdBannerView = (ImageAdBannerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.contextual_banner, "field 'imageAdBannerView'", ImageAdBannerView.class);
        View findViewById = view.findViewById(R.id.target_favourite_button);
        if (findViewById != null) {
            this.MediaSessionCompat$Token = findViewById;
            findViewById.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    BillPaymentSuccessFragment.this.onAddFavoriteClick();
                }
            });
        }
    }

    public final void read() {
        BillPaymentSuccessFragment billPaymentSuccessFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (billPaymentSuccessFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            billPaymentSuccessFragment.billPaymentRelativeLayout = null;
            billPaymentSuccessFragment.billLinearLayout = null;
            billPaymentSuccessFragment.mRemainingBalanceTextView = null;
            billPaymentSuccessFragment.autoSaveOffSaveButton = null;
            billPaymentSuccessFragment.autoSaveOffDonationsSaveButton = null;
            billPaymentSuccessFragment.shareMomentButton = null;
            billPaymentSuccessFragment.autoSaveOffShareButton = null;
            billPaymentSuccessFragment.shareButton = null;
            billPaymentSuccessFragment.lineBlackView = null;
            billPaymentSuccessFragment.lineView = null;
            billPaymentSuccessFragment.endSlipImage = null;
            billPaymentSuccessFragment.returnTextView = null;
            billPaymentSuccessFragment.slipRelativeLayout = null;
            billPaymentSuccessFragment.qrCodeLayout = null;
            billPaymentSuccessFragment.qrCodeSectionHeaderTextView = null;
            billPaymentSuccessFragment.qrCodeImageView = null;
            billPaymentSuccessFragment.qrCodeDescriptionTextView = null;
            billPaymentSuccessFragment.refIdTextView = null;
            billPaymentSuccessFragment.qrCodeSectionView = null;
            billPaymentSuccessFragment.expandIcon = null;
            billPaymentSuccessFragment.mRootView = null;
            billPaymentSuccessFragment.mQRCodeSectionCoachmarkContainer = null;
            billPaymentSuccessFragment.mOverlayQRCodeSectionCoachmarkImageView = null;
            billPaymentSuccessFragment.coachmarkQRCodeSectionDescription = null;
            billPaymentSuccessFragment.coachmarkQRCodeSectionHeader = null;
            billPaymentSuccessFragment.scheduleNote = null;
            billPaymentSuccessFragment.additionalRecyclerView = null;
            billPaymentSuccessFragment.movieTicket = null;
            billPaymentSuccessFragment.ticketDivider = null;
            billPaymentSuccessFragment.imageAdBannerView = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaDescriptionCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaDescriptionCompat = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaMetadataCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaMetadataCompat = null;
            this.MediaBrowserCompat$MediaItem.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            this.RatingCompat.setOnClickListener((View.OnClickListener) null);
            this.RatingCompat = null;
            this.MediaBrowserCompat$SearchResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$SearchResultReceiver = null;
            View view = this.MediaSessionCompat$Token;
            if (view != null) {
                view.setOnClickListener((View.OnClickListener) null);
                this.MediaSessionCompat$Token = null;
            }
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
