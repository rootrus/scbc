package com.kofax.mobile.sdk.p083w;

import android.graphics.Bitmap;
import bolts.CancellationToken;
import com.kofax.BuildConfig;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk._internal.C7919g;
import com.kofax.mobile.sdk.extract.p018id.IIdImageProcessingListener;
import com.kofax.mobile.sdk.p075e.C8340a;
import com.kofax.mobile.sdk.p081u.C8478b;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.w.ai */
public class C8507ai extends C8500ae {

    /* renamed from: Qs */
    private final C8508a f5166Qs;

    /* renamed from: com.kofax.mobile.sdk.w.ai$a */
    public interface C8508a {
        /* renamed from: B */
        C8478b mo55417B(C8340a aVar);

        /* renamed from: a */
        void mo55418a(IIdImageProcessingListener iIdImageProcessingListener, Image image);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    @HmlPinActivity
    public C8507ai(C8508a aVar) {
        this.f5166Qs = aVar;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        IIdImageProcessingListener imageProcessingListener = aVar.getImageProcessingListener();
        C8478b B = this.f5166Qs.mo55417B(aVar);
        if (imageProcessingListener != null && B != null) {
            Image image = B.f5066NW;
            C7919g.C7920a aVar2 = B.f5067NX;
            Bitmap a = m5223a(aVar2);
            if (a == null) {
                aVar2 = B.f5065NV;
                a = m5223a(aVar2);
                try {
                    Image image2 = new Image(a);
                    try {
                        Image.FriendI friendI = new Image.FriendI(BuildConfig.APPLICATION_ID);
                        friendI.setImageDPI(B.originalImage.getImageDPI());
                        friendI.setImageMetaData(B.originalImage.getImageMetaData());
                    } catch (Throwable unused) {
                    }
                    image = image2;
                } catch (Throwable unused2) {
                }
            }
            if (a != null && image != null) {
                aVar2.mo54328i(false);
                this.f5166Qs.mo55418a(imageProcessingListener, image);
            }
        }
    }

    /* renamed from: a */
    private static Bitmap m5223a(C7919g.C7920a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.getBitmap();
    }
}
