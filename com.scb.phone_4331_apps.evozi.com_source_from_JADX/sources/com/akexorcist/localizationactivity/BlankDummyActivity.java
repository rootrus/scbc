package com.akexorcist.localizationactivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import p040o.Iterables;

public class BlankDummyActivity extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(Iterables.C35273.IconCompatParcelizer.animation_localization_activity_transition_in, Iterables.C35273.IconCompatParcelizer.animation_localization_activity_transition_out);
        setContentView(Iterables.C35273.RatingCompat.activity_blank_dummy);
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                BlankDummyActivity.this.finish();
            }
        }, 200);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(Iterables.C35273.IconCompatParcelizer.animation_localization_activity_transition_in, Iterables.C35273.IconCompatParcelizer.animation_localization_activity_transition_out);
    }
}
