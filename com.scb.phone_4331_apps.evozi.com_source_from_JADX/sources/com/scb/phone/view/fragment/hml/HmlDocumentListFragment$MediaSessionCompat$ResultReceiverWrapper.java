package com.scb.phone.view.fragment.hml;

import android.content.DialogInterface;
import com.scb.phone.view.custom.common.CustomInputDialog;
import p040o.md5Hash;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

final class HmlDocumentListFragment$MediaSessionCompat$ResultReceiverWrapper implements DialogInterface.OnClickListener {
    private /* synthetic */ HmlDocumentListFragment IconCompatParcelizer;
    private /* synthetic */ CustomInputDialog MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ String write;

    HmlDocumentListFragment$MediaSessionCompat$ResultReceiverWrapper(HmlDocumentListFragment hmlDocumentListFragment, String str, CustomInputDialog customInputDialog) {
        this.IconCompatParcelizer = hmlDocumentListFragment;
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = customInputDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        md5Hash md5hash = this.IconCompatParcelizer.presenter;
        if (md5hash == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str = this.write;
        String valueOf = String.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.mEditTextView.getText());
        onGetStartedClick.IconCompatParcelizer((Object) valueOf, "passwordDialog.editTextString");
        onGetStartedClick.write((Object) str, "path");
        onGetStartedClick.write((Object) valueOf, "password");
        md5hash.f2892x50fd9e4a = str;
        writeUInt64NoTag.IconCompatParcelizer sethasdecor = new md5Hash.setHasDecor(str, valueOf);
        if (md5hash.RatingCompat != null) {
            sethasdecor.IconCompatParcelizer(md5hash.RatingCompat);
        }
    }
}
