package com.drew.imaging.png;

import com.drew.imaging.ImageProcessingException;

public class PngProcessingException extends ImageProcessingException {
    public PngProcessingException(String str) {
        super(str);
    }

    public PngProcessingException(Throwable th) {
        super(th);
    }
}
