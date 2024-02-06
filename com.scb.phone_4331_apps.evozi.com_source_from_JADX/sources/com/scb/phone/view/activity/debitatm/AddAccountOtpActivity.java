package com.scb.phone.view.activity.debitatm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.androidadvance.topsnackbar.TSnackbar;
import com.scb.phone.R;
import com.scb.phone.domain.errors.RetrofitException;
import com.scb.phone.view.activity.BaseOtpActivity;
import p040o.AlertController$RecycleListView;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application;
import p040o.GoogleMap;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule_GetIIdDeserializerOnDeviceFactory;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.access$2300;
import p040o.getOversizeImage;
import p040o.getStringValue;

public class AddAccountOtpActivity extends BaseOtpActivity implements IdCaptureModule_GetIIdDeserializerOnDeviceFactory.IconCompatParcelizer {
    @HmlPinActivity
    public getStringValue addAccountOtpPresenter;

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, boolean z) {
        Intent intent = new Intent(context, AddAccountOtpActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_CONSENT_FLAG", z);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.addAccountOtpPresenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void write(String str, String str2) {
        boolean z = false;
        boolean booleanExtra = getIntent() != null ? getIntent().getBooleanExtra("com.scb.phone.EXTRA_CONSENT_FLAG", false) : false;
        getStringValue getstringvalue = this.addAccountOtpPresenter;
        if (getstringvalue.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getstringvalue.RatingCompat.AlertController$RecycleListView();
        }
        getstringvalue.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(booleanExtra, str, str2);
        getstringvalue.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<GoogleMap.OnMapLongClickListener>() {
            public final /* synthetic */ void onNext(Object obj) {
                GoogleMap.OnMapLongClickListener onMapLongClickListener = (GoogleMap.OnMapLongClickListener) obj;
                super.onNext(onMapLongClickListener);
                getStringValue.MediaBrowserCompat$ItemReceiver(getStringValue.this);
                getStringValue getstringvalue = getStringValue.this;
                isAssignableFrom isassignablefrom = new isAssignableFrom(this, onMapLongClickListener);
                if (getstringvalue.RatingCompat != null) {
                    isassignablefrom.IconCompatParcelizer(getstringvalue.RatingCompat);
                }
            }

            public final void onError(Throwable th) {
                super.onError(th);
                getStringValue.IconCompatParcelizer(getStringValue.this);
                if (th instanceof RetrofitException) {
                    RetrofitException retrofitException = (RetrofitException) th;
                    if (retrofitException.IconCompatParcelizer == null || retrofitException.IconCompatParcelizer.write == null) {
                        getStringValue.this.MediaBrowserCompat$ItemReceiver(getStringValue.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                        return;
                    }
                    String str = retrofitException.IconCompatParcelizer.write.IconCompatParcelizer;
                    char c = 65535;
                    boolean z = false;
                    switch (str.hashCode()) {
                        case 1507521:
                            if (str.equals("1035")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1507523:
                            if (str.equals("1037")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1507524:
                            if (str.equals("1038")) {
                                c = 1;
                                break;
                            }
                            break;
                    }
                    if (c == 0 || c == 1) {
                        getStringValue getstringvalue = getStringValue.this;
                        getSuperclassTypeParameter getsuperclasstypeparameter = new getSuperclassTypeParameter(this, th);
                        if (getstringvalue.RatingCompat != null) {
                            z = true;
                        }
                        if (z) {
                            getsuperclasstypeparameter.IconCompatParcelizer(getstringvalue.RatingCompat);
                        }
                    } else if (c != 2) {
                        getStringValue getstringvalue2 = getStringValue.this;
                        JsonToken jsonToken = new JsonToken(this, th);
                        if (getstringvalue2.RatingCompat != null) {
                            z = true;
                        }
                        if (z) {
                            jsonToken.IconCompatParcelizer(getstringvalue2.RatingCompat);
                        }
                    } else {
                        getStringValue getstringvalue3 = getStringValue.this;
                        typeEquals typeequals = new typeEquals(this, th);
                        if (getstringvalue3.RatingCompat != null) {
                            z = true;
                        }
                        if (z) {
                            typeequals.IconCompatParcelizer(getstringvalue3.RatingCompat);
                        }
                    }
                } else {
                    getStringValue.this.MediaBrowserCompat$ItemReceiver(getStringValue.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                }
            }
        });
    }

    public final void IconCompatParcelizer(String str) {
        write(this, R.id.root_activity, str, getOversizeImage.ERROR);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AutoValue_CrashlyticsReport_Session_Event_Application.Builder builder) {
        Intent intent = new Intent();
        intent.putExtra("UNREGISTER_ACCOUNT_LIST", builder);
        setResult(-1, intent);
        finish();
    }

    public final void read(String str) {
        C10774 r7 = new TSnackbar.IconCompatParcelizer() {
            public final void read(TSnackbar tSnackbar, int i) {
                super.read(tSnackbar, i);
                AddAccountOtpActivity.this.setResult(0, new Intent());
                AddAccountOtpActivity.this.finish();
            }
        };
        if (this.IconCompatParcelizer) {
            AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(this, findViewById(R.id.root_activity), R.drawable.ic_error_white_24dp, str, R.color.f71012131100257, R.color.f66062131099761, AlertController$RecycleListView.IconCompatParcelizer((Context) this), r7, 0, (View.OnClickListener) null, 0);
            return;
        }
        AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(this, findViewById(R.id.root_activity), R.drawable.ic_error_white_24dp, str, R.color.f71012131100257, R.color.f66062131099761, 0, r7, 0, (View.OnClickListener) null, 0);
    }
}
