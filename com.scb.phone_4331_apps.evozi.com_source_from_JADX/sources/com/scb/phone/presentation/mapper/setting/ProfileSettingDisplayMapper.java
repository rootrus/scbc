package com.scb.phone.presentation.mapper.setting;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.scb.phone.view.fragment.hml.HmlOutcomeResubmissionFragment$MediaBrowserCompat$ItemReceiver;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Log;
import p040o.HmlPinActivity;
import p040o.MapDifference;
import p040o.constrainedSetMultimap;
import p040o.saturatedCast;

public class ProfileSettingDisplayMapper extends constrainedSetMultimap<HmlOutcomeResubmissionFragment$MediaBrowserCompat$ItemReceiver, AutoValue_CrashlyticsReport_Session_Event_Log.Builder> {
    @HmlPinActivity
    public saturatedCast profileItemMenuDisplayMapper;
    @HmlPinActivity
    public MapDifference.ValueDifference userInfoDisplayMapper;

    /* renamed from: write */
    public final AutoValue_CrashlyticsReport_Session_Event_Log.Builder MediaBrowserCompat$ItemReceiver(HmlOutcomeResubmissionFragment$MediaBrowserCompat$ItemReceiver hmlOutcomeResubmissionFragment$MediaBrowserCompat$ItemReceiver) {
        AutoValue_CrashlyticsReport_Session_Event_Log.Builder MediaBrowserCompat$ItemReceiver = AutoValue_CrashlyticsReport_Session_Event_Log.Builder.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.read = this.userInfoDisplayMapper.MediaBrowserCompat$ItemReceiver(hmlOutcomeResubmissionFragment$MediaBrowserCompat$ItemReceiver.read);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = this.profileItemMenuDisplayMapper.MediaBrowserCompat$ItemReceiver(hmlOutcomeResubmissionFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
        return MediaBrowserCompat$ItemReceiver;
    }

    @HmlPinActivity
    public ProfileSettingDisplayMapper(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }
}
