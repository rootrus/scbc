package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.data.Image;
import java.util.EventObject;

@Deprecated
public class ImageClassificationCompleteEvent extends EventObject {
    private static final long serialVersionUID = 1;

    /* renamed from: t */
    private final Image f3312t;

    public ImageClassificationCompleteEvent(Object obj, Image image) {
        super(obj);
        this.f3312t = image;
    }

    public Image getImage() {
        return this.f3312t;
    }
}
