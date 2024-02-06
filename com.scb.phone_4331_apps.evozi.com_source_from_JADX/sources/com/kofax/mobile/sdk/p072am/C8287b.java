package com.kofax.mobile.sdk.p072am;

import android.graphics.Bitmap;
import com.kofax.android.abc.document.Document;
import com.kofax.android.abc.quickextractor.MrzExtractor;
import com.kofax.android.abc.vrs.VrsImage;
import com.kofax.mobile.commonextractionengine.recognition.TextRecognizer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import p040o.PrepaidConfirmPinActivity;

/* renamed from: com.kofax.mobile.sdk.am.b */
public class C8287b implements C8286a {

    /* renamed from: Yp */
    private final Deque<C8294a<?>> f4464Yp = new ArrayDeque();

    /* renamed from: a */
    public <T extends C8286a> T mo54754a(final T t) {
        return (C8286a) m4664a(new C8294a<T>(t) {
            public void dispose() {
                t.dispose();
            }
        });
    }

    /* renamed from: a */
    public TextRecognizer mo54753a(final TextRecognizer textRecognizer) {
        return (TextRecognizer) m4664a(new C8294a<TextRecognizer>(textRecognizer) {
            public void dispose() {
                textRecognizer.dispose();
            }
        });
    }

    /* renamed from: a */
    public VrsImage mo54752a(final VrsImage vrsImage) {
        return (VrsImage) m4664a(new C8294a<VrsImage>(vrsImage) {
            public void dispose() {
                vrsImage.dispose();
            }
        });
    }

    /* renamed from: a */
    public MrzExtractor mo54751a(final MrzExtractor mrzExtractor) {
        return (MrzExtractor) m4664a(new C8294a<MrzExtractor>(mrzExtractor) {
            public void dispose() {
                mrzExtractor.dispose();
            }
        });
    }

    /* renamed from: f */
    public Document mo54755f(final Document document) {
        return (Document) m4664a(new C8294a<Document>(document) {
            public void dispose() {
                document.dispose();
            }
        });
    }

    /* renamed from: o */
    public Bitmap mo54757o(final Bitmap bitmap) {
        return (Bitmap) m4664a(new C8294a<Bitmap>(bitmap) {
            public void dispose() {
                bitmap.recycle();
            }
        });
    }

    /* renamed from: f */
    public <T> T mo54756f(T t) {
        if (t == null) {
            return null;
        }
        Iterator<C8294a<?>> it = this.f4464Yp.iterator();
        while (it.hasNext()) {
            if (it.next().object == t) {
                it.remove();
                return t;
            }
        }
        throw new IllegalArgumentException(String.format("%s was not registered", new Object[]{t}));
    }

    public void dispose() {
        Throwable th = null;
        while (!this.f4464Yp.isEmpty()) {
            try {
                this.f4464Yp.pop().dispose();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
        }
        if (th != null) {
            PrepaidConfirmPinActivity.MediaBrowserCompat$CustomActionResultReceiver(th);
        }
    }

    /* renamed from: a */
    private <T> T m4664a(C8294a<T> aVar) {
        if (aVar.object != null) {
            this.f4464Yp.push(aVar);
        }
        return aVar.object;
    }

    /* renamed from: com.kofax.mobile.sdk.am.b$a */
    static abstract class C8294a<T> implements C8286a {
        /* access modifiers changed from: private */
        public final T object;

        C8294a(T t) {
            this.object = t;
        }
    }
}
