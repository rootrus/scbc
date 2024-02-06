package com.kofax.mobile.sdk._internal.impl.event;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kui.uicontrols.ImageCapturedEvent;
import com.kofax.kmc.kui.uicontrols.ImageCapturedListener;
import com.kofax.kmc.kui.uicontrols.data.GpsUsageLimits;
import com.kofax.kmc.kut.utilities.error.KmcException;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;

/* renamed from: com.kofax.mobile.sdk._internal.impl.event.ah */
public final class C0680ah extends C0701x<ImageCapturedListener> {

    /* renamed from: IP */
    private GpsUsageLimits f1614IP = GpsUsageLimits.ALWAYS_USE_IF_ENABLED;

    /* renamed from: jO */
    private float f1615jO;

    /* renamed from: jP */
    private float f1616jP;

    /* renamed from: jQ */
    private float f1617jQ;

    /* renamed from: jR */
    private float f1618jR;

    /* renamed from: jS */
    private boolean f1619jS = false;

    public C0680ah(ImageCapturedListener imageCapturedListener) {
        super(imageCapturedListener, ImageCapturedListener.class);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public final void mo11621a(C7953af afVar) {
        this.f1614IP = afVar.f3703IO;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    public final void onLocationEvent(LocationEvent locationEvent) {
        this.f1617jQ = (float) locationEvent.latitude;
        this.f1618jR = (float) locationEvent.longitude;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    public final void onLocationEnableEvent(GPSEnabledEvent gPSEnabledEvent) {
        this.f1619jS = gPSEnabledEvent.gpsEnabled;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: b */
    public final void mo11622b(LevelChangedEvent levelChangedEvent) {
        this.f1615jO = levelChangedEvent.pitch;
        this.f1616jP = levelChangedEvent.roll;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public final void mo11620a(ImageCapturedBusEvent imageCapturedBusEvent) {
        try {
            Image.FriendI friendI = new Image.FriendI("com.kofax.kmc.kui.uicontrols");
            if (this.f1619jS && GpsUsageLimits.ALWAYS_USE_IF_ENABLED.equals(this.f1614IP)) {
                friendI.setImageLatitude(Float.valueOf(this.f1617jQ));
                friendI.setImageLongitude(Float.valueOf(this.f1618jR));
            }
            friendI.setImagePitch(Float.valueOf(this.f1615jO));
            friendI.setImageRoll(Float.valueOf(this.f1616jP));
        } catch (KmcException e) {
            try {
                e.printStackTrace();
            } catch (Exception e2) {
                mo11635c(e2);
                return;
            }
        }
        ((ImageCapturedListener) this.f1635IC).onImageCaptured(new ImageCapturedEvent(this, imageCapturedBusEvent.image));
    }
}
