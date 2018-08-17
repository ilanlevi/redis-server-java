package entities;

public enum EActionType {
    CREATE("CREATE"),
    CREATE_UPDATE("CREATE_UPDATE"),
    DELETE("DELETE");

    private String name;

    EActionType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
