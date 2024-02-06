package p040o;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.BondLandingActivity */
public final class BondLandingActivity {
    private int[] IconCompatParcelizer;
    public View MediaBrowserCompat$ItemReceiver;
    public boolean read = true;

    private BondLandingActivity(View view) {
        this.MediaBrowserCompat$ItemReceiver = view;
    }

    public static List<BondLandingActivity> write(List<View> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new BondLandingActivity(list.get(i)));
        }
        return arrayList;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        Drawable background = this.MediaBrowserCompat$ItemReceiver.getBackground();
        if (background == null) {
            return 0;
        }
        if (!(background instanceof ColorDrawable)) {
            return 100;
        }
        int color = ((ColorDrawable) background).getColor();
        if (color == 0) {
            return 0;
        }
        return (Color.alpha(color) * 100) / 255;
    }

    /* access modifiers changed from: protected */
    public final Rect write() {
        int[] iArr = new int[2];
        this.MediaBrowserCompat$ItemReceiver.getLocationOnScreen(iArr);
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new int[]{iArr[0], iArr[1], iArr[0] + this.MediaBrowserCompat$ItemReceiver.getWidth(), iArr[1] + this.MediaBrowserCompat$ItemReceiver.getHeight()};
        }
        int[] iArr2 = this.IconCompatParcelizer;
        return new Rect(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
    }
}
