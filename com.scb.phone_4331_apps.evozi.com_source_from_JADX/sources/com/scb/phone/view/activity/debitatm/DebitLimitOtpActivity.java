package com.scb.phone.view.activity.debitatm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseOtpActivity;
import p040o.HmlPinActivity;
import p040o.getLar$MediaBrowserCompat$ItemReceiver;
import p040o.getOversizeImage;
import p040o.nativeCreate;
import p040o.setBoolValue;
import p040o.setReferenceCounted;
import p040o.setTorchListener;

public class DebitLimitOtpActivity extends BaseOtpActivity implements getLar$MediaBrowserCompat$ItemReceiver {
    @HmlPinActivity
    public setBoolValue presenter;

    public final void IconCompatParcelizer() {
    }

    public static Intent IconCompatParcelizer(Context context) {
        return new Intent(context, DebitLimitOtpActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void write(String str, String str2) {
        setBoolValue setboolvalue = this.presenter;
        if (setboolvalue.RatingCompat != null) {
            setboolvalue.RatingCompat.AlertController$RecycleListView();
        }
        setReferenceCounted setreferencecounted = setboolvalue.IconCompatParcelizer;
        setreferencecounted.read(setreferencecounted.IconCompatParcelizer.read(str, str2, setreferencecounted.write), new nativeCreate(setboolvalue), new setTorchListener(setboolvalue));
    }

    public final void read() {
        setResult(-1);
        finish();
    }

    public final void IconCompatParcelizer(String str) {
        write(this, R.id.root_activity, str, getOversizeImage.ERROR);
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }
}
