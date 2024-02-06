package com.scb.phone.view.fragment.hml;

import android.text.Editable;
import android.view.View;
import com.scb.phone.view.custom.common.CustomEditText;
import p040o.onGetStartedClick;
import p040o.setSheetID;
import p040o.setSheetID$MediaSessionCompat$ResultReceiverWrapper;
import p040o.setSheetID$MediaSessionCompat$Token;
import p040o.writeUInt64NoTag;

final class HmlBusinessInformationFragment$MediaBrowserCompat$ItemReceiver implements View.OnFocusChangeListener {
    private /* synthetic */ HmlBusinessInformationFragment IconCompatParcelizer;

    HmlBusinessInformationFragment$MediaBrowserCompat$ItemReceiver(HmlBusinessInformationFragment hmlBusinessInformationFragment) {
        this.IconCompatParcelizer = hmlBusinessInformationFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        String str;
        Editable text;
        setSheetID setsheetid = this.IconCompatParcelizer.presenter;
        if (setsheetid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (!(view instanceof CustomEditText)) {
            view = null;
        }
        CustomEditText customEditText = (CustomEditText) view;
        if (customEditText == null || (text = customEditText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        onGetStartedClick.write((Object) str, "income");
        boolean z2 = true;
        if (z) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setSheetID$MediaSessionCompat$Token.read;
            if (setsheetid.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                iconCompatParcelizer.IconCompatParcelizer(setsheetid.RatingCompat);
                return;
            }
            return;
        }
        if (str.length() == 0) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = setSheetID$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver;
            if (setsheetid.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                iconCompatParcelizer2.IconCompatParcelizer(setsheetid.RatingCompat);
            }
            setsheetid.MediaSessionCompat$QueueItem.remove(setSheetID.write.NET_INCOME);
            return;
        }
        setsheetid.MediaBrowserCompat$CustomActionResultReceiver(setSheetID.write.NET_INCOME, setsheetid.read(str));
    }
}
