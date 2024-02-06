package p040o;

import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import p040o.Api;

/* renamed from: o.stopAutoManage */
public final class stopAutoManage extends FragmentBuilder_BindSummaryFragment {

    /* renamed from: o.stopAutoManage$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public final createFailedResult$MediaBrowserCompat$ItemReceiver read;
        public final Api.ApiOptions.Optional.IconCompatParcelizer[] write;

        private IconCompatParcelizer() {
        }

        public IconCompatParcelizer(createFailedResult$MediaBrowserCompat$ItemReceiver createfailedresult_mediabrowsercompat_itemreceiver) {
            this.read = new createFailedResult$MediaBrowserCompat$ItemReceiver(createfailedresult_mediabrowsercompat_itemreceiver);
            this.write = new Api.ApiOptions.Optional.IconCompatParcelizer[((createfailedresult_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver - createfailedresult_mediabrowsercompat_itemreceiver.MediaDescriptionCompat) + 1)];
        }

        public final Api.ApiOptions.Optional.IconCompatParcelizer IconCompatParcelizer(int i) {
            Api.ApiOptions.Optional.IconCompatParcelizer iconCompatParcelizer;
            Api.ApiOptions.Optional.IconCompatParcelizer iconCompatParcelizer2;
            Api.ApiOptions.Optional.IconCompatParcelizer iconCompatParcelizer3 = this.write[i - this.read.MediaDescriptionCompat];
            if (iconCompatParcelizer3 != null) {
                return iconCompatParcelizer3;
            }
            for (int i2 = 1; i2 < 5; i2++) {
                int i3 = (i - this.read.MediaDescriptionCompat) - i2;
                if (i3 >= 0 && (iconCompatParcelizer2 = this.write[i3]) != null) {
                    return iconCompatParcelizer2;
                }
                int i4 = (i - this.read.MediaDescriptionCompat) + i2;
                Api.ApiOptions.Optional.IconCompatParcelizer[] iconCompatParcelizerArr = this.write;
                if (i4 < iconCompatParcelizerArr.length && (iconCompatParcelizer = iconCompatParcelizerArr[i4]) != null) {
                    return iconCompatParcelizer;
                }
            }
            return null;
        }

        public final Api.ApiOptions.Optional.IconCompatParcelizer[] read() {
            return this.write;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
            r1.addSuppressed(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
            throw r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r10 = this;
                java.util.Formatter r0 = new java.util.Formatter
                r0.<init>()
                o.Api$ApiOptions$Optional$IconCompatParcelizer[] r1 = r10.write     // Catch:{ all -> 0x004d }
                int r2 = r1.length     // Catch:{ all -> 0x004d }
                r3 = 0
                r4 = r3
                r5 = r4
            L_0x000b:
                if (r4 >= r2) goto L_0x0045
                r6 = r1[r4]     // Catch:{ all -> 0x004d }
                r7 = 1
                if (r6 != 0) goto L_0x0022
                java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ all -> 0x004d }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x004d }
                r6[r3] = r7     // Catch:{ all -> 0x004d }
                java.lang.String r7 = "%3d:    |   %n"
                r0.format(r7, r6)     // Catch:{ all -> 0x004d }
            L_0x001f:
                int r5 = r5 + 1
                goto L_0x0042
            L_0x0022:
                r8 = 3
                java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x004d }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x004d }
                r8[r3] = r9     // Catch:{ all -> 0x004d }
                int r9 = r6.read     // Catch:{ all -> 0x004d }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x004d }
                r8[r7] = r9     // Catch:{ all -> 0x004d }
                r7 = 2
                int r6 = r6.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x004d }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x004d }
                r8[r7] = r6     // Catch:{ all -> 0x004d }
                java.lang.String r6 = "%3d: %3d|%3d%n"
                r0.format(r6, r8)     // Catch:{ all -> 0x004d }
                goto L_0x001f
            L_0x0042:
                int r4 = r4 + 1
                goto L_0x000b
            L_0x0045:
                java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x004d }
                r0.close()
                return r1
            L_0x004d:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x004f }
            L_0x004f:
                r2 = move-exception
                r0.close()     // Catch:{ all -> 0x0054 }
                goto L_0x0058
            L_0x0054:
                r0 = move-exception
                r1.addSuppressed(r0)
            L_0x0058:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.stopAutoManage.IconCompatParcelizer.toString():java.lang.String");
        }
    }

    public static setOnInfoWindowClickListener MediaBrowserCompat$ItemReceiver(dpScale dpscale) {
        if (dpscale != null) {
            CharSequence charSequence = dpscale.read;
            boolean z = false;
            if (!(charSequence == null || charSequence.length() == 0)) {
                CharSequence charSequence2 = dpscale.write;
                if (!(charSequence2 == null || charSequence2.length() == 0)) {
                    CharSequence charSequence3 = dpscale.IconCompatParcelizer;
                    if (charSequence3 == null || charSequence3.length() == 0) {
                        z = true;
                    }
                    if (!z) {
                        return new setOnInfoWindowClickListener(dpscale.read, dpscale.write, dpscale.IconCompatParcelizer);
                    }
                }
            }
        }
        throw new EntityMappingException("data must not be null or empty");
    }
}
