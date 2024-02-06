package net.p088sf.scuba.smartcards;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: net.sf.scuba.smartcards.CardService */
public abstract class CardService implements Serializable {
    protected static final int SESSION_STARTED_STATE = 1;
    protected static final int SESSION_STOPPED_STATE = 0;
    private static final Map<String, String> objectToServiceMap;
    private static final long serialVersionUID = 5618527358158494957L;
    private Collection<APDUListener> apduListeners = new HashSet();
    protected int state = 0;

    public abstract void close();

    public abstract byte[] getATR() throws CardServiceException;

    public boolean isExtendedAPDULengthSupported() {
        return false;
    }

    public abstract boolean isOpen();

    public abstract void open() throws CardServiceException;

    public abstract ResponseAPDU transmit(CommandAPDU commandAPDU) throws CardServiceException;

    static {
        HashMap hashMap = new HashMap();
        objectToServiceMap = hashMap;
        hashMap.put("javax.smartcardio.CardTerminal", "net.sf.scuba.smartcards.TerminalCardService");
        objectToServiceMap.put("sun.security.smartcardio.TerminalImpl", "net.sf.scuba.smartcards.TerminalCardService");
        objectToServiceMap.put("android.nfc.tech.IsoDep", "net.sf.scuba.smartcards.IsoDepCardService");
    }

    public static CardService getInstance(Object obj) {
        if (obj != null) {
            String canonicalName = obj.getClass().getCanonicalName();
            for (Map.Entry next : objectToServiceMap.entrySet()) {
                try {
                    Class<?> cls = Class.forName((String) next.getKey());
                    String str = (String) next.getValue();
                    if (cls.isInstance(obj)) {
                        return (CardService) Class.forName(str).getConstructor(new Class[]{cls}).newInstance(new Object[]{obj});
                    }
                    continue;
                } catch (Exception e) {
                    throw new IllegalArgumentException(e);
                } catch (ClassNotFoundException unused) {
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find a CardService for object of class \"");
            sb.append(canonicalName);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException();
    }

    public void addAPDUListener(APDUListener aPDUListener) {
        Collection<APDUListener> collection = this.apduListeners;
        if (collection != null) {
            collection.add(aPDUListener);
        }
    }

    public void removeAPDUListener(APDUListener aPDUListener) {
        Collection<APDUListener> collection = this.apduListeners;
        if (collection != null) {
            collection.remove(aPDUListener);
        }
    }

    /* access modifiers changed from: protected */
    public void notifyExchangedAPDU(int i, CommandAPDU commandAPDU, ResponseAPDU responseAPDU) {
        Collection<APDUListener> collection = this.apduListeners;
        if (collection != null && collection.size() > 0) {
            APDUEvent aPDUEvent = new APDUEvent(this, "RAW", i, commandAPDU, responseAPDU);
            for (APDUListener exchangedAPDU : this.apduListeners) {
                exchangedAPDU.exchangedAPDU(aPDUEvent);
            }
        }
    }
}
