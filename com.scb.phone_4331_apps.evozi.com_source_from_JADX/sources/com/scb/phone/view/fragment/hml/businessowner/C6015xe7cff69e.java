package com.scb.phone.view.fragment.hml.businessowner;

import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import p040o.ExtractionCredentials;
import p040o.onGetStartedClick;
import p040o.setUserLoggedIn;
import p040o.setUserLoggedIn$MediaBrowserCompat$SearchResultReceiver;
import p040o.setUserLoggedIn$MediaSessionCompat$QueueItem;
import p040o.setUserLoggedIn$MediaSessionCompat$ResultReceiverWrapper;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOccupationInfoFragment$MediaBrowserCompat$SearchResultReceiver */
public final class C6015xe7cff69e implements CustomSpinnerWithTitle.IconCompatParcelizer {
    private /* synthetic */ HmlBusinessOccupationInfoFragment MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ CustomSpinnerWithTitle write;

    public final void write() {
    }

    C6015xe7cff69e(HmlBusinessOccupationInfoFragment hmlBusinessOccupationInfoFragment, CustomSpinnerWithTitle customSpinnerWithTitle) {
        this.MediaBrowserCompat$ItemReceiver = hmlBusinessOccupationInfoFragment;
        this.write = customSpinnerWithTitle;
    }

    public final void IconCompatParcelizer() {
        if (this.write.spinner.getSelectedItemPosition() > 0) {
            boolean z = true;
            int selectedItemPosition = this.write.spinner.getSelectedItemPosition() - 1;
            CustomSpinnerWithTitle customSpinnerWithTitle = this.write;
            CustomSpinnerWithTitle customSpinnerWithTitle2 = this.MediaBrowserCompat$ItemReceiver.yearsSpinner;
            if (customSpinnerWithTitle2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("yearsSpinner");
            }
            boolean z2 = false;
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) customSpinnerWithTitle, (Object) customSpinnerWithTitle2)) {
                setUserLoggedIn<ExtractionCredentials> setuserloggedin = this.MediaBrowserCompat$ItemReceiver.presenter;
                if (setuserloggedin == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                setuserloggedin.read.read.MediaBrowserCompat$ItemReceiver = Integer.valueOf(selectedItemPosition);
                if (!setuserloggedin.MediaMetadataCompat) {
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setUserLoggedIn$MediaSessionCompat$ResultReceiverWrapper.read;
                    if (setuserloggedin.RatingCompat != null) {
                        z2 = true;
                    }
                    if (z2) {
                        iconCompatParcelizer.IconCompatParcelizer(setuserloggedin.RatingCompat);
                    }
                    setuserloggedin.MediaMetadataCompat = true;
                } else if (setuserloggedin.MediaDescriptionCompat) {
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = setUserLoggedIn$MediaSessionCompat$QueueItem.IconCompatParcelizer;
                    if (setuserloggedin.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        iconCompatParcelizer2.IconCompatParcelizer(setuserloggedin.RatingCompat);
                    }
                    setuserloggedin.MediaDescriptionCompat = false;
                } else {
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = new setUserLoggedIn.IconCompatParcelizer(setuserloggedin.read.read);
                    if (setuserloggedin.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        iconCompatParcelizer3.IconCompatParcelizer(setuserloggedin.RatingCompat);
                    }
                }
            } else {
                setUserLoggedIn<ExtractionCredentials> setuserloggedin2 = this.MediaBrowserCompat$ItemReceiver.presenter;
                if (setuserloggedin2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                setuserloggedin2.read.read.write = Integer.valueOf(selectedItemPosition);
                if (!setuserloggedin2.write) {
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer4 = setUserLoggedIn$MediaBrowserCompat$SearchResultReceiver.read;
                    if (setuserloggedin2.RatingCompat != null) {
                        z2 = true;
                    }
                    if (z2) {
                        iconCompatParcelizer4.IconCompatParcelizer(setuserloggedin2.RatingCompat);
                    }
                    setuserloggedin2.write = true;
                } else if (setuserloggedin2.MediaBrowserCompat$MediaItem) {
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer5 = setUserLoggedIn.MediaMetadataCompat.read;
                    if (setuserloggedin2.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        iconCompatParcelizer5.IconCompatParcelizer(setuserloggedin2.RatingCompat);
                    }
                    setuserloggedin2.MediaBrowserCompat$MediaItem = false;
                } else {
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer6 = new setUserLoggedIn.IconCompatParcelizer(setuserloggedin2.read.read);
                    if (setuserloggedin2.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        iconCompatParcelizer6.IconCompatParcelizer(setuserloggedin2.RatingCompat);
                    }
                }
            }
        }
    }
}
