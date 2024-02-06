package p040o;

import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import p040o.Api;
import p040o.onLoadFinished;
import p040o.stopAutoManage;

/* renamed from: o.registerConnectionCallbacks */
public final class registerConnectionCallbacks extends FragmentBuilder_BindSummaryFragment {

    /* renamed from: o.registerConnectionCallbacks$read */
    public static final class read {
        public final stopAutoManage.IconCompatParcelizer[] IconCompatParcelizer;
        public final onLoadFinished.write MediaBrowserCompat$ItemReceiver;
        public createFailedResult$MediaBrowserCompat$ItemReceiver read;
        public final int write;

        private read() {
        }

        public read(onLoadFinished.write write2, createFailedResult$MediaBrowserCompat$ItemReceiver createfailedresult_mediabrowsercompat_itemreceiver) {
            this.MediaBrowserCompat$ItemReceiver = write2;
            int i = write2.MediaBrowserCompat$ItemReceiver;
            this.write = i;
            this.read = createfailedresult_mediabrowsercompat_itemreceiver;
            this.IconCompatParcelizer = new stopAutoManage.IconCompatParcelizer[(i + 2)];
        }

        public void MediaBrowserCompat$CustomActionResultReceiver(stopAutoManage.IconCompatParcelizer iconCompatParcelizer) {
            rsnScriptForEach rsnscriptforeach;
            rsnScriptForEach rsnscriptforeach2;
            int i;
            if (iconCompatParcelizer != null) {
                access$200 access_200 = (access$200) iconCompatParcelizer;
                onLoadFinished.write write2 = this.MediaBrowserCompat$ItemReceiver;
                Api.ApiOptions.Optional.IconCompatParcelizer[] iconCompatParcelizerArr = access_200.write;
                access_200.IconCompatParcelizer();
                access_200.read(iconCompatParcelizerArr, write2);
                createFailedResult$MediaBrowserCompat$ItemReceiver createfailedresult_mediabrowsercompat_itemreceiver = access_200.read;
                if (access_200.MediaBrowserCompat$ItemReceiver) {
                    rsnscriptforeach = createfailedresult_mediabrowsercompat_itemreceiver.MediaMetadataCompat;
                } else {
                    rsnscriptforeach = createfailedresult_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver;
                }
                if (access_200.MediaBrowserCompat$ItemReceiver) {
                    rsnscriptforeach2 = createfailedresult_mediabrowsercompat_itemreceiver.read;
                } else {
                    rsnscriptforeach2 = createfailedresult_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
                }
                int i2 = ((int) rsnscriptforeach.read) - access_200.read.MediaDescriptionCompat;
                int i3 = ((int) rsnscriptforeach2.read) - access_200.read.MediaDescriptionCompat;
                int i4 = -1;
                int i5 = 0;
                int i6 = 1;
                while (i2 < i3) {
                    if (iconCompatParcelizerArr[i2] != null) {
                        Api.ApiOptions.Optional.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizerArr[i2];
                        int i7 = iconCompatParcelizer2.read - i4;
                        if (i7 == 0) {
                            i5++;
                        } else {
                            if (i7 == 1) {
                                int max = Math.max(i6, i5);
                                i = iconCompatParcelizer2.read;
                                i6 = max;
                            } else if (i7 < 0 || iconCompatParcelizer2.read >= write2.IconCompatParcelizer || i7 > i2) {
                                iconCompatParcelizerArr[i2] = null;
                            } else {
                                if (i6 > 2) {
                                    i7 *= i6 - 2;
                                }
                                boolean z = i7 >= i2;
                                for (int i8 = 1; i8 <= i7 && !z; i8++) {
                                    z = iconCompatParcelizerArr[i2 - i8] != null;
                                }
                                if (z) {
                                    iconCompatParcelizerArr[i2] = null;
                                } else {
                                    i = iconCompatParcelizer2.read;
                                }
                            }
                            i4 = i;
                            i5 = 1;
                        }
                    }
                    i2++;
                }
            }
        }

        public static int write(int i, int i2, Api.ApiOptions.Optional.IconCompatParcelizer iconCompatParcelizer) {
            if (iconCompatParcelizer == null) {
                return i2;
            }
            int i3 = iconCompatParcelizer.read;
            boolean z = true;
            if (i3 != -1 && iconCompatParcelizer.write == (i3 % 3) * 3) {
                return i2;
            }
            if (i == -1 || iconCompatParcelizer.write != (i % 3) * 3) {
                z = false;
            }
            if (!z) {
                return i2 + 1;
            }
            iconCompatParcelizer.read = i;
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
            r1.addSuppressed(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0081, code lost:
            throw r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String toString() {
            /*
                r9 = this;
                o.stopAutoManage$IconCompatParcelizer[] r0 = r9.IconCompatParcelizer
                r1 = 0
                r2 = r0[r1]
                r3 = 1
                if (r2 != 0) goto L_0x000d
                int r2 = r9.write
                int r2 = r2 + r3
                r2 = r0[r2]
            L_0x000d:
                java.util.Formatter r0 = new java.util.Formatter
                r0.<init>()
                r4 = r1
            L_0x0013:
                o.Api$ApiOptions$Optional$IconCompatParcelizer[] r5 = r2.write     // Catch:{ all -> 0x0076 }
                int r5 = r5.length     // Catch:{ all -> 0x0076 }
                if (r4 >= r5) goto L_0x006e
                java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x0076 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0076 }
                r5[r1] = r6     // Catch:{ all -> 0x0076 }
                java.lang.String r6 = "CW %3d:"
                r0.format(r6, r5)     // Catch:{ all -> 0x0076 }
                r5 = r1
            L_0x0026:
                int r6 = r9.write     // Catch:{ all -> 0x0076 }
                r7 = 2
                int r6 = r6 + r7
                if (r5 >= r6) goto L_0x0064
                o.stopAutoManage$IconCompatParcelizer[] r6 = r9.IconCompatParcelizer     // Catch:{ all -> 0x0076 }
                r6 = r6[r5]     // Catch:{ all -> 0x0076 }
                java.lang.String r8 = "    |   "
                if (r6 != 0) goto L_0x003a
                java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0076 }
                r0.format(r8, r6)     // Catch:{ all -> 0x0076 }
                goto L_0x0061
            L_0x003a:
                o.stopAutoManage$IconCompatParcelizer[] r6 = r9.IconCompatParcelizer     // Catch:{ all -> 0x0076 }
                r6 = r6[r5]     // Catch:{ all -> 0x0076 }
                o.Api$ApiOptions$Optional$IconCompatParcelizer[] r6 = r6.write     // Catch:{ all -> 0x0076 }
                r6 = r6[r4]     // Catch:{ all -> 0x0076 }
                if (r6 != 0) goto L_0x004a
                java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0076 }
                r0.format(r8, r6)     // Catch:{ all -> 0x0076 }
                goto L_0x0061
            L_0x004a:
                java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0076 }
                int r8 = r6.read     // Catch:{ all -> 0x0076 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0076 }
                r7[r1] = r8     // Catch:{ all -> 0x0076 }
                int r6 = r6.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0076 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0076 }
                r7[r3] = r6     // Catch:{ all -> 0x0076 }
                java.lang.String r6 = " %3d|%3d"
                r0.format(r6, r7)     // Catch:{ all -> 0x0076 }
            L_0x0061:
                int r5 = r5 + 1
                goto L_0x0026
            L_0x0064:
                java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x0076 }
                java.lang.String r6 = "%n"
                r0.format(r6, r5)     // Catch:{ all -> 0x0076 }
                int r4 = r4 + 1
                goto L_0x0013
            L_0x006e:
                java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0076 }
                r0.close()
                return r1
            L_0x0076:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0078 }
            L_0x0078:
                r2 = move-exception
                r0.close()     // Catch:{ all -> 0x007d }
                goto L_0x0081
            L_0x007d:
                r0 = move-exception
                r1.addSuppressed(r0)
            L_0x0081:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.registerConnectionCallbacks.read.toString():java.lang.String");
        }
    }

    public static setOnCameraMoveListener write(applyTrimPathIfNeeded applytrimpathifneeded) {
        if (applytrimpathifneeded != null) {
            CharSequence charSequence = applytrimpathifneeded.MediaBrowserCompat$ItemReceiver;
            boolean z = false;
            if (!(charSequence == null || charSequence.length() == 0)) {
                CharSequence charSequence2 = applytrimpathifneeded.MediaBrowserCompat$CustomActionResultReceiver;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    z = true;
                }
                if (!z) {
                    String str = applytrimpathifneeded.read;
                    if (str == null) {
                        str = "";
                    }
                    return new setOnCameraMoveListener(str, applytrimpathifneeded.MediaBrowserCompat$ItemReceiver, applytrimpathifneeded.MediaBrowserCompat$CustomActionResultReceiver);
                }
            }
        }
        throw new EntityMappingException("data must not be null or empty");
    }
}
