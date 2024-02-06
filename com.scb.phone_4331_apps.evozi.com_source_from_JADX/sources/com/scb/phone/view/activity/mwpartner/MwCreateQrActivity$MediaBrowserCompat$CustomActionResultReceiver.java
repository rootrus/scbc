package com.scb.phone.view.activity.mwpartner;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.mwpartner.MwCreateQrActivity;
import com.squareup.picasso.Picasso$MediaBrowserCompat$ItemReceiver;
import java.io.IOException;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindDeejungTransferInstallmentsReviewFragment;
import p040o.FragmentBuilder_BindEBillSelectedFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.getICheckDeserializerRtti;
import p040o.onCheckBoxClick;

public class MwCreateQrActivity$MediaBrowserCompat$CustomActionResultReceiver extends FragmentBuilder_BindEBillSelectedFragment<MwCreateQrActivity.MwScreenshotDisplay> {
    public final /* synthetic */ void write(ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, View view) {
        MwCreateQrActivity.MwScreenshotDisplay mwScreenshotDisplay = (MwCreateQrActivity.MwScreenshotDisplay) simpleForwardingListenableFuture;
        ButterKnife.IconCompatParcelizer(mwScreenshotDisplay, view);
        try {
            mwScreenshotDisplay.qrCodeImageViewScreen.setImageBitmap(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(mwScreenshotDisplay.IconCompatParcelizer, BitmapFactory.decodeResource(MwCreateQrActivity.this.getResources(), R.drawable.thai_qr_logo), 5.0d));
            mwScreenshotDisplay.tvNameTHScreen.setText(mwScreenshotDisplay.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver.write);
            if (!TextUtils.isEmpty(mwScreenshotDisplay.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver)) {
                mwScreenshotDisplay.tvNameENScreen.setVisibility(0);
                mwScreenshotDisplay.tvNameENScreen.setText(mwScreenshotDisplay.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
            } else {
                mwScreenshotDisplay.tvNameENScreen.setVisibility(8);
            }
            mwScreenshotDisplay.layoutDynamicAmountScreen.setVisibility(!TextUtils.isEmpty(mwScreenshotDisplay.read) ? 0 : 8);
            mwScreenshotDisplay.tvAmountScreen.setText(mwScreenshotDisplay.read);
            mwScreenshotDisplay.amountItemScreen.setVisibility(TextUtils.isEmpty(mwScreenshotDisplay.read) ? 0 : 8);
            mwScreenshotDisplay.amountItemScreen.setValue(MwCreateQrActivity.this.getString(R.string.mw_create_qr_amount));
            if (!TextUtils.isEmpty(mwScreenshotDisplay.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer)) {
                mwScreenshotDisplay.imageShopCoverScreen.setVisibility(0);
                mwScreenshotDisplay.imageShopCoverScreen.setImageBitmap(new FragmentBuilder_BindFundDetailSummaryFragment(new Picasso$MediaBrowserCompat$ItemReceiver(MwCreateQrActivity.this).IconCompatParcelizer(new FragmentBuilder_BindDeejungTransferInstallmentsReviewFragment()).MediaBrowserCompat$ItemReceiver(), Uri.fromParts("base64", mwScreenshotDisplay.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, (String) null), 0).MediaBrowserCompat$CustomActionResultReceiver());
                mwScreenshotDisplay.separator1Screen.setVisibility(0);
                mwScreenshotDisplay.separator2Screen.setVisibility(0);
            } else {
                mwScreenshotDisplay.separator1Screen.setVisibility(8);
                mwScreenshotDisplay.separator2Screen.setVisibility(8);
                mwScreenshotDisplay.imageShopCoverScreen.setVisibility(8);
            }
            mwScreenshotDisplay.tvPayWalletIdScreen.setText(mwScreenshotDisplay.MediaMetadataCompat.write);
            if (!TextUtils.isEmpty(mwScreenshotDisplay.MediaBrowserCompat$MediaItem)) {
                mwScreenshotDisplay.shopNoteItemScreen.setValue(mwScreenshotDisplay.MediaBrowserCompat$MediaItem);
                mwScreenshotDisplay.shopNoteItemScreen.setVisibility(0);
                mwScreenshotDisplay.shopNoteItemScreen.mDividerView.setVisibility(8);
            } else {
                mwScreenshotDisplay.shopNoteItemScreen.setVisibility(8);
            }
            mwScreenshotDisplay.tvAccountName.setText(mwScreenshotDisplay.MediaMetadataCompat.read.IconCompatParcelizer);
        } catch (IOException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }
}
