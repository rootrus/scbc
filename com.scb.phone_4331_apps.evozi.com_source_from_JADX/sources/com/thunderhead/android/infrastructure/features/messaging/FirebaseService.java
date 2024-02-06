package com.thunderhead.android.infrastructure.features.messaging;

import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Locale;
import p040o.CalendarLandingActivity_ViewBinding;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment;
import p040o.FragmentBuilder_BindSensitiveCSentFragment;
import p040o.ManageRecipientGroupActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;

public final class FirebaseService extends FirebaseMessagingService {
    public final void onNewToken(String str) {
        if (str != null) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManageEmailVerificationSuccessFragment.TOKEN_RECIEVED_FROM_FIREBASE, str);
            FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(new FragmentBuilder_BindSensitiveCSentFragment.MediaMetadataCompat(str));
        }
    }

    public final void onMessageReceived(RemoteMessage remoteMessage) {
        Bundle extras;
        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManageEmailVerificationSuccessFragment.MESSAGE_RECIEVED_FROM_FIREBASE, new Object[0]);
        if (remoteMessage == null) {
            return;
        }
        if (remoteMessage != null) {
            onGetStartedClick.write((Object) remoteMessage, "$this$toCloudMessage");
            Intent intent = remoteMessage.toIntent();
            ManageRecipientGroupActivity manageRecipientGroupActivity = null;
            if (!(intent == null || (extras = intent.getExtras()) == null)) {
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                for (String str5 : extras.keySet()) {
                    if (str5.contains("one-message")) {
                        str = extras.getString(str5);
                    } else if (str5.contains("one-positiveCode")) {
                        str3 = extras.getString(str5);
                    } else if (str5.contains("one-neutralCode")) {
                        str2 = extras.getString(str5);
                    } else if (str5.contains("one-targetUrl")) {
                        str4 = extras.getString(str5);
                    }
                }
                if (str != null && str2 != null && str3 != null) {
                    manageRecipientGroupActivity = new ManageRecipientGroupActivity(str, str3, str2, str4);
                } else if (!(str == null && str3 == null && str2 == null)) {
                    MyECouponActivity_ViewBinding.write(String.format(Locale.US, "All of %s, %s, and %s parameters are mandatory for cloud message payload", new Object[]{"one-message", "one-neutralCode", "one-positiveCode"}));
                }
            }
            if (manageRecipientGroupActivity != null) {
                CalendarLandingActivity_ViewBinding AbsActionBarView = FragmentBuilder_BindHmlIssuerLandingFragment.AbsActionBarView();
                if (AbsActionBarView != null) {
                    AbsActionBarView.read(manageRecipientGroupActivity);
                } else {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManageEmailVerificationSuccessFragment.CONTEXT_REQUIRED);
                }
            } else {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManageEmailVerificationSuccessFragment.CLOUD_MESSAGE_PARSE_ERROR);
            }
        } else {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManageEmailVerificationSuccessFragment.NULL_MESSAGE_INTENT);
        }
    }
}
