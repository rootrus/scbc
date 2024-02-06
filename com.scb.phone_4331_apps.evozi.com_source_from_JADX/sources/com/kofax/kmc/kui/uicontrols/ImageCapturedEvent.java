package com.kofax.kmc.kui.uicontrols;

import com.kofax.kmc.ken.engines.data.Image;
import java.util.EventObject;

public class ImageCapturedEvent extends EventObject {
    private static final long serialVersionUID = 1;

    /* renamed from: t */
    private Image f593t;

    public ImageCapturedEvent(Object obj, Image image) {
        super(obj);
        this.f593t = image;
    }

    public final Image getImage() {
        return this.f593t;
    }
}
