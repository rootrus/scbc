package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.ImageProcessor;
import p040o.writeUInt64NoTag;

/* renamed from: o.setBasicSettingsProfile */
public final /* synthetic */ class setBasicSettingsProfile implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutoValue_CrashlyticsReport_CustomAttribute IconCompatParcelizer;
    private final /* synthetic */ C3490x49eb2967 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setBasicSettingsProfile(C3490x49eb2967 imageProcessor$ProcessProgressEvent$MediaBrowserCompat$ItemReceiver, AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute) {
        this.MediaBrowserCompat$ItemReceiver = imageProcessor$ProcessProgressEvent$MediaBrowserCompat$ItemReceiver;
        this.IconCompatParcelizer = autoValue_CrashlyticsReport_CustomAttribute;
    }

    public final void IconCompatParcelizer(Object obj) {
        C3490x49eb2967 imageProcessor$ProcessProgressEvent$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver;
        AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute = this.IconCompatParcelizer;
        CheckExtractActivity_MembersInjector.setCheckable setcheckable = (CheckExtractActivity_MembersInjector.setCheckable) obj;
        if (ImageProcessor.ProcessProgressEvent.read(autoValue_CrashlyticsReport_CustomAttribute)) {
            setcheckable.write();
            String str = autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.write((Object) "", "defaultValue");
            if (str == null) {
                str = "";
            }
            setcheckable.read(str);
            return;
        }
        setcheckable.RatingCompat();
    }
}
