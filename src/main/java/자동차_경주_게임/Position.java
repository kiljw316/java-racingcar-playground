package 자동차_경주_게임;

public record Position(int position) {
    public Position {
        if (position < 0) {
            throw new IllegalArgumentException("포지션은 음수가 될 수 없습니다.");
        }
    }

    public Position forward() {
        return new Position(position + 1);
    }
}
