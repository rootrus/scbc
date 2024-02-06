package p040o;

import android.net.Uri;

/* renamed from: o.IdExtractActivity */
public interface IdExtractActivity {

    /* renamed from: o.IdExtractActivity$IconCompatParcelizer */
    public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(Uri uri);

        void IconCompatParcelizer(Throwable th);
    }

    boolean IconCompatParcelizer(Object obj);

    Object read(Object obj);

    void read(Object obj, Object obj2);
}
