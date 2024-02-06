package com.scb.phone.view.fragment.bankingagent;

import android.content.DialogInterface;
import p040o.AppMeasurementDynamiteService;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.UpdateAppSpiCall;
import p040o.consumingIterator;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.fragment.bankingagent.BankingAgentTCFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C5856x6b3201cb implements DialogInterface.OnClickListener {
    private /* synthetic */ BankingAgentTCFragment read;

    C5856x6b3201cb(BankingAgentTCFragment bankingAgentTCFragment) {
        this.read = bankingAgentTCFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UpdateAppSpiCall updateAppSpiCall = this.read.presenter;
        if (updateAppSpiCall == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = UpdateAppSpiCall.write.MediaBrowserCompat$ItemReceiver;
        if (updateAppSpiCall.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(updateAppSpiCall.RatingCompat);
        }
        consumingIterator consumingiterator = updateAppSpiCall.IconCompatParcelizer;
        FundActionsSuccessActivity read2 = new UpdateAppSpiCall.read(updateAppSpiCall);
        FundFactSheetActivity iconCompatParcelizer2 = new UpdateAppSpiCall.IconCompatParcelizer(updateAppSpiCall);
        onGetStartedClick.write((Object) read2, "onSuccess");
        onGetStartedClick.write((Object) iconCompatParcelizer2, "onError");
        consumingiterator.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(new consumingIterator.write(read2), iconCompatParcelizer2, new AppMeasurementDynamiteService.zza.read(0), consumingiterator.MediaBrowserCompat$ItemReceiver);
    }
}
