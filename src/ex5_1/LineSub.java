package ex5_1;

public class LineSub extends Point {
    // Thuộc tính riêng cho điểm cuối
    private Point end;

    // Constructor 1: nhận tọa độ của 2 điểm
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);            // gọi constructor của Point -> tạo begin
        this.end = new Point(endX, endY); // tạo end
    }

    // Constructor 2: nhận sẵn 2 đối tượng Point
    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY()); // kế thừa begin từ lớp cha
        this.end = end;
    }

    // Hiển thị thông tin đường thẳng
    @Override
    public String toString() {
        return "LineSub[begin=(" + getX() + "," + getY() + "), end=" + end + "]";
    }

    // Getter cho begin và end
    public Point getBegin() {
        // begin chính là "this" vì lớp này kế thừa Point
        return new Point(getX(), getY());
    }

    public Point getEnd() {
        return end;
    }

    // Setter cho begin và end
    public void setBegin(Point begin) {
        setX(begin.getX());
        setY(begin.getY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    // Getter cho tọa độ begin và end
    public int getBeginX() {
        return getX();
    }

    public int getBeginY() {
        return getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    // Setter cho từng tọa độ begin
    public void setBeginX(int x) {
        setX(x);
    }

    public void setBeginY(int y) {
        setY(y);
    }

    public void setBeginXY(int x, int y) {
        setXY(x, y);
    }

    // Setter cho từng tọa độ end
    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // Tính độ dài của đoạn thẳng
    public double getLength() {
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Tính góc nghiêng của đoạn thẳng (đơn vị radian)
    public double getGradient() {
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return Math.atan2(yDiff, xDiff);
    }
}
