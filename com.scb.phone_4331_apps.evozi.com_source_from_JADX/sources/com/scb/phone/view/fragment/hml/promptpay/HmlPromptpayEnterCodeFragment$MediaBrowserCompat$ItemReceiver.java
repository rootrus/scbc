package com.scb.phone.view.fragment.hml.promptpay;

import android.widget.ImageView;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.custom.hml.CustomDecimalAmountVerification;
import kotlin.NoWhenBranchMatchedException;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.getShortcutTypeOrdinal;
import p040o.onGetStartedClick;
import p040o.setDataStoreName;
import p040o.setDataStoreName$MediaBrowserCompat$MediaItem;
import p040o.setDataStoreName$MediaBrowserCompat$SearchResultReceiver;
import p040o.writeUInt64NoTag;

public final class HmlPromptpayEnterCodeFragment$MediaBrowserCompat$ItemReceiver implements CustomDecimalAmountVerification.IconCompatParcelizer {
    private /* synthetic */ setDataStoreName.read MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ CustomDecimalAmountVerification MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ HmlPromptpayEnterCodeFragment read;
    private /* synthetic */ CustomDecimalAmountVerification write;

    HmlPromptpayEnterCodeFragment$MediaBrowserCompat$ItemReceiver(HmlPromptpayEnterCodeFragment hmlPromptpayEnterCodeFragment, setDataStoreName.read read2, CustomDecimalAmountVerification customDecimalAmountVerification, CustomDecimalAmountVerification customDecimalAmountVerification2) {
        this.read = hmlPromptpayEnterCodeFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = read2;
        this.MediaBrowserCompat$ItemReceiver = customDecimalAmountVerification;
        this.write = customDecimalAmountVerification2;
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, boolean z) {
        CustomDecimalAmountVerification customDecimalAmountVerification;
        onGetStartedClick.write((Object) str, "code");
        setDataStoreName setdatastorename = this.read.presenter;
        if (setdatastorename == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setDataStoreName.read read2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) read2, "code");
        onGetStartedClick.write((Object) str, "inputCode");
        int i = getShortcutTypeOrdinal.IconCompatParcelizer[read2.ordinal()];
        if (i == 1) {
            setdatastorename.MediaBrowserCompat$ItemReceiver = str;
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        } else if (i == 2) {
            setdatastorename.IconCompatParcelizer = str;
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity2 = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        } else if (i == 3) {
            setdatastorename.write = str;
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity3 = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            setdatastorename.MediaBrowserCompat$ItemReceiver();
        }
        if (z && (customDecimalAmountVerification = this.MediaBrowserCompat$ItemReceiver) != null) {
            CustomEditText customEditText = customDecimalAmountVerification.editText;
            if (customEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("editText");
            }
            customEditText.requestFocus();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        setDataStoreName setdatastorename = this.read.presenter;
        if (setdatastorename == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setDataStoreName.read read2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) read2, "code");
        setdatastorename.read = read2;
        this.write.MediaBrowserCompat$ItemReceiver(false);
        HmlPromptpayEnterCodeFragment hmlPromptpayEnterCodeFragment = this.read;
        if (hmlPromptpayEnterCodeFragment.getActivity() != null && hmlPromptpayEnterCodeFragment.isAdded()) {
            ((BaseActivity) hmlPromptpayEnterCodeFragment.getActivity()).ActionBarContainer();
        }
    }

    public final void read(boolean z) {
        String str;
        if (!z) {
            setDataStoreName setdatastorename = this.read.presenter;
            if (setdatastorename == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            setDataStoreName.read read2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) read2, "code");
            int i = getShortcutTypeOrdinal.MediaBrowserCompat$CustomActionResultReceiver[read2.ordinal()];
            boolean z2 = false;
            if (i == 1) {
                String str2 = setdatastorename.MediaBrowserCompat$ItemReceiver;
                if (str2 == null || str2 == null || str2.length() != 2) {
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setDataStoreName.MediaDescriptionCompat.write;
                    if (setdatastorename.RatingCompat != null) {
                        iconCompatParcelizer.IconCompatParcelizer(setdatastorename.RatingCompat);
                    }
                }
            } else if (i == 2) {
                String str3 = setdatastorename.IconCompatParcelizer;
                if (str3 == null || str3 == null || str3.length() != 2) {
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = setDataStoreName$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver;
                    if (setdatastorename.RatingCompat != null) {
                        iconCompatParcelizer2.IconCompatParcelizer(setdatastorename.RatingCompat);
                    }
                }
            } else if (i == 3 && ((str = setdatastorename.write) == null || str == null || str.length() != 2)) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = setDataStoreName$MediaBrowserCompat$MediaItem.read;
                if (setdatastorename.RatingCompat != null) {
                    iconCompatParcelizer3.IconCompatParcelizer(setdatastorename.RatingCompat);
                }
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer4 = setDataStoreName.MediaMetadataCompat.IconCompatParcelizer;
            if (setdatastorename.RatingCompat != null) {
                z2 = true;
            }
            if (z2) {
                iconCompatParcelizer4.IconCompatParcelizer(setdatastorename.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ImageView imageView = this.read.aboutImg;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("aboutImg");
        }
        imageView.requestFocus();
        this.read.PlaybackStateCompat$CustomAction();
        setDataStoreName setdatastorename = this.read.presenter;
        if (setdatastorename == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (setdatastorename.MediaBrowserCompat$ItemReceiver == null) {
            setdatastorename.MediaBrowserCompat$ItemReceiver = "";
        }
        if (setdatastorename.IconCompatParcelizer == null) {
            setdatastorename.IconCompatParcelizer = "";
        }
        if (setdatastorename.write == null) {
            setdatastorename.write = "";
        }
        setdatastorename.read = null;
        setdatastorename.MediaBrowserCompat$ItemReceiver();
    }
}
