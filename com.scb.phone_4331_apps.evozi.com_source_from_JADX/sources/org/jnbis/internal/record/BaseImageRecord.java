package org.jnbis.internal.record;

public abstract class BaseImageRecord extends BaseRecord {
    private String compressionAlgorithm;
    private String horizontalLineLength;
    private byte[] imageData;
    private String imageDesignationCharacter;
    private String verticalLineLength;

    public String getImageDesignationCharacter() {
        return this.imageDesignationCharacter;
    }

    public void setImageDesignationCharacter(String str) {
        this.imageDesignationCharacter = str;
    }

    public String getHorizontalLineLength() {
        return this.horizontalLineLength;
    }

    public void setHorizontalLineLength(String str) {
        this.horizontalLineLength = str;
    }

    public String getVerticalLineLength() {
        return this.verticalLineLength;
    }

    public void setVerticalLineLength(String str) {
        this.verticalLineLength = str;
    }

    public String getCompressionAlgorithm() {
        return this.compressionAlgorithm;
    }

    public void setCompressionAlgorithm(String str) {
        this.compressionAlgorithm = str;
    }

    public byte[] getImageData() {
        return this.imageData;
    }

    public void setImageData(byte[] bArr) {
        this.imageData = bArr;
    }
}
