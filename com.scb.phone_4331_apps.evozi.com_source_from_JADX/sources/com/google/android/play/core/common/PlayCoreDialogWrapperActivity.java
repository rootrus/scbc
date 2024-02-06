package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

public class PlayCoreDialogWrapperActivity extends Activity {
    private ResultReceiver write;

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        Bundle bundle;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.write) != null) {
            if (i2 == -1) {
                i3 = 1;
                bundle = new Bundle();
            } else if (i2 == 0) {
                i3 = 2;
                bundle = new Bundle();
            }
            resultReceiver.send(i3, bundle);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.write = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            try {
                startIntentSenderForResult(((PendingIntent) getIntent().getExtras().get("confirmation_intent")).getIntentSender(), 0, (Intent) null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                ResultReceiver resultReceiver = this.write;
                if (resultReceiver != null) {
                    resultReceiver.send(3, new Bundle());
                }
                finish();
            }
        } else {
            this.write = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.write);
    }
}
