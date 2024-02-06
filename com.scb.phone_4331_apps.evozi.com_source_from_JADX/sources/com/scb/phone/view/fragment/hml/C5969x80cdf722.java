package com.scb.phone.view.fragment.hml;

import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import p040o.onGetStartedClick;
import p040o.setSheetID;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.fragment.hml.HmlBusinessInformationFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5969x80cdf722 implements CustomSpinnerWithTitle.IconCompatParcelizer {
    private boolean MediaBrowserCompat$CustomActionResultReceiver = true;
    private /* synthetic */ HmlBusinessInformationFragment read;

    public final void write() {
    }

    C5969x80cdf722(HmlBusinessInformationFragment hmlBusinessInformationFragment) {
        this.read = hmlBusinessInformationFragment;
    }

    public final void IconCompatParcelizer() {
        boolean z = false;
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = false;
            return;
        }
        setSheetID setsheetid = this.read.presenter;
        if (setsheetid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CustomSpinnerWithTitle customSpinnerWithTitle = this.read.incomeSpinner;
        if (customSpinnerWithTitle == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("incomeSpinner");
        }
        if (customSpinnerWithTitle.spinner.getSelectedItemPosition() == 0) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setSheetID.PlaybackStateCompat.write;
            if (setsheetid.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(setsheetid.RatingCompat);
            }
            setsheetid.MediaSessionCompat$QueueItem.remove(setSheetID.write.SOURCE_OF_INCOME);
            return;
        }
        setsheetid.MediaBrowserCompat$CustomActionResultReceiver(setSheetID.write.SOURCE_OF_INCOME, true);
    }
}
