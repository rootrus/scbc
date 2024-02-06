package net.p088sf.scuba.smartcards;

import java.util.EventObject;

/* renamed from: net.sf.scuba.smartcards.CardEvent */
public class CardEvent extends EventObject {
    public static final int INSERTED = 1;
    public static final int REMOVED = 0;
    private static final long serialVersionUID = -5645277246646615351L;
    private CardService service;
    private int type;

    public CardEvent(int i, CardService cardService) {
        super(cardService);
        this.type = i;
        this.service = cardService;
    }

    public int getType() {
        return this.type;
    }

    public CardService getService() {
        return this.service;
    }

    public String toString() {
        int i = this.type;
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Card removed from ");
            sb.append(this.service);
            return sb.toString();
        } else if (i != 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CardEvent ");
            sb2.append(this.service);
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Card inserted in ");
            sb3.append(this.service);
            return sb3.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        try {
            if (!obj.getClass().equals(getClass())) {
                return false;
            }
            CardEvent cardEvent = (CardEvent) obj;
            if (this.type != cardEvent.type || !this.service.equals(cardEvent.service)) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return (this.service.hashCode() * 5) + (this.type * 7);
    }
}
