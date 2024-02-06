package com.kofax.mobile.sdk._internal;

import com.kofax.kmc.ken.engines.data.Image;

public interface IImageToByteArray {
    byte[] convert(Image image);
}
