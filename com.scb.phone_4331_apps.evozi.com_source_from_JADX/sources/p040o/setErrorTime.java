package p040o;

import p040o.TaskRunner;

/* renamed from: o.setErrorTime */
public final /* synthetic */ class setErrorTime implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ TaskRunner.TaskCompletedEvent MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setErrorTime(TaskRunner.TaskCompletedEvent taskCompletedEvent) {
        this.MediaBrowserCompat$CustomActionResultReceiver = taskCompletedEvent;
    }

    public final void IconCompatParcelizer(Object obj) {
        TaskRunner.TaskCompletedEvent taskCompletedEvent = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        if (((Boolean) obj).booleanValue()) {
            if (taskCompletedEvent.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver().MediaDescriptionCompat == 0) {
                C9848aW aWVar = C9848aW.IconCompatParcelizer;
                if (taskCompletedEvent.RatingCompat != null) {
                    aWVar.IconCompatParcelizer(taskCompletedEvent.RatingCompat);
                }
            } else {
                AppStatsDbFieldType appStatsDbFieldType = AppStatsDbFieldType.read;
                if (taskCompletedEvent.RatingCompat != null) {
                    appStatsDbFieldType.IconCompatParcelizer(taskCompletedEvent.RatingCompat);
                }
            }
        }
        if (taskCompletedEvent.RatingCompat == null) {
            z = false;
        }
        if (z) {
            taskCompletedEvent.RatingCompat.aj_();
        }
    }
}
