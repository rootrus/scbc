package p040o;

/* renamed from: o.IImageStorage */
public enum IImageStorage {
    DEPOSIT("CCW_CASA"),
    CREDIT("CCW_CC"),
    SPEEDY_CASH("CCW_SC");
    
    public String typeCode;

    private IImageStorage(String str) {
        this.typeCode = str;
    }
}
