package com.scb.phone.view.fragment.juristic;

import android.view.View;
import com.google.android.gms.common.Scopes;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import p040o.DebitCardResetOtpActivity;
import p040o.DocumentCaptureExperience;
import p040o.getCurrentPlace;
import p040o.getDetectionSettings;
import p040o.isLowerCase;
import p040o.onGetStartedClick;

final class JuristicRequestFormFragment$MediaBrowserCompat$MediaItem implements View.OnClickListener {
    private /* synthetic */ JuristicRequestFormFragment read;

    JuristicRequestFormFragment$MediaBrowserCompat$MediaItem(JuristicRequestFormFragment juristicRequestFormFragment) {
        this.read = juristicRequestFormFragment;
    }

    public final void onClick(View view) {
        DocumentCaptureExperience documentCaptureExperience = this.read.presenter;
        if (documentCaptureExperience == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CommonInputViewGroup commonInputViewGroup = this.read.ivgEmail;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
        }
        String obj = commonInputViewGroup.mEditText.getText().toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "ivgEmail.text");
        onGetStartedClick.write((Object) obj, Scopes.EMAIL);
        if (documentCaptureExperience.RatingCompat != null) {
            documentCaptureExperience.RatingCompat.AlertController$RecycleListView();
        }
        isLowerCase islowercase = documentCaptureExperience.IconCompatParcelizer;
        onGetStartedClick.write((Object) obj, Scopes.EMAIL);
        DebitCardResetOtpActivity<getCurrentPlace> MediaBrowserCompat$ItemReceiver = islowercase.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(obj);
        isLowerCase islowercase2 = documentCaptureExperience.IconCompatParcelizer;
        DocumentCaptureExperience documentCaptureExperience2 = documentCaptureExperience;
        islowercase2.read(MediaBrowserCompat$ItemReceiver, new getDetectionSettings(new DocumentCaptureExperience.IconCompatParcelizer(documentCaptureExperience2)), new getDetectionSettings(new DocumentCaptureExperience.write(documentCaptureExperience2)));
    }
}
