package p040o;

import android.graphics.Rect;

/* renamed from: o.BScanCEntryPointActivity */
public final class BScanCEntryPointActivity {
    public boolean IconCompatParcelizer = false;
    public float MediaBrowserCompat$CustomActionResultReceiver;
    public BondLandingActivity MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    public float read;
    public BondLandingActivity write;

    private BScanCEntryPointActivity(BondLandingActivity bondLandingActivity, BondLandingActivity bondLandingActivity2) {
        this.MediaBrowserCompat$ItemReceiver = bondLandingActivity;
        this.write = bondLandingActivity2;
    }

    public static BScanCEntryPointActivity read(BondLandingActivity bondLandingActivity, BondLandingActivity bondLandingActivity2) {
        BScanCEntryPointActivity bScanCEntryPointActivity = new BScanCEntryPointActivity(bondLandingActivity, bondLandingActivity2);
        Rect write2 = bondLandingActivity.write();
        Rect write3 = bondLandingActivity2.write();
        if (write2.isEmpty() || write3.isEmpty()) {
            bScanCEntryPointActivity.IconCompatParcelizer = false;
            return bScanCEntryPointActivity;
        }
        Rect rect = new Rect();
        if (!rect.setIntersect(write2, write3)) {
            bScanCEntryPointActivity.IconCompatParcelizer = false;
            return bScanCEntryPointActivity;
        }
        bScanCEntryPointActivity.IconCompatParcelizer = true;
        int height = rect.height() * rect.width();
        bScanCEntryPointActivity.MediaBrowserCompat$MediaItem = height;
        bScanCEntryPointActivity.read = (((float) height) / ((float) (write2.height() * write2.width()))) * 100.0f;
        bScanCEntryPointActivity.MediaBrowserCompat$CustomActionResultReceiver = (((float) bScanCEntryPointActivity.MediaBrowserCompat$MediaItem) / ((float) (write3.height() * write3.width()))) * 100.0f;
        return bScanCEntryPointActivity;
    }
}
