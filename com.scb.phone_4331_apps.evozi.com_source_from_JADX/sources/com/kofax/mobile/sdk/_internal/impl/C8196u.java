package com.kofax.mobile.sdk._internal.impl;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.C7919g;

/* renamed from: com.kofax.mobile.sdk._internal.impl.u */
public class C8196u implements C7919g {
    /* renamed from: w */
    public C7919g.C7920a mo54325w(Image image) {
        C8198a aVar = new C8198a();
        if (image.getImageRepresentation() == Image.ImageRep.IMAGE_REP_FILE && image.getImageFileRep() == Image.ImageFileRep.FILE_STORED) {
            try {
                ErrorInfo imageReadFromFile = image.imageReadFromFile();
                if (imageReadFromFile != ErrorInfo.KMC_SUCCESS) {
                    if (imageReadFromFile != ErrorInfo.KMC_ED_ALTERNATE_FILEIO_ENGINE) {
                        throw new KmcRuntimeException(imageReadFromFile);
                    }
                }
                aVar.f4248wI = true;
                aVar.f4249wJ = true;
                aVar.f4247t = image;
                aVar._bitmap = image.getImageBitmap();
            } catch (KmcException e) {
                throw new KmcRuntimeException(e.getErrorInfo());
            }
        } else if (image.getImageRepresentation() == Image.ImageRep.IMAGE_REP_BITMAP || image.getImageRepresentation() == Image.ImageRep.IMAGE_REP_BOTH) {
            aVar._bitmap = image.getImageBitmap();
        } else if (image.getImageFileRep() == Image.ImageFileRep.FILE_BUFFERED) {
            throw new KmcRuntimeException(ErrorInfo.KMC_IP_FILE_AND_BUFFERED_REPRESENTATION);
        } else {
            throw new KmcRuntimeException(ErrorInfo.KMC_IP_NO_REPRESENTATION);
        }
        return aVar;
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.u$a */
    class C8198a implements C7919g.C7920a {
        Bitmap _bitmap;

        /* renamed from: t */
        Image f4247t;

        /* renamed from: wI */
        boolean f4248wI;

        /* renamed from: wJ */
        boolean f4249wJ;

        private C8198a() {
        }

        public Bitmap getBitmap() {
            return this._bitmap;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0029 */
        /* renamed from: be */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo54326be() {
            /*
                r4 = this;
                monitor-enter(r4)
                r0 = 0
                boolean r1 = r4.f4248wI     // Catch:{ all -> 0x0034 }
                if (r1 == 0) goto L_0x002e
                boolean r1 = r4.f4249wJ     // Catch:{ KmcException -> 0x0029 }
                if (r1 == 0) goto L_0x0011
                com.kofax.kmc.ken.engines.data.Image r1 = r4.f4247t     // Catch:{ KmcException -> 0x0029 }
                com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = r1.imageClearBitmap()     // Catch:{ KmcException -> 0x0029 }
                goto L_0x001e
            L_0x0011:
                com.kofax.kmc.ken.engines.data.Image$FriendI r1 = new com.kofax.kmc.ken.engines.data.Image$FriendI     // Catch:{ KmcException -> 0x0029 }
                com.kofax.kmc.ken.engines.data.Image r2 = r4.f4247t     // Catch:{ KmcException -> 0x0029 }
                java.lang.String r3 = "com.kofax"
                r1.<init>(r3)     // Catch:{ KmcException -> 0x0029 }
                com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = r1.clearBitmapWithoutRecycle()     // Catch:{ KmcException -> 0x0029 }
            L_0x001e:
                com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS     // Catch:{ KmcException -> 0x0029 }
                if (r1 != r2) goto L_0x0023
                goto L_0x0029
            L_0x0023:
                com.kofax.kmc.kut.utilities.error.KmcRuntimeException r2 = new com.kofax.kmc.kut.utilities.error.KmcRuntimeException     // Catch:{ KmcException -> 0x0029 }
                r2.<init>(r1)     // Catch:{ KmcException -> 0x0029 }
                throw r2     // Catch:{ KmcException -> 0x0029 }
            L_0x0029:
                r4.f4248wI = r0     // Catch:{ all -> 0x0032 }
                monitor-exit(r4)
                r0 = 1
                return r0
            L_0x002e:
                r4.f4248wI = r0     // Catch:{ all -> 0x0032 }
                monitor-exit(r4)
                return r0
            L_0x0032:
                r0 = move-exception
                goto L_0x0038
            L_0x0034:
                r1 = move-exception
                r4.f4248wI = r0     // Catch:{ all -> 0x0032 }
                throw r1     // Catch:{ all -> 0x0032 }
            L_0x0038:
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.C8196u.C8198a.mo54326be():boolean");
        }

        /* renamed from: i */
        public void mo54328i(boolean z) {
            this.f4249wJ = z;
        }
    }
}
