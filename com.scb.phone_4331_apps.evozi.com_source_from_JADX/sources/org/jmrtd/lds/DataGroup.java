package org.jmrtd.lds;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

public abstract class DataGroup extends AbstractTaggedLDSFile {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -4761360877353069639L;

    public DataGroup(int i) {
        super(i);
    }

    public DataGroup(int i, InputStream inputStream) throws IOException {
        super(i, inputStream);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataGroup [");
        sb.append(Integer.toHexString(getTag()));
        sb.append(" (");
        sb.append(getLength());
        sb.append(")]");
        return sb.toString();
    }
}
