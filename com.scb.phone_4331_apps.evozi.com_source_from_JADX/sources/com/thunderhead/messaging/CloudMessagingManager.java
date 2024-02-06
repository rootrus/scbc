package com.thunderhead.messaging;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import p040o.CalendarLandingActivity_ViewBinding;
import p040o.FragmentBuilder_BindHmlEditOperatingAccountFragment;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindHmlNdidInstructionFragment;
import p040o.FragmentBuilder_BindSetupQuickPromptPayFragment;
import p040o.ManageRecipientGroupActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.SelectRecipientFromFavouriteActivity;
import p040o.setPopupBackgroundResource;

public final class CloudMessagingManager implements CalendarLandingActivity_ViewBinding, FragmentBuilder_BindHmlEditOperatingAccountFragment {
    private Context IconCompatParcelizer;
    private final FragmentBuilder_BindSetupQuickPromptPayFragment MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver = 0;
    private FragmentBuilder_BindHmlEditOperatingAccountFragment write;

    public CloudMessagingManager(Context context, FragmentBuilder_BindHmlEditOperatingAccountFragment fragmentBuilder_BindHmlEditOperatingAccountFragment, FragmentBuilder_BindSetupQuickPromptPayFragment fragmentBuilder_BindSetupQuickPromptPayFragment) {
        this.IconCompatParcelizer = context;
        this.write = fragmentBuilder_BindHmlEditOperatingAccountFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindSetupQuickPromptPayFragment;
    }

    public final void read(ManageRecipientGroupActivity manageRecipientGroupActivity) {
        if (this.MediaBrowserCompat$ItemReceiver == 1) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(manageRecipientGroupActivity);
            if (!TextUtils.isEmpty(manageRecipientGroupActivity.MediaBrowserCompat$CustomActionResultReceiver)) {
                this.write.MediaBrowserCompat$ItemReceiver(manageRecipientGroupActivity.MediaBrowserCompat$CustomActionResultReceiver, "/", (FragmentBuilder_BindHmlNdidInstructionFragment) null);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, FragmentBuilder_BindHmlNdidInstructionFragment fragmentBuilder_BindHmlNdidInstructionFragment) {
        this.write.MediaBrowserCompat$ItemReceiver(str, str2, fragmentBuilder_BindHmlNdidInstructionFragment);
    }

    public static class UserNotificationInteractionReceiver extends BroadcastReceiver {
        private FragmentBuilder_BindHmlEditOperatingAccountFragment write;

        public void onReceive(Context context, Intent intent) {
            ActivityInfo activityInfo;
            PackageManager packageManager = context.getPackageManager();
            Intent intent2 = new Intent("android.intent.action.MAIN", (Uri) null);
            intent2.addCategory("android.intent.category.LAUNCHER");
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
            int i = 0;
            while (true) {
                if (i >= queryIntentActivities.size()) {
                    activityInfo = null;
                    break;
                }
                ResolveInfo resolveInfo = queryIntentActivities.get(i);
                if (resolveInfo.activityInfo.packageName.startsWith(context.getPackageName())) {
                    activityInfo = resolveInfo.activityInfo;
                    break;
                }
                i++;
            }
            if (activityInfo != null) {
                ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                Intent intent3 = new Intent("android.intent.action.MAIN");
                intent3.addCategory("android.intent.category.LAUNCHER");
                intent3.setFlags(270532608);
                intent3.setComponent(componentName);
                context.startActivity(intent3);
            }
            ManageRecipientGroupActivity manageRecipientGroupActivity = (ManageRecipientGroupActivity) intent.getParcelableExtra("ONE_CLOUD_MESSAGE");
            if (manageRecipientGroupActivity == null) {
                MyECouponActivity_ViewBinding.write(String.format(Locale.US, "%s: null message object deserialized from notification extras", new Object[]{UserNotificationInteractionReceiver.class.getSimpleName()}));
                return;
            }
            String str = manageRecipientGroupActivity.MediaBrowserCompat$ItemReceiver;
            if (this.write == null) {
                this.write = FragmentBuilder_BindHmlIssuerLandingFragment.ActionMenuItemView();
            }
            FragmentBuilder_BindHmlEditOperatingAccountFragment fragmentBuilder_BindHmlEditOperatingAccountFragment = this.write;
            if (fragmentBuilder_BindHmlEditOperatingAccountFragment != null) {
                fragmentBuilder_BindHmlEditOperatingAccountFragment.MediaBrowserCompat$ItemReceiver(str, "/", (FragmentBuilder_BindHmlNdidInstructionFragment) null);
            }
            if (!TextUtils.isEmpty(manageRecipientGroupActivity.read)) {
                SelectRecipientFromFavouriteActivity.MediaBrowserCompat$CustomActionResultReceiver(context, manageRecipientGroupActivity.read);
            }
            int i2 = manageRecipientGroupActivity.write;
            if (i2 >= 0) {
                setPopupBackgroundResource.MediaBrowserCompat$CustomActionResultReceiver(context).IconCompatParcelizer("ONE_NOTIFICATION_TAG", i2);
            }
        }
    }

    public final boolean read() {
        String str;
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) this.IconCompatParcelizer.getSystemService("activity");
        int i = 0;
        while (true) {
            if (i >= activityManager.getRunningAppProcesses().size()) {
                str = "";
                break;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = activityManager.getRunningAppProcesses().get(i);
            if (runningAppProcessInfo.pid == myPid) {
                str = runningAppProcessInfo.processName;
                break;
            }
            i++;
        }
        return str.contains("leakcanary");
    }
}
