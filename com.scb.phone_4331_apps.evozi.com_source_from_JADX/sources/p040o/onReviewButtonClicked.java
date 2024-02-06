package p040o;

import p040o.onPause;

/* renamed from: o.onReviewButtonClicked */
public final class onReviewButtonClicked implements onPause.read {
    private FragmentBuilder_BindSetupScheduleWeeklyFragment MediaBrowserCompat$CustomActionResultReceiver;

    onReviewButtonClicked() {
    }

    public static boolean read() {
        try {
            Class.forName("o.setOnDismissListener");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @HmlPinActivity
    public onReviewButtonClicked(FragmentBuilder_BindSetupScheduleWeeklyFragment fragmentBuilder_BindSetupScheduleWeeklyFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindSetupScheduleWeeklyFragment;
    }

    public final zzvd IconCompatParcelizer() {
        zzvd zzvd = this.MediaBrowserCompat$CustomActionResultReceiver.write;
        return zzvd == null ? zzvd.ALL_REWARDS : zzvd;
    }

    public final zzvg MediaBrowserCompat$CustomActionResultReceiver() {
        zzvg zzvg = this.MediaBrowserCompat$CustomActionResultReceiver.read;
        return zzvg == null ? zzvg.POPULARITY : zzvg;
    }

    public final void write(zzvd zzvd) {
        this.MediaBrowserCompat$CustomActionResultReceiver.write = zzvd;
    }

    public final void write(zzvg zzvg) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read = zzvg;
    }
}
