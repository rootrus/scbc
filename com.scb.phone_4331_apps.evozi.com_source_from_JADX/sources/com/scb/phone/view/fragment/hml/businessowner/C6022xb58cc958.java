package com.scb.phone.view.fragment.hml.businessowner;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.scb.phone.R;
import p040o.LookAndFeelParameters;
import p040o.UserLogoutResponse;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.writeUInt64NoTag;
import p040o.zzfe;

/* renamed from: com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoFragment$MediaSessionCompat$QueueItem */
public final class C6022xb58cc958 extends ClickableSpan {
    private /* synthetic */ HmlBusinessOwnerSubmissionReviewStepTwoFragment MediaBrowserCompat$CustomActionResultReceiver;

    C6022xb58cc958(HmlBusinessOwnerSubmissionReviewStepTwoFragment hmlBusinessOwnerSubmissionReviewStepTwoFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessOwnerSubmissionReviewStepTwoFragment;
    }

    public final void onClick(View view) {
        onGetStartedClick.write((Object) view, "textView");
        UserLogoutResponse<LookAndFeelParameters.TorchMode> userLogoutResponse = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        if (userLogoutResponse == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        zzfe.zza zza = zzfe.zza.TERMS_N_CONDITIONS;
        onGetStartedClick.write((Object) zza, "type");
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new UserLogoutResponse.IconCompatParcelizer(zza);
        if (userLogoutResponse.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(userLogoutResponse.RatingCompat);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        onGetStartedClick.write((Object) textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        Context context = this.MediaBrowserCompat$CustomActionResultReceiver.getContext();
        if (context != null) {
            textPaint.setColor(setLastBaselineToBottomHeight.read(context, R.color.f67252131099881));
        }
    }
}
