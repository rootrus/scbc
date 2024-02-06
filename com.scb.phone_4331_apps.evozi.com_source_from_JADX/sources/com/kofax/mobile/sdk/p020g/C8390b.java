package com.kofax.mobile.sdk.p020g;

import com.kofax.BuildConfig;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.data.ImageSource;
import com.kofax.kmc.kut.utilities.error.KmcException;

/* renamed from: com.kofax.mobile.sdk.g.b */
public class C8390b {

    /* renamed from: iL */
    String f4902iL;
    String imageID;

    /* renamed from: oc */
    long f4903oc;

    /* renamed from: rH */
    private long f4904rH;

    /* renamed from: rQ */
    ImageSource f4905rQ;

    public C8390b(Image image, ImageSource imageSource) {
        this(image, imageSource, (String) null);
    }

    public C8390b(Image image, String str) {
        this(image, (ImageSource) null, str);
    }

    private C8390b(Image image, ImageSource imageSource, String str) {
        if (image != null) {
            this.imageID = image.getImageID();
            this.f4903oc = image.getImageSize();
            try {
                this.f4904rH = new Image.FriendI(BuildConfig.APPLICATION_ID).getImageCreationTime();
            } catch (KmcException e) {
                e.printStackTrace();
            }
        }
        if (imageSource != null) {
            this.f4905rQ = imageSource;
        }
        if (str != null) {
            this.f4902iL = str;
        }
    }

    public String getImageID() {
        return this.imageID;
    }

    public void setImageID(String str) {
        this.imageID = str;
    }

    public ImageSource getSource() {
        return this.f4905rQ;
    }

    public void setSource(ImageSource imageSource) {
        this.f4905rQ = imageSource;
    }

    public long getFileSize() {
        return this.f4903oc;
    }

    public void setFileSize(long j) {
        this.f4903oc = j;
    }

    public String getDocumentID() {
        return this.f4902iL;
    }

    public void setDocumentID(String str) {
        this.f4902iL = str;
    }

    public void setCreationTime(long j) {
        this.f4904rH = j;
    }

    /* renamed from: iB */
    public long mo55281iB() {
        return this.f4904rH;
    }
}
