package org.jmrtd.lds;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import net.p088sf.scuba.tlv.TLVInputStream;
import net.p088sf.scuba.tlv.TLVOutputStream;

public abstract class DisplayedImageDataGroup extends DataGroup {
    private static final int DISPLAYED_IMAGE_COUNT_TAG = 2;
    private static final long serialVersionUID = 5994136177872308962L;
    private int displayedImageTagToUse;
    private List<DisplayedImageInfo> imageInfos;

    public DisplayedImageDataGroup(int i, List<DisplayedImageInfo> list, int i2) {
        super(i);
        if (list != null) {
            this.displayedImageTagToUse = i2;
            this.imageInfos = new ArrayList(list);
            checkTypesConsistentWithTag();
            return;
        }
        throw new IllegalArgumentException("imageInfos cannot be null");
    }

    public DisplayedImageDataGroup(int i, InputStream inputStream) throws IOException {
        super(i, inputStream);
        if (this.imageInfos == null) {
            this.imageInfos = new ArrayList();
        }
        checkTypesConsistentWithTag();
    }

    /* access modifiers changed from: protected */
    public void readContent(InputStream inputStream) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int write = tLVInputStream.write();
        if (write != 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected tag 0x02 in displayed image structure, found ");
            sb.append(Integer.toHexString(write));
            throw new IllegalArgumentException(sb.toString());
        } else if (tLVInputStream.IconCompatParcelizer() == 1) {
            byte b = tLVInputStream.MediaBrowserCompat$ItemReceiver()[0];
            for (int i = 0; i < (b & 255); i++) {
                DisplayedImageInfo displayedImageInfo = new DisplayedImageInfo(tLVInputStream);
                if (i == 0) {
                    this.displayedImageTagToUse = displayedImageInfo.getDisplayedImageTag();
                } else if (displayedImageInfo.getDisplayedImageTag() != this.displayedImageTagToUse) {
                    throw new IOException("Found images with different displayed image tags inside displayed image datagroup");
                }
                add(displayedImageInfo);
            }
        } else {
            throw new IllegalArgumentException("DISPLAYED_IMAGE_COUNT should have length 1");
        }
    }

    /* access modifiers changed from: protected */
    public void writeContent(OutputStream outputStream) throws IOException {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        tLVOutputStream.IconCompatParcelizer(2);
        tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(new byte[]{(byte) this.imageInfos.size()});
        for (DisplayedImageInfo writeObject : this.imageInfos) {
            writeObject.writeObject(tLVOutputStream);
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass().getSimpleName());
        stringBuffer.append(" [");
        List<DisplayedImageInfo> list = this.imageInfos;
        if (list != null) {
            boolean z = true;
            for (DisplayedImageInfo next : list) {
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append(", ");
                }
                stringBuffer.append(next.toString());
            }
            stringBuffer.append("]");
            return stringBuffer.toString();
        }
        throw new IllegalStateException("imageInfos cannot be null");
    }

    public int hashCode() {
        List<DisplayedImageInfo> list = this.imageInfos;
        return (list == null ? 1 : list.hashCode()) + 1337 + 31337;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        List<DisplayedImageInfo> list = this.imageInfos;
        List<DisplayedImageInfo> list2 = ((DisplayedImageDataGroup) obj).imageInfos;
        if (list == list2 || (list != null && list.equals(list2))) {
            return true;
        }
        return false;
    }

    public List<DisplayedImageInfo> getImages() {
        return new ArrayList(this.imageInfos);
    }

    private void add(DisplayedImageInfo displayedImageInfo) {
        if (this.imageInfos == null) {
            this.imageInfos = new ArrayList();
        }
        this.imageInfos.add(displayedImageInfo);
    }

    private void checkTypesConsistentWithTag() {
        for (DisplayedImageInfo type : this.imageInfos) {
            int type2 = type.getType();
            if (type2 != 0) {
                if (type2 == 1 && this.displayedImageTagToUse != 24387) {
                    throw new IllegalArgumentException("'Portrait' image cannot be part of a 'Signature or usual mark' displayed image datagroup");
                }
            } else if (this.displayedImageTagToUse != 24384) {
                throw new IllegalArgumentException("'Signature or usual mark' image cannot be part of a 'Portrait' displayed image datagroup");
            }
        }
    }
}
