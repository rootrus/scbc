package com.drew.imaging;

import com.drew.lang.CompoundException;

public class ImageProcessingException extends CompoundException {
    public ImageProcessingException(String str) {
        super(str);
    }

    public ImageProcessingException(Throwable th) {
        super(th);
    }
}
