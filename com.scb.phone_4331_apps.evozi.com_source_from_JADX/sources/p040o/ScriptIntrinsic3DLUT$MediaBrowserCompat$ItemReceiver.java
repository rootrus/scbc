package p040o;

import java.lang.ref.WeakReference;

/* renamed from: o.ScriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver */
public class ScriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver implements Runnable {
    public final WeakReference<ScriptIntrinsic3DLUT> read;
    public boolean write;

    public ScriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver(ScriptIntrinsic3DLUT scriptIntrinsic3DLUT) {
        this.read = new WeakReference<>(scriptIntrinsic3DLUT);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00aa, code lost:
        if (((r2 ? 8 : 2) & r9) == 0) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b3, code lost:
        if ((r3 & r9) != 0) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            java.lang.ref.WeakReference<o.ScriptIntrinsic3DLUT> r0 = r12.read
            java.lang.Object r0 = r0.get()
            o.ScriptIntrinsic3DLUT r0 = (p040o.ScriptIntrinsic3DLUT) r0
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            boolean r1 = r12.write
            if (r1 != 0) goto L_0x0010
            return
        L_0x0010:
            androidx.recyclerview.widget.RecyclerView r1 = r0.setShortcut
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r2 = r1.AppCompatActivity
            int r2 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write(r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0020
            if (r2 != r3) goto L_0x010e
            r2 = r4
            goto L_0x0021
        L_0x0020:
            r2 = r3
        L_0x0021:
            androidx.core.widget.NestedScrollView r5 = r0.setChecked
            if (r5 == 0) goto L_0x010b
            androidx.core.widget.NestedScrollView r5 = r0.setChecked
            int r6 = r5.getScrollX()
            int r7 = r5.getScrollY()
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            int r9 = r0.AppCompatDialogFragment
            androidx.core.widget.NestedScrollView r10 = r0.setChecked
            if (r10 == 0) goto L_0x0042
            int r10 = r10.getScrollX()
            int r11 = r0.ActionMenuItemView
            int r10 = r10 - r11
            int r9 = r9 + r10
        L_0x0042:
            r8.right = r9
            r8.left = r9
            int r9 = r0.setExpandedFormat
            androidx.core.widget.NestedScrollView r10 = r0.setChecked
            if (r10 == 0) goto L_0x0054
            int r10 = r10.getScrollY()
            int r11 = r0.AppCompatViewInflater
            int r10 = r10 - r11
            int r9 = r9 + r10
        L_0x0054:
            r8.bottom = r9
            r8.top = r9
            androidx.recyclerview.widget.RecyclerView r9 = r0.setShortcut
            p040o.ScriptIntrinsic3DLUT.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r9, (android.view.View) r5, (android.graphics.Rect) r8)
            int r9 = r8.left
            int r9 = r9 - r6
            int r6 = r8.top
            if (r2 == 0) goto L_0x0069
            int r8 = r5.getWidth()
            goto L_0x006d
        L_0x0069:
            int r8 = r5.getHeight()
        L_0x006d:
            r10 = 1065353216(0x3f800000, float:1.0)
            float r8 = (float) r8
            float r10 = r10 / r8
            if (r2 == 0) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            int r9 = r6 - r7
        L_0x0076:
            float r6 = (float) r9
            float r6 = r6 * r10
            r7 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 - r7
            float r8 = java.lang.Math.abs(r6)
            r9 = 0
            r10 = 1050253722(0x3e99999a, float:0.3)
            float r8 = r7 - r8
            float r10 = r10 - r8
            float r8 = java.lang.Math.max(r9, r10)
            int r9 = r0.setItemInvoker
            float r6 = java.lang.Math.signum(r6)
            int r6 = (int) r6
            float r10 = r0.MediaDescriptionCompat
            r11 = 1103626240(0x41c80000, float:25.0)
            float r10 = r10 * r11
            float r11 = r0.MediaMetadataCompat
            float r10 = r10 * r11
            r11 = 1079334229(0x40555555, float:3.3333333)
            float r8 = r8 * r11
            float r10 = r10 * r8
            float r10 = r10 + r7
            int r7 = (int) r10
            int r6 = r6 * r7
            if (r6 <= 0) goto L_0x00ad
            if (r2 == 0) goto L_0x00a8
            r3 = 8
            goto L_0x00a9
        L_0x00a8:
            r3 = 2
        L_0x00a9:
            r3 = r3 & r9
            if (r3 != 0) goto L_0x00b7
            goto L_0x00b6
        L_0x00ad:
            if (r6 >= 0) goto L_0x00b7
            if (r2 == 0) goto L_0x00b2
            r3 = 4
        L_0x00b2:
            r3 = r3 & r9
            if (r3 == 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r6 = r4
        L_0x00b7:
            if (r6 == 0) goto L_0x00d1
            o.validateGEMV r3 = r0.setIcon
            if (r3 == 0) goto L_0x00c8
            if (r1 == 0) goto L_0x00c2
            androidx.recyclerview.widget.RecyclerView$MediaMetadataCompat r3 = r1.AlertController$RecycleListView
            goto L_0x00c3
        L_0x00c2:
            r3 = 0
        L_0x00c3:
            if (r3 == 0) goto L_0x00c8
            r3.write()
        L_0x00c8:
            if (r2 == 0) goto L_0x00ce
            r5.scrollBy(r6, r4)
            goto L_0x00d1
        L_0x00ce:
            r5.scrollBy(r4, r6)
        L_0x00d1:
            o.getKernelID r2 = r0.MediaBrowserCompat$SearchResultReceiver
            int r3 = r0.AppCompatDialogFragment
            androidx.core.widget.NestedScrollView r5 = r0.setChecked
            if (r5 == 0) goto L_0x00e1
            int r5 = r5.getScrollX()
            int r6 = r0.ActionMenuItemView
            int r5 = r5 - r6
            int r3 = r3 + r5
        L_0x00e1:
            int r5 = r0.setExpandedFormat
            androidx.core.widget.NestedScrollView r6 = r0.setChecked
            if (r6 == 0) goto L_0x00ef
            int r6 = r6.getScrollY()
            int r7 = r0.AppCompatViewInflater
            int r6 = r6 - r7
            int r5 = r5 + r6
        L_0x00ef:
            boolean r2 = r2.MediaBrowserCompat$ItemReceiver(r3, r5, r4)
            if (r2 == 0) goto L_0x010e
            o.validateGEMV r2 = r0.setIcon
            if (r2 == 0) goto L_0x0105
            o.getKernelID r3 = r0.MediaBrowserCompat$SearchResultReceiver
            int r3 = r3.Keep
            o.getKernelID r5 = r0.MediaBrowserCompat$SearchResultReceiver
            int r5 = r5.setBackgroundResource
            r2.MediaDescriptionCompat = r3
            r2.MediaBrowserCompat$MediaItem = r5
        L_0x0105:
            r0.MediaBrowserCompat$ItemReceiver(r1)
            o.ScriptIntrinsic3DLUT$IconCompatParcelizer r1 = r0.setContentView
            goto L_0x010e
        L_0x010b:
            r0.MediaBrowserCompat$ItemReceiver((androidx.recyclerview.widget.RecyclerView) r1, (boolean) r2)
        L_0x010e:
            androidx.recyclerview.widget.RecyclerView r0 = r0.setShortcut
            if (r0 == 0) goto L_0x011a
            boolean r1 = r12.write
            if (r1 == 0) goto L_0x011a
            p040o.SwitchCompat.MediaBrowserCompat$ItemReceiver((android.view.View) r0, (java.lang.Runnable) r12)
            return
        L_0x011a:
            r12.write = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ScriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver.run():void");
    }
}
