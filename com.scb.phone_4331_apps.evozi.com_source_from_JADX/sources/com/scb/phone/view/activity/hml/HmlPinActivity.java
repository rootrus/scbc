package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import p040o.C6979x9b852ec2;
import p040o.getPropertyCount;

public class HmlPinActivity extends PinLoginActivity implements C6979x9b852ec2 {
    @p040o.HmlPinActivity
    public getPropertyCount hmlPinPresenter;

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, Boolean bool) {
        return new Intent(context, HmlPinActivity.class).putExtra("EXTRA_IS_NCB_ACCEPTED", bool);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.hmlPinPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.hmlPinPresenter.read = getIntent().getBooleanExtra("EXTRA_IS_NCB_ACCEPTED", false);
    }

    public final void MediaDescriptionCompat() {
        getPropertyCount getpropertycount = this.hmlPinPresenter;
        if (getpropertycount.RatingCompat != null) {
            getpropertycount.RatingCompat.AlertController$RecycleListView();
        }
        getpropertycount.IconCompatParcelizer.write(getpropertycount.IconCompatParcelizer.IconCompatParcelizer((String) null, (String) null, getpropertycount.read), new getPropertyCount.IconCompatParcelizer(getpropertycount));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        super.MediaDescriptionCompat();
    }

    public void onDestroy() {
        this.hmlPinPresenter.onDestroy();
        super.onDestroy();
    }
}
