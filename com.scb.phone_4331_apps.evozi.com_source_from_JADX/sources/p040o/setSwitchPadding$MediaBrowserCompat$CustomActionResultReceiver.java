package p040o;

import android.view.View;

/* renamed from: o.setSwitchPadding$MediaBrowserCompat$CustomActionResultReceiver */
class setSwitchPadding$MediaBrowserCompat$CustomActionResultReceiver implements setSwitchTypeface {
    setSwitchPadding MediaBrowserCompat$CustomActionResultReceiver;
    boolean read;

    setSwitchPadding$MediaBrowserCompat$CustomActionResultReceiver(setSwitchPadding setswitchpadding) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setswitchpadding;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: o.setSwitchTypeface} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void write(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            r3.read = r0
            o.setSwitchPadding r0 = r3.MediaBrowserCompat$CustomActionResultReceiver
            int r0 = r0.IconCompatParcelizer
            r1 = 0
            if (r0 < 0) goto L_0x000e
            r0 = 2
            r4.setLayerType(r0, r1)
        L_0x000e:
            o.setSwitchPadding r0 = r3.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Runnable r0 = r0.read
            if (r0 == 0) goto L_0x001f
            o.setSwitchPadding r0 = r3.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Runnable r0 = r0.read
            o.setSwitchPadding r2 = r3.MediaBrowserCompat$CustomActionResultReceiver
            r2.read = r1
            r0.run()
        L_0x001f:
            r0 = 2113929216(0x7e000000, float:4.2535296E37)
            java.lang.Object r0 = r4.getTag(r0)
            boolean r2 = r0 instanceof p040o.setSwitchTypeface
            if (r2 == 0) goto L_0x002c
            r1 = r0
            o.setSwitchTypeface r1 = (p040o.setSwitchTypeface) r1
        L_0x002c:
            if (r1 == 0) goto L_0x0031
            r1.write(r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setSwitchPadding$MediaBrowserCompat$CustomActionResultReceiver.write(android.view.View):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: o.setSwitchTypeface} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void MediaBrowserCompat$ItemReceiver(android.view.View r4) {
        /*
            r3 = this;
            o.setSwitchPadding r0 = r3.MediaBrowserCompat$CustomActionResultReceiver
            int r0 = r0.IconCompatParcelizer
            r1 = 0
            if (r0 < 0) goto L_0x0013
            o.setSwitchPadding r0 = r3.MediaBrowserCompat$CustomActionResultReceiver
            int r0 = r0.IconCompatParcelizer
            r4.setLayerType(r0, r1)
            o.setSwitchPadding r0 = r3.MediaBrowserCompat$CustomActionResultReceiver
            r2 = -1
            r0.IconCompatParcelizer = r2
        L_0x0013:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 >= r2) goto L_0x001d
            boolean r0 = r3.read
            if (r0 != 0) goto L_0x0043
        L_0x001d:
            o.setSwitchPadding r0 = r3.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Runnable r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x002e
            o.setSwitchPadding r0 = r3.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Runnable r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.setSwitchPadding r2 = r3.MediaBrowserCompat$CustomActionResultReceiver
            r2.MediaBrowserCompat$CustomActionResultReceiver = r1
            r0.run()
        L_0x002e:
            r0 = 2113929216(0x7e000000, float:4.2535296E37)
            java.lang.Object r0 = r4.getTag(r0)
            boolean r2 = r0 instanceof p040o.setSwitchTypeface
            if (r2 == 0) goto L_0x003b
            r1 = r0
            o.setSwitchTypeface r1 = (p040o.setSwitchTypeface) r1
        L_0x003b:
            if (r1 == 0) goto L_0x0040
            r1.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0040:
            r4 = 1
            r3.read = r4
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setSwitchPadding$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(android.view.View):void");
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(View view) {
        Object tag = view.getTag(2113929216);
        setSwitchTypeface setswitchtypeface = tag instanceof setSwitchTypeface ? (setSwitchTypeface) tag : null;
        if (setswitchtypeface != null) {
            setswitchtypeface.MediaBrowserCompat$CustomActionResultReceiver(view);
        }
    }
}
