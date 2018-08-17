package entities;

public class CollectionStoreKey {
    private String collectionName, partition, suffix;

    public CollectionStoreKey(String collectionName, String partition, String suffix) {
        this.collectionName = collectionName;
        this.partition = partition;
        this.suffix = suffix;
    }

    public CollectionStoreKey(String collectionName, String partition) {
        this(collectionName, partition, "");
    }

    public String getCollectionName() {
        return collectionName;
    }

    public CollectionStoreKey setCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    public String getPartition() {
        return partition;
    }

    public CollectionStoreKey setPartition(String partition) {
        this.partition = partition;
        return this;
    }

    public String getSuffix() {
        return suffix;
    }

    public CollectionStoreKey setSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    public String getKey(){
        if(suffix == null || suffix.equals("")) {
          return String.format("%s_%s", partition, collectionName);
        }
        return String.format("%s_%s_%s", partition, collectionName, suffix);
    }
}
