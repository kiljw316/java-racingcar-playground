package 자동차_경주_게임;

public record Position(int position) {
    public Position forward() {
        return new Position(position + 1);
    }
}