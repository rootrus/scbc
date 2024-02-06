package com.scb.phone.service;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import com.airbnb.deeplinkdispatch.DeepLink;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.Gson;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.scb.phone.R;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import p040o.AlertController$RecycleListView;
import p040o.C1479x17e19db7;
import p040o.CustomConcurrentHashMap;
import p040o.HmlPinActivity;
import p040o.getDocument;
import p040o.getDocument$MediaBrowserCompat$ItemReceiver;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.setDropDownHorizontalOffset;
import p040o.setLastBaselineToBottomHeight;
import p040o.snippet;
import p040o.writeToParcel;

public final class SCBFcmMessagingService extends FirebaseMessagingService {
    @HmlPinActivity
    public getDocument deviceUpdatePresenter;

    public final void onCreate() {
        super.onCreate();
        AlertController$RecycleListView.IconCompatParcelizer((Service) this);
    }

    public final void onNewToken(String str) {
        onGetStartedClick.write((Object) str, "token");
        super.onNewToken(str);
        boolean z = true;
        onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("SCBFcmMessagingService onNewToken : %s", str);
        getDocument getdocument = this.deviceUpdatePresenter;
        if (getdocument == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("deviceUpdatePresenter");
        }
        Context applicationContext = getApplicationContext();
        String MediaBrowserCompat$CustomActionResultReceiver = getdocument.IconCompatParcelizer.read.MediaBrowserCompat$CustomActionResultReceiver();
        getdocument.read = null;
        SharedPreferences.Editor edit = applicationContext.getSharedPreferences("FCM_TOKEN", 0).edit();
        edit.putString("FCM_TOKEN", str);
        edit.apply();
        if (!(MediaBrowserCompat$CustomActionResultReceiver == null || MediaBrowserCompat$CustomActionResultReceiver.length() == 0)) {
            z = false;
        }
        if (!z) {
            getdocument.write = str;
            snippet snippet = getdocument.IconCompatParcelizer;
            CustomConcurrentHashMap.EntryFactory MediaBrowserCompat$CustomActionResultReceiver2 = CustomConcurrentHashMap.EntryFactory.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver;
            MediaBrowserCompat$CustomActionResultReceiver2.write = str;
            MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer = "ANDROID";
            snippet.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2);
            getdocument.IconCompatParcelizer.IconCompatParcelizer(new getDocument$MediaBrowserCompat$ItemReceiver(getdocument, (byte) 0));
        }
    }

    public final void onMessageReceived(RemoteMessage remoteMessage) {
        Intent intent;
        onGetStartedClick.write((Object) remoteMessage, "remoteMessage");
        Map<String, String> data = remoteMessage.getData();
        if (data != null) {
            data.isEmpty();
        }
        writeToParcel writetoparcel = (writeToParcel) new Gson().fromJson(remoteMessage.getData().get(C8183f.f4230JO), writeToParcel.class);
        onGetStartedClick.IconCompatParcelizer((Object) writetoparcel, "pushPayLoadEntity");
        String str = writetoparcel.MediaBrowserCompat$ItemReceiver;
        String str2 = writetoparcel.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = null;
        if (writetoparcel.write != null) {
            List<writeToParcel.write> list = writetoparcel.write;
            if (list == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            str3 = list.get(0).MediaBrowserCompat$CustomActionResultReceiver;
        }
        if (str3 != null) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str3));
            intent.putExtra("PUSH_TAG", true);
            onGetStartedClick.IconCompatParcelizer((Object) intent.putExtra(DeepLink.URI, str3), "launchIntent.putExtra(DeepLink.URI, linkUrl)");
        } else {
            intent = getPackageManager().getLaunchIntentForPackage("com.scb.phone");
        }
        Context context = this;
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 134217728);
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.ic_scb_logo);
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        setDropDownHorizontalOffset.IconCompatParcelizer iconCompatParcelizer = new setDropDownHorizontalOffset.IconCompatParcelizer(context, "scb_channel_id");
        CharSequence charSequence = str2;
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.ic_scb_logo).IconCompatParcelizer(decodeResource).read(setLastBaselineToBottomHeight.read(context, R.color.f65622131099715)).write((C1479x17e19db7) new setDropDownHorizontalOffset.read().write(charSequence)).IconCompatParcelizer((CharSequence) str).MediaBrowserCompat$ItemReceiver(charSequence).MediaBrowserCompat$CustomActionResultReceiver(true).read(defaultUri).IconCompatParcelizer(activity);
        String string = getString(R.string.notification_channels_name);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.notification_channels_name)");
        Object systemService = getSystemService("notification");
        if (systemService != null) {
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                notificationManager.createNotificationChannel(new NotificationChannel("scb_channel_id", string, 4));
            }
            notificationManager.notify((int) System.currentTimeMillis(), iconCompatParcelizer.MediaBrowserCompat$ItemReceiver());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.NotificationManager");
    }
}
