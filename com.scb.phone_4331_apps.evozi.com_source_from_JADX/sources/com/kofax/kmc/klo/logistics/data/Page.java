package com.kofax.kmc.klo.logistics.data;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.klo.logistics.version.KloVersion;
import com.kofax.kmc.kut.utilities.AppContextProvider;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.IllegalArgumentException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.p027r.C8466a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class Page implements Serializable, Cloneable {
    private static final long serialVersionUID = 5250164060821176306L;
    private transient IBus _bus;

    /* renamed from: iL */
    private transient String f3440iL;

    /* renamed from: jk */
    private transient UUID f3441jk = UUID.randomUUID();

    /* renamed from: jl */
    private transient int f3442jl = 0;

    /* renamed from: jm */
    private transient int f3443jm = 0;

    /* renamed from: jn */
    private transient List<Image> f3444jn;

    /* renamed from: jo */
    private transient List<Image> f3445jo;

    /* renamed from: jp */
    private transient Side f3446jp = Side.FRONT;

    public enum Side {
        FRONT,
        BACK
    }

    public Page() {
        ArrayList arrayList = new ArrayList();
        this.f3445jo = arrayList;
        this.f3444jn = Collections.unmodifiableList(arrayList);
        this.f3440iL = "";
        this._bus = Injector.getInjector(AppContextProvider.getContext()).getIBus();
    }

    public List<Image> getImages() {
        return this.f3444jn;
    }

    public String getPageID() {
        return this.f3441jk.toString();
    }

    public String getDocumentID() {
        return this.f3440iL;
    }

    /* access modifiers changed from: protected */
    public void setDocumentID(String str) {
        this.f3440iL = str;
    }

    public void addImage(Image image) {
        if (image != null) {
            this.f3445jo.add(image);
            this.f3442jl = this.f3445jo.size() - 1;
            this._bus.post(new C8466a(this.f3440iL, image));
            return;
        }
        throw new IllegalArgumentException("image parameter is null");
    }

    public ErrorInfo removeImage(String str) {
        Iterator<Image> it = this.f3445jo.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (str.equalsIgnoreCase(it.next().getImageID())) {
                it.remove();
                int i2 = this.f3442jl;
                if (i == i2) {
                    this.f3442jl = 0;
                } else if (i < i2) {
                    this.f3442jl = i2 - 1;
                }
                return ErrorInfo.KMC_SUCCESS;
            }
            i++;
        }
        return ErrorInfo.KMC_LO_IMAGE_NOT_FOUND;
    }

    public int getSheetID() {
        return this.f3443jm;
    }

    public void setSheetID(int i) {
        this.f3443jm = i;
    }

    public int getCurrentImageIndex() {
        return this.f3442jl;
    }

    public void setCurrentImageIndex(int i) {
        if (i < 0 || i >= this.f3445jo.size()) {
            throw new KmcRuntimeException(ErrorInfo.KMC_LO_PAGE_IMAGE_INDEX_INVALID);
        }
        this.f3442jl = i;
    }

    public void setSide(Side side) {
        this.f3446jp = side;
    }

    public Side getSide() {
        return this.f3446jp;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(Page.class.getName());
        objectOutputStream.writeObject(KloVersion.getPackageVersion());
        objectOutputStream.writeObject(Integer.valueOf(this.f3442jl));
        objectOutputStream.writeObject(this.f3441jk);
        objectOutputStream.writeObject(Integer.valueOf(this.f3443jm));
        objectOutputStream.writeObject(this.f3446jp);
        objectOutputStream.writeObject(this.f3445jo);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException, KmcRuntimeException {
        objectInputStream.defaultReadObject();
        if (Page.class.getName().compareToIgnoreCase((String) objectInputStream.readObject()) == 0) {
            if (SdkVersion.versionCompatible(KloVersion.getPackageVersion(), (String) objectInputStream.readObject()).booleanValue()) {
                this.f3442jl = ((Integer) objectInputStream.readObject()).intValue();
                this.f3441jk = (UUID) objectInputStream.readObject();
                this.f3443jm = ((Integer) objectInputStream.readObject()).intValue();
                this.f3446jp = (Side) objectInputStream.readObject();
                ArrayList arrayList = (ArrayList) objectInputStream.readObject();
                this.f3445jo = arrayList;
                this.f3444jn = Collections.unmodifiableList(arrayList);
                return;
            }
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_VERSION_ERROR);
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_OBJECT_ERROR);
    }
}
