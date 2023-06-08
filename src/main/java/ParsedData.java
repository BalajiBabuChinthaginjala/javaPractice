import org.apache.tika.metadata.Metadata;

public class ParsedData {
    String handler;
    Metadata metadata;

    public ParsedData() {
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
}
