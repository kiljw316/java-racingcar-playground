package 자동차_경주_게임;

public record Name(String name) {
    public Name(String name) {
        if (name.trim().length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없다.");
        }

        this.name = name.trim();
    }
}
