package entities;


public class ObjectWrap<T extends BaseObject> {
    private EActionType eActionType;
    private T object;

    public ObjectWrap(T object, EActionType eActionType) {
        this.object = object;
        this.eActionType = eActionType;
    }

    public ObjectWrap(T object) {
        this.object = object;
        eActionType = EActionType.CREATE;
    }

    public T getObject() {
        return object;
    }

    public ObjectWrap<T> setObject(T object) {
        this.object = object;
        return this;
    }

    public EActionType geteActionType() {
        return eActionType;
    }

    public ObjectWrap<T> seteActionType(EActionType eActionType) {
        this.eActionType = eActionType;
        return this;
    }

    @Override
    public String toString() {
        return "ObjectWrap{" +
                "eActionType=" + eActionType.name() +
                ", object=" + object.toString() +
                '}';
    }
}
