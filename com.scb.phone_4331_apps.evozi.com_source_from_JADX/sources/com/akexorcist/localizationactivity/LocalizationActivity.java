package com.akexorcist.localizationactivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Locale;
import p040o.AlertController$RecycleListView;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.HmlPinActivity;
import p040o.onGetLayoutInflater;
import p040o.setOnCloseListener;

public class LocalizationActivity extends AppCompatActivity implements CheckExtractActivity_MembersInjector {
    private setOnCloseListener IconCompatParcelizer = new setOnCloseListener(this);
    @HmlPinActivity
    public SharedPreferences sharedPreferences;

    /* renamed from: F_ */
    public void mo3027F_() {
    }

    /* renamed from: z_ */
    public void mo3031z_() {
    }

    public void onCreate(Bundle bundle) {
        this.IconCompatParcelizer.read.add(this);
        setOnCloseListener setoncloselistener = this.IconCompatParcelizer;
        Locale IconCompatParcelizer2 = onGetLayoutInflater.IconCompatParcelizer(setoncloselistener.MediaBrowserCompat$CustomActionResultReceiver);
        AlertController$RecycleListView.read((Context) setoncloselistener.MediaBrowserCompat$CustomActionResultReceiver, IconCompatParcelizer2);
        setoncloselistener.IconCompatParcelizer = IconCompatParcelizer2.getLanguage();
        onGetLayoutInflater.write(setoncloselistener.MediaBrowserCompat$CustomActionResultReceiver, IconCompatParcelizer2.getLanguage());
        if (setoncloselistener.MediaBrowserCompat$CustomActionResultReceiver.getIntent().getBooleanExtra("activity_locale_changed", false)) {
            setoncloselistener.write = true;
            setoncloselistener.MediaBrowserCompat$CustomActionResultReceiver.getIntent().removeExtra("activity_locale_changed");
        }
        super.onCreate(bundle);
    }

    public void onResume() {
        super.onResume();
        new Handler().post(this.IconCompatParcelizer);
    }

    public final void read(Locale locale) {
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(locale.getLanguage());
    }

    /* renamed from: D_ */
    public String mo3026D_() {
        return onGetLayoutInflater.IconCompatParcelizer();
    }

    /* renamed from: b_ */
    public final void mo3029b_(String str) {
        if (!(str == null || str.trim().isEmpty())) {
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(str);
        }
    }

    /* renamed from: a_ */
    public void mo3028a_(String str) {
        if (!(str == null || str.trim().isEmpty())) {
            setOnCloseListener setoncloselistener = this.IconCompatParcelizer;
            if (str != null && !str.trim().isEmpty()) {
                setoncloselistener.IconCompatParcelizer = str;
                onGetLayoutInflater.write(setoncloselistener.MediaBrowserCompat$CustomActionResultReceiver, str);
                AlertController$RecycleListView.read((Context) setoncloselistener.MediaBrowserCompat$CustomActionResultReceiver, new Locale(str));
                setoncloselistener.write = true;
            }
            this.sharedPreferences.edit().putString("com.scb.phone.pref.key.LANGUAGE", str).apply();
        }
    }
}
